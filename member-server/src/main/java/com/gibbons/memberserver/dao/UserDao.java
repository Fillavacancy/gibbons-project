/**
 * FileName: UserDao
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:39
 * Description: 用户Dao
 */
package com.gibbons.memberserver.dao;


import com.gibbons.memberserver.entity.User;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户Dao〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:39
 * @since 1.0.0
 */
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);
}