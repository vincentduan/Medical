-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: medical
-- ------------------------------------------------------
-- Server version	5.7.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `doctorid` int(11) DEFAULT NULL COMMENT '医生主键',
  `doctor_name` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `document` longtext COMMENT '文章内容',
  `category_parent` int(11) DEFAULT NULL COMMENT '文章所属科室分类',
  `category_child` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL COMMENT '审核状态',
  `info` varchar(255) DEFAULT NULL COMMENT '备注',
  `summary` varchar(255) DEFAULT NULL COMMENT '文章概要',
  `createtime` timestamp NULL DEFAULT NULL COMMENT '添加时间',
  `updatetime` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `isDel` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='医生上传文章';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` VALUES (1,2,'doc2','title1','wenzhangneirong1',1,2,'0','sdfs','摘要1',NULL,NULL,1),(2,2,'doc2','title2','<p>这里写你的内容2<img alt=\"mountietocat.png\" src=\"/Medical/resources/image/20160826/1472200068847013663.png\" title=\"1472200068847013663.png\"/></p>',1,2,'0',NULL,'摘要2','2016-08-26 08:27:54',NULL,1),(3,2,'doc2','title3','<p><img alt=\"Chrysanthemum.jpg\" src=\"/Medical/resources/image/20160826/1472201381782094370.jpg\" title=\"1472201381782094370.jpg\"/>哈哈</p>',1,3,'0',NULL,'摘要3','2016-08-26 08:49:52',NULL,0);
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `article_category`
--

DROP TABLE IF EXISTS `article_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `article_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '分类名称',
  `parent_id` int(11) DEFAULT NULL COMMENT '父分类',
  `parent_name` varchar(255) DEFAULT NULL COMMENT '父分类名称',
  `info` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `isDel` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article_category`
--

