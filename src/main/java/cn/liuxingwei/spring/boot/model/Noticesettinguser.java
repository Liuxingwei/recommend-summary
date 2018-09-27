package cn.liuxingwei.spring.boot.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_notice_setting_user
 */
public class Noticesettinguser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_setting_user.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_setting_user.time
     *
     * @mbg.generated
     */
    private Date time;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_setting_user.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   场景code
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_setting_user.scene
     *
     * @mbg.generated
     */
    private Byte scene;

    /**
     * Database Column Remarks:
     *   是否接收:
     *   0-不接收
     *   1-接收
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_setting_user.sms
     *
     * @mbg.generated
     */
    private Boolean sms;

    /**
     * Database Column Remarks:
     *   是否接收站内消息
     *   0-不接收
     *   1-接收
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_setting_user.msg
     *
     * @mbg.generated
     */
    private Boolean msg;

    /**
     * Database Column Remarks:
     *   是否接收邮件
     *   0-不接收
     *   1-接收
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_setting_user.email
     *
     * @mbg.generated
     */
    private Boolean email;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_setting_user.id
     *
     * @return the value of t_notice_setting_user.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_setting_user.id
     *
     * @param id the value for t_notice_setting_user.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_setting_user.time
     *
     * @return the value of t_notice_setting_user.time
     *
     * @mbg.generated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_setting_user.time
     *
     * @param time the value for t_notice_setting_user.time
     *
     * @mbg.generated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_setting_user.user_id
     *
     * @return the value of t_notice_setting_user.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_setting_user.user_id
     *
     * @param userId the value for t_notice_setting_user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_setting_user.scene
     *
     * @return the value of t_notice_setting_user.scene
     *
     * @mbg.generated
     */
    public Byte getScene() {
        return scene;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_setting_user.scene
     *
     * @param scene the value for t_notice_setting_user.scene
     *
     * @mbg.generated
     */
    public void setScene(Byte scene) {
        this.scene = scene;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_setting_user.sms
     *
     * @return the value of t_notice_setting_user.sms
     *
     * @mbg.generated
     */
    public Boolean getSms() {
        return sms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_setting_user.sms
     *
     * @param sms the value for t_notice_setting_user.sms
     *
     * @mbg.generated
     */
    public void setSms(Boolean sms) {
        this.sms = sms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_setting_user.msg
     *
     * @return the value of t_notice_setting_user.msg
     *
     * @mbg.generated
     */
    public Boolean getMsg() {
        return msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_setting_user.msg
     *
     * @param msg the value for t_notice_setting_user.msg
     *
     * @mbg.generated
     */
    public void setMsg(Boolean msg) {
        this.msg = msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_setting_user.email
     *
     * @return the value of t_notice_setting_user.email
     *
     * @mbg.generated
     */
    public Boolean getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_setting_user.email
     *
     * @param email the value for t_notice_setting_user.email
     *
     * @mbg.generated
     */
    public void setEmail(Boolean email) {
        this.email = email;
    }
}