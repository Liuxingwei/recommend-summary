package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Redpacket;

import java.util.List;

public interface RedpacketMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_red_packet
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_red_packet
	 * @mbg.generated
	 */
	int insert(Redpacket record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_red_packet
	 * @mbg.generated
	 */
	Redpacket selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_red_packet
	 * @mbg.generated
	 */
	List<Redpacket> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_red_packet
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Redpacket record);
}