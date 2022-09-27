-- Câu lệnh để tạo 1 cơ sở dữ liệu
CREATE DATABASE Testing_System_Assignment_1;

-- Tạo bảng trong cơ sở dữ liệu
CREATE TABLE `Department` (
	DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(30) NOT NULL UNIQUE KEY
);