/**
 * FileName: UserType
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:43
 * Description: 用户类型Entity
 */
package com.gibbons.memberserver.entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户类型Entity〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:43
 * @since 1.0.0
 */
public class UserType implements Serializable {

    private static final long serialVersionUID = -4144952248025870444L;

    private Integer id;

    private String typeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}