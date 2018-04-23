package com.blog.common.entity;

import javax.persistence.*;

/**
 * 用户表
 */
@Table(name = "user")
public class User {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户组ID
     */
    @Column(name = "group_id")
    private Integer groupId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    @Column(name = "user_pwd")
    private String userPwd;

    /**
     * 用户手机号码
     */
    @Column(name = "user_phone")
    private Integer userPhone;

    /**
     * 用户性别
     */
    @Column(name = "user_sex")
    private String userSex;

    /**
     * 用户QQ号码
     */
    @Column(name = "user_qq")
    private Integer userQq;

    /**
     * 用户EMAIL地址
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * 用户地址
     */
    @Column(name = "user_address")
    private String userAddress;

    /**
     * 用户积分
     */
    @Column(name = "user_mark")
    private Integer userMark;

    /**
     * 用户等级
     */
    @Column(name = "user_rank_id")
    private Byte userRankId;

    /**
     * 用户上一次登录IP地址
     */
    @Column(name = "user_last_login_ip")
    private String userLastLoginIp;

    /**
     * 用户生日
     */
    @Column(name = "user_birthday")
    private Integer userBirthday;

    /**
     * 自我描述
     */
    @Column(name = "user_description")
    private String userDescription;

    /**
     * 用户头像存储路径
     */
    @Column(name = "user_image_url")
    private String userImageUrl;

    /**
     * 毕业学校
     */
    @Column(name = "user_school")
    private String userSchool;

    /**
     * 用户注册时间
     */
    @Column(name = "user_register_time")
    private Integer userRegisterTime;

    /**
     * 用户注册时IP地址
     */
    @Column(name = "user_register_ip")
    private String userRegisterIp;

    /**
     * 用户上次更新博客时间
     */
    @Column(name = "user_last_update_time")
    private Integer userLastUpdateTime;

    /**
     * 用户微博
     */
    @Column(name = "user_weibo")
    private String userWeibo;

    /**
     * 用户语录
     */
    @Column(name = "user_says")
    private String userSays;

    /**
     * 是否锁定，0为不锁定，1为锁定
     */
    @Column(name = "user_lock")
    private Byte userLock;

    /**
     * 是否冻结，0为不冻结，1为冻结
     */
    @Column(name = "user_freeze")
    private Byte userFreeze;

    /**
     * 拥有权限
     */
    @Column(name = "user_power")
    private String userPower;

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户组ID
     *
     * @return group_id - 用户组ID
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置用户组ID
     *
     * @param groupId 用户组ID
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户密码
     *
     * @return user_pwd - 用户密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 设置用户密码
     *
     * @param userPwd 用户密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * 获取用户手机号码
     *
     * @return user_phone - 用户手机号码
     */
    public Integer getUserPhone() {
        return userPhone;
    }

    /**
     * 设置用户手机号码
     *
     * @param userPhone 用户手机号码
     */
    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 获取用户性别
     *
     * @return user_sex - 用户性别
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 设置用户性别
     *
     * @param userSex 用户性别
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * 获取用户QQ号码
     *
     * @return user_qq - 用户QQ号码
     */
    public Integer getUserQq() {
        return userQq;
    }

    /**
     * 设置用户QQ号码
     *
     * @param userQq 用户QQ号码
     */
    public void setUserQq(Integer userQq) {
        this.userQq = userQq;
    }

    /**
     * 获取用户EMAIL地址
     *
     * @return user_email - 用户EMAIL地址
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置用户EMAIL地址
     *
     * @param userEmail 用户EMAIL地址
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取用户地址
     *
     * @return user_address - 用户地址
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * 设置用户地址
     *
     * @param userAddress 用户地址
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * 获取用户积分
     *
     * @return user_mark - 用户积分
     */
    public Integer getUserMark() {
        return userMark;
    }

    /**
     * 设置用户积分
     *
     * @param userMark 用户积分
     */
    public void setUserMark(Integer userMark) {
        this.userMark = userMark;
    }

    /**
     * 获取用户等级
     *
     * @return user_rank_id - 用户等级
     */
    public Byte getUserRankId() {
        return userRankId;
    }

    /**
     * 设置用户等级
     *
     * @param userRankId 用户等级
     */
    public void setUserRankId(Byte userRankId) {
        this.userRankId = userRankId;
    }

    /**
     * 获取用户上一次登录IP地址
     *
     * @return user_last_login_ip - 用户上一次登录IP地址
     */
    public String getUserLastLoginIp() {
        return userLastLoginIp;
    }

