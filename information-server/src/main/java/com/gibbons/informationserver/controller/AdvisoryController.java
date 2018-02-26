/**
 * FileName: AdvisoryController
 * Author:   xiangjunzhong
 * Date:     2018/2/25 14:50
 * Description: 资讯Controller
 */
package com.gibbons.informationserver.controller;

import com.gibbons.commonserver.entity.GibbonsPage;
import com.gibbons.commonserver.entity.PageInfo;
import com.gibbons.commonserver.entity.Result;
import com.gibbons.commonserver.util.ResultUtil;
import com.gibbons.informationserver.entity.Advisory;
import com.gibbons.informationserver.service.AdvisoryService;
import com.github.pagehelper.Page;
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
 * 〈资讯Controller〉
 *
 * @author xiangjunzhong
 * @create 2018/2/25 14:50
 * @since 1.0.0
 */
@RestController("/info/advisory")
@Api(description = "资讯管理")
public class AdvisoryController {

    @Autowired
    private AdvisoryService advisoryService;

    /**
     * 查询资讯信息
     * 根据type查询 管理员查询所有
     *
     * @param userId 用户 ID
     * @param type   查询类型 1 会员 2 管理员
     * @param page   分页参数
     * @return
     */
    @ApiOperation(value = "查询资讯信息", notes = "根据 type 查询 管理员查询所有")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户 ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "type", value = "查询类型", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "page", value = "分页参数", required = true, dataType = "GibbonsPage")
    })
    @RequestMapping(value = "get/advisory", method = RequestMethod.GET)
    public Result<PageInfo<Advisory>> getAdvisoryByUserIdAndType(Integer userId, Integer type, GibbonsPage page) {
        Page<Advisory> advisories = advisoryService.getAdvisoryByUserIdAndType(userId, type, page);
        PageInfo<Advisory> pageInfo = new PageInfo<Advisory>(advisories);
        return new ResultUtil<PageInfo<Advisory>>().setData(pageInfo);
    }

    /**
     * 添加资讯信息
     *
     * @param advisory 资讯对象
     */
    @ApiOperation(value = "创建资讯信息", notes = "根据 Advisory 对象创建资讯信息")
    @ApiImplicitParam(name = "advisory", value = "资讯信息实体 advisory", required = true, dataType = "Advisory")
    @RequestMapping(value = "add/advisory", method = RequestMethod.POST)
    public Result<Object> addAdvisory(Advisory advisory) {
        advisoryService.addAdvisory(advisory);
        return new ResultUtil<Object>().setData(null);
    }

    /**
     * 修改资讯信息
     *
     * @param advisory 资讯对象
     */
    @ApiOperation(value = "更新资讯信息", notes = "根据id来指定更新资讯信息")
    @ApiImplicitParam(name = "advisory", value = "资讯信息实体 advisory", required = true, dataType = "Advisory")
    @RequestMapping(value = "update/advisory", method = RequestMethod.POST)
    public Result<Object> updateAdvisory(Advisory advisory) {
        advisoryService.updateAdvisory(advisory);
        return new ResultUtil<Object>().setData(null);
    }

    /**
     * 删除资讯信息
     *
     * @param id 资讯 ID
     */
    @ApiOperation(value = "删除资讯信息", notes = "根据url的id来指定删除资讯信息")
    @ApiImplicitParam(name = "id", value = "资讯 ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "delete/advisory/{id}", method = RequestMethod.POST)
    public Result<Object> deleteAdvisoryById(@PathVariable(value = "id") Integer id) {
        advisoryService.deleteAdvisoryById(id);
        return new ResultUtil<Object>().setData(null);
    }
}