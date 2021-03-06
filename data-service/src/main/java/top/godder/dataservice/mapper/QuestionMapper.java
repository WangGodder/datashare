package top.godder.dataservice.mapper;

import top.godder.common.database.BaseMapper;
import top.godder.dataapi.entry.Question;
import top.godder.dataapi.request.QuestionReq;

import java.util.List;

public interface QuestionMapper extends BaseMapper<Question> {
    Question findQuestionById(Long id);

    List<Question> findAllQuestionById();

    List<Question> findQuestionByReq(QuestionReq req);

    boolean addQuestion(Question question);

    boolean updateQuestion(Question question);

    boolean deleteQuestion(Long id);
}