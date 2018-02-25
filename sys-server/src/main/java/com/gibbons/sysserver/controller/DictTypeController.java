/**
 * FileName: DictTypeController
 * Author:   xiangjunzhong
 * Date:     2018/2/24 14:23
 * Description: 字典类型Controller
 */
package com.gibbons.sysserver.controller;

import com.gibbons.commonserver.entity.Result;
import com.gibbons.commonserver.util.ResultUtil;
import com.gibbons.sysserver.entity.DictType;
import com.gibbons.sysserver.service.DictTypeService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈字典类型Controller〉
 *
 * @author xiangjunzhong
 * @create 2018/2/24 14:23
 * @since 1.0.0
 */
@RestController("/sys/dict/type")
public class DictTypeController {

    @Autowired
    private DictTypeService dictTypeService;

    /**
     * 查询所有数据字典类型
     *
     * @return
     */
    @ApiOperation(value = "获取所有数据字典类型信息", notes = "获取所有数据字典类型信息")
    @RequestMapping(value = "get/all/dict/type", method = RequestMethod.GET)
    public Result<List<DictType>> getAllDictType() {
        List<DictType> dictTypes = dictTypeService.getAllDictType();
        return new ResultUtil<List<DictType>>().setData(dictTypes);
    }

    /**
     * 添加数据字典类型
     *
     * @param dictType 数据字典类型
     * @return
     */
    @ApiOperation(value = "创建数据字典类型", notes = "根据Dict对象创建数据字典类型")
    @ApiImplicitParam(name = "dictType", value = "数据字典类型实体 dictType", required = true, dataType = "DictType")
    @RequestMapping(value = "add/dict/type", method = RequestMethod.POST)
    public Result<Object> addDictType(DictType dictType) {
        dictTypeService.addDictType(dictType);
        return new ResultUtil<Object>().setData(null);
    }

    /**
     * 修改数据字典类型
     *
     * @param id       数据字典类型 ID
     * @param dictType 数据字典类型
     * @return
     */
    @ApiOperation(value = "更新数据字典类型", notes = "根据url的id来指定更新数据字典类型信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "数据字典类型 ID", required = true, dataType = "Integer", paramType = "path"),
            @ApiImplicitParam(name = "dictType", value = "数据字典类型 dictType", required = true, dataType = "DictType")
    })
    @RequestMapping(value = "update/dict/type/{id}", method = RequestMethod.PUT)
    public Result<Object> updateDictType(@PathVariable("id") Integer id, DictType dictType) {
        dictTypeService.updateDictType(dictType);
        return new ResultUtil<Object>().setData(null);
    }

    /**
     * 删除数据字典类型
     *
     * @param id 数据字典类型 ID
     * @return
     */
    @ApiOperation(value = "删除数据字典类型", notes = "根据url的id来指定删除数据字典类型 ID")
    @ApiImplicitParam(name = "id", value = "数据字典类型 ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "delete/dict/type/{id}", method = RequestMethod.DELETE)
    public Result<Object> deleteDictTypeById(@PathVariable(value = "id") Integer id) {
        dictTypeService.deleteDictTypeById(id);
        return new ResultUtil<Object>().setData(null);
    }
}