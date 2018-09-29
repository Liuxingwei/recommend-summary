package com.juqijinfu.p2p.platform.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_email
 */
public class Email {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_email.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * Database Column Remarks: 添加时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_email.time
	 * @mbg.generated
	 */
	private Date time;
	/**
	 * Database Column Remarks: 管理员id,如果是0表示系统自动发送 This field was generated by MyBatis Generator. This field corresponds to the database column t_email.supervisor_id
	 * @mbg.generated
	 */
	private Long supervisorId;
	/**
	 * Database Column Remarks: 接受者邮箱地址 This field was generated by MyBatis Generator. This field corresponds to the database column t_email.email
	 * @mbg.generated
	 */
	private String email;
	/**
	 * Database Column Remarks: 标题 This field was generated by MyBatis Generator. This field corresponds to the database column t_email.title
	 * @mbg.generated
	 */
	private String title;
	/**
	 * Database Column Remarks: 邮件内容 This field was generated by MyBatis Generator. This field corresponds to the database column t_email.content
	 * @mbg.generated
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_email.id
	 * @return  the value of t_email.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_email.id
	 * @param id  the value for t_email.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_email.time
	 * @return  the value of t_email.time
	 * @mbg.generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_email.time
	 * @param time  the value for t_email.time
	 * @mbg.generated
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_email.supervisor_id
	 * @return  the value of t_email.supervisor_id
	 * @mbg.generated
	 */
	public Long getSupervisorId() {
		return supervisorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_email.supervisor_id
	 * @param supervisorId  the value for t_email.supervisor_id
	 * @mbg.generated
	 */
	public void setSupervisorId(Long supervisorId) {
		this.supervisorId = supervisorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_email.email
	 * @return  the value of t_email.email
	 * @mbg.generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_email.email
	 * @param email  the value for t_email.email
	 * @mbg.generated
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_email.title
	 * @return  the value of t_email.title
	 * @mbg.generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_email.title
	 * @param title  the value for t_email.title
	 * @mbg.generated
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_email.content
	 * @return  the value of t_email.content
	 * @mbg.generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_email.content
	 * @param content  the value for t_email.content
	 * @mbg.generated
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
}