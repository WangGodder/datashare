package top.godder.dataapi.entry;

import javax.persistence.Column;
import javax.persistence.Id;

public class Auth {
    /**
     * 权限ID
     */
    @Id
    @Column(name = "auth_id")
    private Integer authId;

    /**
     * 权限名称
     */
    @Column(name = "auth_name")
    private String authName;

    /**
     * 权限信息
     */
    private String comment;

    /**
     * 获取权限ID
     *
     * @return auth_id - 权限ID
     */
    public Integer getAuthId() {
        return authId;
    }

    /**
     * 设置权限ID
     *
     * @param authId 权限ID
     */
    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    /**
     * 获取权限名称
     *
     * @return auth_name - 权限名称
     */
    public String getAuthName() {
        return authName;
    }

    /**
     * 设置权限名称
     *
     * @param authName 权限名称
     */
    public void setAuthName(String authName) {
        this.authName = authName == null ? null : authName.trim();
    }

    /**
     * 获取权限信息
     *
     * @return comment - 权限信息
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置权限信息
     *
     * @param comment 权限信息
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}