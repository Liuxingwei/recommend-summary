package com.juqijinfu.p2p.platform.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_debt_bid_bill
 */
public class Debtbidbill {

	/**
	 * Database Column Remarks: 借款账单ID This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * Database Column Remarks: 生成时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.time
	 * @mbg.generated
	 */
	private Date time;
	/**
	 * Database Column Remarks: 实际借款人ID This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.user_id
	 * @mbg.generated
	 */
	private Long userId;
	/**
	 * Database Column Remarks: 借款人id This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.loan_id
	 * @mbg.generated
	 */
	private Long loanId;
	/**
	 * Database Column Remarks: 债权标ID This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.debt_bid_id
	 * @mbg.generated
	 */
	private Long debtBidId;
	/**
	 * Database Column Remarks: 债权标标题 This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.title
	 * @mbg.generated
	 */
	private String title;
	/**
	 * Database Column Remarks: 账单期数 This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.period
	 * @mbg.generated
	 */
	private Integer period;
	/**
	 * Database Column Remarks: 还款状态: 0-正常待还； 1-本金垫付待还； 2-正常还款； 3-本金垫付还款； 4-线下收款； 5-本金垫付后线下收款； This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.status
	 * @mbg.generated
	 */
	private Byte status;
	/**
	 * Database Column Remarks: 还款日 This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.repayment_time
	 * @mbg.generated
	 */
	private Date repaymentTime;
	/**
	 * Database Column Remarks: 应还本金 This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.repayment_corpus
	 * @mbg.generated
	 */
	private BigDecimal repaymentCorpus;
	/**
	 * Database Column Remarks: 应还利息 This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.repayment_interest
	 * @mbg.generated
	 */
	private Double repaymentInterest;
	/**
	 * Database Column Remarks: 实际还款时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.real_repayment_time
	 * @mbg.generated
	 */
	private Date realRepaymentTime;
	/**
	 * Database Column Remarks: 逾期标记时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.mark_overdue_time
	 * @mbg.generated
	 */
	private Date markOverdueTime;
	/**
	 * Database Column Remarks: 是否逾期，0-未逾期；1-逾期。 This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.is_overdue
	 * @mbg.generated
	 */
	private Boolean isOverdue;
	/**
	 * Database Column Remarks: 逾期罚息 This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.overdue_fine
	 * @mbg.generated
	 */
	private BigDecimal overdueFine;
	/**
	 * Database Column Remarks: 逾期天数 This field was generated by MyBatis Generator. This field corresponds to the database column t_debt_bid_bill.overdue_days
	 * @mbg.generated
	 */
	private Integer overdueDays;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.id
	 * @return  the value of t_debt_bid_bill.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.id
	 * @param id  the value for t_debt_bid_bill.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.time
	 * @return  the value of t_debt_bid_bill.time
	 * @mbg.generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.time
	 * @param time  the value for t_debt_bid_bill.time
	 * @mbg.generated
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.user_id
	 * @return  the value of t_debt_bid_bill.user_id
	 * @mbg.generated
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.user_id
	 * @param userId  the value for t_debt_bid_bill.user_id
	 * @mbg.generated
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.loan_id
	 * @return  the value of t_debt_bid_bill.loan_id
	 * @mbg.generated
	 */
	public Long getLoanId() {
		return loanId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.loan_id
	 * @param loanId  the value for t_debt_bid_bill.loan_id
	 * @mbg.generated
	 */
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.debt_bid_id
	 * @return  the value of t_debt_bid_bill.debt_bid_id
	 * @mbg.generated
	 */
	public Long getDebtBidId() {
		return debtBidId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.debt_bid_id
	 * @param debtBidId  the value for t_debt_bid_bill.debt_bid_id
	 * @mbg.generated
	 */
	public void setDebtBidId(Long debtBidId) {
		this.debtBidId = debtBidId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.title
	 * @return  the value of t_debt_bid_bill.title
	 * @mbg.generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.title
	 * @param title  the value for t_debt_bid_bill.title
	 * @mbg.generated
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.period
	 * @return  the value of t_debt_bid_bill.period
	 * @mbg.generated
	 */
	public Integer getPeriod() {
		return period;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.period
	 * @param period  the value for t_debt_bid_bill.period
	 * @mbg.generated
	 */
	public void setPeriod(Integer period) {
		this.period = period;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.status
	 * @return  the value of t_debt_bid_bill.status
	 * @mbg.generated
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.status
	 * @param status  the value for t_debt_bid_bill.status
	 * @mbg.generated
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.repayment_time
	 * @return  the value of t_debt_bid_bill.repayment_time
	 * @mbg.generated
	 */
	public Date getRepaymentTime() {
		return repaymentTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.repayment_time
	 * @param repaymentTime  the value for t_debt_bid_bill.repayment_time
	 * @mbg.generated
	 */
	public void setRepaymentTime(Date repaymentTime) {
		this.repaymentTime = repaymentTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.repayment_corpus
	 * @return  the value of t_debt_bid_bill.repayment_corpus
	 * @mbg.generated
	 */
	public BigDecimal getRepaymentCorpus() {
		return repaymentCorpus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.repayment_corpus
	 * @param repaymentCorpus  the value for t_debt_bid_bill.repayment_corpus
	 * @mbg.generated
	 */
	public void setRepaymentCorpus(BigDecimal repaymentCorpus) {
		this.repaymentCorpus = repaymentCorpus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.repayment_interest
	 * @return  the value of t_debt_bid_bill.repayment_interest
	 * @mbg.generated
	 */
	public Double getRepaymentInterest() {
		return repaymentInterest;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.repayment_interest
	 * @param repaymentInterest  the value for t_debt_bid_bill.repayment_interest
	 * @mbg.generated
	 */
	public void setRepaymentInterest(Double repaymentInterest) {
		this.repaymentInterest = repaymentInterest;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.real_repayment_time
	 * @return  the value of t_debt_bid_bill.real_repayment_time
	 * @mbg.generated
	 */
	public Date getRealRepaymentTime() {
		return realRepaymentTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.real_repayment_time
	 * @param realRepaymentTime  the value for t_debt_bid_bill.real_repayment_time
	 * @mbg.generated
	 */
	public void setRealRepaymentTime(Date realRepaymentTime) {
		this.realRepaymentTime = realRepaymentTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.mark_overdue_time
	 * @return  the value of t_debt_bid_bill.mark_overdue_time
	 * @mbg.generated
	 */
	public Date getMarkOverdueTime() {
		return markOverdueTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.mark_overdue_time
	 * @param markOverdueTime  the value for t_debt_bid_bill.mark_overdue_time
	 * @mbg.generated
	 */
	public void setMarkOverdueTime(Date markOverdueTime) {
		this.markOverdueTime = markOverdueTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.is_overdue
	 * @return  the value of t_debt_bid_bill.is_overdue
	 * @mbg.generated
	 */
	public Boolean getIsOverdue() {
		return isOverdue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.is_overdue
	 * @param isOverdue  the value for t_debt_bid_bill.is_overdue
	 * @mbg.generated
	 */
	public void setIsOverdue(Boolean isOverdue) {
		this.isOverdue = isOverdue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.overdue_fine
	 * @return  the value of t_debt_bid_bill.overdue_fine
	 * @mbg.generated
	 */
	public BigDecimal getOverdueFine() {
		return overdueFine;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.overdue_fine
	 * @param overdueFine  the value for t_debt_bid_bill.overdue_fine
	 * @mbg.generated
	 */
	public void setOverdueFine(BigDecimal overdueFine) {
		this.overdueFine = overdueFine;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_debt_bid_bill.overdue_days
	 * @return  the value of t_debt_bid_bill.overdue_days
	 * @mbg.generated
	 */
	public Integer getOverdueDays() {
		return overdueDays;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_debt_bid_bill.overdue_days
	 * @param overdueDays  the value for t_debt_bid_bill.overdue_days
	 * @mbg.generated
	 */
	public void setOverdueDays(Integer overdueDays) {
		this.overdueDays = overdueDays;
	}
}