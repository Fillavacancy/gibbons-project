/**
 * FileName: ButtonDao
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:38
 * Description: 按钮Dao
 */
package com.gibbons.sysserver.dao;

import com.gibbons.sysserver.entity.Button;

/**
 * 〈一句话功能简述〉<br>
 * 〈按钮Dao〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:38
 * @since 1.0.0
 */
public interface ButtonDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Button record);

    Button selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Button record);
}