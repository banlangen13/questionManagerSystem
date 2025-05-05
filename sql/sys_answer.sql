CREATE TABLE `sys_answer` (
                              `answerId` BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY COMMENT '答案ID（主键）',
                              `toQuestionId` BIGINT UNSIGNED NOT NULL COMMENT '所属题目ID',
                              `option` VARCHAR(20) COMMENT '选项（如ABCDE）',
                              `content` TEXT NOT NULL COMMENT '答案内容',
                              `status` VARCHAR(50) DEFAULT '0' COMMENT '问题状态（0正常 1停用）',
                              `createBy` VARCHAR(50) NOT NULL COMMENT '创建人',
                              `createTime` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                              `updateBy` VARCHAR(50) COMMENT '更新人',
                              `updateTime` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                              `isRight` TINYINT DEFAULT 0 CHECK (`isRight` IN (0, 1)) COMMENT '是否正确（0否 1是）',
                              `delFlag` TINYINT DEFAULT 0 CHECK (`delFlag` IN (0, 1)) COMMENT '删除标识（0未删除 1已删除）',
                              `remark` VARCHAR(500) COMMENT '备注信息'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='问题答案表';