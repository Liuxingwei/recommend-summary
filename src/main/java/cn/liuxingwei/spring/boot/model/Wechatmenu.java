package cn.liuxingwei.spring.boot.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_wechat_menu
 */
public class Wechatmenu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_wechat_menu.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   菜单名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_wechat_menu.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   菜单类型：
     *   1：click 点击事件
     *   2：view 
     *   3：scancode_push 扫码推事件
     *   4：scancode_waitmsg：扫码推事件且弹框
     *   5：pic_sysphoto：弹出系统拍照
     *   6：pic_photo_or_album：弹出拍照或者相册发图
     *   7：pic_weixin：弹出微信相册发图器
     *   8：location_select：弹出地理位置
     *   9：media_id：下发消息
     *   10：view_limited：跳转图文消息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_wechat_menu.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     * Database Column Remarks:
     *   菜单结构
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_wechat_menu.menu_structure
     *
     * @mbg.generated
     */
    private String menuStructure;

    /**
     * Database Column Remarks:
     *   click的事件key值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_wechat_menu._key
     *
     * @mbg.generated
     */
    private String key;

    /**
     * Database Column Remarks:
     *   view菜单的转发的url地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_wechat_menu.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     * Database Column Remarks:
     *   菜单ID
     *   -1：一级菜单
     *   其它数字，表示二级菜单（对应的数字，表示一级菜单下的二级菜单）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_wechat_menu.parent_id
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_wechat_menu.id
     *
     * @return the value of t_wechat_menu.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_wechat_menu.id
     *
     * @param id the value for t_wechat_menu.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_wechat_menu.name
     *
     * @return the value of t_wechat_menu.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_wechat_menu.name
     *
     * @param name the value for t_wechat_menu.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_wechat_menu.type
     *
     * @return the value of t_wechat_menu.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_wechat_menu.type
     *
     * @param type the value for t_wechat_menu.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_wechat_menu.menu_structure
     *
     * @return the value of t_wechat_menu.menu_structure
     *
     * @mbg.generated
     */
    public String getMenuStructure() {
        return menuStructure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_wechat_menu.menu_structure
     *
     * @param menuStructure the value for t_wechat_menu.menu_structure
     *
     * @mbg.generated
     */
    public void setMenuStructure(String menuStructure) {
        this.menuStructure = menuStructure == null ? null : menuStructure.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_wechat_menu._key
     *
     * @return the value of t_wechat_menu._key
     *
     * @mbg.generated
     */
    public String getKey() {
        return key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_wechat_menu._key
     *
     * @param key the value for t_wechat_menu._key
     *
     * @mbg.generated
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_wechat_menu.url
     *
     * @return the value of t_wechat_menu.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_wechat_menu.url
     *
     * @param url the value for t_wechat_menu.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_wechat_menu.parent_id
     *
     * @return the value of t_wechat_menu.parent_id
     *
     * @mbg.generated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_wechat_menu.parent_id
     *
     * @param parentId the value for t_wechat_menu.parent_id
     *
     * @mbg.generated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}