package com.blog.common.entity;

import javax.persistence.*;

/**
 * 功能权限表
 */
@Table(name = "power_list")
public class PowerList {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "p_id")
    private Integer pId;

    /**
     * 权限ID
     */
    @Column(name = "power_id")
    private Integer powerId;

    /**
     * 权限描述
     */
    @Column(name = "power_name")
    private String powerName;

    /**
     * 获取自增ID
     *
     * @return p_id - 自增ID
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * 设置自增ID
     *
     * @param pId 自增ID
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * 获取权限ID
     *
     * @return power_id - 权限ID
     */
    public Integer getPowerId() {
        return powerId;
    }

    /**
     * 设置权限ID
     *
     * @param powerId 权限ID
     */
    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    /**
     * 获取权限描述
     *
     * @return power_name - 权限描述
     */
    public String getPowerName() {
        return powerName;
    }

    /**
     * 设置权限描述
     *
     * @param powerName 权限描述
     */
    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }
}