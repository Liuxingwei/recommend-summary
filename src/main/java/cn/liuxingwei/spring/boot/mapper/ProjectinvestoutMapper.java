package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Projectinvestout;
import java.util.List;

public interface ProjectinvestoutMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_invest_out
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_invest_out
     *
     * @mbg.generated
     */
    int insert(Projectinvestout record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_invest_out
     *
     * @mbg.generated
     */
    Projectinvestout selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_invest_out
     *
     * @mbg.generated
     */
    List<Projectinvestout> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_invest_out
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Projectinvestout record);
}