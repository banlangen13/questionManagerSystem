package com.ruoyi.system.service.impl;


import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysQuestion;
import com.ruoyi.system.mapper.SysQuestionMapper;
import com.ruoyi.system.service.ISysQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysQuestionServiceImpl implements ISysQuestionService{

    @Autowired
    private SysQuestionMapper sysQuestionMapper;

    @Override
    public List<SysQuestion> selectQuestionList(SysQuestion question) {
        List<SysQuestion> list = sysQuestionMapper.selectQuestionList(question);
        return list;
    }

    @Override
    public int insertQuestion(SysQuestion question) {
        //sysQuestionMapper.insertQuestion(question);
        return 1;
    }
}
