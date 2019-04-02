package top.godder.userservice.mapper;

import top.godder.common.database.BaseMapper;
import top.godder.userapi.entry.UserTk;

public interface UserTkMapper extends BaseMapper<UserTk> {
    UserTk findUserTkByUserName(String userName);

    boolean addUserTk(UserTk userTk);

    boolean updateUserTk(UserTk userTk);

    boolean deleteUserTk(UserTk userTk);
}