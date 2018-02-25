/**
 * FileName: DictServiceImpl
 * Author:   xiangjunzhong
 * Date:     2018/2/24 15:54
 * Description: 数据字典ServiceImpl
 */
package com.gibbons.sysserver.service.impl;

import com.gibbons.sysserver.dao.DictDao;
import com.gibbons.sysserver.entity.Dict;
import com.gibbons.sysserver.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈数据字典ServiceImpl〉
 *
 * @author xiangjunzhong
 * @create 2018/2/24 15:54
 * @since 1.0.0
 */
@Service
@Transactional(readOnly = true)
public class DictServiceImpl implements DictService {

    @Autowired
    private DictDao dictDao;

    /**
     * 根据字典类型查询
     *
     * @param typeId 字典类型 ID
     * @return
     */
    public List<Dict> getAllDict(Integer typeId) {
        return dictDao.getAllDict(typeId);
    }

    /**
     * 添加数据字典
     *
     * @param dict 数据字典对象
     * @return
     */
    @Transactional
    public void addDict(Dict dict) {
        dictDao.insertSelective(dict);
    }

    /**
     * 修改数据字典
     *
     * @param dict 数据字典对象
     * @return
     */
    @Transactional
    public void updateDict(Dict dict) {
        dictDao.updateByPrimaryKeySelective(dict);
    }

    /**
     * 删除指定数据字典
     *
     * @param id 字典 ID
     * @return
     */
    public void deleteDictById(Integer id) {
        dictDao.deleteByPrimaryKey(id);
    }
}