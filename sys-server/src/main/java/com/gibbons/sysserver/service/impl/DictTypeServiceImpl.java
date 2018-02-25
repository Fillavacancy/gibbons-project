/**
 * FileName: DictTypeServiceImpl
 * Author:   xiangjunzhong
 * Date:     2018/2/24 15:55
 * Description: 数据字典类型ServiceImpl
 */
package com.gibbons.sysserver.service.impl;

import com.gibbons.sysserver.dao.DictTypeDao;
import com.gibbons.sysserver.entity.DictType;
import com.gibbons.sysserver.service.DictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈数据字典类型ServiceImpl〉
 *
 * @author xiangjunzhong
 * @create 2018/2/24 15:55
 * @since 1.0.0
 */
@Service
@Transactional(readOnly = true)
public class DictTypeServiceImpl implements DictTypeService {

    @Autowired
    private DictTypeDao dictTypeDao;

    /**
     * 查询所有数据字典类型
     *
     * @return
     */
    public List<DictType> getAllDictType() {
        return dictTypeDao.getAllDictType();
    }

    /**
     * 添加数据字典类型
     *
     * @param dictType 数据字典类型
     * @return
     */
    @Transactional
    public void addDictType(DictType dictType) {
        dictTypeDao.insertSelective(dictType);
    }

    /**
     * 修改数据字典类型
     *
     * @param dictType 数据字典类型
     * @return
     */
    @Transactional
    public void updateDictType(DictType dictType) {
        dictTypeDao.updateByPrimaryKeySelective(dictType);
    }

    /**
     * 删除数据字典类型
     *
     * @param id 数据字典类型 ID
     * @return
     */
    @Transactional
    public void deleteDictTypeById(Integer id) {
        dictTypeDao.deleteByPrimaryKey(id);
    }
}