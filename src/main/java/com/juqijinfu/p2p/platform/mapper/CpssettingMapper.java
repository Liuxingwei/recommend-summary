package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Cpssetting;

import java.util.List;

public interface CpssettingMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_setting
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_setting
	 * @mbg.generated
	 */
	int insert(Cpssetting record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_setting
	 * @mbg.generated
	 */
	Cpssetting selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_setting
	 * @mbg.generated
	 */
	List<Cpssetting> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_setting
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Cpssetting record);
}