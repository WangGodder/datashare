package top.godder.dataservice.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.godder.dataapi.entry.UserLocalInfo;
import top.godder.dataapi.request.UserLocalInfoReq;
import top.godder.dataservice.dao.UserLocalInfoDao;
import top.godder.dataservice.mapper.UserLocalInfoMapper;

import java.util.List;

/**
 * @author: godder
 * @date: 2019/4/1
 */
@Service
public class UserLocalInfoDaoImpl implements UserLocalInfoDao {
    @Autowired
    private UserLocalInfoMapper mapper;

    @Override
    public UserLocalInfo findUserLocalInfoById(Long id) {
        return mapper.findUserLocalInfoById(id);
    }

    @Override
    public List<UserLocalInfo> findUserLocalInfoByReq(UserLocalInfoReq req) {
        return mapper.findUserLocalInfoByReq(req);
    }

    @Override
    public boolean addUserLocalInfo(UserLocalInfo userLocalInfo) {
        return mapper.addUserLocalInfo(userLocalInfo);
    }

    @Override
    public boolean updateUserLocalInfo(UserLocalInfo userLocalInfo) {
        return mapper.updateUserLocalInfo(userLocalInfo);
    }

    @Override
    public boolean deleteUserLocalInfo(Long id) {
        return mapper.deleteUserLocalInfo(id);
    }
}
