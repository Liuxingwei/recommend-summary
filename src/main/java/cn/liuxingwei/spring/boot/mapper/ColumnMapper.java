package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Column;
import java.util.List;

public interface ColumnMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_column
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_column
     *
     * @mbg.generated
     */
    int insert(Column record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_column
     *
     * @mbg.generated
     */
    Column selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_column
     *
     * @mbg.generated
     */
    List<Column> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_column
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Column record);
}