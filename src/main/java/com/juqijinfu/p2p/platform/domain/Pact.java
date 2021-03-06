package com.juqijinfu.p2p.platform.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_pact
 */
public class Pact {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_pact.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * Database Column Remarks: 生成时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_pact.time
	 * @mbg.generated
	 */
	private Date time;
	/**
	 * Database Column Remarks: 主体的id(如债权转让合同对应的是债权id，散标投资对应的是bid) This field was generated by MyBatis Generator. This field corresponds to the database column t_pact.pid
	 * @mbg.generated
	 */
	private Long pid;
	/**
	 * Database Column Remarks: 合同模板类型(后面可以扩展):0 散标投资，1 债权转让 This field was generated by MyBatis Generator. This field corresponds to the database column t_pact.type
	 * @mbg.generated
	 */
	private Byte type;
	/**
	 * Database Column Remarks: 水印图片路径 This field was generated by MyBatis Generator. This field corresponds to the database column t_pact.image_url
	 * @mbg.generated
	 */
	private String imageUrl;
	/**
	 * Database Column Remarks: 合同的内容(生成好后的合同) This field was generated by MyBatis Generator. This field corresponds to the database column t_pact.content
	 * @mbg.generated
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_pact.id
	 * @return  the value of t_pact.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_pact.id
	 * @param id  the value for t_pact.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_pact.time
	 * @return  the value of t_pact.time
	 * @mbg.generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_pact.time
	 * @param time  the value for t_pact.time
	 * @mbg.generated
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_pact.pid
	 * @return  the value of t_pact.pid
	 * @mbg.generated
	 */
	public Long getPid() {
		return pid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_pact.pid
	 * @param pid  the value for t_pact.pid
	 * @mbg.generated
	 */
	public void setPid(Long pid) {
		this.pid = pid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_pact.type
	 * @return  the value of t_pact.type
	 * @mbg.generated
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_pact.type
	 * @param type  the value for t_pact.type
	 * @mbg.generated
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_pact.image_url
	 * @return  the value of t_pact.image_url
	 * @mbg.generated
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_pact.image_url
	 * @param imageUrl  the value for t_pact.image_url
	 * @mbg.generated
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl == null ? null : imageUrl.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_pact.content
	 * @return  the value of t_pact.content
	 * @mbg.generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_pact.content
	 * @param content  the value for t_pact.content
	 * @mbg.generated
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
}