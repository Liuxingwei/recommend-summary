package com.juqijinfu.p2p.platform.domain;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_cps_setting
 */
public class Cpssetting {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cps_setting.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * Database Column Remarks: 键 This field was generated by MyBatis Generator. This field corresponds to the database column t_cps_setting._key
	 * @mbg.generated
	 */
	private String key;
	/**
	 * Database Column Remarks: 值 This field was generated by MyBatis Generator. This field corresponds to the database column t_cps_setting._value
	 * @mbg.generated
	 */
	private String value;
	/**
	 * Database Column Remarks: 描述 This field was generated by MyBatis Generator. This field corresponds to the database column t_cps_setting.description
	 * @mbg.generated
	 */
	private String description;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cps_setting.id
	 * @return  the value of t_cps_setting.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cps_setting.id
	 * @param id  the value for t_cps_setting.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cps_setting._key
	 * @return  the value of t_cps_setting._key
	 * @mbg.generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cps_setting._key
	 * @param key  the value for t_cps_setting._key
	 * @mbg.generated
	 */
	public void setKey(String key) {
		this.key = key == null ? null : key.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cps_setting._value
	 * @return  the value of t_cps_setting._value
	 * @mbg.generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cps_setting._value
	 * @param value  the value for t_cps_setting._value
	 * @mbg.generated
	 */
	public void setValue(String value) {
		this.value = value == null ? null : value.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cps_setting.description
	 * @return  the value of t_cps_setting.description
	 * @mbg.generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cps_setting.description
	 * @param description  the value for t_cps_setting.description
	 * @mbg.generated
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}
}