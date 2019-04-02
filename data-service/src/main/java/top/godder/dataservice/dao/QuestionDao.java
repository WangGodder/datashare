package top.godder.dataservice.dao;

import top.godder.dataapi.entry.Question;
import top.godder.dataapi.request.QuestionReq;

import java.util.List;

/**
 * @author: godder
 * @date: 2019/4/2
 */
public interface QuestionDao {
    Question findQuestionById(Long id);

    List<Question> findAllQuestionById();

    List<Question> findQuestionByReq(QuestionReq req);

    boolean addQuestion(Question question);

    boolean updateQuestion(Question question);

    boolean deleteQuestion(Long id);
}
