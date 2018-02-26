/**
 * FileName: DownloadCenterController
 * Author:   xiangjunzhong
 * Date:     2018/2/26 9:59
 * Description: 下载中心Controller
 */
package com.gibbons.informationserver.controller;

import com.gibbons.commonserver.entity.GibbonsPage;
import com.gibbons.commonserver.entity.PageInfo;
import com.gibbons.commonserver.entity.Result;
import com.gibbons.commonserver.util.ResultUtil;
import com.gibbons.informationserver.entity.Advisory;
import com.gibbons.informationserver.service.DownloadCenterService;
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

/**
 * 〈一句话功能简述〉<br>
 * 〈下载中心Controller〉
 *
 * @author xiangjunzhong
 * @create 2018/2/26 9:59
 * @since 1.0.0
 */
@RestController("/info/download/center")
@Api(description = "下载中心")
public class DownloadCenterController {

    @Autowired
    private DownloadCenterService downloadCenterService;

    /**
     * 查询资讯信息
     *
     * @param userId 用户 ID
     * @param page   分页参数
     * @return
     */
    @ApiOperation(value = "查询资讯信息", notes = "根据 userId 查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户 ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "page", value = "分页参数", required = true, dataType = "GibbonsPage")
    })
    @RequestMapping(value = "get/advisory/by/user", method = RequestMethod.GET)
    public Result<PageInfo<Advisory>> getAdvisoryByUserId(Integer userId, GibbonsPage page) {
        Page<Advisory> advisories = downloadCenterService.getAdvisoryByUserId(userId, page);
        PageInfo<Advisory> pageInfo = new PageInfo<Advisory>(advisories);
        return new ResultUtil<PageInfo<Advisory>>().setData(pageInfo);
    }

    /**
     * 下载咨询
     *
     * @param id 资讯 ID
     * @return
     */
    @ApiOperation(value = "下载咨询", notes = "根据url的id来指定下载咨询")
    @ApiImplicitParam(name = "id", value = "资讯 ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "download/advisory/{id}", method = RequestMethod.POST)
    public Result<Object> downloadAdvice(@PathVariable(value = "id") Integer id) {
        return new ResultUtil<Object>().setData(null);
    }
}