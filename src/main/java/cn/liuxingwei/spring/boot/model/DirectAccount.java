package cn.liuxingwei.spring.boot.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class DirectAccount {
    private Long id;
    private Timestamp time;
    private Long userId;
    private BigDecimal balance;
    private String directCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getDirectCode() {
        return directCode;
    }

    public void setDirectCode(String directCode) {
        this.directCode = directCode;
    }
}
