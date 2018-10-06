package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.domain.Advertisement;
import java.util.List;

public interface AdvertisementMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_advertisement
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_advertisement
	 * @mbg.generated
	 */
	int insert(Advertisement record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_advertisement
	 * @mbg.generated
	 */
	Advertisement selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_advertisement
	 * @mbg.generated
	 */
	List<Advertisement> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_advertisement
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Advertisement record);
}