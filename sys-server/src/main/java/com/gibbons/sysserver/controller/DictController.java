/**
 * FileName: DictController
 * Author:   xiangjunzhong
 * Date:     2018/2/24 14:23
 * Description: 字典Controller
 */
package com.gibbons.sysserver.controller;

import com.gibbons.commonserver.entity.Result;
import com.gibbons.commonserver.util.ResultUtil;
import com.gibbons.sysserver.entity.Dict;
import com.gibbons.sysserver.service.DictService;
import io.swagger.annotations.Api;
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
 * 〈字典Controller〉
 *
 * @author xiangjunzhong
 * @create 2018/2/24 14:23
 * @since 1.0.0
 */
@RestController("/sys/dict")
@Api(description = "数据字典")
public class DictController {

    @Autowired
    private DictService dictService;

    /**
     * 根据字典类型查询
     *
     * @param typeId 字典类型 ID
     * @return
     */
    @ApiOperation(value = "获取所有字段类型信息", notes = "根据url的typeId来获取字典类型信息")
    @ApiImplicitParam(name = "typeId", value = "字典类型 ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "get/all/dict/{typeId}", method = RequestMethod.GET)
    public Result<List<Dict>> getAllDict(@PathVariable(value = "typeId") Integer typeId) {
        List<Dict> dicts = dictService.getAllDict(typeId);
        return new ResultUtil<List<Dict>>().setData(dicts);
    }

    /**
     * 创建数据字典
     *
     * @param dict 数据字典对象
     * @return
     */
    @ApiOperation(value = "创建数据字典", notes = "根据Dict对象创建数据字典")
    @ApiImplicitParam(name = "dict", value = "数据字典实体 dict", required = true, dataType = "Dict")
    @RequestMapping(value = "add/dict", method = RequestMethod.POST)
    public Result<Object> addDict(Dict dict) {
        dictService.addDict(dict);
        return new ResultUtil<Object>().setData(null);
    }

    /**
     * 修改数据字典
     *
     * @param id   数据字典 ID
     * @param dict 数据字典实体
     * @return
     */
    @ApiOperation(value = "更新数据字典", notes = "根据url的id来指定更新数据字典信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "数据字典 ID", required = true, dataType = "Integer", paramType = "path"),
            @ApiImplicitParam(name = "dict", value = "数据字典实体 dict", required = true, dataType = "Dict")
    })
    @RequestMapping(value = "update/dict/{id}", method = RequestMethod.PUT)
    public Result<Object> updateDict(@PathVariable("id") Integer id, Dict dict) {
        dictService.updateDict(dict);
        return new ResultUtil<Object>().setData(null);
    }

    /**
     * 删除指定数据字典
     *
     * @param id 字典 ID
     * @return
     */
    @ApiOperation(value = "删除数据字典", notes = "根据url的id来指定删除数据字典")
    @ApiImplicitParam(name = "id", value = "字典 ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "delete/dict/{id}", method = RequestMethod.DELETE)
    public Result<Object> deleteDictById(@PathVariable(value = "id") Integer id) {
        dictService.deleteDictById(id);
        return new ResultUtil<Object>().setData(null);
    }
}