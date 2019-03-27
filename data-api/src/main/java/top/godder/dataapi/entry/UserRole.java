package top.godder.dataapi.entry;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user_role")
public class UserRole {
    /**
     * 角色ID
     */
    @Id
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 角色命名
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色级别
     */
    @Column(name = "role_level")
    private Integer roleLevel;

    /**
     * 级别命名
     */
    @Column(name = "level_name")
    private String levelName;

    /**
     * 获取角色ID
     *
     * @return role_id - 角色ID
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色命名
     *
     * @return role_name - 角色命名
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色命名
     *
     * @param roleName 角色命名
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 获取角色级别
     *
     * @return role_level - 角色级别
     */
    public Integer getRoleLevel() {
        return roleLevel;
    }

    /**
     * 设置角色级别
     *
     * @param roleLevel 角色级别
     */
    public void setRoleLevel(Integer roleLevel) {
        this.roleLevel = roleLevel;
    }

    /**
     * 获取级别命名
     *
     * @return level_name - 级别命名
     */
    public String getLevelName() {
        return levelName;
    }

    /**
     * 设置级别命名
     *
     * @param levelName 级别命名
     */
    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }
}