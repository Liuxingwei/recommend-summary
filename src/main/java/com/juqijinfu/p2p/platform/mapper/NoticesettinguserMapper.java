package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Noticesettinguser;
import java.util.List;

public interface NoticesettinguserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_notice_setting_user
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_notice_setting_user
	 * @mbg.generated
	 */
	int insert(Noticesettinguser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_notice_setting_user
	 * @mbg.generated
	 */
	Noticesettinguser selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_notice_setting_user
	 * @mbg.generated
	 */
	List<Noticesettinguser> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_notice_setting_user
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Noticesettinguser record);
}