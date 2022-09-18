USE Testing_System_Assignment_1;

-- Câu 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban Sale
-- Cách 1: Sử dụng view
-- View lưu trữ dữ liệu vĩnh viễn trong ổ cứng 
CREATE OR REPLACE VIEW V_DSNV_Sale AS
    SELECT 
        A.*, D.DepartmentName
    FROM
        `Account` A JOIN
        `Department` D ON A.DepartmentID = D.DepartmentID
    WHERE
        D.DepartmentName = 'Sale';
        
SELECT * FROM V_DSNV_SaleAccount ORDER BY AccountID;

-- Cách 2: Sử dụng CTEv_dsnv_sale
WITH DSNV_Sale AS (
	SELECT 
        A.*, D.DepartmentName
    FROM
        `Account` A JOIN
        `Department` D ON A.DepartmentID = D.DepartmentID
    WHERE
        D.DepartmentName = 'Sale'
)

SELECT * FROM DSNV_Sale;

-- Câu 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
CREATE OR REPLACE VIEW v_account AS
-- Tạo CTE đếm số lượng Account trong bảng GroupAccount
-- 1 account đang tham gia bao nhiêu group
	WITH CTE_GetListCountAccount AS (
		SELECT COUNT(AccountID) AS SL
		FROM `GroupAccount` GA 
		GROUP BY AccountID
	)
	-- Select và đếm trong CTE
	SELECT A.AccountID, A.Username, COUNT(GA.AccountID)
	FROM `GroupAccount` GA
	INNER JOIN `Account` A ON GA.AccountID = A.AccountID
	GROUP BY GA.AccountID
	HAVING COUNT(GA.AccountID) = (
		SELECT MAX(SL) FROM CTE_GetListCountAccount
	);

SELECT * FROM v_account;

-- Câu 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 18 từ được coi là quá dài) 
-- Xóa nó đi
CREATE OR REPLACE VIEW v_contenttren18 AS
	SELECT *
	FROM Question
	WHERE LENGTH(Content) > 18;		

SELECT * FROM v_contenttren18;

DELETE FROM v_contenttren18;

-- Câu 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
CREATE OR REPLACE VIEW V_MaxNV AS
	SELECT D.DepartmentName, COUNT(A.DepartmentID) AS SL
	FROM account A
	INNER JOIN `department` D ON D.DepartmentID = A.DepartmentID
	GROUP BY A.DepartmentID
	HAVING COUNT(A.DepartmentID) = (SELECT MAX(countDEP_ID) AS maxDEP_ID FROM
	(SELECT COUNT(A1.DepartmentID) AS countDEP_ID FROM account A1
	GROUP BY A1.DepartmentID) AS TB_countDepID);

SELECT * FROM V_MaxNV;

UPDATE `Account` SET FullName = 'Nguyễn Hoàng Giang 3' WHERE AccountID = 3;

-- Câu 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
CREATE OR REPLACE VIEW V_QuestionCreateByNguyen AS
	SELECT Q.QuestionID, Q.Content, A.FullName AS Creator 
    FROM `Question` Q
	JOIN `Account` A ON A.AccountID = Q.CreatorID
	WHERE SUBSTRING_INDEX(A.FullName, ' ',1) = 'Nguyễn';

SELECT * FROM V_QuestionCreateByNguyen;
