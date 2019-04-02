package top.godder.userservice.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.godder.userapi.entry.UserTk;
import top.godder.userservice.dao.UserTkDao;
import top.godder.userservice.mapper.UserTkMapper;

/**
 * @author: godder
 * @date: 2019/3/27
 */
@Service
public class UserTkDaoImpl implements UserTkDao {
    @Autowired
    private UserTkMapper mapper;

    @Override
    public UserTk findUserTkByUserName(String userName) {
        return mapper.findUserTkByUserName(userName);
    }

    @Override
    public boolean addUserTk(UserTk userTk) {
        return mapper.addUserTk(userTk);
    }

    @Override
    public boolean updateUserTk(UserTk userTk) {
        return mapper.updateUserTk(userTk);
    }

    @Override
    public boolean deleteUserTk(UserTk userTk) {
        return false;
    }
}
