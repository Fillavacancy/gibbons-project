/**
 * FileName: UserRole
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:40
 * Description: 用户角色关联Entity
 */
package com.gibbons.sysserver.entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户角色关联Entity〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:40
 * @since 1.0.0
 */
public class UserRole implements Serializable {

    private static final long serialVersionUID = -594133894191174884L;

    /**
     * 编号
     */
    private Integer id;

    /**
     * 用户 ID
     */
    private Integer userId;

    /**
     * 角色 ID
     */
    private Integer roleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}