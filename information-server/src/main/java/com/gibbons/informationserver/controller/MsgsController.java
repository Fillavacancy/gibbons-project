/**
 * FileName: MsgsController
 * Author:   xiangjunzhong
 * Date:     2018/2/25 14:50
 * Description: 留言Controller
 */
package com.gibbons.informationserver.controller;

import com.gibbons.commonserver.entity.GibbonsPage;
import com.gibbons.commonserver.entity.PageInfo;
import com.gibbons.commonserver.entity.Result;
import com.gibbons.commonserver.util.ResultUtil;
import com.gibbons.informationserver.entity.Announcement;
import com.gibbons.informationserver.entity.Msgs;
import com.gibbons.informationserver.service.MsgsService;
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
 * 〈留言Controller〉
 *
 * @author xiangjunzhong
 * @create 2018/2/25 14:50
 * @since 1.0.0
 */
@RestController("/info/msgs")
@Api(description = "留言管理")
public class MsgsController {

    @Autowired
    private MsgsService msgsService;

    /**
     * 查询留言信息
     * 根据type查询 管理员查询所有
     *
     * @param userId 用户 ID
     * @param type   查询类型 1 会员 2 管理员
     * @param page   分页参数
     * @return
     */
    @ApiOperation(value = "查询留言信息", notes = "根据type查询 管理员查询所有")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户 ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "type", value = "查询类型", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "page", value = "分页参数", required = true, dataType = "GibbonsPage")
    })
    @RequestMapping(value = "get/msgs", method = RequestMethod.GET)
    public Result<PageInfo<Msgs>> getMsgsByUserIdAndType(Integer userId, Integer type, GibbonsPage page) {
        Page<Msgs> msgs = msgsService.getMsgsByUserIdAndType(userId, type, page);
        PageInfo<Msgs> pageInfo = new PageInfo<Msgs>(msgs);
        return new ResultUtil<PageInfo<Msgs>>().setData(pageInfo);
    }

    /**
     * 添加留言信息
     *
     * @param msgs 留言对象
     */
    @ApiOperation(value = "创建留言信息", notes = "根据 Msgs 对象创建留言信息")
    @ApiImplicitParam(name = "msgs", value = "留言实体 msgs", required = true, dataType = "Msgs")
    @RequestMapping(value = "add/msgs", method = RequestMethod.POST)
    public Result<Object> addMsgs(Msgs msgs) {
        msgsService.addMsgs(msgs);
        return new ResultUtil<Object>().setData(null);
    }

    /**
     * 删除留言信息
     *
     * @param id 留言 ID
     */
    @ApiOperation(value = "删除留言信息", notes = "根据url的id来指定删除留言信息")
    @ApiImplicitParam(name = "id", value = "留言 ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "delete/msgs/{id}", method = RequestMethod.POST)
    public Result<Object> deleteMsgsById(@PathVariable(value = "id") Integer id) {
        msgsService.deleteMsgsById(id);
        return new ResultUtil<Object>().setData(null);
    }

    /**
     * 回复留言
     *
     * @param msgs 留言对象
     */
    @ApiOperation(value = "回复留言", notes = "根据url的id来指定删除留言信息")
    @ApiImplicitParam(name = "id", value = "留言 ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "reply/msgs/{id}", method = RequestMethod.POST)
    public Result<Object> replyMsgs(Msgs msgs) {
        msgsService.replyMsgs(msgs);
        return new ResultUtil<Object>().setData(null);
    }
}