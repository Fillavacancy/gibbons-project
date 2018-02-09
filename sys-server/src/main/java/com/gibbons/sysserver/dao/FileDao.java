/**
 * FileName: FileDao
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:38
 * Description: 文件Dao
 */
package com.gibbons.sysserver.dao;

import com.gibbons.sysserver.entity.File;

/**
 * 〈一句话功能简述〉<br>
 * 〈文件Dao〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:38
 * @since 1.0.0
 */
public interface FileDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(File record);

    File selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(File record);
}