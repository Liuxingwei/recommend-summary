package com.juqijinfu.p2p.platform.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_user
 */
public class User {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * Database Column Remarks: 注册时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_user.time
	 * @mbg.generated
	 */
	private Date time;
	/**
	 * Database Column Remarks: 用户名 This field was generated by MyBatis Generator. This field corresponds to the database column t_user.name
	 * @mbg.generated
	 */
	private String name;
	/**
	 * Database Column Remarks: 手机号码（冗余，仅作登入） This field was generated by MyBatis Generator. This field corresponds to the database column t_user.mobile
	 * @mbg.generated
	 */
	private String mobile;
	/**
	 * Database Column Remarks: 登录密码 This field was generated by MyBatis Generator. This field corresponds to the database column t_user.password
	 * @mbg.generated
	 */
	private String password;
	/**
	 * Database Column Remarks: 连续登录失败次数 This field was generated by MyBatis Generator. This field corresponds to the database column t_user.password_continue_fails
	 * @mbg.generated
	 */
	private Integer passwordContinueFails;
	/**
	 * Database Column Remarks: 密码连续错误被锁定 This field was generated by MyBatis Generator. This field corresponds to the database column t_user.is_password_locked
	 * @mbg.generated
	 */
	private Boolean isPasswordLocked;
	/**
	 * Database Column Remarks: 密码连续错误被锁定时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_user.password_locked_time
	 * @mbg.generated
	 */
	private Date passwordLockedTime;
	/**
	 * Database Column Remarks: 是否允许登录(锁定)  This field was generated by MyBatis Generator. This field corresponds to the database column t_user.is_allow_login
	 * @mbg.generated
	 */
	private Boolean isAllowLogin;
	/**
	 * Database Column Remarks: 后台管理员执行锁定的时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_user.lock_time
	 * @mbg.generated
	 */
	private Date lockTime;
	/**
	 * Database Column Remarks: 登录次数 This field was generated by MyBatis Generator. This field corresponds to the database column t_user.login_count
	 * @mbg.generated
	 */
	private Integer loginCount;
	/**
	 * Database Column Remarks: 上次登录时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_user.last_login_time
	 * @mbg.generated
	 */
	private Date lastLoginTime;
	/**
	 * Database Column Remarks: 上次登录入口：1 pc 2 app 3 wechat  This field was generated by MyBatis Generator. This field corresponds to the database column t_user.last_login_client
	 * @mbg.generated
	 */
	private Byte lastLoginClient;
	/**
	 * Database Column Remarks: 上次登录ip This field was generated by MyBatis Generator. This field corresponds to the database column t_user.last_login_ip
	 * @mbg.generated
	 */
	private String lastLoginIp;
	/**
	 * Database Column Remarks: 1:个人用户  2:企业用户 This field was generated by MyBatis Generator. This field corresponds to the database column t_user.type
	 * @mbg.generated
	 */
	private Byte type;
	/**
	 * Database Column Remarks: 是否平台账户 This field was generated by MyBatis Generator. This field corresponds to the database column t_user.platform_account
	 * @mbg.generated
	 */
	private Boolean platformAccount;
	/**
	 * Database Column Remarks: 是否进行免登签约 This field was generated by MyBatis Generator. This field corresponds to the database column t_user.is_freeSigningContract
	 * @mbg.generated
	 */
	private Boolean isFreesigningcontract;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.id
	 * @return  the value of t_user.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.id
	 * @param id  the value for t_user.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.time
	 * @return  the value of t_user.time
	 * @mbg.generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.time
	 * @param time  the value for t_user.time
	 * @mbg.generated
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.name
	 * @return  the value of t_user.name
	 * @mbg.generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.name
	 * @param name  the value for t_user.name
	 * @mbg.generated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.mobile
	 * @return  the value of t_user.mobile
	 * @mbg.generated
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.mobile
	 * @param mobile  the value for t_user.mobile
	 * @mbg.generated
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.password
	 * @return  the value of t_user.password
	 * @mbg.generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.password
	 * @param password  the value for t_user.password
	 * @mbg.generated
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.password_continue_fails
	 * @return  the value of t_user.password_continue_fails
	 * @mbg.generated
	 */
	public Integer getPasswordContinueFails() {
		return passwordContinueFails;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.password_continue_fails
	 * @param passwordContinueFails  the value for t_user.password_continue_fails
	 * @mbg.generated
	 */
	public void setPasswordContinueFails(Integer passwordContinueFails) {
		this.passwordContinueFails = passwordContinueFails;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.is_password_locked
	 * @return  the value of t_user.is_password_locked
	 * @mbg.generated
	 */
	public Boolean getIsPasswordLocked() {
		return isPasswordLocked;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.is_password_locked
	 * @param isPasswordLocked  the value for t_user.is_password_locked
	 * @mbg.generated
	 */
	public void setIsPasswordLocked(Boolean isPasswordLocked) {
		this.isPasswordLocked = isPasswordLocked;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.password_locked_time
	 * @return  the value of t_user.password_locked_time
	 * @mbg.generated
	 */
	public Date getPasswordLockedTime() {
		return passwordLockedTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.password_locked_time
	 * @param passwordLockedTime  the value for t_user.password_locked_time
	 * @mbg.generated
	 */
	public void setPasswordLockedTime(Date passwordLockedTime) {
		this.passwordLockedTime = passwordLockedTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.is_allow_login
	 * @return  the value of t_user.is_allow_login
	 * @mbg.generated
	 */
	public Boolean getIsAllowLogin() {
		return isAllowLogin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.is_allow_login
	 * @param isAllowLogin  the value for t_user.is_allow_login
	 * @mbg.generated
	 */
	public void setIsAllowLogin(Boolean isAllowLogin) {
		this.isAllowLogin = isAllowLogin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.lock_time
	 * @return  the value of t_user.lock_time
	 * @mbg.generated
	 */
	public Date getLockTime() {
		return lockTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.lock_time
	 * @param lockTime  the value for t_user.lock_time
	 * @mbg.generated
	 */
	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.login_count
	 * @return  the value of t_user.login_count
	 * @mbg.generated
	 */
	public Integer getLoginCount() {
		return loginCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.login_count
	 * @param loginCount  the value for t_user.login_count
	 * @mbg.generated
	 */
	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.last_login_time
	 * @return  the value of t_user.last_login_time
	 * @mbg.generated
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.last_login_time
	 * @param lastLoginTime  the value for t_user.last_login_time
	 * @mbg.generated
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.last_login_client
	 * @return  the value of t_user.last_login_client
	 * @mbg.generated
	 */
	public Byte getLastLoginClient() {
		return lastLoginClient;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.last_login_client
	 * @param lastLoginClient  the value for t_user.last_login_client
	 * @mbg.generated
	 */
	public void setLastLoginClient(Byte lastLoginClient) {
		this.lastLoginClient = lastLoginClient;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.last_login_ip
	 * @return  the value of t_user.last_login_ip
	 * @mbg.generated
	 */
	public String getLastLoginIp() {
		return lastLoginIp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.last_login_ip
	 * @param lastLoginIp  the value for t_user.last_login_ip
	 * @mbg.generated
	 */
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.type
	 * @return  the value of t_user.type
	 * @mbg.generated
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.type
	 * @param type  the value for t_user.type
	 * @mbg.generated
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.platform_account
	 * @return  the value of t_user.platform_account
	 * @mbg.generated
	 */
	public Boolean getPlatformAccount() {
		return platformAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.platform_account
	 * @param platformAccount  the value for t_user.platform_account
	 * @mbg.generated
	 */
	public void setPlatformAccount(Boolean platformAccount) {
		this.platformAccount = platformAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.is_freeSigningContract
	 * @return  the value of t_user.is_freeSigningContract
	 * @mbg.generated
	 */
	public Boolean getIsFreesigningcontract() {
		return isFreesigningcontract;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.is_freeSigningContract
	 * @param isFreesigningcontract  the value for t_user.is_freeSigningContract
	 * @mbg.generated
	 */
	public void setIsFreesigningcontract(Boolean isFreesigningcontract) {
		this.isFreesigningcontract = isFreesigningcontract;
	}

	/**
     * 用户直客信息
     * @author liuxingwei
     */
    private Directaccount directaccount;

    /**
     * 获取用户直客推荐码
     *
     * @author liuxingwei
     * @return the value of t_direct_account
     */
    public Directaccount getDiretaccount() {
        return directaccount;
    }

    /**
     * 设置用户直客推荐码
     *
     * @author liuxingwei
     * @param directaccount the value for t_direct_account
     */
    public void setDirectaccount(Directaccount directaccount) {
        this.directaccount = directaccount;
    }
}