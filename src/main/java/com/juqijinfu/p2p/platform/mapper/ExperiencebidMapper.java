package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Experiencebid;
import java.util.List;

public interface ExperiencebidMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_experience_bid
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_experience_bid
	 * @mbg.generated
	 */
	int insert(Experiencebid record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_experience_bid
	 * @mbg.generated
	 */
	Experiencebid selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_experience_bid
	 * @mbg.generated
	 */
	List<Experiencebid> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_experience_bid
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Experiencebid record);
}