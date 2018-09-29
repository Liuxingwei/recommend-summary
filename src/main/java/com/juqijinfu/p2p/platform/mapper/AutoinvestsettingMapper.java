package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Autoinvestsetting;

import java.util.List;

public interface AutoinvestsettingMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_auto_invest_setting
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_auto_invest_setting
	 * @mbg.generated
	 */
	int insert(Autoinvestsetting record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_auto_invest_setting
	 * @mbg.generated
	 */
	Autoinvestsetting selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_auto_invest_setting
	 * @mbg.generated
	 */
	List<Autoinvestsetting> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_auto_invest_setting
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Autoinvestsetting record);
}