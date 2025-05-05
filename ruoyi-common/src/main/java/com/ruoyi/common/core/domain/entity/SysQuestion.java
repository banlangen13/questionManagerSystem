package com.ruoyi.common.core.domain.entity;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.List;

public class SysQuestion extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 问题ID */
    @Excel(name = "问题序号")
    private String questionId;

    /** 问题标题 */
    @Excel(name = "问题标题")
    private String questionTitle;

    /** 问题分区 */
    @Excel(name = "问题分区")
    private String questionPartition;

    /** 问题类型 */
    @Excel(name = "问题类型")
    private String questionType;

    /** 答案列表 */
    @Excel(name = "答案列表")
    private List<SysAnswer> questionAnswerList;

    /** 问题答案 */
    @Excel(name = "正确答案")
    private List<SysAnswer> questionAnswer;

    /** 问题解析 */
    @Excel(name = "问题解析")
    private String questionAnalysis;

    /** 问题状态 */
    @Excel(name = "问题状态")
    private String status;

    @Excel(name = "是否删除")
    private String delFlag;


    public SysQuestion() {
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public SysQuestion(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public List<SysAnswer> getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(List<SysAnswer> questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestionPartition() {
        return questionPartition;
    }

    public void setQuestionPartition(String questionPartition) {
        this.questionPartition = questionPartition;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionAnalysis() {
        return questionAnalysis;
    }

    public void setQuestionAnalysis(String questionAnalysis) {
        this.questionAnalysis = questionAnalysis;
    }
    public List<SysAnswer> getQuestionAnswerList() {
        return questionAnswerList;
    }

    public void setQuestionAnswerList(List<SysAnswer> questionAnswerList) {
        this.questionAnswerList = questionAnswerList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SysQuestion{" +
                "questionId='" + questionId + '\'' +
                ", questionTitle='" + questionTitle + '\'' +
                ", questionPartition='" + questionPartition + '\'' +
                ", questionType='" + questionType + '\'' +
                ", questionAnswerList='" + questionAnswerList + '\'' +
                ", questionAnswer='" + questionAnswer + '\'' +
                ", questionAnalysis='" + questionAnalysis + '\'' +
                ", status='" + status + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
