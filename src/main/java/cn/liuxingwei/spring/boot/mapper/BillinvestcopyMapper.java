package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Billinvestcopy;
import java.util.List;

public interface BillinvestcopyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill_invest_copy
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill_invest_copy
     *
     * @mbg.generated
     */
    int insert(Billinvestcopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill_invest_copy
     *
     * @mbg.generated
     */
    Billinvestcopy selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill_invest_copy
     *
     * @mbg.generated
     */
    List<Billinvestcopy> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill_invest_copy
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Billinvestcopy record);
}