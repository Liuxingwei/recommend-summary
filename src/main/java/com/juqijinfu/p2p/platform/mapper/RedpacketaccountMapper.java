package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Redpacketaccount;
import java.util.List;

public interface RedpacketaccountMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_red_packet_account
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_red_packet_account
	 * @mbg.generated
	 */
	int insert(Redpacketaccount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_red_packet_account
	 * @mbg.generated
	 */
	Redpacketaccount selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_red_packet_account
	 * @mbg.generated
	 */
	List<Redpacketaccount> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_red_packet_account
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Redpacketaccount record);
}