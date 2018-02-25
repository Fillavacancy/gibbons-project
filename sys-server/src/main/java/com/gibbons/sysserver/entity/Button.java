/**
 * FileName: Button
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:40
 * Description: 按钮Entity
 */
package com.gibbons.sysserver.entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈按钮Entity〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:40
 * @since 1.0.0
 */
public class Button implements Serializable {

    private static final long serialVersionUID = -1512315766203709250L;

    /**
     * 编号
     */
    private Integer id;

    /**
     * 按钮名
     */
    private String buttonName;

    /**
     * 按钮代码
     */
    private String buttonCode;

    /**
     * 按钮 IOCN
     */
    private String iocn;

    /**
     * 菜单 ID
     */
    private Integer menuId;

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

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName == null ? null : buttonName.trim();
    }

    public String getButtonCode() {
        return buttonCode;
    }

    public void setButtonCode(String buttonCode) {
        this.buttonCode = buttonCode == null ? null : buttonCode.trim();
    }

    public String getIocn() {
        return iocn;
    }

    public void setIocn(String iocn) {
        this.iocn = iocn == null ? null : iocn.trim();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}