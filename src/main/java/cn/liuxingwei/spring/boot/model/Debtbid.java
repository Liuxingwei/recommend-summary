package cn.liuxingwei.spring.boot.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_debt_bid
 */
public class Debtbid {
    /**
     * Database Column Remarks:
     *   债权标id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   发布时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.time
     *
     * @mbg.generated
     */
    private Date time;

    /**
     * Database Column Remarks:
     *   线下借款人id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.loan_id
     *
     * @mbg.generated
     */
    private Long loanId;

    /**
     * Database Column Remarks:
     *   平台借款人id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   所属产品id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.product_id
     *
     * @mbg.generated
     */
    private Long productId;

    /**
     * Database Column Remarks:
     *   借款标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     * Database Column Remarks:
     *   借款金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     * Database Column Remarks:
     *   年利率
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.apr
     *
     * @mbg.generated
     */
    private BigDecimal apr;

    /**
     * Database Column Remarks:
     *   借款期限单位。1：天，2：月
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.period_unit
     *
     * @mbg.generated
     */
    private Byte periodUnit;

    /**
     * Database Column Remarks:
     *   借款期限
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.period
     *
     * @mbg.generated
     */
    private Integer period;

    /**
     * Database Column Remarks:
     *   还款方式1-先息后本2-等本等息3-一次性还款
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.repayment_type
     *
     * @mbg.generated
     */
    private Byte repaymentType;

    /**
     * Database Column Remarks:
     *   已还期数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.expected_period
     *
     * @mbg.generated
     */
    private Integer expectedPeriod;

    /**
     * Database Column Remarks:
     *   标的状态：0，审核中，1,审核通过，-1，待审核
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * Database Column Remarks:
     *   借款说明
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * Database Column Remarks:
     *   剩余本金
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.remain_amount
     *
     * @mbg.generated
     */
    private BigDecimal remainAmount;

    /**
     * Database Column Remarks:
     *   借款人姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * Database Column Remarks:
     *   借款人手机号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * Database Column Remarks:
     *   放款时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.release_time
     *
     * @mbg.generated
     */
    private Date releaseTime;

    /**
     * Database Column Remarks:
     *   审核时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.audit_time
     *
     * @mbg.generated
     */
    private Date auditTime;

    /**
     * Database Column Remarks:
     *   审核人id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.auditor_supervisor_id
     *
     * @mbg.generated
     */
    private Long auditorSupervisorId;

    /**
     * Database Column Remarks:
     *   审核意见
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.audit_suggest
     *
     * @mbg.generated
     */
    private String auditSuggest;

    /**
     * Database Column Remarks:
     *   标的发布入口:
     *   1-pc 
     *   2-android 
     *   3-ios 
     *   4-wechat 
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.client
     *
     * @mbg.generated
     */
    private Byte client;

    /**
     * Database Column Remarks:
     *   等本等息利率
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.wait_apr
     *
     * @mbg.generated
     */
    private BigDecimal waitApr;

    /**
     * Database Column Remarks:
     *   借款服务费、理财服务费、逾期罚息规则（以JSON串的形式存储）(数据来自借款产品)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.service_fee_rule
     *
     * @mbg.generated
     */
    private String serviceFeeRule;

    /**
     * Database Column Remarks:
     *   借款服务费
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.loan_fee
     *
     * @mbg.generated
     */
    private BigDecimal loanFee;

    /**
     * Database Column Remarks:
     *   平台账户已转让金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.has_tranfer
     *
     * @mbg.generated
     */
    private BigDecimal hasTranfer;

    /**
     * Database Column Remarks:
     *   加入人次
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.invest_count
     *
     * @mbg.generated
     */
    private Integer investCount;

    /**
     * Database Column Remarks:
     *   剩余本金转让进度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.loan_schedule
     *
     * @mbg.generated
     */
    private BigDecimal loanSchedule;

    /**
     * Database Column Remarks:
     *   转让结束时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.tranfer_end_time
     *
     * @mbg.generated
     */
    private Date tranferEndTime;

    /**
     * Database Column Remarks:
     *   可投金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.reamin_invest
     *
     * @mbg.generated
     */
    private BigDecimal reaminInvest;

    /**
     * Database Column Remarks:
     *   债权总额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.debt_bid_amount
     *
     * @mbg.generated
     */
    private BigDecimal debtBidAmount;

    /**
     * Database Column Remarks:
     *   对应的标的id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.bid_id
     *
     * @mbg.generated
     */
    private Long bidId;

