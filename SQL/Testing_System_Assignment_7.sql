USE Testing_System_Assignment_1;

DROP TRIGGER IF EXISTS trg_CheckInsertGroup;
DELIMITER $$
	CREATE TRIGGER trg_CheckInsertGroup
	BEFORE INSERT ON `Group` -- trước khi insert
	FOR EACH ROW -- Với mỗi dòng khi insert vào
	BEGIN
		DECLARE vCreateDate DATETIME;
		SET vCreateDate = DATE_SUB(NOW(), INTERVAL 1 YEAR);
		IF (NEW.CreateDate <= vCreateDate) THEN
			SIGNAL SQLSTATE '12345'
			SET MESSAGE_TEXT = 'Không thể thêm bản ghi vì ngày tạo của dữ liệu không được quá 1 năm';
		END IF;
	END$$
DELIMITER ;

SELECT DATE_SUB(NOW(), INTERVAL 1 YEAR);

INSERT INTO `Group` (`GroupName`, `CreatorID`, `CreateDate`)
VALUES ('4', '1', '2018-04-10 00:00:00');