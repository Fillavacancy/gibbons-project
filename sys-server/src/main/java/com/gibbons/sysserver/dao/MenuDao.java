/**
 * FileName: MenuDao
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:38
 * Description: 菜单Dao
 */
package com.gibbons.sysserver.dao;

import com.gibbons.sysserver.entity.Menu;

/**
 * 〈一句话功能简述〉<br>
 * 〈菜单Dao〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:38
 * @since 1.0.0
 */
public interface MenuDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);
}