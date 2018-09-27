package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Project;
import java.util.List;

public interface ProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project
     *
     * @mbg.generated
     */
    int insert(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project
     *
     * @mbg.generated
     */
    Project selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project
     *
     * @mbg.generated
     */
    List<Project> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Project record);
}