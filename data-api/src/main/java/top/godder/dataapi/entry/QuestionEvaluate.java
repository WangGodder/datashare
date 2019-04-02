package top.godder.dataapi.entry;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "question_evaluate")
public class QuestionEvaluate {
    @Column(name = "question_id")
    private Long questionId;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 提问者对回答的评价级别(1-5分)
     */
    @Column(name = "answer_level")
    private Integer answerLevel;

    /**
     * @return question_id
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * @param questionId
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取提问者对回答的评价级别(1-5分)
     *
     * @return answer_level - 提问者对回答的评价级别(1-5分)
     */
    public Integer getAnswerLevel() {
        return answerLevel;
    }

    /**
     * 设置提问者对回答的评价级别(1-5分)
     *
     * @param answerLevel 提问者对回答的评价级别(1-5分)
     */
    public void setAnswerLevel(Integer answerLevel) {
        this.answerLevel = answerLevel;
    }
}