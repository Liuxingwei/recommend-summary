package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Message;

import java.util.List;

public interface MessageMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_message
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_message
	 * @mbg.generated
	 */
	int insert(Message record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_message
	 * @mbg.generated
	 */
	Message selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_message
	 * @mbg.generated
	 */
	List<Message> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_message
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Message record);
}