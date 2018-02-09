/**
 * FileName: UserTypeDao
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:40
 * Description: 用户类型Dao
 */
package com.gibbons.sysserver.dao;

import com.gibbons.sysserver.entity.UserType;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户类型Dao〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:40
 * @since 1.0.0
 */
public interface UserTypeDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserType record);

    UserType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserType record);
}