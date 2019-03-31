package top.godder.dataapi.entry;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Answer {
    @Id
    @Column(name = "answer_id")
    private Long answerId;

    /**
     * 问题ID
     */
    @Column(name = "question_id")
    private Long questionId;

    /**
     * 回答人
     */
    @Column(name = "answer_user")
    private Long answerUser;

    /**
     * 回答内容文件的名称
     */
    @Column(name = "answer_file_name")
    private String answerFileName;

    /**
     * 回答内容(可选)
     */
    @Column(name = "answer_content")
    private String answerContent;

    /**
     * 回答时间
     */
    @Column(name = "answer_date")
    private Date answerDate;

    /**
     * @return answer_id
     */
    public Long getAnswerId() {
        return answerId;
    }

    /**
     * @param answerId
     */
    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    /**
     * 获取问题ID
     *
     * @return question_id - 问题ID
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * 设置问题ID
     *
     * @param questionId 问题ID
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * 获取回答人
     *
     * @return answer_user - 回答人
     */
    public Long getAnswerUser() {
        return answerUser;
    }

    /**
     * 设置回答人
     *
     * @param answerUser 回答人
     */
    public void setAnswerUser(Long answerUser) {
        this.answerUser = answerUser;
    }

    /**
     * 获取回答内容文件的名称
     *
     * @return answer_file_name - 回答内容文件的名称
     */
    public String getAnswerFileName() {
        return answerFileName;
    }

    /**
     * 设置回答内容文件的名称
     *
     * @param answerFileName 回答内容文件的名称
     */
    public void setAnswerFileName(String answerFileName) {
        this.answerFileName = answerFileName == null ? null : answerFileName.trim();
    }

    /**
     * 获取回答内容(可选)
     *
     * @return answer_content - 回答内容(可选)
     */
    public String getAnswerContent() {
        return answerContent;
    }

    /**
     * 设置回答内容(可选)
     *
     * @param answerContent 回答内容(可选)
     */
    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent == null ? null : answerContent.trim();
    }

    /**
     * 获取回答时间
     *
     * @return answer_date - 回答时间
     */
    public Date getAnswerDate() {
        return answerDate;
    }

    /**
     * 设置回答时间
     *
     * @param answerDate 回答时间
     */
    public void setAnswerDate(Date answerDate) {
        this.answerDate = answerDate;
    }
}