package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Experiencebidinvest;
import java.util.List;

public interface ExperiencebidinvestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_experience_bid_invest
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_experience_bid_invest
     *
     * @mbg.generated
     */
    int insert(Experiencebidinvest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_experience_bid_invest
     *
     * @mbg.generated
     */
    Experiencebidinvest selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_experience_bid_invest
     *
     * @mbg.generated
     */
    List<Experiencebidinvest> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_experience_bid_invest
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Experiencebidinvest record);
}