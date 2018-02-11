/**
 * FileName: Role
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:40
 * Description: 角色Entity
 */
package com.gibbons.sysserver.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 〈一句话功能简述〉<br>
 * 〈角色Entity〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:40
 * @since 1.0.0
 */
public class Role implements Serializable {

    private static final long serialVersionUID = -3179537009482914191L;

    /**
     * 编号
     */
    private Integer id;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 角色代码
     */
    private String roleCode;

    /**
     * 修改时间
     */
    private Timestamp updateTime;

    /**
     * 创建人
     */
    private String referee;

    /**
     * 状态
     */
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee == null ? null : referee.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}