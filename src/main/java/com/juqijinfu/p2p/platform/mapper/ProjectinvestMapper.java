package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Projectinvest;

import java.util.List;

public interface ProjectinvestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_invest
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_invest
     *
     * @mbg.generated
     */
    int insert(Projectinvest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_invest
     *
     * @mbg.generated
     */
    Projectinvest selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_invest
     *
     * @mbg.generated
     */
    List<Projectinvest> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_invest
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Projectinvest record);
}