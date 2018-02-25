/**
 * FileName: DictTypeService
 * Author:   xiangjunzhong
 * Date:     2018/2/24 14:26
 * Description: 字典类型Service
 */
package com.gibbons.sysserver.service;

import com.gibbons.sysserver.entity.DictType;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈字典类型Service〉
 *
 * @author xiangjunzhong
 * @create 2018/2/24 14:26
 * @since 1.0.0
 */
public interface DictTypeService {

    /**
     * 查询所有数据字典类型
     *
     * @return
     */
    List<DictType> getAllDictType();

    /**
     * 添加数据字典类型
     *
     * @param dictType 数据字典类型
     * @return
     */
    void addDictType(DictType dictType);

    /**
     * 修改数据字典类型
     *
     * @param dictType 数据字典类型
     * @return
     */
    void updateDictType(DictType dictType);

    /**
     * 删除数据字典类型
     *
     * @param id 数据字典类型 ID
     * @return
     */
    void deleteDictTypeById(Integer id);
}