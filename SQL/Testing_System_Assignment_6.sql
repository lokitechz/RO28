USE Testing_System_Assignment_1;

-- Câu 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các
-- account thuộc phòng ban đó
DROP PROCEDURE IF EXISTS SP_GetAccFromDepartName;
DELIMITER $$
	CREATE PROCEDURE SP_GetAccFromDepartName(IN departmentName VARCHAR(50))
	BEGIN
		SELECT A.AccountID, A.FullName, D.DepartmentName 
		FROM `Account` A
		JOIN `Department` D ON D.DepartmentID = A.DepartmentID
		WHERE D.DepartmentName = departmentName;
	END $$
DELIMITER ;

DELETE FROM `Department` WHERE DepartmentID  = 2;

CALL SP_GetAccFromDepartName('Sale');
CALL SP_GetAccFromDepartName('No person');
CALL SP_GetAccFromDepartName('Giám đốc');

-- Câu 2: Tạo store để in ra số lượng account trong mỗi group
DROP PROCEDURE IF EXISTS SP_GetCountAccFromGroup;
DELIMITER $$
	CREATE PROCEDURE SP_GetCountAccFromGroup(IN groupName VARCHAR(50))
	BEGIN
		SELECT g.GroupName, COUNT(ga.AccountID) AS SL 
		FROM `GroupAccount` ga
		JOIN `Group` g ON ga.GroupID = g.GroupID
		WHERE g.GroupName = groupName
		GROUP BY ga.GroupID;
	END$$
DELIMITER ;


DROP PROCEDURE IF EXISTS GET_GROUP_NAME;
DELIMITER $$
  CREATE PROCEDURE GET_GROUP_NAME(IN GROUP_NAME VARCHAR(50))
     BEGIN
       SELECT G.GroupName, COUNT(GR.AccountID) AS SL
       FROM `GroupAccount` GR
       JOIN `Group` G ON G.GroupID = GR.GroupID
       WHERE G.GroupName = GROUP_NAME
       GROUP BY GR.GroupID;
     END $$
DELIMITER ;

CALL GET_GROUP_NAME('Testing System');

CALL SP_GetCountAccFromGroup('Testing System');
CALL SP_GetCountAccFromGroup('Management');

-- Câu 3: 
DROP PROCEDURE IF EXISTS sp_GetCountTypeInMonth;
DELIMITER $$
	CREATE PROCEDURE sp_GetCountTypeInMonth()
	BEGIN
		SELECT tq.TypeName, count(q.TypeID) FROM question q
		INNER JOIN typequestion tq ON q.TypeID = tq.TypeID
		WHERE month(q.CreateDate) = month(now()) AND year(q.CreateDate) = year(now())
		GROUP BY q.TypeID;
	END$$
DELIMITER ;

SELECT month(now());

CALL sp_GetCountTypeInMonth();
    
-- Câu 4: 
DROP PROCEDURE IF EXISTS sp_GetCountQuesFromType;
DELIMITER $$
	CREATE PROCEDURE sp_GetCountQuesFromType(OUT typeQuestionID TINYINT)
	BEGIN
	WITH CTE_CountTypeID AS (
	SELECT count(q.TypeID) AS SL FROM question q
	GROUP BY q.TypeID)
	SELECT q.TypeID INTO typeQuestionID
    FROM question q
	GROUP BY q.TypeID
	HAVING COUNT(q.TypeID) = (SELECT max(SL) FROM CTE_CountTypeID);
	END$$
DELIMITER ;

-- Khởi tạo giá trị ban đầu khi chưa gọi store procedure
-- Biến phải bắt đầu bằng kí tự @
SET @typeQuestionID = 0;
-- Gọi store procedure
CALL sp_GetCountQuesFromType(@typeQuestionID);
-- Sau khi gọi xong store procedure thì giá trị của biến out đã thay đổi
-- Lấy giá trị của output
SELECT @typeQuestionID;

-- Câu 6:
DROP PROCEDURE IF EXISTS sp_getNameAccOrNameGroup;
DELIMITER $$
	CREATE PROCEDURE sp_getNameAccOrNameGroup(IN input VARCHAR(50))
	BEGIN
		SELECT g.GroupName FROM `group` g WHERE g.GroupName LIKE CONCAT("%",input,"%")
		UNION
		SELECT a.Username FROM `account` a WHERE a.Username LIKE CONCAT("%",input,"%");
	END$$
DELIMITER ;

CALL sp_getNameAccOrNameGroup('s');

