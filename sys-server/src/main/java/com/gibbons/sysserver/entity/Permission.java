/**
 * FileName: Permission
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:40
 * Description: 权限Entity
 */
package com.gibbons.sysserver.entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈权限Entity〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:40
 * @since 1.0.0
 */
public class Permission implements Serializable {

    private static final long serialVersionUID = -2252563321924150859L;

    /**
     * 编号
     */
    private Integer id;

    /**
     * 权限名
     */
    private String perName;

    /**
     * 权限代码
     */
    private String perCode;

    /**
     * 父 ID
     */
    private Integer pId;

    /**
     * 资源 ID
     */
    private Integer resourceId;

    /**
     * 权限类型
     */
    private Integer perType;

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

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName == null ? null : perName.trim();
    }

    public String getPerCode() {
        return perCode;
    }

    public void setPerCode(String perCode) {
        this.perCode = perCode == null ? null : perCode.trim();
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getPerType() {
        return perType;
    }

    public void setPerType(Integer perType) {
        this.perType = perType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}