    /**
     * 设置用户上一次登录IP地址
     *
     * @param userLastLoginIp 用户上一次登录IP地址
     */
    public void setUserLastLoginIp(String userLastLoginIp) {
        this.userLastLoginIp = userLastLoginIp;
    }

    /**
     * 获取用户生日
     *
     * @return user_birthday - 用户生日
     */
    public Integer getUserBirthday() {
        return userBirthday;
    }

    /**
     * 设置用户生日
     *
     * @param userBirthday 用户生日
     */
    public void setUserBirthday(Integer userBirthday) {
        this.userBirthday = userBirthday;
    }

    /**
     * 获取自我描述
     *
     * @return user_description - 自我描述
     */
    public String getUserDescription() {
        return userDescription;
    }

    /**
     * 设置自我描述
     *
     * @param userDescription 自我描述
     */
    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    /**
     * 获取用户头像存储路径
     *
     * @return user_image_url - 用户头像存储路径
     */
    public String getUserImageUrl() {
        return userImageUrl;
    }

    /**
     * 设置用户头像存储路径
     *
     * @param userImageUrl 用户头像存储路径
     */
    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }

    /**
     * 获取毕业学校
     *
     * @return user_school - 毕业学校
     */
    public String getUserSchool() {
        return userSchool;
    }

    /**
     * 设置毕业学校
     *
     * @param userSchool 毕业学校
     */
    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool;
    }

    /**
     * 获取用户注册时间
     *
     * @return user_register_time - 用户注册时间
     */
    public Integer getUserRegisterTime() {
        return userRegisterTime;
    }

    /**
     * 设置用户注册时间
     *
     * @param userRegisterTime 用户注册时间
     */
    public void setUserRegisterTime(Integer userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    /**
     * 获取用户注册时IP地址
     *
     * @return user_register_ip - 用户注册时IP地址
     */
    public String getUserRegisterIp() {
        return userRegisterIp;
    }

    /**
     * 设置用户注册时IP地址
     *
     * @param userRegisterIp 用户注册时IP地址
     */
    public void setUserRegisterIp(String userRegisterIp) {
        this.userRegisterIp = userRegisterIp;
    }

    /**
     * 获取用户上次更新博客时间
     *
     * @return user_last_update_time - 用户上次更新博客时间
     */
    public Integer getUserLastUpdateTime() {
        return userLastUpdateTime;
    }

    /**
     * 设置用户上次更新博客时间
     *
     * @param userLastUpdateTime 用户上次更新博客时间
     */
    public void setUserLastUpdateTime(Integer userLastUpdateTime) {
        this.userLastUpdateTime = userLastUpdateTime;
    }

    /**
     * 获取用户微博
     *
     * @return user_weibo - 用户微博
     */
    public String getUserWeibo() {
        return userWeibo;
    }

    /**
     * 设置用户微博
     *
     * @param userWeibo 用户微博
     */
    public void setUserWeibo(String userWeibo) {
        this.userWeibo = userWeibo;
    }

    /**
     * 获取用户语录
     *
     * @return user_says - 用户语录
     */
    public String getUserSays() {
        return userSays;
    }

    /**
     * 设置用户语录
     *
     * @param userSays 用户语录
     */
    public void setUserSays(String userSays) {
        this.userSays = userSays;
    }

    /**
     * 获取是否锁定，0为不锁定，1为锁定
     *
     * @return user_lock - 是否锁定，0为不锁定，1为锁定
     */
    public Byte getUserLock() {
        return userLock;
    }

    /**
     * 设置是否锁定，0为不锁定，1为锁定
     *
     * @param userLock 是否锁定，0为不锁定，1为锁定
     */
    public void setUserLock(Byte userLock) {
        this.userLock = userLock;
    }

    /**
     * 获取是否冻结，0为不冻结，1为冻结
     *
     * @return user_freeze - 是否冻结，0为不冻结，1为冻结
     */
    public Byte getUserFreeze() {
        return userFreeze;
    }

    /**
     * 设置是否冻结，0为不冻结，1为冻结
     *
     * @param userFreeze 是否冻结，0为不冻结，1为冻结
     */
    public void setUserFreeze(Byte userFreeze) {
        this.userFreeze = userFreeze;
    }

    /**
     * 获取拥有权限
     *
     * @return user_power - 拥有权限
     */
    public String getUserPower() {
        return userPower;
    }

    /**
     * 设置拥有权限
     *
     * @param userPower 拥有权限
     */
    public void setUserPower(String userPower) {
        this.userPower = userPower;
    }
}