package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Cpsuser;

import java.util.List;

public interface CpsuserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_user
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_user
	 * @mbg.generated
	 */
	int insert(Cpsuser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_user
	 * @mbg.generated
	 */
	Cpsuser selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_user
	 * @mbg.generated
	 */
	List<Cpsuser> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_user
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Cpsuser record);
}