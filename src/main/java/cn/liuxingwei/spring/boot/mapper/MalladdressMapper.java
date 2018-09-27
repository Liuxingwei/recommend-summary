package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Malladdress;
import java.util.List;

public interface MalladdressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_address
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_address
     *
     * @mbg.generated
     */
    int insert(Malladdress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_address
     *
     * @mbg.generated
     */
    Malladdress selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_address
     *
     * @mbg.generated
     */
    List<Malladdress> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Malladdress record);
}