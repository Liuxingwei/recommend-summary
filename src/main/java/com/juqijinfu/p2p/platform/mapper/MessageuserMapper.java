package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Messageuser;
import java.util.List;

public interface MessageuserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_message_user
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_message_user
	 * @mbg.generated
	 */
	int insert(Messageuser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_message_user
	 * @mbg.generated
	 */
	Messageuser selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_message_user
	 * @mbg.generated
	 */
	List<Messageuser> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_message_user
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Messageuser record);
}