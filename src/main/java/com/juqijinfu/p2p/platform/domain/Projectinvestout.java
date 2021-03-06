package com.juqijinfu.p2p.platform.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_project_invest_out
 */
public class Projectinvestout {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.time
	 * @mbg.generated
	 */
	private Date time;
	/**
	 * Database Column Remarks: 对应的投资id This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.invest_id
	 * @mbg.generated
	 */
	private Long investId;
	/**
	 * Database Column Remarks: 转让人的user_id This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.user_id
	 * @mbg.generated
	 */
	private Long userId;
	/**
	 * Database Column Remarks: 债权金额 This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.debt_amount
	 * @mbg.generated
	 */
	private BigDecimal debtAmount;
	/**
	 * Database Column Remarks: 债权本金 This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.debt_principal
	 * @mbg.generated
	 */
	private BigDecimal debtPrincipal;
	/**
	 * Database Column Remarks: 转让底价 This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.transfer_price
	 * @mbg.generated
	 */
	private BigDecimal transferPrice;
	/**
	 * Database Column Remarks: 转让期数 This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.transfer_period
	 * @mbg.generated
	 */
	private Integer transferPeriod;
	/**
	 * Database Column Remarks: 状态 0-退出中； 1-成功； -1-失效。 This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.status
	 * @mbg.generated
	 */
	private Byte status;
	/**
	 * Database Column Remarks: 业务订单号 This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.service_order_no
	 * @mbg.generated
	 */
	private String serviceOrderNo;
	/**
	 * Database Column Remarks: 交易订单号(第三方返回) This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.trust_order_no
	 * @mbg.generated
	 */
	private String trustOrderNo;
	/**
	 * Database Column Remarks: U计划已投金额 This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.tranfer_amount
	 * @mbg.generated
	 */
	private BigDecimal tranferAmount;
	/**
	 * Database Column Remarks: 转让进度 This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.schedule
	 * @mbg.generated
	 */
	private BigDecimal schedule;
	/**
	 * Database Column Remarks: 理财计划记录ID This field was generated by MyBatis Generator. This field corresponds to the database column t_project_invest_out.project_invest_id
	 * @mbg.generated
	 */
	private Long projectInvestId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.id
	 * @return  the value of t_project_invest_out.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.id
	 * @param id  the value for t_project_invest_out.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.time
	 * @return  the value of t_project_invest_out.time
	 * @mbg.generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.time
	 * @param time  the value for t_project_invest_out.time
	 * @mbg.generated
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.invest_id
	 * @return  the value of t_project_invest_out.invest_id
	 * @mbg.generated
	 */
	public Long getInvestId() {
		return investId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.invest_id
	 * @param investId  the value for t_project_invest_out.invest_id
	 * @mbg.generated
	 */
	public void setInvestId(Long investId) {
		this.investId = investId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.user_id
	 * @return  the value of t_project_invest_out.user_id
	 * @mbg.generated
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.user_id
	 * @param userId  the value for t_project_invest_out.user_id
	 * @mbg.generated
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.debt_amount
	 * @return  the value of t_project_invest_out.debt_amount
	 * @mbg.generated
	 */
	public BigDecimal getDebtAmount() {
		return debtAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.debt_amount
	 * @param debtAmount  the value for t_project_invest_out.debt_amount
	 * @mbg.generated
	 */
	public void setDebtAmount(BigDecimal debtAmount) {
		this.debtAmount = debtAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.debt_principal
	 * @return  the value of t_project_invest_out.debt_principal
	 * @mbg.generated
	 */
	public BigDecimal getDebtPrincipal() {
		return debtPrincipal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.debt_principal
	 * @param debtPrincipal  the value for t_project_invest_out.debt_principal
	 * @mbg.generated
	 */
	public void setDebtPrincipal(BigDecimal debtPrincipal) {
		this.debtPrincipal = debtPrincipal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.transfer_price
	 * @return  the value of t_project_invest_out.transfer_price
	 * @mbg.generated
	 */
	public BigDecimal getTransferPrice() {
		return transferPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.transfer_price
	 * @param transferPrice  the value for t_project_invest_out.transfer_price
	 * @mbg.generated
	 */
	public void setTransferPrice(BigDecimal transferPrice) {
		this.transferPrice = transferPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.transfer_period
	 * @return  the value of t_project_invest_out.transfer_period
	 * @mbg.generated
	 */
	public Integer getTransferPeriod() {
		return transferPeriod;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.transfer_period
	 * @param transferPeriod  the value for t_project_invest_out.transfer_period
	 * @mbg.generated
	 */
	public void setTransferPeriod(Integer transferPeriod) {
		this.transferPeriod = transferPeriod;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.status
	 * @return  the value of t_project_invest_out.status
	 * @mbg.generated
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.status
	 * @param status  the value for t_project_invest_out.status
	 * @mbg.generated
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.service_order_no
	 * @return  the value of t_project_invest_out.service_order_no
	 * @mbg.generated
	 */
	public String getServiceOrderNo() {
		return serviceOrderNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.service_order_no
	 * @param serviceOrderNo  the value for t_project_invest_out.service_order_no
	 * @mbg.generated
	 */
	public void setServiceOrderNo(String serviceOrderNo) {
		this.serviceOrderNo = serviceOrderNo == null ? null : serviceOrderNo.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.trust_order_no
	 * @return  the value of t_project_invest_out.trust_order_no
	 * @mbg.generated
	 */
	public String getTrustOrderNo() {
		return trustOrderNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.trust_order_no
	 * @param trustOrderNo  the value for t_project_invest_out.trust_order_no
	 * @mbg.generated
	 */
	public void setTrustOrderNo(String trustOrderNo) {
		this.trustOrderNo = trustOrderNo == null ? null : trustOrderNo.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.tranfer_amount
	 * @return  the value of t_project_invest_out.tranfer_amount
	 * @mbg.generated
	 */
	public BigDecimal getTranferAmount() {
		return tranferAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.tranfer_amount
	 * @param tranferAmount  the value for t_project_invest_out.tranfer_amount
	 * @mbg.generated
	 */
	public void setTranferAmount(BigDecimal tranferAmount) {
		this.tranferAmount = tranferAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.schedule
	 * @return  the value of t_project_invest_out.schedule
	 * @mbg.generated
	 */
	public BigDecimal getSchedule() {
		return schedule;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.schedule
	 * @param schedule  the value for t_project_invest_out.schedule
	 * @mbg.generated
	 */
	public void setSchedule(BigDecimal schedule) {
		this.schedule = schedule;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_project_invest_out.project_invest_id
	 * @return  the value of t_project_invest_out.project_invest_id
	 * @mbg.generated
	 */
	public Long getProjectInvestId() {
		return projectInvestId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_project_invest_out.project_invest_id
	 * @param projectInvestId  the value for t_project_invest_out.project_invest_id
	 * @mbg.generated
	 */
	public void setProjectInvestId(Long projectInvestId) {
		this.projectInvestId = projectInvestId;
	}
}