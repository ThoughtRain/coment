/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2019-08-13 16:16:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bu_token
-- ----------------------------
DROP TABLE IF EXISTS `bu_token`;
CREATE TABLE `bu_token` (
  `id` bigint(80) DEFAULT NULL,
  `userId` bigint(80) NOT NULL,
  `buildTime` int(11) DEFAULT NULL,
  `token` varchar(300) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of bu_token
-- ----------------------------

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('2');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '6', 'junjun0');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userName` varchar(16) NOT NULL,
  `userAge` int(16) NOT NULL,
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `userPassWord` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('rui', '22', '1', '123456');
INSERT INTO `userinfo` VALUES ('long', '12', '2', '123456');
INSERT INTO `userinfo` VALUES ('xxx', '13', '3', '123456');
INSERT INTO `userinfo` VALUES ('12xx', '17', '4', '123456');
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                        `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
                        `username` varchar(64) NOT NULL COMMENT '用户名',
                        `password` varchar(64) NOT NULL COMMENT '密码',
                        PRIMARY KEY (`id`),
                        UNIQUE KEY `users_username_uindex` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'tom', '123456');
INSERT INTO `user` VALUES ('2', 'rose', '888888');
INSERT INTO `user` VALUES ('3', 'mark', 'qwerty');
INSERT INTO `user` VALUES ('4', 'jack', 'qaz123');
INSERT INTO `user` VALUES ('5', 'mali', 'uio890');

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `emp`
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
                       `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
                       `user_id` int(11) DEFAULT NULL COMMENT '用户编号',
                       `realname` varchar(32) NOT NULL COMMENT '姓名',
                       `email` varchar(64) DEFAULT NULL COMMENT '邮箱',
                       PRIMARY KEY (`id`),
                       KEY `emp_user_id` (`user_id`),
                       CONSTRAINT `emp_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='员工表';

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('1', '1', '汤姆', 'tom@gmail.com');
INSERT INTO `emp` VALUES ('2', '2', '梅贵', 'rose@163.com');
INSERT INTO `emp` VALUES ('3', '3', '马克', 'mark@sina.com');
INSERT INTO `emp` VALUES ('4', '4', '岳翰', 'jack@gmail.com');
INSERT INTO `emp` VALUES ('5', '5', '马丽', 'mali@sina.com');
