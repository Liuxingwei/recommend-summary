package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Payprocity;

import java.util.List;

public interface PayprocityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_pay_pro_city
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_pay_pro_city
	 * @mbg.generated
	 */
	int insert(Payprocity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_pay_pro_city
	 * @mbg.generated
	 */
	Payprocity selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_pay_pro_city
	 * @mbg.generated
	 */
	List<Payprocity> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_pay_pro_city
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Payprocity record);
}