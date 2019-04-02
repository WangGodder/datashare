package top.godder.dataservice.mapper;

import top.godder.common.database.BaseMapper;
import top.godder.dataapi.entry.Role;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {
    Role findRoleById(Long id);

    List<Role> findAllRole();

    boolean addRole(Role role);

    boolean updateRole(Role role);

    boolean deleteRole(Long id);
}