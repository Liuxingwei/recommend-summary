package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Debtbidinvest;
import java.util.List;

public interface DebtbidinvestMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_debt_bid_invest
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_debt_bid_invest
	 * @mbg.generated
	 */
	int insert(Debtbidinvest record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_debt_bid_invest
	 * @mbg.generated
	 */
	Debtbidinvest selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_debt_bid_invest
	 * @mbg.generated
	 */
	List<Debtbidinvest> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_debt_bid_invest
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Debtbidinvest record);
}