package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Experiencebidsetting;

import java.util.List;

public interface ExperiencebidsettingMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_experience_bid_setting
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_experience_bid_setting
	 * @mbg.generated
	 */
	int insert(Experiencebidsetting record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_experience_bid_setting
	 * @mbg.generated
	 */
	Experiencebidsetting selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_experience_bid_setting
	 * @mbg.generated
	 */
	List<Experiencebidsetting> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_experience_bid_setting
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Experiencebidsetting record);
}