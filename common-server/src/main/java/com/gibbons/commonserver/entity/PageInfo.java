/**
 * FileName: PageBeanVo
 * Author:   xiangjunzhong
 * Date:     2017/11/1 14:12
 * Description: 数据分页传输实体
 */
package com.gibbons.commonserver.entity;

import com.gibbons.commonserver.util.TextUtil;
import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * 对 Page 结果进行包装
 *
 * @author xiangjunzhong
 * @create 2017/11/1 14:12
 * @since 1.0.0
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class PageInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    //当前页
    private int pageNo;
    //页大小
    private int pageSize;
    //总记录数
    private long allRow;
    //总页数
    private int totalPage;
    //排序列名
    private String sortRow;
    //排序方向
    private String sortDirection;
    //结果集
    private List<T> list;
    //是否为第一页
    private boolean isFirstPage = false;
    //是否为最后一页
    private boolean isLastPage = false;

    public PageInfo() {

    }

    /**
     * 包装Page对象
     *
     * @param list
     */
    public PageInfo(List<T> list) {
        if (list instanceof Page) {
            Page page = (Page) list;
            this.pageNo = page.getPageNum();
            this.pageSize = page.getPageSize();

            if (TextUtil.isNotNull(page.getOrderBy())) {
                String[] order = page.getOrderBy().split(" ");
                if (order != null && order.length == 2) {
                    this.sortRow = order[0];
                    this.sortDirection = order[1].toLowerCase();
                }
            }

            this.totalPage = page.getPages();
            this.list = page;
            this.allRow = page.getTotal();
        } else if (list instanceof Collection) {
            this.pageNo = 1;
            this.pageSize = list.size();

            this.totalPage = 1;
            this.list = list;
            this.allRow = list.size();
        }
        if (list instanceof Collection) {
            //判断页面边界
            judgePageBoudary();
        }
    }

    private void OrderDirection(String orderBy) {
    }

    /**
     * 判定页面边界
     */
    private void judgePageBoudary() {
        isFirstPage = pageNo == 1;
        isLastPage = pageNo == totalPage;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getAllRow() {
        return allRow;
    }

    public void setAllRow(long allRow) {
        this.allRow = allRow;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
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

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}