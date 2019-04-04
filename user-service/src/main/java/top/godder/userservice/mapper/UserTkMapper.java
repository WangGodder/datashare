package top.godder.userservice.mapper;

import top.godder.common.database.BaseMapper;
import top.godder.userapi.entry.UserTk;

public interface UserTkMapper extends BaseMapper<UserTk> {
    UserTk findUserTkByUserName(String userName);

    boolean addUserTk(UserTk userTk);

    Integer updateUserTk(UserTk userTk);

    Integer deleteUserTk(UserTk userTk);
}