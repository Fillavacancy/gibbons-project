/**
 * FileName: DictTypeDao
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:38
 * Description: 字典类型Dao
 */
package com.gibbons.sysserver.dao;

import com.gibbons.sysserver.entity.DictType;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈字典类型Dao〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:38
 * @since 1.0.0
 */
public interface DictTypeDao {

    DictType selectByPrimaryKey(Integer id);

    /**
     * 查询所有数据字典类型
     *
     * @return
     */
    List<DictType> getAllDictType();

    /**
     * 删除数据字典类型
     *
     * @param id 数据字典类型 ID
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加数据字典类型
     *
     * @param dictType 数据字典类型
     * @return
     */
    int insertSelective(DictType dictType);

    /**
     * 修改数据字典类型
     *
     * @param dictType 数据字典类型
     * @return
     */
    int updateByPrimaryKeySelective(DictType dictType);
}