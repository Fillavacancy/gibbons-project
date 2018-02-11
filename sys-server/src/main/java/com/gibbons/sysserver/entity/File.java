/**
 * FileName: File
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:40
 * Description: 文件Entity
 */
package com.gibbons.sysserver.entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈文件Entity〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:40
 * @since 1.0.0
 */
public class File implements Serializable {

    private static final long serialVersionUID = -5266564260197235003L;

    /**
     * 编号
     */
    private Integer id;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件代码
     */
    private String fileCode;

    /**
     * 文件路径
     */
    private String filePath;

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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode == null ? null : fileCode.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}