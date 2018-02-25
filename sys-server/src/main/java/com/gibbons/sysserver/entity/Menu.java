/**
 * FileName: Menu
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:40
 * Description: 菜单Entity
 */
package com.gibbons.sysserver.entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈菜单Entity〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:40
 * @since 1.0.0
 */
public class Menu implements Serializable {

    private static final long serialVersionUID = 8736372418895181782L;

    /**
     * 编号
     */
    private Integer id;

    /**
     * 菜单名
     */
    private String menuName;

    /**
     * 菜单代码
     */
    private String menuCode;

    /**
     * 菜单 URL
     */
    private String url;

    /**
     * 菜单 ICON
     */
    private String icon;

    /**
     * 父 ID
     */
    private Integer pId;

    /**
     * 状态
     */
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}