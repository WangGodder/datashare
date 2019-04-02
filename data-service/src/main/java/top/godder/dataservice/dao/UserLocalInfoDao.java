package top.godder.dataservice.dao;

import top.godder.dataapi.entry.UserLocalInfo;
import top.godder.dataapi.request.UserLocalInfoReq;

import java.util.List;

/**
 * @author: godder
 * @date: 2019/4/1
 */
public interface UserLocalInfoDao {
    UserLocalInfo findUserLocalInfoById(Long id);

    List<UserLocalInfo> findUserLocalInfoByReq(UserLocalInfoReq req);

    boolean addUserLocalInfo(UserLocalInfo userLocalInfo);

    boolean updateUserLocalInfo(UserLocalInfo userLocalInfo);

    boolean deleteUserLocalInfo(Long id);
}
