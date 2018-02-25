/**
 * FileName: DictService
 * Author:   xiangjunzhong
 * Date:     2018/2/24 14:26
 * Description: 字典Service
 */
package com.gibbons.sysserver.service;

import com.gibbons.sysserver.entity.Dict;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈字典Service〉
 *
 * @author xiangjunzhong
 * @create 2018/2/24 14:26
 * @since 1.0.0
 */
public interface DictService {

    /**
     * 根据字典类型查询
     *
     * @param typeId 字典类型 ID
     * @return
     */
    List<Dict> getAllDict(Integer typeId);

    /**
     * 添加数据字典
     *
     * @param dict 数据字典对象
     * @return
     */
    void addDict(Dict dict);

    /**
     * 修改数据字典
     *
     * @param dict 数据字典对象
     * @return
     */
    void updateDict(Dict dict);

    /**
     * 删除指定数据字典
     *
     * @param id 字典 ID
     * @return
     */
    void deleteDictById(Integer id);
}