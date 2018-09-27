package cn.liuxingwei.spring.boot.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_project_repeat_fee
 */
public class Projectrepeatfee {
    /**
     * Database Column Remarks:
     *   主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_repeat_fee.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   userId
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_repeat_fee.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   用户名(冗余)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_repeat_fee.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * Database Column Remarks:
     *   产生金额的理财金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_repeat_fee.create_amount
     *
     * @mbg.generated
     */
    private BigDecimal createAmount;

    /**
     * Database Column Remarks:
     *   插入时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_repeat_fee.time
     *
     * @mbg.generated
     */
    private Date time;

    /**
     * Database Column Remarks:
     *   服务费金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_repeat_fee.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     * Database Column Remarks:
     *   类型1复投产生2参与理财计划产生
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_repeat_fee.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     * Database Column Remarks:
     *   理财计划ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_repeat_fee.project_id
     *
     * @mbg.generated
     */
    private Long projectId;

    /**
     * Database Column Remarks:
     *   理财计划名称(冗余)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_repeat_fee.project_name
     *
     * @mbg.generated
     */
    private String projectName;

    /**
     * Database Column Remarks:
     *   理财计划参与记录ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_project_repeat_fee.project_invest_id
     *
     * @mbg.generated
     */
    private Long projectInvestId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_repeat_fee.id
     *
     * @return the value of t_project_repeat_fee.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_repeat_fee.id
     *
     * @param id the value for t_project_repeat_fee.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_repeat_fee.user_id
     *
     * @return the value of t_project_repeat_fee.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_repeat_fee.user_id
     *
     * @param userId the value for t_project_repeat_fee.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_repeat_fee.user_name
     *
     * @return the value of t_project_repeat_fee.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_repeat_fee.user_name
     *
     * @param userName the value for t_project_repeat_fee.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_repeat_fee.create_amount
     *
     * @return the value of t_project_repeat_fee.create_amount
     *
     * @mbg.generated
     */
    public BigDecimal getCreateAmount() {
        return createAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_repeat_fee.create_amount
     *
     * @param createAmount the value for t_project_repeat_fee.create_amount
     *
     * @mbg.generated
     */
    public void setCreateAmount(BigDecimal createAmount) {
        this.createAmount = createAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_repeat_fee.time
     *
     * @return the value of t_project_repeat_fee.time
     *
     * @mbg.generated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_repeat_fee.time
     *
     * @param time the value for t_project_repeat_fee.time
     *
     * @mbg.generated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_repeat_fee.amount
     *
     * @return the value of t_project_repeat_fee.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_repeat_fee.amount
     *
     * @param amount the value for t_project_repeat_fee.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_repeat_fee.type
     *
     * @return the value of t_project_repeat_fee.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_repeat_fee.type
     *
     * @param type the value for t_project_repeat_fee.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_repeat_fee.project_id
     *
     * @return the value of t_project_repeat_fee.project_id
     *
     * @mbg.generated
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_repeat_fee.project_id
     *
     * @param projectId the value for t_project_repeat_fee.project_id
     *
     * @mbg.generated
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_repeat_fee.project_name
     *
     * @return the value of t_project_repeat_fee.project_name
     *
     * @mbg.generated
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_repeat_fee.project_name
     *
     * @param projectName the value for t_project_repeat_fee.project_name
     *
     * @mbg.generated
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_project_repeat_fee.project_invest_id
     *
     * @return the value of t_project_repeat_fee.project_invest_id
     *
     * @mbg.generated
     */
    public Long getProjectInvestId() {
        return projectInvestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_project_repeat_fee.project_invest_id
     *
     * @param projectInvestId the value for t_project_repeat_fee.project_invest_id
     *
     * @mbg.generated
     */
    public void setProjectInvestId(Long projectInvestId) {
        this.projectInvestId = projectInvestId;
    }
}