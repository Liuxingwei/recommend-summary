package com.juqijinfu.p2p.platform.domain;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_right
 */
public class Right {

	/**
	 * Database Column Remarks: 权限ID This field was generated by MyBatis Generator. This field corresponds to the database column t_right.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * Database Column Remarks: 权限描述 This field was generated by MyBatis Generator. This field corresponds to the database column t_right.description
	 * @mbg.generated
	 */
	private String description;
	/**
	 * Database Column Remarks: 权限名称 This field was generated by MyBatis Generator. This field corresponds to the database column t_right.name
	 * @mbg.generated
	 */
	private String name;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_right.id
	 * @return  the value of t_right.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_right.id
	 * @param id  the value for t_right.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_right.description
	 * @return  the value of t_right.description
	 * @mbg.generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_right.description
	 * @param description  the value for t_right.description
	 * @mbg.generated
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_right.name
	 * @return  the value of t_right.name
	 * @mbg.generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_right.name
	 * @param name  the value for t_right.name
	 * @mbg.generated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
}