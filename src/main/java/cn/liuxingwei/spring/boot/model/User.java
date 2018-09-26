package cn.liuxingwei.spring.boot.model;

import java.sql.Date;

public class User {
    private Long id;
    private String time;
    private String name;
    private String mobile;
    private String password;
    private Integer passwordContinueFails;
    private Boolean isPasswordLocked;
    private Date passwordLockedTime;
    private Boolean isAllowLogin;
    private Date lockTime;
    private Integer loginCount;
    private Date lastLoginTime;
    private Byte lastLoginClient;
    private String lastLoginIp;
    private Byte type;
    private Boolean platformAccount;
    private Boolean isFreeSigningContract;

    public Long getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }

    public Integer getPasswordContinueFails() {
        return passwordContinueFails;
    }

    public Boolean getPasswordLocked() {
        return isPasswordLocked;
    }

    public Date getPasswordLockedTime() {
        return passwordLockedTime;
    }

    public Boolean getAllowLogin() {
        return isAllowLogin;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public Byte getLastLoginClient() {
        return lastLoginClient;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public Byte getType() {
        return type;
    }

    public Boolean getPlatformAccount() {
        return platformAccount;
    }

    public Boolean getFreeSigningContract() {
        return isFreeSigningContract;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordContinueFails(Integer passwordContinueFails) {
        this.passwordContinueFails = passwordContinueFails;
    }

    public void setPasswordLocked(Boolean passwordLocked) {
        isPasswordLocked = passwordLocked;
    }

    public void setPasswordLockedTime(Date passwordLockedTime) {
        this.passwordLockedTime = passwordLockedTime;
    }

    public void setAllowLogin(Boolean allowLogin) {
        isAllowLogin = allowLogin;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public void setLastLoginClient(Byte lastLoginClient) {
        this.lastLoginClient = lastLoginClient;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public void setPlatformAccount(Boolean platformAccount) {
        this.platformAccount = platformAccount;
    }

    public void setFreeSigningContract(Boolean freeSigningContract) {
        isFreeSigningContract = freeSigningContract;
    }
}
