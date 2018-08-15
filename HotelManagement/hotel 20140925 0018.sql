-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.16-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema hotel
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ hotel;
USE hotel;

--
-- Table structure for table `hotel`.`child`
--

DROP TABLE IF EXISTS `child`;
CREATE TABLE `child` (
  `child_id` int(50) NOT NULL AUTO_INCREMENT,
  `child_name` varchar(50) NOT NULL,
  `child_age` varchar(10) NOT NULL,
  `family_id` int(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`child_id`),
  KEY `FK_family_id` (`family_id`),
  CONSTRAINT `FK_family_id` FOREIGN KEY (`family_id`) REFERENCES `family` (`family_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hotel`.`child`
--

/*!40000 ALTER TABLE `child` DISABLE KEYS */;
/*!40000 ALTER TABLE `child` ENABLE KEYS */;


--
-- Table structure for table `hotel`.`couple`
--

DROP TABLE IF EXISTS `couple`;
CREATE TABLE `couple` (
  `couple_id` int(50) NOT NULL AUTO_INCREMENT,
  `husband_name` varchar(25) NOT NULL,
  `husband_age` varchar(10) NOT NULL,
  `wife_name` varchar(25) NOT NULL,
  `wife_age` varchar(10) NOT NULL,
  `couple_address` varchar(50) NOT NULL,
  `couple_phone` varchar(15) NOT NULL,
  PRIMARY KEY (`couple_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hotel`.`couple`
--

/*!40000 ALTER TABLE `couple` DISABLE KEYS */;
INSERT INTO `couple` (`couple_id`,`husband_name`,`husband_age`,`wife_name`,`wife_age`,`couple_address`,`couple_phone`) VALUES 
 (7,'abisek ','40','aishwarya','34','mumbai','465465'),
 (8,'DFH','yi','TUE','r','ry','sryrs'),
 (9,'tarek','25','begum rarek','28','ctg','3546');
/*!40000 ALTER TABLE `couple` ENABLE KEYS */;


--
-- Table structure for table `hotel`.`daily`
--

DROP TABLE IF EXISTS `daily`;
CREATE TABLE `daily` (
  `dailly_id` int(50) NOT NULL AUTO_INCREMENT,
  `daily_total` double(50,0) DEFAULT NULL,
  `daily_withdraw` double(50,0) DEFAULT NULL,
  `daily_net_income` double(50,0) DEFAULT NULL,
  `daily_date` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`dailly_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotel`.`daily`
--

/*!40000 ALTER TABLE `daily` DISABLE KEYS */;
INSERT INTO `daily` (`dailly_id`,`daily_total`,`daily_withdraw`,`daily_net_income`,`daily_date`) VALUES 
 (1,3401,401,3000,'20-02-2014'),
 (2,3401,2000,1401,'20-02-2014'),
 (3,3401,4,3397,'20-02-2014'),
 (4,400,200,200,'16-02-2014'),
 (5,520,20,500,'16-02-2014');
/*!40000 ALTER TABLE `daily` ENABLE KEYS */;


--
-- Table structure for table `hotel`.`family`
--

DROP TABLE IF EXISTS `family`;
CREATE TABLE `family` (
  `family_id` int(50) NOT NULL AUTO_INCREMENT,
  `father_name` varchar(50) NOT NULL,
  `father_age` varchar(10) NOT NULL,
  `mother_name` varchar(50) NOT NULL,
  `mother_age` varchar(10) NOT NULL,
  `family_address` varchar(50) NOT NULL,
  `family_phone` varchar(50) NOT NULL,
  PRIMARY KEY (`family_id`),
  KEY `father_name` (`father_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hotel`.`family`
--

/*!40000 ALTER TABLE `family` DISABLE KEYS */;
/*!40000 ALTER TABLE `family` ENABLE KEYS */;


--
-- Table structure for table `hotel`.`group`
--

DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `group_id` int(50) NOT NULL AUTO_INCREMENT,
  `group_member_name` varchar(50) DEFAULT NULL,
  `group_contact_no` varchar(50) DEFAULT NULL,
  `no_of_member` varchar(5) DEFAULT NULL,
  `group_address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hotel`.`group`
--

/*!40000 ALTER TABLE `group` DISABLE KEYS */;
/*!40000 ALTER TABLE `group` ENABLE KEYS */;


--
-- Table structure for table `hotel`.`member`
--

DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `memeber_id` int(50) NOT NULL AUTO_INCREMENT,
  `member_name` varchar(50) DEFAULT NULL,
  `member_contact_no` varchar(50) DEFAULT NULL,
  `member_age` varchar(50) DEFAULT NULL,
  `member_address` varchar(50) DEFAULT NULL,
  `group_id` int(50) DEFAULT NULL,
  PRIMARY KEY (`memeber_id`),
  KEY `FK_group_id` (`group_id`),
  CONSTRAINT `FK_group_id` FOREIGN KEY (`group_id`) REFERENCES `group` (`group_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hotel`.`member`
--

/*!40000 ALTER TABLE `member` DISABLE KEYS */;
/*!40000 ALTER TABLE `member` ENABLE KEYS */;


--
-- Table structure for table `hotel`.`monthly`
--

DROP TABLE IF EXISTS `monthly`;
CREATE TABLE `monthly` (
  `monthly_id` int(50) NOT NULL AUTO_INCREMENT,
  `select_month` int(5) NOT NULL,
  `select_year` int(5) NOT NULL,
  `monthly_net_income` int(11) NOT NULL,
  PRIMARY KEY (`monthly_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotel`.`monthly`
--

/*!40000 ALTER TABLE `monthly` DISABLE KEYS */;
INSERT INTO `monthly` (`monthly_id`,`select_month`,`select_year`,`monthly_net_income`) VALUES 
 (3,3,2014,10498),
 (4,1,2014,12000);
/*!40000 ALTER TABLE `monthly` ENABLE KEYS */;


--
-- Table structure for table `hotel`.`rent`
--

DROP TABLE IF EXISTS `rent`;
CREATE TABLE `rent` (
  `rent_id` int(50) NOT NULL AUTO_INCREMENT,
  `room_no` varchar(50) DEFAULT NULL,
  `room_rent` double(30,0) DEFAULT NULL,
  `subject` varchar(5) DEFAULT NULL,
  `vat` double(10,0) DEFAULT NULL,
  `discount` double(10,0) DEFAULT NULL,
  `total` double(25,0) DEFAULT NULL,
  `reserveline_id` int(50) DEFAULT NULL,
  PRIMARY KEY (`rent_id`),
  KEY `FK_reserveline_id` (`reserveline_id`),
  CONSTRAINT `FK_reserveline_id` FOREIGN KEY (`reserveline_id`) REFERENCES `reserveline` (`reserveline_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hotel`.`rent`
--

/*!40000 ALTER TABLE `rent` DISABLE KEYS */;
INSERT INTO `rent` (`rent_id`,`room_no`,`room_rent`,`subject`,`vat`,`discount`,`total`,`reserveline_id`) VALUES 
 (7,'3214',520,'WT',2,10,478,19),
 (9,'45',2845,'y',0,0,2845,21),
 (10,'555',452,'hfdg',56,41,520,22),
 (11,'455',412,'hgfg',45,10,556,23);
/*!40000 ALTER TABLE `rent` ENABLE KEYS */;


--
-- Table structure for table `hotel`.`reserveline`
--

DROP TABLE IF EXISTS `reserveline`;
CREATE TABLE `reserveline` (
  `reserveline_id` int(50) NOT NULL AUTO_INCREMENT,
  `couple_id` int(50) DEFAULT NULL,
  `member_id` int(50) DEFAULT NULL,
  `single_id` int(50) DEFAULT NULL,
  `child_id` int(50) DEFAULT NULL,
  `check_in` varchar(50) DEFAULT NULL,
  `check_out` varchar(50) DEFAULT NULL,
  `reserve_date` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`reserveline_id`),
  KEY `FK_couple_id` (`couple_id`),
  KEY `FK_group_id` (`member_id`) USING BTREE,
  KEY `FK_single_id` (`single_id`),
  KEY `FK_child_id` (`child_id`),
  CONSTRAINT `FK_child_id` FOREIGN KEY (`child_id`) REFERENCES `child` (`child_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_couple_id` FOREIGN KEY (`couple_id`) REFERENCES `couple` (`couple_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_member_id` FOREIGN KEY (`member_id`) REFERENCES `member` (`memeber_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_single_id` FOREIGN KEY (`single_id`) REFERENCES `single` (`single_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotel`.`reserveline`
--

/*!40000 ALTER TABLE `reserveline` DISABLE KEYS */;
INSERT INTO `reserveline` (`reserveline_id`,`couple_id`,`member_id`,`single_id`,`child_id`,`check_in`,`check_out`,`reserve_date`) VALUES 
 (17,NULL,NULL,23,NULL,'12-12','12-12','16-02-2014'),
 (18,7,NULL,NULL,NULL,'12-12','12-12','20-02-2014'),
 (19,NULL,NULL,24,NULL,'WET4','EQWT','null-null-null'),
 (21,8,NULL,NULL,NULL,'ryw','ryw','20-02-2014'),
 (22,NULL,NULL,26,NULL,'12','12','16-02-2014'),
 (23,9,NULL,NULL,NULL,'12','12','20-02-2014');
/*!40000 ALTER TABLE `reserveline` ENABLE KEYS */;


--
-- Table structure for table `hotel`.`single`
--

DROP TABLE IF EXISTS `single`;
CREATE TABLE `single` (
  `single_id` int(50) NOT NULL AUTO_INCREMENT,
  `single_name` varchar(50) NOT NULL,
  `single_father_name` varchar(50) NOT NULL,
  `single_age` varchar(10) NOT NULL,
  `single_address` varchar(30) NOT NULL,
  `single_phone` varchar(20) NOT NULL,
  PRIMARY KEY (`single_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hotel`.`single`
--

/*!40000 ALTER TABLE `single` DISABLE KEYS */;
INSERT INTO `single` (`single_id`,`single_name`,`single_father_name`,`single_age`,`single_address`,`single_phone`) VALUES 
 (23,'salauddin rony','nasir uddin shah','25','ctg','54321432'),
 (24,'tarek islam','ksjgfnsd','25','ret','wt'),
 (26,'rony','nasir uddin shah','25','raozan','65456544');
/*!40000 ALTER TABLE `single` ENABLE KEYS */;


--
-- Table structure for table `hotel`.`weekly`
--

DROP TABLE IF EXISTS `weekly`;
CREATE TABLE `weekly` (
  `weekly_id` int(50) NOT NULL AUTO_INCREMENT,
  `from_date` varchar(255) NOT NULL,
  `to_date` varchar(255) NOT NULL,
  `weekly_net_income` double(50,0) NOT NULL,
  PRIMARY KEY (`weekly_id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotel`.`weekly`
--

/*!40000 ALTER TABLE `weekly` DISABLE KEYS */;
INSERT INTO `weekly` (`weekly_id`,`from_date`,`to_date`,`weekly_net_income`) VALUES 
 (31,'20-02-2014','20-02-2014',7798),
 (32,'16-03-2014','20-03-2014',8498),
 (33,'21-03-2014','27-03-2014',1000),
 (34,'05-03-2014','11-03-2014',1000);
/*!40000 ALTER TABLE `weekly` ENABLE KEYS */;


--
-- Table structure for table `hotel`.`yearly`
--

DROP TABLE IF EXISTS `yearly`;
CREATE TABLE `yearly` (
  `yearly_id` int(50) NOT NULL AUTO_INCREMENT,
  `select_year` varchar(50) DEFAULT NULL,
  `yearly_net_income` double(50,0) DEFAULT NULL,
  PRIMARY KEY (`yearly_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotel`.`yearly`
--

/*!40000 ALTER TABLE `yearly` DISABLE KEYS */;
INSERT INTO `yearly` (`yearly_id`,`select_year`,`yearly_net_income`) VALUES 
 (1,'2014',22498),
 (2,'2014',22498),
 (3,'2014',22498);
/*!40000 ALTER TABLE `yearly` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
