package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Supervisor;
import java.util.List;

public interface SupervisorMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_supervisor
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_supervisor
	 * @mbg.generated
	 */
	int insert(Supervisor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_supervisor
	 * @mbg.generated
	 */
	Supervisor selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_supervisor
	 * @mbg.generated
	 */
	List<Supervisor> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_supervisor
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Supervisor record);
}