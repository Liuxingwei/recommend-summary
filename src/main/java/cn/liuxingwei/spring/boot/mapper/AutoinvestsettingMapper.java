package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Autoinvestsetting;
import java.util.List;

public interface AutoinvestsettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auto_invest_setting
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auto_invest_setting
     *
     * @mbg.generated
     */
    int insert(Autoinvestsetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auto_invest_setting
     *
     * @mbg.generated
     */
    Autoinvestsetting selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auto_invest_setting
     *
     * @mbg.generated
     */
    List<Autoinvestsetting> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auto_invest_setting
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Autoinvestsetting record);
}