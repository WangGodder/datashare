package top.godder.userservice.dao;

import top.godder.userapi.entry.UserInfo;
import top.godder.userapi.request.UserInfoReq;

import java.util.List;

/**
 * @author: godder
 * @date: 2019/3/27
 */
public interface UserInfoDao {
    UserInfo findUserInfoById(Long id);

    List<UserInfo> findAllUserInfo();

    List<UserInfo> findUserInfoByReq(UserInfoReq req);

    boolean addUserInfo(UserInfo userInfo);

    boolean updateUserInfo(UserInfo userInfo);

    boolean deleteUserInfo(Long id);
}
