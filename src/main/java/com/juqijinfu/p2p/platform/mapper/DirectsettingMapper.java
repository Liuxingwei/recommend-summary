package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Directsetting;

import java.util.List;

public interface DirectsettingMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_direct_setting
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_direct_setting
	 * @mbg.generated
	 */
	int insert(Directsetting record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_direct_setting
	 * @mbg.generated
	 */
	Directsetting selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_direct_setting
	 * @mbg.generated
	 */
	List<Directsetting> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_direct_setting
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Directsetting record);
}