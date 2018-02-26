/**
 * FileName: DictType
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:40
 * Description: 字典类型Entity
 */
package com.gibbons.sysserver.entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈字典类型Entity〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:40
 * @since 1.0.0
 */
public class DictType implements Serializable {

    private static final long serialVersionUID = 4181490718923884568L;

    private Integer id;

    private String name;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}