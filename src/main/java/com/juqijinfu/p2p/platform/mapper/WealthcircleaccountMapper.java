package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Wealthcircleaccount;
import java.util.List;

public interface WealthcircleaccountMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_wealthcircle_account
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_wealthcircle_account
	 * @mbg.generated
	 */
	int insert(Wealthcircleaccount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_wealthcircle_account
	 * @mbg.generated
	 */
	Wealthcircleaccount selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_wealthcircle_account
	 * @mbg.generated
	 */
	List<Wealthcircleaccount> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_wealthcircle_account
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Wealthcircleaccount record);
}