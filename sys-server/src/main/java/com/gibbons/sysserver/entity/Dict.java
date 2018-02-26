/**
 * FileName: Dict
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:40
 * Description: 字典Entity
 */
package com.gibbons.sysserver.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 〈一句话功能简述〉<br>
 * 〈字典Entity〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:40
 * @since 1.0.0
 */
public class Dict implements Serializable {

    private static final long serialVersionUID = 7508832554278515725L;

    private Integer id;

    private String code;

    private Integer typeId;

    private String name;

    private String value;

    private Integer fixed;

    private Integer deft;

    private Timestamp createTime;

    private Timestamp updateTime;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Integer getFixed() {
        return fixed;
    }

    public void setFixed(Integer fixed) {
        this.fixed = fixed;
    }

    public Integer getDeft() {
        return deft;
    }

    public void setDeft(Integer deft) {
        this.deft = deft;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}