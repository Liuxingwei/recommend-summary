package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Projectrepeatfee;
import java.util.List;

public interface ProjectrepeatfeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_repeat_fee
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_repeat_fee
     *
     * @mbg.generated
     */
    int insert(Projectrepeatfee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_repeat_fee
     *
     * @mbg.generated
     */
    Projectrepeatfee selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_repeat_fee
     *
     * @mbg.generated
     */
    List<Projectrepeatfee> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_repeat_fee
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Projectrepeatfee record);
}