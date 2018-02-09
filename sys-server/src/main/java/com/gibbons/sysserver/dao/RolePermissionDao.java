/**
 * FileName: RolePermissionDao
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:38
 * Description: 角色权限关联Dao
 */
package com.gibbons.sysserver.dao;

import com.gibbons.sysserver.entity.RolePermission;

/**
 * 〈一句话功能简述〉<br>
 * 〈角色权限关联Dao〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:38
 * @since 1.0.0
 */
public interface RolePermissionDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePermission record);
}