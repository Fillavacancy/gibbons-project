/**
 * FileName: PaperworkTypeDao
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:38
 * Description: 证件类型Dao
 */
package com.gibbons.sysserver.dao;

import com.gibbons.sysserver.entity.PaperworkType;

/**
 * 〈一句话功能简述〉<br>
 * 〈证件类型Dao〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:38
 * @since 1.0.0
 */
public interface PaperworkTypeDao {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(PaperworkType record);

    PaperworkType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaperworkType record);
}