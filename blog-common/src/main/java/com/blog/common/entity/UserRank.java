package com.blog.common.entity;

import javax.persistence.*;

/**
 * 用户权限表
 */
@Table(name = "user_rank")
public class UserRank {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "rank_id")
    private Integer rankId;

    /**
     * 等级ID
     */
    @Column(name = "user_rank_id")
    private Short userRankId;

    /**
     * 等级积分
     */
    @Column(name = "rank_mark")
    private Integer rankMark;

    /**
     * 等级名称
     */
    @Column(name = "rank_name")
    private String rankName;

    /**
     * 获取自增ID
     *
     * @return rank_id - 自增ID
     */
    public Integer getRankId() {
        return rankId;
    }

    /**
     * 设置自增ID
     *
     * @param rankId 自增ID
     */
    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    /**
     * 获取等级ID
     *
     * @return user_rank_id - 等级ID
     */
    public Short getUserRankId() {
        return userRankId;
    }

    /**
     * 设置等级ID
     *
     * @param userRankId 等级ID
     */
    public void setUserRankId(Short userRankId) {
        this.userRankId = userRankId;
    }

    /**
     * 获取等级积分
     *
     * @return rank_mark - 等级积分
     */
    public Integer getRankMark() {
        return rankMark;
    }

    /**
     * 设置等级积分
     *
     * @param rankMark 等级积分
     */
    public void setRankMark(Integer rankMark) {
        this.rankMark = rankMark;
    }

    /**
     * 获取等级名称
     *
     * @return rank_name - 等级名称
     */
    public String getRankName() {
        return rankName;
    }

    /**
     * 设置等级名称
     *
     * @param rankName 等级名称
     */
    public void setRankName(String rankName) {
        this.rankName = rankName;
    }
}