DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS account;

CREATE TABLE `customer` (
		  `customer_id` int AUTO_INCREMENT  PRIMARY KEY,
		  `name` varchar(100) NOT NULL,
		  `email` varchar(100) NOT NULL,
		  `mobile_number` varchar(20) NOT NULL,
		  `create_dt` date DEFAULT NULL
);

CREATE TABLE `account` (
		  `customer_id` int NOT NULL,
		   `account_number` int AUTO_INCREMENT  PRIMARY KEY,
		  `account_type` varchar(100) NOT NULL,
		  `branch_address` varchar(200) NOT NULL,
		  `create_dt` date DEFAULT NULL
);

INSERT INTO `customer` (`name`,`email`,`mobile_number`,`create_dt`)
	VALUES ('je','je@gmail.com','78010079',CURDATE());

INSERT INTO `account` (`customer_id`, `account_number`, `account_type`, `branch_address`, `create_dt`)
		 VALUES (1, 501000, 'Current', '301 Main Street, nyc', CURDATE());