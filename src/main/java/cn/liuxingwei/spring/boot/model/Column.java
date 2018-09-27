package cn.liuxingwei.spring.boot.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_column
 */
public class Column {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_column.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_column.time
     *
     * @mbg.generated
     */
    private Date time;

    /**
     * Database Column Remarks:
     *   栏目编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_column.column_no
     *
     * @mbg.generated
     */
    private String columnNo;

    /**
     * Database Column Remarks:
     *   栏目标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_column.column_key
     *
     * @mbg.generated
     */
    private String columnKey;

    /**
     * Database Column Remarks:
     *   栏目名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_column.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   后台显示的栏目名称(不可变)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_column.back_name
     *
     * @mbg.generated
     */
    private String backName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column.id
     *
     * @return the value of t_column.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column.id
     *
     * @param id the value for t_column.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column.time
     *
     * @return the value of t_column.time
     *
     * @mbg.generated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column.time
     *
     * @param time the value for t_column.time
     *
     * @mbg.generated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column.column_no
     *
     * @return the value of t_column.column_no
     *
     * @mbg.generated
     */
    public String getColumnNo() {
        return columnNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column.column_no
     *
     * @param columnNo the value for t_column.column_no
     *
     * @mbg.generated
     */
    public void setColumnNo(String columnNo) {
        this.columnNo = columnNo == null ? null : columnNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column.column_key
     *
     * @return the value of t_column.column_key
     *
     * @mbg.generated
     */
    public String getColumnKey() {
        return columnKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column.column_key
     *
     * @param columnKey the value for t_column.column_key
     *
     * @mbg.generated
     */
    public void setColumnKey(String columnKey) {
        this.columnKey = columnKey == null ? null : columnKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column.name
     *
     * @return the value of t_column.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column.name
     *
     * @param name the value for t_column.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_column.back_name
     *
     * @return the value of t_column.back_name
     *
     * @mbg.generated
     */
    public String getBackName() {
        return backName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_column.back_name
     *
     * @param backName the value for t_column.back_name
     *
     * @mbg.generated
     */
    public void setBackName(String backName) {
        this.backName = backName == null ? null : backName.trim();
    }
}