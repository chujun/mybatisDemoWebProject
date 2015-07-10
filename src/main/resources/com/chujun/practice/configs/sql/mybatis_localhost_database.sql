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

/*Table structure for table `author` */

DROP TABLE IF EXISTS `author`;

CREATE TABLE `author` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(15) NOT NULL DEFAULT '""',
  `password` varchar(15) NOT NULL DEFAULT '"123456"',
  `email` varchar(30) NOT NULL DEFAULT '""',
  `bio` varchar(20) NOT NULL DEFAULT '""',
  `favourite_section` varchar(30) NOT NULL DEFAULT '""',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='作者';

/*Data for the table `author` */

insert  into `author`(`id`,`user_name`,`password`,`email`,`bio`,`favourite_section`) values (1,'\"储骏\"','\"123456\"','\"173234532@qq.com\"','\"\"','\"IT\"'),(2,'\"汪彬\"','\"123456\"','\"1534554345@qq.com\"','\"\"','\"园林\"'),(3,'\"李廷\"','\"123456\"','\"1034234@qq.com\"','\"\"','\"PHP\"');

/*Table structure for table `blog` */

DROP TABLE IF EXISTS `blog`;

CREATE TABLE `blog` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(20) NOT NULL DEFAULT '""',
  `author_id` bigint(20) NOT NULL DEFAULT '0',
  `co_author_id` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `blog` */

insert  into `blog`(`id`,`title`,`author_id`,`co_author_id`) values (1,'仙境源地',2,1),(2,'天空',1,2),(3,'youth90',3,0);

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `post_id` bigint(20) NOT NULL DEFAULT '0',
  `name` varchar(20) NOT NULL DEFAULT '""',
  `comment` varchar(500) NOT NULL DEFAULT '""',
  `create_time` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

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

/*Table structure for table `post` */

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blog_id` bigint(20) NOT NULL DEFAULT '0',
  `author_id` int(12) NOT NULL DEFAULT '0',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `section` varchar(20) COLLATE utf8_esperanto_ci NOT NULL DEFAULT '""',
  `subject` varchar(20) COLLATE utf8_esperanto_ci NOT NULL DEFAULT '""',
  `draft` varchar(20) COLLATE utf8_esperanto_ci NOT NULL DEFAULT '""',
  `body` text COLLATE utf8_esperanto_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_esperanto_ci;

/*Data for the table `post` */

/*Table structure for table `tag` */

DROP TABLE IF EXISTS `tag`;

CREATE TABLE `tag` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '""',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tag` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) NOT NULL DEFAULT '""',
  `user_age` int(11) NOT NULL DEFAULT '0',
  `user_address` varchar(200) NOT NULL DEFAULT '""',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `employ_time` bigint(20) NOT NULL DEFAULT '0',
  `employ_status` smallint(4) NOT NULL DEFAULT '1' COMMENT '雇佣状态，0：正常，1：试用，2：离职',
  `salary` decimal(10,2) NOT NULL DEFAULT '2000.00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`user_name`,`user_age`,`user_address`,`create_time`,`employ_time`,`employ_status`,`salary`) values (1,'summer',100,'shanghai,pudong','2015-07-01 15:31:49',1036409160540,0,2000.00),(2,'chujun',25,'anhui,huangshan','2015-07-07 15:31:47',1236209160540,0,2000.00),(3,'wangbin',25,'anhui,huangshan','2015-07-05 15:31:45',1434409160540,0,2000.00),(4,'liting',26,'anhui,liuan','2015-07-06 15:31:42',1436407160540,0,2000.00),(5,'lichangfen',28,'shangdong,weifang','2015-07-07 15:31:40',1236409160540,0,2000.00),(6,'wuqingfu',26,'anhui,liuan','2015-07-08 14:54:01',1336409160540,1,2000.00),(11,'chujiaqi',24,'anhui,huangshan','2015-07-09 11:39:00',1436413140945,2,12345.35),(29,'chujiaqi',24,'anhui,huangshan','2015-07-10 11:14:09',1436498049125,0,12345.35);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
