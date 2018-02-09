/**
 * FileName: UserRoleDao
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:38
 * Description: 用户角色关联Dao
 */
package com.gibbons.sysserver.dao;

import com.gibbons.sysserver.entity.UserRole;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户角色关联Dao〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:38
 * @since 1.0.0
 */
public interface UserRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);
}