CREATE TABLE `t_file` (
  `id` varchar(200) DEFAULT NULL COMMENT '主键',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `size` bigint(20) DEFAULT NULL COMMENT '大小',
  `path` varchar(200) DEFAULT NULL COMMENT '路径'
) ENGINE=InnoDB DEFAULT CHARSET=utf8

