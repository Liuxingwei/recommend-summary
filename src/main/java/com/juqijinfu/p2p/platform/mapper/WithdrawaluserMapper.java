package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Withdrawaluser;

import java.util.List;

public interface WithdrawaluserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_withdrawal_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_withdrawal_user
     *
     * @mbg.generated
     */
    int insert(Withdrawaluser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_withdrawal_user
     *
     * @mbg.generated
     */
    Withdrawaluser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_withdrawal_user
     *
     * @mbg.generated
     */
    List<Withdrawaluser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_withdrawal_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Withdrawaluser record);
}