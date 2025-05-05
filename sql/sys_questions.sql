-- ----------------------------
-- 1、问题信息表
-- ----------------------------
CREATE TABLE sys_questions (
                               questionId VARCHAR(36) PRIMARY KEY COMMENT '问题ID，主键',
                               questionPartition VARCHAR(50) NOT NULL COMMENT '问题分区',
                               questionTitle VARCHAR(255) NOT NULL COMMENT '问题标题',
                               questionType VARCHAR(50) NOT NULL COMMENT '问题类型',
                               questionAnswer TEXT COMMENT '问题答案',
                               questionAnalysis TEXT COMMENT '问题解析',
                               status VARCHAR(20) DEFAULT 'active' COMMENT '问题状态，默认active',
                               createBy VARCHAR(50) NOT NULL COMMENT '创建人',
                               createTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，默认当前时间',
                               updateBy VARCHAR(50) COMMENT '更新人',
                               updateTime TIMESTAMP COMMENT '更新时间',
                               remark TEXT COMMENT '备注信息'
) COMMENT='问题信息表';