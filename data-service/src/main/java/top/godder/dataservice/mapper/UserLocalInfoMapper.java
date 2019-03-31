package top.godder.dataservice.mapper;

import top.godder.common.database.BaseMapper;
import top.godder.dataapi.entry.UserLocalInfo;
import top.godder.dataapi.request.UserLocalInfoReq;

import java.util.List;

public interface UserLocalInfoMapper extends BaseMapper<UserLocalInfo> {
    UserLocalInfo findUserLocalInfoById(Long id);

    List<UserLocalInfo> findUserLocalInfoByReq(UserLocalInfoReq req);

    boolean updateUserLocalInfo(UserLocalInfo userLocalInfo);

    boolean deleteUserLocalInfo(UserLocalInfo userLocalInfo);
}