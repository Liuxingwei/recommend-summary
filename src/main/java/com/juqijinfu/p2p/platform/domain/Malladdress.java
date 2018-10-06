package com.juqijinfu.p2p.platform.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_mall_address
 */
public class Malladdress {

	/**
	 * Database Column Remarks: 记录id This field was generated by MyBatis Generator. This field corresponds to the database column t_mall_address.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * Database Column Remarks: 会员id This field was generated by MyBatis Generator. This field corresponds to the database column t_mall_address.user_id
	 * @mbg.generated
	 */
	private Long userId;
	/**
	 * Database Column Remarks: 更新时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_mall_address.time
	 * @mbg.generated
	 */
	private Date time;
	/**
	 * Database Column Remarks: 收货人姓名 This field was generated by MyBatis Generator. This field corresponds to the database column t_mall_address.receiver
	 * @mbg.generated
	 */
	private String receiver;
	/**
	 * Database Column Remarks: 电话号码 This field was generated by MyBatis Generator. This field corresponds to the database column t_mall_address.tel
	 * @mbg.generated
	 */
	private String tel;
	/**
	 * Database Column Remarks: 详细地址 This field was generated by MyBatis Generator. This field corresponds to the database column t_mall_address.address
	 * @mbg.generated
	 */
	private String address;
	/**
	 * Database Column Remarks: 邮政编码 This field was generated by MyBatis Generator. This field corresponds to the database column t_mall_address.postcode
	 * @mbg.generated
	 */
	private String postcode;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_mall_address.id
	 * @return  the value of t_mall_address.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_mall_address.id
	 * @param id  the value for t_mall_address.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_mall_address.user_id
	 * @return  the value of t_mall_address.user_id
	 * @mbg.generated
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_mall_address.user_id
	 * @param userId  the value for t_mall_address.user_id
	 * @mbg.generated
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_mall_address.time
	 * @return  the value of t_mall_address.time
	 * @mbg.generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_mall_address.time
	 * @param time  the value for t_mall_address.time
	 * @mbg.generated
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_mall_address.receiver
	 * @return  the value of t_mall_address.receiver
	 * @mbg.generated
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_mall_address.receiver
	 * @param receiver  the value for t_mall_address.receiver
	 * @mbg.generated
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver == null ? null : receiver.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_mall_address.tel
	 * @return  the value of t_mall_address.tel
	 * @mbg.generated
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_mall_address.tel
	 * @param tel  the value for t_mall_address.tel
	 * @mbg.generated
	 */
	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_mall_address.address
	 * @return  the value of t_mall_address.address
	 * @mbg.generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_mall_address.address
	 * @param address  the value for t_mall_address.address
	 * @mbg.generated
	 */
	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_mall_address.postcode
	 * @return  the value of t_mall_address.postcode
	 * @mbg.generated
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_mall_address.postcode
	 * @param postcode  the value for t_mall_address.postcode
	 * @mbg.generated
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode == null ? null : postcode.trim();
	}
}