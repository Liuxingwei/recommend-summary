package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Billinvest;

import java.util.List;

public interface BillinvestMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bill_invest
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bill_invest
	 * @mbg.generated
	 */
	int insert(Billinvest record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bill_invest
	 * @mbg.generated
	 */
	Billinvest selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bill_invest
	 * @mbg.generated
	 */
	List<Billinvest> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bill_invest
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Billinvest record);
}