package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Transferee;
import java.util.List;

public interface TransfereeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_transferee
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_transferee
     *
     * @mbg.generated
     */
    int insert(Transferee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_transferee
     *
     * @mbg.generated
     */
    Transferee selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_transferee
     *
     * @mbg.generated
     */
    List<Transferee> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_transferee
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Transferee record);
}