    /**
     * Database Column Remarks:
     *   债权id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_debt_bid.debt_transfer_id
     *
     * @mbg.generated
     */
    private Long debtTransferId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.id
     *
     * @return the value of t_debt_bid.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.id
     *
     * @param id the value for t_debt_bid.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.time
     *
     * @return the value of t_debt_bid.time
     *
     * @mbg.generated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.time
     *
     * @param time the value for t_debt_bid.time
     *
     * @mbg.generated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.loan_id
     *
     * @return the value of t_debt_bid.loan_id
     *
     * @mbg.generated
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.loan_id
     *
     * @param loanId the value for t_debt_bid.loan_id
     *
     * @mbg.generated
     */
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.user_id
     *
     * @return the value of t_debt_bid.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.user_id
     *
     * @param userId the value for t_debt_bid.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.product_id
     *
     * @return the value of t_debt_bid.product_id
     *
     * @mbg.generated
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.product_id
     *
     * @param productId the value for t_debt_bid.product_id
     *
     * @mbg.generated
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.title
     *
     * @return the value of t_debt_bid.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.title
     *
     * @param title the value for t_debt_bid.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.amount
     *
     * @return the value of t_debt_bid.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.amount
     *
     * @param amount the value for t_debt_bid.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.apr
     *
     * @return the value of t_debt_bid.apr
     *
     * @mbg.generated
     */
    public BigDecimal getApr() {
        return apr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.apr
     *
     * @param apr the value for t_debt_bid.apr
     *
     * @mbg.generated
     */
    public void setApr(BigDecimal apr) {
        this.apr = apr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.period_unit
     *
     * @return the value of t_debt_bid.period_unit
     *
     * @mbg.generated
     */
    public Byte getPeriodUnit() {
        return periodUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.period_unit
     *
     * @param periodUnit the value for t_debt_bid.period_unit
     *
     * @mbg.generated
     */
    public void setPeriodUnit(Byte periodUnit) {
        this.periodUnit = periodUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.period
     *
     * @return the value of t_debt_bid.period
     *
     * @mbg.generated
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.period
     *
     * @param period the value for t_debt_bid.period
     *
     * @mbg.generated
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.repayment_type
     *
     * @return the value of t_debt_bid.repayment_type
     *
     * @mbg.generated
     */
    public Byte getRepaymentType() {
        return repaymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.repayment_type
     *
     * @param repaymentType the value for t_debt_bid.repayment_type
     *
     * @mbg.generated
     */
    public void setRepaymentType(Byte repaymentType) {
        this.repaymentType = repaymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.expected_period
     *
     * @return the value of t_debt_bid.expected_period
     *
     * @mbg.generated
     */
    public Integer getExpectedPeriod() {
        return expectedPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.expected_period
     *
     * @param expectedPeriod the value for t_debt_bid.expected_period
     *
     * @mbg.generated
     */
    public void setExpectedPeriod(Integer expectedPeriod) {
        this.expectedPeriod = expectedPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.status
     *
     * @return the value of t_debt_bid.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.status
     *
     * @param status the value for t_debt_bid.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.description
     *
     * @return the value of t_debt_bid.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.description
     *
     * @param description the value for t_debt_bid.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.remain_amount
     *
     * @return the value of t_debt_bid.remain_amount
     *
     * @mbg.generated
     */
    public BigDecimal getRemainAmount() {
        return remainAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.remain_amount
     *
     * @param remainAmount the value for t_debt_bid.remain_amount
     *
     * @mbg.generated
     */
    public void setRemainAmount(BigDecimal remainAmount) {
        this.remainAmount = remainAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.user_name
     *
     * @return the value of t_debt_bid.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.user_name
     *
     * @param userName the value for t_debt_bid.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.mobile
     *
     * @return the value of t_debt_bid.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.mobile
     *
     * @param mobile the value for t_debt_bid.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.release_time
     *
     * @return the value of t_debt_bid.release_time
     *
     * @mbg.generated
     */
    public Date getReleaseTime() {
        return releaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.release_time
     *
     * @param releaseTime the value for t_debt_bid.release_time
     *
     * @mbg.generated
     */
    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.audit_time
     *
     * @return the value of t_debt_bid.audit_time
     *
     * @mbg.generated
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.audit_time
     *
     * @param auditTime the value for t_debt_bid.audit_time
     *
     * @mbg.generated
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.auditor_supervisor_id
     *
     * @return the value of t_debt_bid.auditor_supervisor_id
     *
     * @mbg.generated
     */
    public Long getAuditorSupervisorId() {
        return auditorSupervisorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.auditor_supervisor_id
     *
     * @param auditorSupervisorId the value for t_debt_bid.auditor_supervisor_id
     *
     * @mbg.generated
     */
    public void setAuditorSupervisorId(Long auditorSupervisorId) {
        this.auditorSupervisorId = auditorSupervisorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.audit_suggest
     *
     * @return the value of t_debt_bid.audit_suggest
     *
     * @mbg.generated
     */
    public String getAuditSuggest() {
        return auditSuggest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.audit_suggest
     *
     * @param auditSuggest the value for t_debt_bid.audit_suggest
     *
     * @mbg.generated
     */
    public void setAuditSuggest(String auditSuggest) {
        this.auditSuggest = auditSuggest == null ? null : auditSuggest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.client
     *
     * @return the value of t_debt_bid.client
     *
     * @mbg.generated
     */
    public Byte getClient() {
        return client;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.client
     *
     * @param client the value for t_debt_bid.client
     *
     * @mbg.generated
     */
    public void setClient(Byte client) {
        this.client = client;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.wait_apr
     *
     * @return the value of t_debt_bid.wait_apr
     *
     * @mbg.generated
     */
    public BigDecimal getWaitApr() {
        return waitApr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.wait_apr
     *
     * @param waitApr the value for t_debt_bid.wait_apr
     *
     * @mbg.generated
     */
    public void setWaitApr(BigDecimal waitApr) {
        this.waitApr = waitApr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.service_fee_rule
     *
     * @return the value of t_debt_bid.service_fee_rule
     *
     * @mbg.generated
     */
    public String getServiceFeeRule() {
        return serviceFeeRule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.service_fee_rule
     *
     * @param serviceFeeRule the value for t_debt_bid.service_fee_rule
     *
     * @mbg.generated
     */
    public void setServiceFeeRule(String serviceFeeRule) {
        this.serviceFeeRule = serviceFeeRule == null ? null : serviceFeeRule.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.loan_fee
     *
     * @return the value of t_debt_bid.loan_fee
     *
     * @mbg.generated
     */
    public BigDecimal getLoanFee() {
        return loanFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.loan_fee
     *
     * @param loanFee the value for t_debt_bid.loan_fee
     *
     * @mbg.generated
     */
    public void setLoanFee(BigDecimal loanFee) {
        this.loanFee = loanFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.has_tranfer
     *
     * @return the value of t_debt_bid.has_tranfer
     *
     * @mbg.generated
     */
    public BigDecimal getHasTranfer() {
        return hasTranfer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.has_tranfer
     *
     * @param hasTranfer the value for t_debt_bid.has_tranfer
     *
     * @mbg.generated
     */
    public void setHasTranfer(BigDecimal hasTranfer) {
        this.hasTranfer = hasTranfer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.invest_count
     *
     * @return the value of t_debt_bid.invest_count
     *
     * @mbg.generated
     */
    public Integer getInvestCount() {
        return investCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.invest_count
     *
     * @param investCount the value for t_debt_bid.invest_count
     *
     * @mbg.generated
     */
    public void setInvestCount(Integer investCount) {
        this.investCount = investCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.loan_schedule
     *
     * @return the value of t_debt_bid.loan_schedule
     *
     * @mbg.generated
     */
    public BigDecimal getLoanSchedule() {
        return loanSchedule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.loan_schedule
     *
     * @param loanSchedule the value for t_debt_bid.loan_schedule
     *
     * @mbg.generated
     */
    public void setLoanSchedule(BigDecimal loanSchedule) {
        this.loanSchedule = loanSchedule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.tranfer_end_time
     *
     * @return the value of t_debt_bid.tranfer_end_time
     *
     * @mbg.generated
     */
    public Date getTranferEndTime() {
        return tranferEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.tranfer_end_time
     *
     * @param tranferEndTime the value for t_debt_bid.tranfer_end_time
     *
     * @mbg.generated
     */
    public void setTranferEndTime(Date tranferEndTime) {
        this.tranferEndTime = tranferEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.reamin_invest
     *
     * @return the value of t_debt_bid.reamin_invest
     *
     * @mbg.generated
     */
    public BigDecimal getReaminInvest() {
        return reaminInvest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.reamin_invest
     *
     * @param reaminInvest the value for t_debt_bid.reamin_invest
     *
     * @mbg.generated
     */
    public void setReaminInvest(BigDecimal reaminInvest) {
        this.reaminInvest = reaminInvest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.debt_bid_amount
     *
     * @return the value of t_debt_bid.debt_bid_amount
     *
     * @mbg.generated
     */
    public BigDecimal getDebtBidAmount() {
        return debtBidAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.debt_bid_amount
     *
     * @param debtBidAmount the value for t_debt_bid.debt_bid_amount
     *
     * @mbg.generated
     */
    public void setDebtBidAmount(BigDecimal debtBidAmount) {
        this.debtBidAmount = debtBidAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.bid_id
     *
     * @return the value of t_debt_bid.bid_id
     *
     * @mbg.generated
     */
    public Long getBidId() {
        return bidId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.bid_id
     *
     * @param bidId the value for t_debt_bid.bid_id
     *
     * @mbg.generated
     */
    public void setBidId(Long bidId) {
        this.bidId = bidId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_debt_bid.debt_transfer_id
     *
     * @return the value of t_debt_bid.debt_transfer_id
     *
     * @mbg.generated
     */
    public Long getDebtTransferId() {
        return debtTransferId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_debt_bid.debt_transfer_id
     *
     * @param debtTransferId the value for t_debt_bid.debt_transfer_id
     *
     * @mbg.generated
     */
    public void setDebtTransferId(Long debtTransferId) {
        this.debtTransferId = debtTransferId;
    }
}