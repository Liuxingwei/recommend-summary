package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Paymentcallback;
import java.util.List;

public interface PaymentcallbackMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_payment_call_back
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_payment_call_back
	 * @mbg.generated
	 */
	int insert(Paymentcallback record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_payment_call_back
	 * @mbg.generated
	 */
	Paymentcallback selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_payment_call_back
	 * @mbg.generated
	 */
	List<Paymentcallback> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_payment_call_back
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Paymentcallback record);
}