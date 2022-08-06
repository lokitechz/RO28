USE Testing_System_Assignment_1;

-- Câu 1: Đã thêm ở bài số 2
-- Câu 2: Lấy ra tất cả các phòng ban
SELECT 
    *
FROM
    `Department`
ORDER BY DepartmentID;

-- Câu 3: Lấy ra ID của phòng ban "Sale"
SELECT 
    DepartmentID
FROM
    `Department`
WHERE
    DepartmentName = 'Sale';

-- Câu 4: Lấy ra thông tin account có fullname dài nhất
SELECT * FROM `Account` 
WHERE LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account`) 
ORDER BY AccountID;

-- Câu 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id = 3
WITH CTE_DEP3 AS (SELECT * FROM `Account` WHERE DepartmentID = 3)

SELECT * FROM `CTE_DEP3`
WHERE LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `CTE_DEP3`)
ORDER BY Fullname;

-- Câu 6: Lấy ra tên group đã tạo trước ngày 20/12/2019
SELECT 
    GroupName
FROM
    `Group`
WHERE
    CreateDate < '2019-12-20';



