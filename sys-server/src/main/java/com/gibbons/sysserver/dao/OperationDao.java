/**
 * FileName: OperationDao
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:38
 * Description: 功能Dao
 */
package com.gibbons.sysserver.dao;

import com.gibbons.sysserver.entity.Operation;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能Dao〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:38
 * @since 1.0.0
 */
public interface OperationDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Operation record);

    Operation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Operation record);
}