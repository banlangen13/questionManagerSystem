package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.entity.SysQuestion;
import com.ruoyi.common.core.domain.entity.SysRole;

import java.util.List;

public interface SysQuestionMapper {
    /**
     * 根据条件分页查询角色数据
     *
     * @param question 角色信息
     * @return 角色数据集合信息
     */
    public List<SysQuestion> selectQuestionList(SysQuestion question);
}
