/**
 * FileName: DictDao
 * Author:   xiangjunzhong
 * Date:     2018/2/9 9:38
 * Description: 字典Dao
 */
package com.gibbons.sysserver.dao;

import com.gibbons.sysserver.entity.Dict;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈字典Dao〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 9:38
 * @since 1.0.0
 */
public interface DictDao {

    Dict selectByPrimaryKey(Integer id);

    /**
     * 根据字典类型查询
     *
     * @param typeId 字典类型 ID
     * @return
     */
    List<Dict> getAllDict(Integer typeId);

    /**
     * 删除指定数据字典
     *
     * @param id 字典 ID
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加数据字典
     *
     * @param dict 数据字典对象
     * @return
     */
    int insertSelective(Dict dict);

    /**
     * 修改数据字典
     *
     * @param dict 数据字典对象
     * @return
     */
    int updateByPrimaryKeySelective(Dict dict);
}