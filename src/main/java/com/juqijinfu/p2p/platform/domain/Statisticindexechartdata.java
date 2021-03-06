package com.juqijinfu.p2p.platform.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_statistic_index_echart_data
 */
public class Statisticindexechartdata {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_statistic_index_echart_data.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * Database Column Remarks: 创建时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_statistic_index_echart_data.time
	 * @mbg.generated
	 */
	private Date time;
	/**
	 * Database Column Remarks: 时间数据所属类型:2-24为昨日12个时间点，71-77为最近7天，301-310为最近30天 This field was generated by MyBatis Generator. This field corresponds to the database column t_statistic_index_echart_data.time_type
	 * @mbg.generated
	 */
	private Integer timeType;
	/**
	 * Database Column Remarks: 新增理财会员 This field was generated by MyBatis Generator. This field corresponds to the database column t_statistic_index_echart_data.new_financial_members_count
	 * @mbg.generated
	 */
	private Integer newFinancialMembersCount;
	/**
	 * Database Column Remarks: 新增注册会员 This field was generated by MyBatis Generator. This field corresponds to the database column t_statistic_index_echart_data.new_register_members_count
	 * @mbg.generated
	 */
	private Integer newRegisterMembersCount;
	/**
	 * Database Column Remarks: 投资金额 This field was generated by MyBatis Generator. This field corresponds to the database column t_statistic_index_echart_data.invest_money
	 * @mbg.generated
	 */
	private BigDecimal investMoney;
	/**
	 * Database Column Remarks: 充值金额 This field was generated by MyBatis Generator. This field corresponds to the database column t_statistic_index_echart_data.recharge_money
	 * @mbg.generated
	 */
	private BigDecimal rechargeMoney;
	/**
	 * Database Column Remarks: 数据类型：1、昨日，2、最近7天，3、最近30天 This field was generated by MyBatis Generator. This field corresponds to the database column t_statistic_index_echart_data.type
	 * @mbg.generated
	 */
	private Byte type;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_statistic_index_echart_data.id
	 * @return  the value of t_statistic_index_echart_data.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_statistic_index_echart_data.id
	 * @param id  the value for t_statistic_index_echart_data.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_statistic_index_echart_data.time
	 * @return  the value of t_statistic_index_echart_data.time
	 * @mbg.generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_statistic_index_echart_data.time
	 * @param time  the value for t_statistic_index_echart_data.time
	 * @mbg.generated
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_statistic_index_echart_data.time_type
	 * @return  the value of t_statistic_index_echart_data.time_type
	 * @mbg.generated
	 */
	public Integer getTimeType() {
		return timeType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_statistic_index_echart_data.time_type
	 * @param timeType  the value for t_statistic_index_echart_data.time_type
	 * @mbg.generated
	 */
	public void setTimeType(Integer timeType) {
		this.timeType = timeType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_statistic_index_echart_data.new_financial_members_count
	 * @return  the value of t_statistic_index_echart_data.new_financial_members_count
	 * @mbg.generated
	 */
	public Integer getNewFinancialMembersCount() {
		return newFinancialMembersCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_statistic_index_echart_data.new_financial_members_count
	 * @param newFinancialMembersCount  the value for t_statistic_index_echart_data.new_financial_members_count
	 * @mbg.generated
	 */
	public void setNewFinancialMembersCount(Integer newFinancialMembersCount) {
		this.newFinancialMembersCount = newFinancialMembersCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_statistic_index_echart_data.new_register_members_count
	 * @return  the value of t_statistic_index_echart_data.new_register_members_count
	 * @mbg.generated
	 */
	public Integer getNewRegisterMembersCount() {
		return newRegisterMembersCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_statistic_index_echart_data.new_register_members_count
	 * @param newRegisterMembersCount  the value for t_statistic_index_echart_data.new_register_members_count
	 * @mbg.generated
	 */
	public void setNewRegisterMembersCount(Integer newRegisterMembersCount) {
		this.newRegisterMembersCount = newRegisterMembersCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_statistic_index_echart_data.invest_money
	 * @return  the value of t_statistic_index_echart_data.invest_money
	 * @mbg.generated
	 */
	public BigDecimal getInvestMoney() {
		return investMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_statistic_index_echart_data.invest_money
	 * @param investMoney  the value for t_statistic_index_echart_data.invest_money
	 * @mbg.generated
	 */
	public void setInvestMoney(BigDecimal investMoney) {
		this.investMoney = investMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_statistic_index_echart_data.recharge_money
	 * @return  the value of t_statistic_index_echart_data.recharge_money
	 * @mbg.generated
	 */
	public BigDecimal getRechargeMoney() {
		return rechargeMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_statistic_index_echart_data.recharge_money
	 * @param rechargeMoney  the value for t_statistic_index_echart_data.recharge_money
	 * @mbg.generated
	 */
	public void setRechargeMoney(BigDecimal rechargeMoney) {
		this.rechargeMoney = rechargeMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_statistic_index_echart_data.type
	 * @return  the value of t_statistic_index_echart_data.type
	 * @mbg.generated
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_statistic_index_echart_data.type
	 * @param type  the value for t_statistic_index_echart_data.type
	 * @mbg.generated
	 */
	public void setType(Byte type) {
		this.type = type;
	}
}