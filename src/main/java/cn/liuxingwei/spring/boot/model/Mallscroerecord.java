package cn.liuxingwei.spring.boot.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_mall_scroe_record
 */
public class Mallscroerecord {
    /**
     * Database Column Remarks:
     *   记录id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_scroe_record.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   会员id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_scroe_record.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   会员用户名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_scroe_record.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * Database Column Remarks:
     *   添加时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_scroe_record.time
     *
     * @mbg.generated
     */
    private Date time;

    /**
     * Database Column Remarks:
     *   积分类型，1：注册，2：签到，3：投资，4：抽奖，5：兑换
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_scroe_record.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     * Database Column Remarks:
     *   关联id：goods_id，invest_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_scroe_record.relation_id
     *
     * @mbg.generated
     */
    private Long relationId;

    /**
     * Database Column Remarks:
     *   积分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_scroe_record.scroe
     *
     * @mbg.generated
     */
    private Integer scroe;

    /**
     * Database Column Remarks:
     *   赠送/消费状态，1：成功，2：未成功
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_scroe_record.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     * Database Column Remarks:
     *   数量，如兑换数量，理财金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_scroe_record.quantity
     *
     * @mbg.generated
     */
    private BigDecimal quantity;

    /**
     * Database Column Remarks:
     *   描述，如兑换**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_scroe_record.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * Database Column Remarks:
     *   备注，如收货地址，理财产品
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_scroe_record.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_scroe_record.id
     *
     * @return the value of t_mall_scroe_record.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_scroe_record.id
     *
     * @param id the value for t_mall_scroe_record.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_scroe_record.user_id
     *
     * @return the value of t_mall_scroe_record.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_scroe_record.user_id
     *
     * @param userId the value for t_mall_scroe_record.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_scroe_record.user_name
     *
     * @return the value of t_mall_scroe_record.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_scroe_record.user_name
     *
     * @param userName the value for t_mall_scroe_record.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_scroe_record.time
     *
     * @return the value of t_mall_scroe_record.time
     *
     * @mbg.generated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_scroe_record.time
     *
     * @param time the value for t_mall_scroe_record.time
     *
     * @mbg.generated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_scroe_record.type
     *
     * @return the value of t_mall_scroe_record.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_scroe_record.type
     *
     * @param type the value for t_mall_scroe_record.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_scroe_record.relation_id
     *
     * @return the value of t_mall_scroe_record.relation_id
     *
     * @mbg.generated
     */
    public Long getRelationId() {
        return relationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_scroe_record.relation_id
     *
     * @param relationId the value for t_mall_scroe_record.relation_id
     *
     * @mbg.generated
     */
    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_scroe_record.scroe
     *
     * @return the value of t_mall_scroe_record.scroe
     *
     * @mbg.generated
     */
    public Integer getScroe() {
        return scroe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_scroe_record.scroe
     *
     * @param scroe the value for t_mall_scroe_record.scroe
     *
     * @mbg.generated
     */
    public void setScroe(Integer scroe) {
        this.scroe = scroe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_scroe_record.status
     *
     * @return the value of t_mall_scroe_record.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_scroe_record.status
     *
     * @param status the value for t_mall_scroe_record.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_scroe_record.quantity
     *
     * @return the value of t_mall_scroe_record.quantity
     *
     * @mbg.generated
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_scroe_record.quantity
     *
     * @param quantity the value for t_mall_scroe_record.quantity
     *
     * @mbg.generated
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_scroe_record.description
     *
     * @return the value of t_mall_scroe_record.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_scroe_record.description
     *
     * @param description the value for t_mall_scroe_record.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_scroe_record.remark
     *
     * @return the value of t_mall_scroe_record.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_scroe_record.remark
     *
     * @param remark the value for t_mall_scroe_record.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}