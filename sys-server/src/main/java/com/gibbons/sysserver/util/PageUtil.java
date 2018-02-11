/**
 * FileName: PageUtil
 * Author:   xiangjunzhong
 * Date:     2017/11/1 13:34
 * Description: 分页工具类
 */
package com.gibbons.sysserver.util;

/**
 * 〈一句话功能简述〉<br>
 * 〈分页工具类〉
 *
 * @author xiangjunzhong
 * @create 2017/11/1 13:34
 * @since 1.0.0
 */
public class PageUtil {

    /**
     * 创建 PageHelper.orderBy 根据 排序字段 排序方向
     *
     * @param sortRow       排序字段
     * @param sortDirection 排序方向
     * @return
     */
    public static String buildPageHelper(String sortRow, String sortDirection) {
        StringBuffer sortDirectionStringBuffer = new StringBuffer();
        String space = " ";
        if (TextUtil.isNotNull(sortRow)) {
            sortDirectionStringBuffer.append(sortRow);
            if (TextUtil.isNotNull(sortDirection)) {
                if (Sort.Direction.DESC.toString().equalsIgnoreCase(sortDirection)) {
                    sortDirectionStringBuffer.append(space + Sort.Direction.DESC);
                } else {
                    sortDirectionStringBuffer.append(space + Sort.Direction.ASC);
                }
            } else {
                sortDirectionStringBuffer.append(space + Sort.Direction.ASC);
            }
        }
        return sortDirectionStringBuffer.toString();
    }
}