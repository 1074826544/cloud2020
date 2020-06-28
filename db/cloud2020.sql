/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50728
Source Host           : localhost:3306
Source Database       : cloud2020

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2020-06-28 12:50:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `serial` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of payment
-- ----------------------------
INSERT INTO `payment` VALUES ('1', 'test');
INSERT INTO `payment` VALUES ('2', 'ok');
INSERT INTO `payment` VALUES ('3', '9999');
