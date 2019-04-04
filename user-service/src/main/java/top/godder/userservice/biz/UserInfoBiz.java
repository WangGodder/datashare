package top.godder.userservice.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.godder.userapi.entry.UserInfo;
import top.godder.userapi.request.UserInfoReq;
import top.godder.userservice.dao.UserInfoDao;

import java.util.List;

/**
 * @author: godder
 * @date: 2019/4/5
 */
@Service
public class UserInfoBiz {
    @Autowired
    private UserInfoDao dao;

    public UserInfo getUserInfoById(Long userId) {
        return dao.findUserInfoById(userId);
    }

    public List<UserInfo> getAllUserInfo() {
        return dao.findAllUserInfo();
    }

    public List<UserInfo> requestUserInfo(UserInfoReq req) {
        return dao.findUserInfoByReq(req);
    }

    public boolean addUserInfo(UserInfo userInfo) {
        return dao.addUserInfo(userInfo);
    }

    public boolean updateUserInfo(UserInfo userInfo) {
        return dao.updateUserInfo(userInfo) == 1;
    }

    public boolean deleteUserInfo(Long userId) {
        return dao.deleteUserInfo(userId) == 1;
    }
}
