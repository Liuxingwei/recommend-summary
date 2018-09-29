package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Product;
import java.util.List;

public interface ProductMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_product
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_product
	 * @mbg.generated
	 */
	int insert(Product record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_product
	 * @mbg.generated
	 */
	Product selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_product
	 * @mbg.generated
	 */
	List<Product> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_product
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Product record);
}