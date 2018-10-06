package com.juqijinfu.p2p.platform.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_conversion_user
 */
public class Conversionuser {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_conversion_user.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * Database Column Remarks: 创建时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_conversion_user.time
	 * @mbg.generated
	 */
	private Date time;
	/**
	 * Database Column Remarks: 关联用户ID This field was generated by MyBatis Generator. This field corresponds to the database column t_conversion_user.user_id
	 * @mbg.generated
	 */
	private Long userId;
	/**
	 * Database Column Remarks: 兑换类型 1-体验金 2-红包 This field was generated by MyBatis Generator. This field corresponds to the database column t_conversion_user.conversion_type
	 * @mbg.generated
	 */
	private Byte conversionType;
	/**
	 * Database Column Remarks: 兑换金额 This field was generated by MyBatis Generator. This field corresponds to the database column t_conversion_user.amount
	 * @mbg.generated
	 */
	private BigDecimal amount;
	/**
	 * Database Column Remarks: 审核时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_conversion_user.audit_time
	 * @mbg.generated
	 */
	private Date auditTime;
	/**
	 * Database Column Remarks: 兑换状态 。0-申请兑换 ;1-已兑换 ; This field was generated by MyBatis Generator. This field corresponds to the database column t_conversion_user.status
	 * @mbg.generated
	 */
	private Byte status;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_conversion_user.id
	 * @return  the value of t_conversion_user.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_conversion_user.id
	 * @param id  the value for t_conversion_user.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_conversion_user.time
	 * @return  the value of t_conversion_user.time
	 * @mbg.generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_conversion_user.time
	 * @param time  the value for t_conversion_user.time
	 * @mbg.generated
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_conversion_user.user_id
	 * @return  the value of t_conversion_user.user_id
	 * @mbg.generated
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_conversion_user.user_id
	 * @param userId  the value for t_conversion_user.user_id
	 * @mbg.generated
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_conversion_user.conversion_type
	 * @return  the value of t_conversion_user.conversion_type
	 * @mbg.generated
	 */
	public Byte getConversionType() {
		return conversionType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_conversion_user.conversion_type
	 * @param conversionType  the value for t_conversion_user.conversion_type
	 * @mbg.generated
	 */
	public void setConversionType(Byte conversionType) {
		this.conversionType = conversionType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_conversion_user.amount
	 * @return  the value of t_conversion_user.amount
	 * @mbg.generated
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_conversion_user.amount
	 * @param amount  the value for t_conversion_user.amount
	 * @mbg.generated
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_conversion_user.audit_time
	 * @return  the value of t_conversion_user.audit_time
	 * @mbg.generated
	 */
	public Date getAuditTime() {
		return auditTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_conversion_user.audit_time
	 * @param auditTime  the value for t_conversion_user.audit_time
	 * @mbg.generated
	 */
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_conversion_user.status
	 * @return  the value of t_conversion_user.status
	 * @mbg.generated
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_conversion_user.status
	 * @param status  the value for t_conversion_user.status
	 * @mbg.generated
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}
}