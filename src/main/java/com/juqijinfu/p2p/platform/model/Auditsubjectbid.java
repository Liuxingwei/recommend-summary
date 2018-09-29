package com.juqijinfu.p2p.platform.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_audit_subject_bid
 */
public class Auditsubjectbid {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_audit_subject_bid.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_audit_subject_bid.time
     *
     * @mbg.generated
     */
    private Date time;

    /**
     * Database Column Remarks:
     *   所属标的ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_audit_subject_bid.bid_id
     *
     * @mbg.generated
     */
    private Long bidId;

    /**
     * Database Column Remarks:
     *   科目名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_audit_subject_bid.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   要求
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_audit_subject_bid.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_audit_subject_bid.id
     *
     * @return the value of t_audit_subject_bid.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_audit_subject_bid.id
     *
     * @param id the value for t_audit_subject_bid.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_audit_subject_bid.time
     *
     * @return the value of t_audit_subject_bid.time
     *
     * @mbg.generated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_audit_subject_bid.time
     *
     * @param time the value for t_audit_subject_bid.time
     *
     * @mbg.generated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_audit_subject_bid.bid_id
     *
     * @return the value of t_audit_subject_bid.bid_id
     *
     * @mbg.generated
     */
    public Long getBidId() {
        return bidId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_audit_subject_bid.bid_id
     *
     * @param bidId the value for t_audit_subject_bid.bid_id
     *
     * @mbg.generated
     */
    public void setBidId(Long bidId) {
        this.bidId = bidId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_audit_subject_bid.name
     *
     * @return the value of t_audit_subject_bid.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_audit_subject_bid.name
     *
     * @param name the value for t_audit_subject_bid.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_audit_subject_bid.description
     *
     * @return the value of t_audit_subject_bid.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_audit_subject_bid.description
     *
     * @param description the value for t_audit_subject_bid.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}