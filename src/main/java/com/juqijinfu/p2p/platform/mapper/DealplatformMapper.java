package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Dealplatform;

import java.util.List;

public interface DealplatformMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_deal_platform
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_deal_platform
	 * @mbg.generated
	 */
	int insert(Dealplatform record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_deal_platform
	 * @mbg.generated
	 */
	Dealplatform selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_deal_platform
	 * @mbg.generated
	 */
	List<Dealplatform> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_deal_platform
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Dealplatform record);
}