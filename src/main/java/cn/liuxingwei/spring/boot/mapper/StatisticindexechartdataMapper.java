package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Statisticindexechartdata;
import java.util.List;

public interface StatisticindexechartdataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_statistic_index_echart_data
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_statistic_index_echart_data
     *
     * @mbg.generated
     */
    int insert(Statisticindexechartdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_statistic_index_echart_data
     *
     * @mbg.generated
     */
    Statisticindexechartdata selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_statistic_index_echart_data
     *
     * @mbg.generated
     */
    List<Statisticindexechartdata> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_statistic_index_echart_data
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Statisticindexechartdata record);
}