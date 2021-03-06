package com.juqijinfu.p2p.platform.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_project_repeat
 */
public class Projectrepeat {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_project_repeat.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * Database Column Remarks: 理财计划投资记录ID This field was generated by MyBatis Generator. This field corresponds to the database column t_project_repeat.project_invest_id
	 * @mbg.generated
	 */
	private Long projectInvestId;
	/**
	 * Database Column Remarks: 担保方用户ID This field was generated by MyBatis Generator. This field corresponds to the database column t_project_repeat.user_id
	 * @mbg.generated
	 */
	private Long userId;
	/**
	 * Database Column Remarks: 插入时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_project_repeat.time
	 * @mbg.generated
	 */
	private Date time;
	/**
	 * Database Column Remarks: 复投金额 This field was generated by MyBatis Generator. This field corresponds to the database column t_project_repeat.amount
	 * @mbg.generated
	 */
	private BigDecimal amount;
	/**
	 * Database Column Remarks: 状态 0：未投资 1：投资中（可能产生流标的情况） 2：已放款,-1,已失效 This field was generated by MyBatis Generator. This field corresponds to the database column t_project_repeat.status
	 * @mbg.generated
	 */
	private Byte status;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_repeat.id
	 * @return  the value of t_project_repeat.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_repeat.id
	 * @param id  the value for t_project_repeat.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_repeat.project_invest_id
	 * @return  the value of t_project_repeat.project_invest_id
	 * @mbg.generated
	 */
	public Long getProjectInvestId() {
		return projectInvestId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_repeat.project_invest_id
	 * @param projectInvestId  the value for t_project_repeat.project_invest_id
	 * @mbg.generated
	 */
	public void setProjectInvestId(Long projectInvestId) {
		this.projectInvestId = projectInvestId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_repeat.user_id
	 * @return  the value of t_project_repeat.user_id
	 * @mbg.generated
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_repeat.user_id
	 * @param userId  the value for t_project_repeat.user_id
	 * @mbg.generated
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_repeat.time
	 * @return  the value of t_project_repeat.time
	 * @mbg.generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_repeat.time
	 * @param time  the value for t_project_repeat.time
	 * @mbg.generated
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_repeat.amount
	 * @return  the value of t_project_repeat.amount
	 * @mbg.generated
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_repeat.amount
	 * @param amount  the value for t_project_repeat.amount
	 * @mbg.generated
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_repeat.status
	 * @return  the value of t_project_repeat.status
	 * @mbg.generated
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_repeat.status
	 * @param status  the value for t_project_repeat.status
	 * @mbg.generated
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}
}