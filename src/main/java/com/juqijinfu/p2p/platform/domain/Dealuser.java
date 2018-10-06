package com.juqijinfu.p2p.platform.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_deal_user
 */
public class Dealuser {

	/**
	 * Database Column Remarks: 编号ID This field was generated by MyBatis Generator. This field corresponds to the database column t_deal_user.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * Database Column Remarks: 添加时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_deal_user.time
	 * @mbg.generated
	 */
	private Date time;
	/**
	 * Database Column Remarks: 业务订单号 This field was generated by MyBatis Generator. This field corresponds to the database column t_deal_user.order_no
	 * @mbg.generated
	 */
	private String orderNo;
	/**
	 * Database Column Remarks: 用户ID This field was generated by MyBatis Generator. This field corresponds to the database column t_deal_user.user_id
	 * @mbg.generated
	 */
	private Long userId;
	/**
	 * Database Column Remarks: 收支类型： 1-收入； 2-支出； 3-冻结； 4-解冻； This field was generated by MyBatis Generator. This field corresponds to the database column t_deal_user.deal_type
	 * @mbg.generated
	 */
	private Byte dealType;
	/**
	 * Database Column Remarks: 操作类型: 1-充值 ； 2-充值手续费； 3-提现； 4-提现手续费； 5-发标 保证金； 。。。。。 This field was generated by MyBatis Generator. This field corresponds to the database column t_deal_user.operation_type
	 * @mbg.generated
	 */
	private Integer operationType;
	/**
	 * Database Column Remarks: 交易金额 This field was generated by MyBatis Generator. This field corresponds to the database column t_deal_user.amount
	 * @mbg.generated
	 */
	private BigDecimal amount;
	/**
	 * Database Column Remarks: 可用余额 This field was generated by MyBatis Generator. This field corresponds to the database column t_deal_user.balance
	 * @mbg.generated
	 */
	private BigDecimal balance;
	/**
	 * Database Column Remarks: 冻结金额 This field was generated by MyBatis Generator. This field corresponds to the database column t_deal_user.freeze
	 * @mbg.generated
	 */
	private BigDecimal freeze;
	/**
	 * Database Column Remarks: 备注 This field was generated by MyBatis Generator. This field corresponds to the database column t_deal_user.summary
	 * @mbg.generated
	 */
	private String summary;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_deal_user.id
	 * @return  the value of t_deal_user.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_deal_user.id
	 * @param id  the value for t_deal_user.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_deal_user.time
	 * @return  the value of t_deal_user.time
	 * @mbg.generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_deal_user.time
	 * @param time  the value for t_deal_user.time
	 * @mbg.generated
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_deal_user.order_no
	 * @return  the value of t_deal_user.order_no
	 * @mbg.generated
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_deal_user.order_no
	 * @param orderNo  the value for t_deal_user.order_no
	 * @mbg.generated
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo == null ? null : orderNo.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_deal_user.user_id
	 * @return  the value of t_deal_user.user_id
	 * @mbg.generated
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_deal_user.user_id
	 * @param userId  the value for t_deal_user.user_id
	 * @mbg.generated
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_deal_user.deal_type
	 * @return  the value of t_deal_user.deal_type
	 * @mbg.generated
	 */
	public Byte getDealType() {
		return dealType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_deal_user.deal_type
	 * @param dealType  the value for t_deal_user.deal_type
	 * @mbg.generated
	 */
	public void setDealType(Byte dealType) {
		this.dealType = dealType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_deal_user.operation_type
	 * @return  the value of t_deal_user.operation_type
	 * @mbg.generated
	 */
	public Integer getOperationType() {
		return operationType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_deal_user.operation_type
	 * @param operationType  the value for t_deal_user.operation_type
	 * @mbg.generated
	 */
	public void setOperationType(Integer operationType) {
		this.operationType = operationType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_deal_user.amount
	 * @return  the value of t_deal_user.amount
	 * @mbg.generated
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_deal_user.amount
	 * @param amount  the value for t_deal_user.amount
	 * @mbg.generated
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_deal_user.balance
	 * @return  the value of t_deal_user.balance
	 * @mbg.generated
	 */
	public BigDecimal getBalance() {
		return balance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_deal_user.balance
	 * @param balance  the value for t_deal_user.balance
	 * @mbg.generated
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_deal_user.freeze
	 * @return  the value of t_deal_user.freeze
	 * @mbg.generated
	 */
	public BigDecimal getFreeze() {
		return freeze;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_deal_user.freeze
	 * @param freeze  the value for t_deal_user.freeze
	 * @mbg.generated
	 */
	public void setFreeze(BigDecimal freeze) {
		this.freeze = freeze;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_deal_user.summary
	 * @return  the value of t_deal_user.summary
	 * @mbg.generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_deal_user.summary
	 * @param summary  the value for t_deal_user.summary
	 * @mbg.generated
	 */
	public void setSummary(String summary) {
		this.summary = summary == null ? null : summary.trim();
	}
}