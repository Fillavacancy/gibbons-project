/**
 * FileName: Operation
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:40
 * Description: 功能Entity
 */
package com.gibbons.sysserver.entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能Entity〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:40
 * @since 1.0.0
 */
public class Operation implements Serializable {

    private static final long serialVersionUID = -5828404518294584932L;

    /**
     * 编号
     */
    private Integer id;

    /**
     * 功能名
     */
    private String operationName;

    /**
     * 功能代码
     */
    private String operationCode;

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

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName == null ? null : operationName.trim();
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}