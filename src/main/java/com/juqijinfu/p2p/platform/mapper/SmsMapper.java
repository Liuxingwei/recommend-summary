package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Sms;

import java.util.List;

public interface SmsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms
     *
     * @mbg.generated
     */
    int insert(Sms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms
     *
     * @mbg.generated
     */
    Sms selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms
     *
     * @mbg.generated
     */
    List<Sms> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Sms record);
}