/**
 * FileName: PermissionDao
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:38
 * Description: 权限Dao
 */
package com.gibbons.sysserver.dao;

import com.gibbons.sysserver.entity.Permission;

/**
 * 〈一句话功能简述〉<br>
 * 〈权限Dao〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:38
 * @since 1.0.0
 */
public interface PermissionDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);
}