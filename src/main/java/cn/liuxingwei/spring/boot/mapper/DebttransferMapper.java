package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Debttransfer;
import java.util.List;

public interface DebttransferMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_debt_transfer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_debt_transfer
     *
     * @mbg.generated
     */
    int insert(Debttransfer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_debt_transfer
     *
     * @mbg.generated
     */
    Debttransfer selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_debt_transfer
     *
     * @mbg.generated
     */
    List<Debttransfer> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_debt_transfer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Debttransfer record);
}