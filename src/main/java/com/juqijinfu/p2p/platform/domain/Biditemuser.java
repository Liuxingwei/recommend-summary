package com.juqijinfu.p2p.platform.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_bid_item_user
 */
public class Biditemuser {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_bid_item_user.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * Database Column Remarks: 上传时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_bid_item_user.time
	 * @mbg.generated
	 */
	private Date time;
	/**
	 * Database Column Remarks: 借款人ID This field was generated by MyBatis Generator. This field corresponds to the database column t_bid_item_user.user_id
	 * @mbg.generated
	 */
	private Long userId;
	/**
	 * Database Column Remarks: 标的ID This field was generated by MyBatis Generator. This field corresponds to the database column t_bid_item_user.bid_id
	 * @mbg.generated
	 */
	private Long bidId;
	/**
	 * Database Column Remarks: 标的审核科目ID This field was generated by MyBatis Generator. This field corresponds to the database column t_bid_item_user.bid_audit_subject_id
	 * @mbg.generated
	 */
	private Long bidAuditSubjectId;
	/**
	 * Database Column Remarks: 图片名称 This field was generated by MyBatis Generator. This field corresponds to the database column t_bid_item_user.name
	 * @mbg.generated
	 */
	private String name;
	/**
	 * Database Column Remarks: 图片路径 This field was generated by MyBatis Generator. This field corresponds to the database column t_bid_item_user.url
	 * @mbg.generated
	 */
	private String url;
	/**
	 * Database Column Remarks: 资料审核人 This field was generated by MyBatis Generator. This field corresponds to the database column t_bid_item_user.audit_supervisor_id
	 * @mbg.generated
	 */
	private Long auditSupervisorId;
	/**
	 * Database Column Remarks: 审核时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_bid_item_user.audit_time
	 * @mbg.generated
	 */
	private Date auditTime;
	/**
	 * Database Column Remarks: 审核结果: -1：未通过 0：未提交 1：待审核 2：已通过 This field was generated by MyBatis Generator. This field corresponds to the database column t_bid_item_user.status
	 * @mbg.generated
	 */
	private Byte status;
	/**
	 * Database Column Remarks: 资料上传方式：0：本地上传；1：科目库上传 This field was generated by MyBatis Generator. This field corresponds to the database column t_bid_item_user.upload_type
	 * @mbg.generated
	 */
	private Byte uploadType;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_bid_item_user.id
	 * @return  the value of t_bid_item_user.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_bid_item_user.id
	 * @param id  the value for t_bid_item_user.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_bid_item_user.time
	 * @return  the value of t_bid_item_user.time
	 * @mbg.generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_bid_item_user.time
	 * @param time  the value for t_bid_item_user.time
	 * @mbg.generated
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_bid_item_user.user_id
	 * @return  the value of t_bid_item_user.user_id
	 * @mbg.generated
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_bid_item_user.user_id
	 * @param userId  the value for t_bid_item_user.user_id
	 * @mbg.generated
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_bid_item_user.bid_id
	 * @return  the value of t_bid_item_user.bid_id
	 * @mbg.generated
	 */
	public Long getBidId() {
		return bidId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_bid_item_user.bid_id
	 * @param bidId  the value for t_bid_item_user.bid_id
	 * @mbg.generated
	 */
	public void setBidId(Long bidId) {
		this.bidId = bidId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_bid_item_user.bid_audit_subject_id
	 * @return  the value of t_bid_item_user.bid_audit_subject_id
	 * @mbg.generated
	 */
	public Long getBidAuditSubjectId() {
		return bidAuditSubjectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_bid_item_user.bid_audit_subject_id
	 * @param bidAuditSubjectId  the value for t_bid_item_user.bid_audit_subject_id
	 * @mbg.generated
	 */
	public void setBidAuditSubjectId(Long bidAuditSubjectId) {
		this.bidAuditSubjectId = bidAuditSubjectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_bid_item_user.name
	 * @return  the value of t_bid_item_user.name
	 * @mbg.generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_bid_item_user.name
	 * @param name  the value for t_bid_item_user.name
	 * @mbg.generated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_bid_item_user.url
	 * @return  the value of t_bid_item_user.url
	 * @mbg.generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_bid_item_user.url
	 * @param url  the value for t_bid_item_user.url
	 * @mbg.generated
	 */
	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_bid_item_user.audit_supervisor_id
	 * @return  the value of t_bid_item_user.audit_supervisor_id
	 * @mbg.generated
	 */
	public Long getAuditSupervisorId() {
		return auditSupervisorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_bid_item_user.audit_supervisor_id
	 * @param auditSupervisorId  the value for t_bid_item_user.audit_supervisor_id
	 * @mbg.generated
	 */
	public void setAuditSupervisorId(Long auditSupervisorId) {
		this.auditSupervisorId = auditSupervisorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_bid_item_user.audit_time
	 * @return  the value of t_bid_item_user.audit_time
	 * @mbg.generated
	 */
	public Date getAuditTime() {
		return auditTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_bid_item_user.audit_time
	 * @param auditTime  the value for t_bid_item_user.audit_time
	 * @mbg.generated
	 */
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_bid_item_user.status
	 * @return  the value of t_bid_item_user.status
	 * @mbg.generated
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_bid_item_user.status
	 * @param status  the value for t_bid_item_user.status
	 * @mbg.generated
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_bid_item_user.upload_type
	 * @return  the value of t_bid_item_user.upload_type
	 * @mbg.generated
	 */
	public Byte getUploadType() {
		return uploadType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_bid_item_user.upload_type
	 * @param uploadType  the value for t_bid_item_user.upload_type
	 * @mbg.generated
	 */
	public void setUploadType(Byte uploadType) {
		this.uploadType = uploadType;
	}
}