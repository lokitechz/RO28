USE Testing_System_Assignment_1;

SHOW GLOBAL VARIABLES;

-- Trigger kiểm tra dữ liệu trước khi insert vào bảng group
DROP TRIGGER IF EXISTS trg_CheckInsertGroup;
DELIMITER $$
	CREATE TRIGGER trg_CheckInsertGroup
	BEFORE INSERT ON `Group`
    -- trước khi insert vào bảng group
	FOR EACH ROW -- Với mỗi dòng khi insert vào
	BEGIN
		DECLARE vCreateDate DATETIME;
        -- Gán giá trị = ngày này 1 năm trước VD: 16/9/2021
		SET vCreateDate = DATE_SUB(NOW(), INTERVAL 1 YEAR);
        -- Gán cái giá trị của biến vCreateDate = ngày giờ hiện tại trừ 1 năm
		IF (NEW.CreateDate <= vCreateDate) THEN
			-- Thông báo với MySQL 1 trạng thái
			SIGNAL SQLSTATE '34567'
            -- Hiển thị thông báo với nội dung mong muôn
			SET MESSAGE_TEXT = 'Không thể thêm bản ghi vì ngày tạo của dữ liệu đã quá 1 năm';
		END IF;
	END$$
DELIMITER ;

-- DATE_SUB cho phép trừ ngày tháng năm theo 1 quy tắc nào đó
SELECT DATE_SUB(NOW(), INTERVAL -1 YEAR);

SHOW CREATE TRIGGER trg_CheckInsertGroup;

INSERT INTO `Group` (`GroupName`, `CreatorID`, `CreateDate`)
VALUES ('4', '1', '2018-04-10 00:00:00');
