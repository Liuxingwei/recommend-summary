package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Right;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RightMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_right
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(@Param("id") Long id, @Param("description") String description);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_right
	 * @mbg.generated
	 */
	int insert(Right record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_right
	 * @mbg.generated
	 */
	Right selectByPrimaryKey(@Param("id") Long id, @Param("description") String description);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_right
	 * @mbg.generated
	 */
	List<Right> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_right
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Right record);
}