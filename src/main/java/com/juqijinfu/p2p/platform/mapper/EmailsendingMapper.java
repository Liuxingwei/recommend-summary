package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Emailsending;
import java.util.List;

public interface EmailsendingMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_email_sending
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_email_sending
	 * @mbg.generated
	 */
	int insert(Emailsending record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_email_sending
	 * @mbg.generated
	 */
	Emailsending selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_email_sending
	 * @mbg.generated
	 */
	List<Emailsending> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_email_sending
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Emailsending record);
}