package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Partner;
import java.util.List;

public interface PartnerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_partner
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_partner
     *
     * @mbg.generated
     */
    int insert(Partner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_partner
     *
     * @mbg.generated
     */
    Partner selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_partner
     *
     * @mbg.generated
     */
    List<Partner> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_partner
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Partner record);
}