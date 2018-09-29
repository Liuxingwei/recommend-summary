package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户表 mapper
 */
@Component
@Mapper
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(User record);

    /**
     * 获取用户信息列表附带其直客推荐信息
     * @author liuxingwei
     * @return List<User>
     */
    List<User> selectAllWithDirect();

    /**
     * 获取指定用户的信息列表，附带其直客推荐信息
     * @author liuxingwei
     * @param ids 用户id构成的数组
     * @return List<User>
     */
    List<User> selectByIdsWithDirect(Long[] ids);
}