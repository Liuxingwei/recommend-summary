package com.juqijinfu.p2p.platform.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_supervisor
 */
public class Supervisor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supervisor.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   添加时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supervisor.time
     *
     * @mbg.generated
     */
    private Date time;

    /**
     * Database Column Remarks:
     *   用户名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supervisor.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   真实姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supervisor.reality_name
     *
     * @mbg.generated
     */
    private String realityName;

    /**
     * Database Column Remarks:
     *   手机号码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supervisor.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * Database Column Remarks:
     *   录登密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supervisor.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     * Database Column Remarks:
     *   锁定状态
     *   0-未锁定
     *   2-管理员直接锁定
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supervisor.lock_status
     *
     * @mbg.generated
     */
    private Byte lockStatus;

    /**
     * Database Column Remarks:
     *   登录次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supervisor.login_count
     *
     * @mbg.generated
     */
    private Long loginCount;

    /**
     * Database Column Remarks:
     *   上次登录时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supervisor.last_login_time
     *
     * @mbg.generated
     */
    private Date lastLoginTime;

    /**
     * Database Column Remarks:
     *   上次登录ip
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supervisor.last_login_ip
     *
     * @mbg.generated
     */
    private String lastLoginIp;

    /**
     * Database Column Remarks:
     *   创建者id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supervisor.creater_id
     *
     * @mbg.generated
     */
    private Long createrId;

    /**
     * Database Column Remarks:
     *   U盾密钥
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supervisor.ukey
     *
     * @mbg.generated
     */
    private String ukey;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supervisor.id
     *
     * @return the value of t_supervisor.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supervisor.id
     *
     * @param id the value for t_supervisor.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supervisor.time
     *
     * @return the value of t_supervisor.time
     *
     * @mbg.generated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supervisor.time
     *
     * @param time the value for t_supervisor.time
     *
     * @mbg.generated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supervisor.name
     *
     * @return the value of t_supervisor.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supervisor.name
     *
     * @param name the value for t_supervisor.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supervisor.reality_name
     *
     * @return the value of t_supervisor.reality_name
     *
     * @mbg.generated
     */
    public String getRealityName() {
        return realityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supervisor.reality_name
     *
     * @param realityName the value for t_supervisor.reality_name
     *
     * @mbg.generated
     */
    public void setRealityName(String realityName) {
        this.realityName = realityName == null ? null : realityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supervisor.mobile
     *
     * @return the value of t_supervisor.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supervisor.mobile
     *
     * @param mobile the value for t_supervisor.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supervisor.password
     *
     * @return the value of t_supervisor.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supervisor.password
     *
     * @param password the value for t_supervisor.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supervisor.lock_status
     *
     * @return the value of t_supervisor.lock_status
     *
     * @mbg.generated
     */
    public Byte getLockStatus() {
        return lockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supervisor.lock_status
     *
     * @param lockStatus the value for t_supervisor.lock_status
     *
     * @mbg.generated
     */
    public void setLockStatus(Byte lockStatus) {
        this.lockStatus = lockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supervisor.login_count
     *
     * @return the value of t_supervisor.login_count
     *
     * @mbg.generated
     */
    public Long getLoginCount() {
        return loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supervisor.login_count
     *
     * @param loginCount the value for t_supervisor.login_count
     *
     * @mbg.generated
     */
    public void setLoginCount(Long loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supervisor.last_login_time
     *
     * @return the value of t_supervisor.last_login_time
     *
     * @mbg.generated
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supervisor.last_login_time
     *
     * @param lastLoginTime the value for t_supervisor.last_login_time
     *
     * @mbg.generated
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supervisor.last_login_ip
     *
     * @return the value of t_supervisor.last_login_ip
     *
     * @mbg.generated
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supervisor.last_login_ip
     *
     * @param lastLoginIp the value for t_supervisor.last_login_ip
     *
     * @mbg.generated
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supervisor.creater_id
     *
     * @return the value of t_supervisor.creater_id
     *
     * @mbg.generated
     */
    public Long getCreaterId() {
        return createrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supervisor.creater_id
     *
     * @param createrId the value for t_supervisor.creater_id
     *
     * @mbg.generated
     */
    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supervisor.ukey
     *
     * @return the value of t_supervisor.ukey
     *
     * @mbg.generated
     */
    public String getUkey() {
        return ukey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supervisor.ukey
     *
     * @param ukey the value for t_supervisor.ukey
     *
     * @mbg.generated
     */
    public void setUkey(String ukey) {
        this.ukey = ukey == null ? null : ukey.trim();
    }
}