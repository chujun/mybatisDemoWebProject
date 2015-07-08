/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.20 : Database - mybatis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybatis`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `continent` varchar(10) NOT NULL COMMENT '洲',
  `country_ref` smallint(5) NOT NULL COMMENT '国家外键',
  `country_name` varchar(50) NOT NULL COMMENT '国家名',
  `province` varchar(50) NOT NULL COMMENT '省级别',
  `city` varchar(50) NOT NULL COMMENT '市级别',
  `area` varchar(50) NOT NULL COMMENT '区级别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='地址表';

/*Data for the table `address` */

insert  into `address`(`id`,`continent`,`country_ref`,`country_name`,`province`,`city`,`area`) values (1,'亚洲',1,'中国','安徽','黄山市','黄山区'),(2,'亚洲',1,'中国','安徽','六安','霍山'),(3,'亚洲',1,'中国','安徽','六安','霍邱');

/*Table structure for table `detail_address` */

DROP TABLE IF EXISTS `detail_address`;

CREATE TABLE `detail_address` (
  `id` bigint(15) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `address_id` smallint(5) NOT NULL,
  `detail` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `detail_address` */

insert  into `detail_address`(`id`,`user_id`,`address_id`,`detail`) values (1,2,1,'仙源镇老街'),(2,3,1,'仙源镇南关'),(3,4,3,NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) NOT NULL DEFAULT '""',
  `user_age` int(11) NOT NULL DEFAULT '0',
  `user_address` varchar(200) NOT NULL DEFAULT '""',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `employ_time` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`user_name`,`user_age`,`user_address`,`create_time`,`employ_time`) values (1,'summer',100,'shanghai,pudong','2015-07-01 15:31:49',1),(2,'chujun',25,'anhui,huangshan','2015-07-07 15:31:47',2),(3,'wangbin',25,'anhui,huangshan','2015-07-05 15:31:45',3),(4,'liting',26,'anhui,liuan','2015-07-06 15:31:42',4),(5,'lichangfen',28,'shangdong,weifang','2015-07-07 15:31:40',5),(6,'wuqingfu',26,'anhui,liuan','2015-07-08 14:54:01',6);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
