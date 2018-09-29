package com.juqijinfu.p2p.platform.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_project_interest_send
 */
public class Projectinterestsend {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_interest_send.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   理财计划用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_interest_send.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   U计划ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_interest_send.project_id
     *
     * @mbg.generated
     */
    private Long projectId;

    /**
     * Database Column Remarks:
     *   U计划加入记录ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_interest_send.project_invest_id
     *
     * @mbg.generated
     */
    private Long projectInvestId;

    /**
     * Database Column Remarks:
     *   生成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_interest_send.time
     *
     * @mbg.generated
     */
    private Date time;

    /**
     * Database Column Remarks:
     *   发放时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_interest_send.send_time
     *
     * @mbg.generated
     */
    private Date sendTime;

    /**
     * Database Column Remarks:
     *   发放时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_interest_send.real_send_time
     *
     * @mbg.generated
     */
    private Date realSendTime;

    /**
     * Database Column Remarks:
     *   期数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_interest_send.period
     *
     * @mbg.generated
     */
    private Integer period;

    /**
     * Database Column Remarks:
     *   应收利息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_interest_send.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     * Database Column Remarks:
     *   利息金额发放服务号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_interest_send.interest_service_no
     *
     * @mbg.generated
     */
    private String interestServiceNo;

    /**
     * Database Column Remarks:
     *   U计划加入记录状态
     *   0：未发放
     *   1：已发放
     *   -1：已失效
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_interest_send.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_interest_send.id
     *
     * @return the value of t_project_interest_send.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_interest_send.id
     *
     * @param id the value for t_project_interest_send.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_interest_send.user_id
     *
     * @return the value of t_project_interest_send.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_interest_send.user_id
     *
     * @param userId the value for t_project_interest_send.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_interest_send.project_id
     *
     * @return the value of t_project_interest_send.project_id
     *
     * @mbg.generated
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_interest_send.project_id
     *
     * @param projectId the value for t_project_interest_send.project_id
     *
     * @mbg.generated
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_interest_send.project_invest_id
     *
     * @return the value of t_project_interest_send.project_invest_id
     *
     * @mbg.generated
     */
    public Long getProjectInvestId() {
        return projectInvestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_interest_send.project_invest_id
     *
     * @param projectInvestId the value for t_project_interest_send.project_invest_id
     *
     * @mbg.generated
     */
    public void setProjectInvestId(Long projectInvestId) {
        this.projectInvestId = projectInvestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_interest_send.time
     *
     * @return the value of t_project_interest_send.time
     *
     * @mbg.generated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_interest_send.time
     *
     * @param time the value for t_project_interest_send.time
     *
     * @mbg.generated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_interest_send.send_time
     *
     * @return the value of t_project_interest_send.send_time
     *
     * @mbg.generated
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_interest_send.send_time
     *
     * @param sendTime the value for t_project_interest_send.send_time
     *
     * @mbg.generated
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_interest_send.real_send_time
     *
     * @return the value of t_project_interest_send.real_send_time
     *
     * @mbg.generated
     */
    public Date getRealSendTime() {
        return realSendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_interest_send.real_send_time
     *
     * @param realSendTime the value for t_project_interest_send.real_send_time
     *
     * @mbg.generated
     */
    public void setRealSendTime(Date realSendTime) {
        this.realSendTime = realSendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_interest_send.period
     *
     * @return the value of t_project_interest_send.period
     *
     * @mbg.generated
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_interest_send.period
     *
     * @param period the value for t_project_interest_send.period
     *
     * @mbg.generated
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_interest_send.amount
     *
     * @return the value of t_project_interest_send.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_interest_send.amount
     *
     * @param amount the value for t_project_interest_send.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_interest_send.interest_service_no
     *
     * @return the value of t_project_interest_send.interest_service_no
     *
     * @mbg.generated
     */
    public String getInterestServiceNo() {
        return interestServiceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_interest_send.interest_service_no
     *
     * @param interestServiceNo the value for t_project_interest_send.interest_service_no
     *
     * @mbg.generated
     */
    public void setInterestServiceNo(String interestServiceNo) {
        this.interestServiceNo = interestServiceNo == null ? null : interestServiceNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_interest_send.status
     *
     * @return the value of t_project_interest_send.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_interest_send.status
     *
     * @param status the value for t_project_interest_send.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}