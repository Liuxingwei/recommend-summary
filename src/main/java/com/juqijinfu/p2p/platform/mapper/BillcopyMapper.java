package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Billcopy;
import java.util.List;

public interface BillcopyMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bill_copy
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bill_copy
	 * @mbg.generated
	 */
	int insert(Billcopy record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bill_copy
	 * @mbg.generated
	 */
	Billcopy selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bill_copy
	 * @mbg.generated
	 */
	List<Billcopy> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bill_copy
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Billcopy record);
}