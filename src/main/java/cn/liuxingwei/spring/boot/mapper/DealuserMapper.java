package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Dealuser;
import java.util.List;

public interface DealuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_deal_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_deal_user
     *
     * @mbg.generated
     */
    int insert(Dealuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_deal_user
     *
     * @mbg.generated
     */
    Dealuser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_deal_user
     *
     * @mbg.generated
     */
    List<Dealuser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_deal_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Dealuser record);
}