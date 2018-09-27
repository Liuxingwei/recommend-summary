package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Bid;
import java.util.List;

public interface BidMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bid
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bid
     *
     * @mbg.generated
     */
    int insert(Bid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bid
     *
     * @mbg.generated
     */
    Bid selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bid
     *
     * @mbg.generated
     */
    List<Bid> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bid
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Bid record);
}