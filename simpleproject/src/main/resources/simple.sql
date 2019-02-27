-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        5.5.32 - MySQL Community Server (GPL)
-- 서버 OS:                        Win32
-- HeidiSQL 버전:                  8.0.0.4396
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- SimpleProject 의 데이터베이스 구조 덤핑
CREATE DATABASE IF NOT EXISTS `simpleproject` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `SimpleProject`;


-- 테이블 SimpleProject의 구조를 덤프합니다. account
CREATE TABLE IF NOT EXISTS `account` (
  `account_number` varchar(50) NOT NULL,
  `client_id` int(10) NOT NULL,
  `account_name` varchar(50) DEFAULT NULL,
  `account_deposit` int(10) DEFAULT NULL,
  `account_branch` varchar(50) DEFAULT NULL,
  `account_manager` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`account_number`),
  KEY `FK_account_client` (`client_id`),
  CONSTRAINT `FK_account_client` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 SimpleProject의 구조를 덤프합니다. branch
CREATE TABLE IF NOT EXISTS `branch` (
  `branch_code` int(10) NOT NULL AUTO_INCREMENT,
  `branch_name` varchar(50) DEFAULT NULL,
  `branch_manager` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`branch_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 SimpleProject의 구조를 덤프합니다. client
CREATE TABLE IF NOT EXISTS `client` (
  `client_id` int(10) NOT NULL AUTO_INCREMENT,
  `client_pw` varchar(50) DEFAULT NULL,
  `client_name` varchar(50) DEFAULT NULL,
  `client_addr` varchar(100) DEFAULT NULL,
  `client_phone` varchar(50) DEFAULT NULL,
  `branch_code` int(10) DEFAULT NULL,
  PRIMARY KEY (`client_id`),
  KEY `FK_client_branch` (`branch_code`),
  CONSTRAINT `FK_client_branch` FOREIGN KEY (`branch_code`) REFERENCES `branch` (`branch_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 SimpleProject의 구조를 덤프합니다. itemorder
CREATE TABLE IF NOT EXISTS `itemorder` (
  `order_date` date DEFAULT NULL,
  `order_number` int(11) NOT NULL AUTO_INCREMENT,
  `account_number` varchar(50) NOT NULL,
  `client_id` int(11) NOT NULL,
  `item_code` varchar(50) NOT NULL,
  `order_count` int(11) NOT NULL,
  `order_price` int(11) NOT NULL,
  PRIMARY KEY (`order_number`),
  KEY `FK_order_client` (`client_id`),
  KEY `FK_order_account` (`account_number`),
  CONSTRAINT `FK_order_account` FOREIGN KEY (`account_number`) REFERENCES `account` (`account_number`),
  CONSTRAINT `FK_order_client` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
