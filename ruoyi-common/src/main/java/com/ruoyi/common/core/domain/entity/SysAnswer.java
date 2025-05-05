package com.ruoyi.common.core.domain.entity;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

public class SysAnswer extends BaseEntity {

    @Excel(name = "答案序号")
    private String answerId;

    @Excel(name = "所属问题")
    private String toQuestionId;

    @Excel(name = "选项")
    private String option;

    @Excel(name = "内容")
    private String content;

    @Excel(name = "答案状态")
    private String status;

    @Excel(name = "是否正确")
    private String isRight;

    @Excel(name = "是否删除")
    private String delFlag;

    public SysAnswer() {

    }

    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    public String getToQuestionId() {
        return toQuestionId;
    }

    public void setToQuestionId(String toQuestionId) {
        this.toQuestionId = toQuestionId;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsRight() {
        return isRight;
    }

    public void setIsRight(String isRight) {
        this.isRight = isRight;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }


    @Override
    public String toString() {
        return "SysAnswer{" +
                "answerId='" + answerId + '\'' +
                ", toQuestionId='" + toQuestionId + '\'' +
                ", option='" + option + '\'' +
                ", content='" + content + '\'' +
                ", status='" + status + '\'' +
                ", isRight='" + isRight + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
