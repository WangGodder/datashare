package top.godder.userservice.dao;

import top.godder.dataapi.entry.UserTk;

/**
 * @author: godder
 * @date: 2019/3/27
 */
public interface UserTkDao {
    UserTk findUserTkByUserName(String userName);

    boolean addUserTk(UserTk userTk);

    boolean updateUserTk(UserTk userTk);

    boolean deleteUserTk(UserTk userTk);
}
