package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Debtbidtransfer;
import java.util.List;

public interface DebtbidtransferMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_debt_bid_transfer
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_debt_bid_transfer
	 * @mbg.generated
	 */
	int insert(Debtbidtransfer record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_debt_bid_transfer
	 * @mbg.generated
	 */
	Debtbidtransfer selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_debt_bid_transfer
	 * @mbg.generated
	 */
	List<Debtbidtransfer> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_debt_bid_transfer
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Debtbidtransfer record);
}