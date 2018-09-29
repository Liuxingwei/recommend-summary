package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Consultant;

import java.util.List;

public interface ConsultantMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_consultant
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_consultant
	 * @mbg.generated
	 */
	int insert(Consultant record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_consultant
	 * @mbg.generated
	 */
	Consultant selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_consultant
	 * @mbg.generated
	 */
	List<Consultant> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_consultant
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Consultant record);
}