package com.blog.common.entity;

import javax.persistence.*;

/**
 * 用户租表
 */
@Table(name = "user_group")
public class UserGroup {
    /**
     * 自增ID号
     */
    @Id
    @Column(name = "g_id")
    private Byte gId;

    /**
     * 用户组ID
     */
    @Column(name = "group_id")
    private Byte groupId;

    /**
     * 用户组名
     */
    @Column(name = "group_name")
    private String groupName;

    /**
     * 用户权限
     */
    @Column(name = "group_power")
    private String groupPower;

    /**
     * 获取自增ID号
     *
     * @return g_id - 自增ID号
     */
    public Byte getgId() {
        return gId;
    }

    /**
     * 设置自增ID号
     *
     * @param gId 自增ID号
     */
    public void setgId(Byte gId) {
        this.gId = gId;
    }

    /**
     * 获取用户组ID
     *
     * @return group_id - 用户组ID
     */
    public Byte getGroupId() {
        return groupId;
    }

    /**
     * 设置用户组ID
     *
     * @param groupId 用户组ID
     */
    public void setGroupId(Byte groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取用户组名
     *
     * @return group_name - 用户组名
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置用户组名
     *
     * @param groupName 用户组名
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 获取用户权限
     *
     * @return group_power - 用户权限
     */
    public String getGroupPower() {
        return groupPower;
    }

    /**
     * 设置用户权限
     *
     * @param groupPower 用户权限
     */
    public void setGroupPower(String groupPower) {
        this.groupPower = groupPower;
    }
}