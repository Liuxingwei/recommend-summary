package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Rightaction;
import java.util.List;

public interface RightactionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_right_action
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_right_action
     *
     * @mbg.generated
     */
    int insert(Rightaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_right_action
     *
     * @mbg.generated
     */
    Rightaction selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_right_action
     *
     * @mbg.generated
     */
    List<Rightaction> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_right_action
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Rightaction record);
}