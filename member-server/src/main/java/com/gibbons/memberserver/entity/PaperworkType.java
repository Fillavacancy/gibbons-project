/**
 * FileName: PaperworkType
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:40
 * Description: 证件类型Entity
 */
package com.gibbons.memberserver.entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈证件类型Entity〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:40
 * @since 1.0.0
 */
public class PaperworkType implements Serializable {

    private static final long serialVersionUID = 4711217379504848764L;

    private Integer id;

    private String paperworkTypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaperworkTypeName() {
        return paperworkTypeName;
    }

    public void setPaperworkTypeName(String paperworkTypeName) {
        this.paperworkTypeName = paperworkTypeName == null ? null : paperworkTypeName.trim();
    }
}