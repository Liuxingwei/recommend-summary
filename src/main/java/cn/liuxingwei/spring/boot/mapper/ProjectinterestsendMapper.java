package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Projectinterestsend;
import java.util.List;

public interface ProjectinterestsendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_interest_send
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_interest_send
     *
     * @mbg.generated
     */
    int insert(Projectinterestsend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_interest_send
     *
     * @mbg.generated
     */
    Projectinterestsend selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_interest_send
     *
     * @mbg.generated
     */
    List<Projectinterestsend> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_project_interest_send
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Projectinterestsend record);
}