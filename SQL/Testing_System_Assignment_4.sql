USE Testing_System_Assignment_1;

-- Câu 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT A.Email, A.Username , A.FullName, D.DepartmentName
FROM `Account` A
JOIN Department D ON A.DepartmentID = D.DepartmentID;

-- Câu 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
SELECT *
FROM `Account`
WHERE CreateDate < '2020-12-20';

-- Câu 3: Viết lệnh để lấy ra tất cả các developer
SELECT A.FullName, A.Email, P.PositionName
FROM `Account` A
JOIN Position P ON A.PositionID = P.PositionID
WHERE P.PositionName = 'Dev';

-- Câu 4: Viết lệnh để lấy ra danh sách các phòng ban có > 3 nhân viên
SELECT D.DepartmentName, COUNT(a.DepartmentID) AS SL FROM `Account` A
JOIN `Department` D ON a.DepartmentID = D.DepartmentID
GROUP BY A.DepartmentID
HAVING COUNT(A.DepartmentID) > 3;

-- Câu 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT E.QuestionID, Q.Content FROM examquestion E
INNER JOIN question Q ON Q.QuestionID = E.QuestionID
GROUP BY E.QuestionID
HAVING COUNT(E.QuestionID) = (SELECT MAX(countQues) as maxcountQues FROM (
SELECT COUNT(E.QuestionID) AS countQues FROM examquestion E
GROUP BY E.QuestionID) AS countTable);

-- Câu 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT cq.CategoryID, cq.CategoryName, COUNT(q.CategoryID) AS SLCHSD FROM categoryquestion cq
JOIN question q ON cq.CategoryID = q.CategoryID
GROUP BY q.CategoryID ORDER BY CategoryID;

-- Câu 7: 
SELECT q.QuestionID, q.Content , count(eq.QuestionID) FROM examquestion eq
RIGHT JOIN question q ON q.QuestionID = eq.QuestionID
GROUP BY q.QuestionID;

SELECT Q.QuestionID,Q.Content, COUNT(EQ.QuestionID) AS 'SO LUONG'
FROM `Question` Q
LEFT JOIN ExamQuestion EQ ON EQ.QuestionID = Q.QuestionID
GROUP BY EQ.QuestionID ORDER BY EQ.ExamID ASC;

