package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Mallscroerecord;
import java.util.List;

public interface MallscroerecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_scroe_record
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_scroe_record
     *
     * @mbg.generated
     */
    int insert(Mallscroerecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_scroe_record
     *
     * @mbg.generated
     */
    Mallscroerecord selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_scroe_record
     *
     * @mbg.generated
     */
    List<Mallscroerecord> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_scroe_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Mallscroerecord record);
}