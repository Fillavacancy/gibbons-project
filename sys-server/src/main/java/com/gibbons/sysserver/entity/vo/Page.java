/**
 * FileName: Page
 * Author:   xiangjunzhong
 * Date:     2018/2/9 14:12
 * Description: 分页参数
 */
package com.gibbons.sysserver.entity.vo;

/**
 * 〈一句话功能简述〉<br>
 * 〈分页参数〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 14:12
 * @since 1.0.0
 */
public class Page {

    private Integer pageSize;
    private Integer pageNo;
    private String sortRow;
    private String sortDirection;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public String getSortRow() {
        return sortRow;
    }

    public void setSortRow(String sortRow) {
        this.sortRow = sortRow;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }
}