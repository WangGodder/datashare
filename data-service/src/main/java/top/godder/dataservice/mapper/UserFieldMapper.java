package top.godder.dataservice.mapper;

import top.godder.common.database.BaseMapper;
import top.godder.dataapi.entry.UserField;

import java.util.List;

public interface UserFieldMapper extends BaseMapper<UserField> {
    List<Long> findFieldByUser(Long userId);

    List<Long> findUserByField(Long fieldId);

    boolean addUserField(UserField userField);

    boolean deleteUserField(UserField userField);
}