USE Testing_System_Assignment_1;

DROP TRIGGER IF EXISTS Trg_CheckInsertGroup;
DELIMITER $$
	CREATE TRIGGER Trg_CheckInsertGroup
	BEFORE INSERT ON `Group`
	FOR EACH ROW
	BEGIN
		DECLARE v_CreateDate DATETIME;
		SET v_CreateDate = DATE_SUB(NOW(), INTERVAL 1 YEAR);
		IF (NEW.CreateDate <= v_CreateDate) THEN
		SIGNAL SQLSTATE '123Account45'
		SET MESSAGE_TEXT = 'Không thể thêm dữ liệu vào vì ngày tạo không được quá 1 năm';
	END IF;
	END$$
DELIMITER ;

INSERT INTO `Group` (`GroupName`, `CreatorID`, `CreateDate`)
VALUES ('2', '1', '2022-04-10 00:00:00');

SELECT D.DepartmentName, 
CASE 
	WHEN COUNT(A.DepartmentID) = 0 THEN 'Không có User'
	ELSE COUNT(A.DepartmentID) END AS SL 
    FROM department D
	LEFT JOIN account A ON D.DepartmentID = A.DepartmentID
	GROUP BY d.DepartmentID;