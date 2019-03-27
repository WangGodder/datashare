package top.godder.userservice.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.godder.dataapi.entry.UserInfo;
import top.godder.dataapi.request.UserInfoReq;
import top.godder.userservice.dao.UserInfoDao;
import top.godder.userservice.mapper.UserInfoMapper;

import java.util.List;

/**
 * @author: godder
 * @date: 2019/3/27
 */
@Service
public class UserInfoDaoImpl implements UserInfoDao {
    @Autowired
    private UserInfoMapper mapper;

    @Override
    public UserInfo findUserInfoById(Long id) {
        return mapper.findUserInfoById(id);
    }

    @Override
    public List<UserInfo> findAllUserInfo() {
        return mapper.findAllUserInfo();
    }

    @Override
    public List<UserInfo> findUserInfoByReq(UserInfoReq req) {
        return mapper.findUserInfoByReq(req);
    }

    @Override
    public boolean addUserInfo(UserInfo userInfo) {
        return mapper.addUserInfo(userInfo);
    }

    @Override
    public boolean updateUserInfo(UserInfo userInfo) {
        return mapper.updateUserInfo(userInfo);
    }

    @Override
    public boolean deleteUserInfo(UserInfo userInfo) {
        return mapper.deleteUserInfo(userInfo);
    }
}
