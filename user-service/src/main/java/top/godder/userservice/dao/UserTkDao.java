package top.godder.userservice.dao;

import top.godder.userapi.entry.UserTk;

/**
 * @author: godder
 * @date: 2019/3/27
 */
public interface UserTkDao {
    UserTk findUserTkByUserName(String userName);

    boolean addUserTk(UserTk userTk);

    Integer updateUserTk(UserTk userTk);

    Integer deleteUserTk(UserTk userTk);
}
