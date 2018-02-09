/**
 * FileName: RoleDao
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:38
 * Description: 角色Dao
 */
package com.gibbons.sysserver.dao;

import com.gibbons.sysserver.entity.Role;

/**
 * 〈一句话功能简述〉<br>
 * 〈角色Dao〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:38
 * @since 1.0.0
 */
public interface RoleDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);
}