package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Biditemuser;
import java.util.List;

public interface BiditemuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bid_item_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bid_item_user
     *
     * @mbg.generated
     */
    int insert(Biditemuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bid_item_user
     *
     * @mbg.generated
     */
    Biditemuser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bid_item_user
     *
     * @mbg.generated
     */
    List<Biditemuser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bid_item_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Biditemuser record);
}