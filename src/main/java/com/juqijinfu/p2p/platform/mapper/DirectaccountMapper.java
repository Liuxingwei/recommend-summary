package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Directaccount;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 直客推广账户信息表 mapper
 */
@Component
@Mapper
public interface DirectaccountMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_direct_account
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_direct_account
	 * @mbg.generated
	 */
	int insert(Directaccount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_direct_account
	 * @mbg.generated
	 */
	Directaccount selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_direct_account
	 * @mbg.generated
	 */
	List<Directaccount> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_direct_account
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Directaccount record);

	/**
     * 根据用户id，获取直客推荐信息
     * @author liuxingwei
     * @param userId
     * @return
     */
    Directaccount selectByUserId(Long userId);
}