USE Testing_System_Assignment_1;

-- Cho phep nguoi dung nhap vao id cuar nhan vien sau do in ra ho ten
DELIMITER $$
CREATE FUNCTION FT_GETFULLNAME(accountId INT) 
RETURNS VARCHAR(250) -- Kieu du lieu muon tra ve
DETERMINISTIC
    BEGIN
        DECLARE fullname VARCHAR(250); 
        --  DECLARE khai bao 1 bien dung de luu tru ket qua tra ve
        SELECT A.FullName INTO fullname FROM `Account` A WHERE A.AccountID = accountId; 
        -- Lay full name tu bang account vaf gan vao bien fullname vua tao
        RETURN fullname;
    END $$
DELIMITER ;

SELECT FT_GETFULLNAME(3);

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

CALL SP_GetAccFromDepartName('Sale');
CALL SP_GetAccFromDepartName('No person');
CALL SP_GetAccFromDepartName('Giám đốc');

-- Câu 2: Tạo store để in ra số lượng account trong mỗi group (nhập vào groupName)
DROP PROCEDURE IF EXISTS SP_GetCountAccFromGroup;
DELIMITER $$
	CREATE PROCEDURE SP_GetCountAccFromGroup(IN groupName VARCHAR(50))
	BEGIN
		SELECT g.GroupName, COUNT(ga.AccountID) AS SL_ACCOUNT
		FROM `GroupAccount` ga
		JOIN `Group` g ON ga.GroupID = g.GroupID
		WHERE g.GroupName = groupName
		GROUP BY ga.GroupID;
	END$$
DELIMITER ;

CALL SP_GetCountAccFromGroup('Testing System');

-- Câu 3: 
DROP PROCEDURE IF EXISTS sp_GetCountTypeInMonth;
DELIMITER $$
	CREATE PROCEDURE sp_GetCountTypeInMonth()
	BEGIN
		SELECT TQ.TypeName, COUNT(Q.TypeID) 
        FROM `Question` Q
		INNER JOIN `TypeQuestion` TQ ON Q.TypeID = TQ.TypeID
		WHERE MONTH(Q.CreateDate) = MONTH(NOW()) AND YEAR(Q.CreateDate) = YEAR(now())
		GROUP BY Q.TypeID;
	END$$
DELIMITER ;

SELECT MONTH(NOW());
SELECT YEAR(NOW());

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

-- TỪ KHOÁ DECLARE(KHAI BAO) CHO PHÉP KHAI BAO 1 BIẾN  ĐỂ LƯU TRỮ 1 GIÁ TRỊ NÀO ĐÓ

INSERT INTO `account` (`Email`, `Username`, `FullName`,
`DepartmentID`, `PositionID`, `CreateDate`)
VALUES (var_Email, v_Username, var_Fullname,
v_DepartmentID, v_PositionID, v_CreateDate);

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


-- Q8
DROP PROCEDURE IF EXISTS sp_getMaxNameQuesFormNameType;
DELIMITER $$
CREATE PROCEDURE sp_getMaxNameQuesFormNameType(IN var_Choice ENUM('Essay', 'Multiple-Choice'))
BEGIN
	-- Đề bài cho phép nhập vào chữ Essay hoặc Multiple-Choice
	DECLARE v_TypeID TINYINT UNSIGNED;
    -- Lấy đc ID của typeQuestion từ tên của chúng
	SELECT tq.TypeID INTO v_TypeID 
    FROM typequestion tq
	WHERE tq.TypeName = var_Choice;
	-- Nếu sự lựa chọn là Essay
	IF var_Choice = 'Essay' 
    THEN
    -- Tạo CTE lưu độ dài của các câu hỏi Essay
	WITH CTE_LengContent AS (
		SELECT length(q.Content) AS leng FROM question q
		WHERE TypeID = v_TypeID
    )
    -- Sử dụng CTE
	SELECT * FROM question q
	WHERE TypeID = v_TypeID
    AND length(q.Content) = (SELECT MAX(leng) FROM CTE_LengContent);
    
	ELSEIF var_Choice = 'Multiple-Choice' 
	THEN
	WITH CTE_LengContent AS (
		SELECT length(q.Content) AS leng FROM question q
		WHERE TypeID = v_TypeID
	)
	SELECT * FROM question q
	WHERE TypeID = v_TypeID
	AND length(q.Content) = (SELECT MAX(leng) FROM CTE_LengContent);
	END IF;
END$$
DELIMITER ;

CALL sp_getMaxNameQuesFormNameType('Essay');
