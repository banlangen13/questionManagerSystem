package com.ruoyi.system.service;


import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysQuestion;

import java.util.List;

public interface ISysQuestionService {

    /**
     * 获取问题列表
     * @param question
     * @return
     */
    public List<SysQuestion> selectQuestionList(SysQuestion question);

    public int insertQuestion(SysQuestion question);
}
