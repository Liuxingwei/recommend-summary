package com.juqijinfu.p2p.platform.domain;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_right_supervisor
 */
public class Rightsupervisor {

	/**
	 * Database Column Remarks: 编号ID This field was generated by MyBatis Generator. This field corresponds to the database column t_right_supervisor.id
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * Database Column Remarks: 管理员ID This field was generated by MyBatis Generator. This field corresponds to the database column t_right_supervisor.supervisor_id
	 * @mbg.generated
	 */
	private Long supervisorId;
	/**
	 * Database Column Remarks: 权限ID This field was generated by MyBatis Generator. This field corresponds to the database column t_right_supervisor.right_id
	 * @mbg.generated
	 */
	private Long rightId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_right_supervisor.id
	 * @return  the value of t_right_supervisor.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_right_supervisor.id
	 * @param id  the value for t_right_supervisor.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_right_supervisor.supervisor_id
	 * @return  the value of t_right_supervisor.supervisor_id
	 * @mbg.generated
	 */
	public Long getSupervisorId() {
		return supervisorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_right_supervisor.supervisor_id
	 * @param supervisorId  the value for t_right_supervisor.supervisor_id
	 * @mbg.generated
	 */
	public void setSupervisorId(Long supervisorId) {
		this.supervisorId = supervisorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_right_supervisor.right_id
	 * @return  the value of t_right_supervisor.right_id
	 * @mbg.generated
	 */
	public Long getRightId() {
		return rightId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_right_supervisor.right_id
	 * @param rightId  the value for t_right_supervisor.right_id
	 * @mbg.generated
	 */
	public void setRightId(Long rightId) {
		this.rightId = rightId;
	}
}