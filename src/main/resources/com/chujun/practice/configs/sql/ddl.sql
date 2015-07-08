Create TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `userAge` int(11) DEFAULT NULL,
  `userAddress` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*==============================================================*/
/* 表 address                     */
/*==============================================================*/
CREATE TABLE `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `continent` varchar(10) NOT NULL COMMENT '洲',
  `country_ref` smallint(5) NOT NULL COMMENT '国家外键',
  `country_name` varchar(50) NOT NULL COMMENT '国家名',
  `province` varchar(50) NOT NULL COMMENT '省级别',
  `city` varchar(50) NOT NULL COMMENT '市级别',
  `area` varchar(50) NOT NULL COMMENT '区级别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='地址表'


/*==============================================================*/
/* 表 detail_address                     */
/*==============================================================*/
CREATE TABLE `detail_address`(  
  `id` BIGINT(15) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL,
  `address_id` SMALLINT(5) NOT NULL,
  `detail` VARCHAR(100),
  PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_general_ci;
