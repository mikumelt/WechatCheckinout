SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`
(
  `id`      int NOT NULL,
  `name`    varchar(30),
  `pid`     int,
  PRIMARY KEY (`id`),
  index `idx_name` (`name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;