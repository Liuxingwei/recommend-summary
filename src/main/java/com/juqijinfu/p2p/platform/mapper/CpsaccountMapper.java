package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Cpsaccount;
import java.util.List;

public interface CpsaccountMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_account
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_account
	 * @mbg.generated
	 */
	int insert(Cpsaccount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_account
	 * @mbg.generated
	 */
	Cpsaccount selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_account
	 * @mbg.generated
	 */
	List<Cpsaccount> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_cps_account
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Cpsaccount record);
}