LOCK TABLES `article_category` WRITE;
/*!40000 ALTER TABLE `article_category` DISABLE KEYS */;
INSERT INTO `article_category` VALUES (1,'儿科',0,NULL,NULL,0),(2,'儿科口腔',1,'儿科',NULL,0),(3,'儿科骨骼',1,'儿科',NULL,0);
/*!40000 ALTER TABLE `article_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '科室名称',
  `brief` varchar(255) DEFAULT NULL COMMENT '简介',
  `info` varchar(255) DEFAULT NULL COMMENT '信息',
  `createTime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `updateTime` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `isDel` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='科室表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'心血管科','这是心血管科的简介','这是新心血管科的简介',NULL,NULL,NULL),(2,'骨科','这是简介','这是骨科简介',NULL,NULL,NULL);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctor` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `accounttype` varchar(255) DEFAULT '1' COMMENT '账户类型',
  `isRealname` varchar(255) DEFAULT NULL COMMENT '认证类型',
  `licenseNum` varchar(255) DEFAULT NULL COMMENT '医师执照编号',
  `telphone` varchar(255) DEFAULT NULL COMMENT '联系方式',
  `status` varchar(255) DEFAULT NULL COMMENT '状态',
  `role` varchar(255) DEFAULT NULL COMMENT '角色',
  `email` varchar(255) DEFAULT NULL COMMENT '电子邮箱',
  `hospital` varchar(255) DEFAULT NULL COMMENT '医院',
  `department` varchar(255) DEFAULT NULL COMMENT '科室',
  `brief` varchar(255) DEFAULT NULL COMMENT '简介',
  `info` varchar(255) DEFAULT NULL COMMENT '备注',
  `score` decimal(4,2) DEFAULT NULL COMMENT '评分',
  `fansNum` int(11) DEFAULT NULL COMMENT '粉丝数',
  `price` int(11) DEFAULT NULL COMMENT '价格',
  `advantage` varchar(255) DEFAULT NULL COMMENT '擅长疾病',
  `background` varchar(255) DEFAULT NULL COMMENT '医学教育背景',
  `achievement` varchar(255) DEFAULT NULL COMMENT '个人荣誉',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像存储地址',
  `createTime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `updateTime` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `englishName` varchar(255) DEFAULT NULL COMMENT '英文姓名',
  `workingExp` varchar(255) DEFAULT NULL COMMENT '从医经历',
  `hasPersonalClinic` varchar(255) DEFAULT NULL COMMENT '是否有个人诊所:1-有,0-没有',
  `personalClinicInfo` varchar(255) DEFAULT NULL COMMENT '个人诊所信息',
  `isDel` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='医生信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (1,'admin','admin','0','1','123213','15801202091','1','主任','2546469650@qq.com','hospital1','1','aaa','dfd',22.00,2345,90,'naoliu','wu','huo',NULL,NULL,NULL,'admin','fff','1','w',0),(2,'doc2','222','1','2','2313','22222','1','副主任','222','11q','2','df','ss',20.00,99,80,'xinzang','w','sf',NULL,NULL,NULL,'suck','sdf','1','f',0),(3,'doc3','333','1','1','112','110','1','操刀手','1111133333','水电费水电费','1','斯蒂芬斯蒂芬是否是对方','啊啊啊',1.00,1,98,'sd','发送到发','玩儿',NULL,NULL,NULL,'weer','对方水电费','1','werwer',0),(4,'vicnent2',NULL,'1',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'vincent234',NULL,'1',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(22,'æ',NULL,'1',NULL,NULL,'1','0','1',NULL,'1','1',NULL,NULL,1.00,NULL,1,'1','1','1',NULL,NULL,NULL,'11','1','1','1',0),(23,'a',NULL,'1',NULL,NULL,'c','0','f',NULL,'d','e',NULL,NULL,2.00,NULL,3,'g','h','i',NULL,NULL,NULL,'b','j','k','l',0),(24,'习近平',NULL,'1',NULL,NULL,'15801202091','0','主任',NULL,'武警医院','骨科',NULL,NULL,9.00,NULL,100,'绘画','硕士','没有',NULL,NULL,NULL,'xijinping','也么有','0','很好',0),(25,'white55kai',NULL,'1',NULL,NULL,'12325456985','0','yisheng',NULL,'hospital23','dep2',NULL,NULL,90.00,NULL,80,'hah','sdf','f',NULL,NULL,NULL,'white','sdf','1','ss',0),(26,'2',NULL,'1',NULL,NULL,'11111111111','1','1',NULL,'1','1',NULL,NULL,1.00,NULL,1,'1','1','1',NULL,NULL,NULL,'3','1','1','1',0),(27,'just','sdf','1',NULL,NULL,'12345678912','0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(28,'vincent',NULL,'1',NULL,NULL,'12542136529','1','sdf',NULL,'sdf','sdf',NULL,NULL,11.00,NULL,123,'sdfsdf','sdfdfsd','fdsf',NULL,NULL,NULL,'vincentduan','fdf','1','dfdfd',0);
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor_department`
--

DROP TABLE IF EXISTS `doctor_department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctor_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `doctorid` int(11) DEFAULT NULL,
  `departmentid` varchar(255) DEFAULT NULL,
  `departmentname` varchar(255) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `createtime` timestamp NULL DEFAULT NULL,
  `updatetime` timestamp NULL DEFAULT NULL,
  `isDel` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor_department`
--

LOCK TABLES `doctor_department` WRITE;
/*!40000 ALTER TABLE `doctor_department` DISABLE KEYS */;
/*!40000 ALTER TABLE `doctor_department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor_hospital`
--

DROP TABLE IF EXISTS `doctor_hospital`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctor_hospital` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `doctorid` int(11) DEFAULT NULL,
  `hospitalid` int(11) DEFAULT NULL,
  `hospitalname` varchar(255) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `createtime` timestamp NULL DEFAULT NULL,
  `updatetime` timestamp NULL DEFAULT NULL,
  `isDel` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor_hospital`
--

LOCK TABLES `doctor_hospital` WRITE;
/*!40000 ALTER TABLE `doctor_hospital` DISABLE KEYS */;
/*!40000 ALTER TABLE `doctor_hospital` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctordate`
--

DROP TABLE IF EXISTS `doctordate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctordate` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `doctorid` int(11) DEFAULT NULL COMMENT '医生主键',
  `userid` int(11) DEFAULT NULL COMMENT '患者主键',
  `orderid` int(11) DEFAULT NULL COMMENT '订单主键',
  `orderdate` timestamp NULL DEFAULT NULL COMMENT '预约日期',
  `createtime` timestamp NULL DEFAULT NULL,
  `updatetime` timestamp NULL DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `isDel` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='医生预约表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctordate`
--

LOCK TABLES `doctordate` WRITE;
/*!40000 ALTER TABLE `doctordate` DISABLE KEYS */;
/*!40000 ALTER TABLE `doctordate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hospital`
--

DROP TABLE IF EXISTS `hospital`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hospital` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `brief` varchar(255) DEFAULT NULL,
  `createtime` timestamp NULL DEFAULT NULL,
  `updatetime` timestamp NULL DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `isdel` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospital`
--

LOCK TABLES `hospital` WRITE;
/*!40000 ALTER TABLE `hospital` DISABLE KEYS */;
/*!40000 ALTER TABLE `hospital` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order` (
  `id` int(11) NOT NULL COMMENT '主键',
  `userid` int(11) DEFAULT NULL COMMENT '客户主键',
  `doctorid` int(11) DEFAULT NULL COMMENT '医生主键',
  `hospital` varchar(255) DEFAULT NULL COMMENT '医院',
  `department` varchar(255) DEFAULT NULL COMMENT '科室',
  `symptom` varchar(255) DEFAULT NULL COMMENT '症状',
  `totalMoney` varchar(255) DEFAULT NULL COMMENT '总价格',
  `status` varchar(255) DEFAULT NULL COMMENT '订单状态 100-发布需求;101-医生受理需求;102-订单结束',
  `evaluate` varchar(255) DEFAULT NULL COMMENT '评价',
  `level` int(11) DEFAULT NULL COMMENT '满意度 1- 满意;2很满意;3-不满意',
  `createTime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `updateTime` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `info` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `isDel` tinyint(1) DEFAULT '0' COMMENT '删除标记0-正常订单状态，1-删除订单状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单服务表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `serviceseting`
--

DROP TABLE IF EXISTS `serviceseting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `serviceseting` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `doctorid` int(11) DEFAULT NULL,
  `pictureConsulting` tinyint(1) DEFAULT NULL COMMENT '图文咨询',
  `telephoneConsultation` tinyint(1) DEFAULT NULL COMMENT '电话咨询',
  `videoConsultation` tinyint(1) DEFAULT NULL COMMENT '视频咨询',
  `consultingPackage` tinyint(1) DEFAULT NULL COMMENT '咨询套餐',
  `outPatient` tinyint(1) DEFAULT NULL COMMENT '门诊加号',
  `guidance` tinyint(1) DEFAULT NULL COMMENT '院后指导',
  `info` varchar(255) DEFAULT NULL COMMENT '其他信息',
  `isDel` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='服务设置';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `serviceseting`
--

LOCK TABLES `serviceseting` WRITE;
/*!40000 ALTER TABLE `serviceseting` DISABLE KEYS */;
/*!40000 ALTER TABLE `serviceseting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `telphone` varchar(255) DEFAULT NULL COMMENT '联系方式',
  `is_vip` varchar(255) DEFAULT NULL COMMENT '是否为会员',
  `accounttype` varchar(255) DEFAULT '1' COMMENT '账户类型',
  `balance` decimal(10,0) DEFAULT NULL COMMENT '余额',
  `isRealname` varchar(255) DEFAULT NULL COMMENT '认证状态',
  `status` varchar(255) DEFAULT NULL COMMENT '状态',
  `role` int(11) DEFAULT NULL COMMENT '角色',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `brief` varchar(255) DEFAULT NULL COMMENT '简介',
  `info` varchar(255) DEFAULT NULL COMMENT '备注',
  `gender` tinyint(1) DEFAULT NULL COMMENT '性别',
  `birthday` timestamp NULL DEFAULT NULL COMMENT '生日',
  `createTime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `updateTime` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `isDel` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='普通用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'abc','111','15812345678',NULL,'1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(2,'vin','111','15812345677',NULL,'1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userfollow`
--

DROP TABLE IF EXISTS `userfollow`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userfollow` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL COMMENT '用户主键',
  `doctorid` int(11) DEFAULT NULL COMMENT '医生主键',
  `info` varchar(255) DEFAULT NULL,
  `isDel` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户关注医生信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userfollow`
--

LOCK TABLES `userfollow` WRITE;
/*!40000 ALTER TABLE `userfollow` DISABLE KEYS */;
/*!40000 ALTER TABLE `userfollow` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-06 16:38:33
