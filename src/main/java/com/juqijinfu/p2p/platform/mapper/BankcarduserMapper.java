package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Bankcarduser;

import java.util.List;

public interface BankcarduserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bank_card_user
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bank_card_user
	 * @mbg.generated
	 */
	int insert(Bankcarduser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bank_card_user
	 * @mbg.generated
	 */
	Bankcarduser selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bank_card_user
	 * @mbg.generated
	 */
	List<Bankcarduser> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bank_card_user
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Bankcarduser record);
}