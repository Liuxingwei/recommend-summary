package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Malladdress;
import java.util.List;

public interface MalladdressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_address
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_address
     *
     * @mbg.generated
     */
    int insert(Malladdress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_address
     *
     * @mbg.generated
     */
    Malladdress selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_address
     *
     * @mbg.generated
     */
    List<Malladdress> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Malladdress record);
}