package cn.liuxingwei.spring.boot.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class DirectUser {
    private Long id;
    private Timestamp time;
    private Long userId;
    private Long spreaderId;
    private BigDecimal totalInvest;
    private BigDecimal firstTotalRebate;
    private BigDecimal secondTotalRebate;

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

    public Long getSpreaderId() {
        return spreaderId;
    }

    public void setSpreaderId(Long spreaderId) {
        this.spreaderId = spreaderId;
    }

    public BigDecimal getTotalInvest() {
        return totalInvest;
    }

    public void setTotalInvest(BigDecimal totalInvest) {
        this.totalInvest = totalInvest;
    }

    public BigDecimal getFirstTotalRebate() {
        return firstTotalRebate;
    }

    public void setFirstTotalRebate(BigDecimal firstTotalRebate) {
        this.firstTotalRebate = firstTotalRebate;
    }

    public BigDecimal getSecondTotalRebate() {
        return secondTotalRebate;
    }

    public void setSecondTotalRebate(BigDecimal secondTotalRebate) {
        this.secondTotalRebate = secondTotalRebate;
    }
}
