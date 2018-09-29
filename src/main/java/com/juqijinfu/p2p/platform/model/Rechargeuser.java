package com.juqijinfu.p2p.platform.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_recharge_user
 */
public class Rechargeuser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_user.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_user.time
     *
     * @mbg.generated
     */
    private Date time;

    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_user.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   业务订单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_user.order_no
     *
     * @mbg.generated
     */
    private String orderNo;

    /**
     * Database Column Remarks:
     *   充值金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_user.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     * Database Column Remarks:
     *   状态:
     *   -1-失败;
     *   0-处理中;
     *   1-成功;
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_user.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * Database Column Remarks:
     *   完成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_user.completed_time
     *
     * @mbg.generated
     */
    private Date completedTime;

    /**
     * Database Column Remarks:
     *   充值入口:
     *   1-pc 
     *   2-android 
     *   3-ios 
     *   4-wechat 
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_user.client
     *
     * @mbg.generated
     */
    private Byte client;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_recharge_user.summary
     *
     * @mbg.generated
     */
    private String summary;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_user.id
     *
     * @return the value of t_recharge_user.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_user.id
     *
     * @param id the value for t_recharge_user.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_user.time
     *
     * @return the value of t_recharge_user.time
     *
     * @mbg.generated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_user.time
     *
     * @param time the value for t_recharge_user.time
     *
     * @mbg.generated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_user.user_id
     *
     * @return the value of t_recharge_user.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_user.user_id
     *
     * @param userId the value for t_recharge_user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_user.order_no
     *
     * @return the value of t_recharge_user.order_no
     *
     * @mbg.generated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_user.order_no
     *
     * @param orderNo the value for t_recharge_user.order_no
     *
     * @mbg.generated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_user.amount
     *
     * @return the value of t_recharge_user.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_user.amount
     *
     * @param amount the value for t_recharge_user.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_user.status
     *
     * @return the value of t_recharge_user.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_user.status
     *
     * @param status the value for t_recharge_user.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_user.completed_time
     *
     * @return the value of t_recharge_user.completed_time
     *
     * @mbg.generated
     */
    public Date getCompletedTime() {
        return completedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_user.completed_time
     *
     * @param completedTime the value for t_recharge_user.completed_time
     *
     * @mbg.generated
     */
    public void setCompletedTime(Date completedTime) {
        this.completedTime = completedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_user.client
     *
     * @return the value of t_recharge_user.client
     *
     * @mbg.generated
     */
    public Byte getClient() {
        return client;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_user.client
     *
     * @param client the value for t_recharge_user.client
     *
     * @mbg.generated
     */
    public void setClient(Byte client) {
        this.client = client;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_recharge_user.summary
     *
     * @return the value of t_recharge_user.summary
     *
     * @mbg.generated
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_recharge_user.summary
     *
     * @param summary the value for t_recharge_user.summary
     *
     * @mbg.generated
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }
}