package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Conversionuser;
import java.util.List;

public interface ConversionuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_conversion_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_conversion_user
     *
     * @mbg.generated
     */
    int insert(Conversionuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_conversion_user
     *
     * @mbg.generated
     */
    Conversionuser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_conversion_user
     *
     * @mbg.generated
     */
    List<Conversionuser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_conversion_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Conversionuser record);
}