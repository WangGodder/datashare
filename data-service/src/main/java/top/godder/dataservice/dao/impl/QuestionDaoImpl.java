package top.godder.dataservice.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.godder.dataapi.entry.Question;
import top.godder.dataapi.request.QuestionReq;
import top.godder.dataservice.dao.QuestionDao;
import top.godder.dataservice.mapper.QuestionMapper;

import java.util.List;

/**
 * @author: godder
 * @date: 2019/4/2
 */
@Service
public class QuestionDaoImpl implements QuestionDao {
    @Autowired
    private QuestionMapper mapper;

    @Override
    public Question findQuestionById(Long id) {
        return mapper.findQuestionById(id);
    }

    @Override
    public List<Question> findAllQuestionById() {
        return mapper.findAllQuestionById();
    }

    @Override
    public List<Question> findQuestionByReq(QuestionReq req) {
        return mapper.findQuestionByReq(req);
    }

    @Override
    public boolean addQuestion(Question question) {
        return mapper.addQuestion(question);
    }

    @Override
    public boolean updateQuestion(Question question) {
        return mapper.updateQuestion(question);
    }

    @Override
    public boolean deleteQuestion(Long id) {
        return mapper.deleteQuestion(id);
    }
}
