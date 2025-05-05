package com.ruoyi.web.controller.system;


import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysQuestion;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.framework.shiro.util.AuthorizationUtils;
import com.ruoyi.system.service.ISysQuestionService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/system/question")
public class SysQuestionController extends BaseController {

    private String prefix = "system/question";

    @Autowired
    private ISysQuestionService questionService;


    /**
     * 打开题库页面
     * @return
     */
    @RequiresPermissions("system:question:view")
    @GetMapping
    public String question(){
        return prefix + "/question";
    }

    /**
     * 获取题库列表
     * @param question
     * @return
     */
    @RequiresPermissions("system:question:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysQuestion question){
        startPage();
        List<SysQuestion> list = questionService.selectQuestionList(question);
        return getDataTable(list);
    }

    /**
     * 新增题目
     */
    @RequiresPermissions("system:question:add")
    @GetMapping("/add")
    public String add(){
        return prefix + "/add";
    }

    /**
     * 新增保存
     * @param question
     * @return
     */
    @RequiresPermissions("system:question:add")
    @Log(title = "题库管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@Validated SysQuestion question){
        question.setCreateBy(getLoginName());
        AuthorizationUtils.clearAllCachedAuthorizationInfo();
        return toAjax(questionService.insertQuestion(question));
    }
}
