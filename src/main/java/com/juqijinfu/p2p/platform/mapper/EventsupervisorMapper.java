package com.juqijinfu.p2p.platform.mapper;

import com.juqijinfu.p2p.platform.model.Eventsupervisor;
import java.util.List;

public interface EventsupervisorMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_event_supervisor
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_event_supervisor
	 * @mbg.generated
	 */
	int insert(Eventsupervisor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_event_supervisor
	 * @mbg.generated
	 */
	Eventsupervisor selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_event_supervisor
	 * @mbg.generated
	 */
	List<Eventsupervisor> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_event_supervisor
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Eventsupervisor record);
}