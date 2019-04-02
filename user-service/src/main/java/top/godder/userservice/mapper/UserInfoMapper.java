package top.godder.userservice.mapper;

import top.godder.common.database.BaseMapper;
import top.godder.userapi.entry.UserInfo;
import top.godder.userapi.request.UserInfoReq;

import java.util.List;

public interface UserInfoMapper extends BaseMapper<UserInfo> {
    UserInfo findUserInfoById(Long id);

    List<UserInfo> findAllUserInfo();

    List<UserInfo> findUserInfoByReq(UserInfoReq req);

    boolean addUserInfo(UserInfo userInfo);

    boolean updateUserInfo(UserInfo userInfo);

    boolean deleteUserInfo(Long id);
}