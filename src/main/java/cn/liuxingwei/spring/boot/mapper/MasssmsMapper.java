package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.Masssms;
import java.util.List;

public interface MasssmsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mass_sms
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mass_sms
     *
     * @mbg.generated
     */
    int insert(Masssms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mass_sms
     *
     * @mbg.generated
     */
    Masssms selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mass_sms
     *
     * @mbg.generated
     */
    List<Masssms> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mass_sms
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Masssms record);
}