package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Mallscroerule;
import java.util.List;

public interface MallscroeruleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mall_scroe_rule
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mall_scroe_rule
	 * @mbg.generated
	 */
	int insert(Mallscroerule record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mall_scroe_rule
	 * @mbg.generated
	 */
	Mallscroerule selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mall_scroe_rule
	 * @mbg.generated
	 */
	List<Mallscroerule> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_mall_scroe_rule
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Mallscroerule record);
}