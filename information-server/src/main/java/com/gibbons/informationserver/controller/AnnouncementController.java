/**
 * FileName: AnnouncementController
 * Author:   xiangjunzhong
 * Date:     2018/2/25 14:49
 * Description: 公告Controller
 */
package com.gibbons.informationserver.controller;

import com.gibbons.commonserver.entity.GibbonsPage;
import com.gibbons.commonserver.entity.PageInfo;
import com.gibbons.commonserver.entity.Result;
import com.gibbons.commonserver.util.ResultUtil;
import com.gibbons.informationserver.entity.Announcement;
import com.gibbons.informationserver.service.AnnouncementService;
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
 * 〈公告Controller〉
 *
 * @author xiangjunzhong
 * @create 2018/2/25 14:49
 * @since 1.0.0
 */
@RestController("/info/anno")
@Api(description = "公告管理")
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    /**
     * 查询公告信息
     * 根据type查询 管理员查询所有
     *
     * @param userId 用户 ID
     * @param type   查询类型 1 会员 2 管理员
     * @param page   分页参数
     * @return
     */
    @ApiOperation(value = "查询公告信息", notes = "根据 type 查询 管理员查询所有")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户 ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "type", value = "查询类型", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "page", value = "分页参数", required = true, dataType = "GibbonsPage")
    })
    @RequestMapping(value = "get/anno", method = RequestMethod.GET)
    public Result<PageInfo<Announcement>> getAnnouncementByUserIdAndType(Integer userId, Integer type, GibbonsPage page) {
        Page<Announcement> announcements = announcementService.getAnnouncementByUserIdAndType(userId, type, page);
        PageInfo<Announcement> pageInfo = new PageInfo<Announcement>(announcements);
        return new ResultUtil<PageInfo<Announcement>>().setData(pageInfo);
    }

    /**
     * 添加公告信息
     *
     * @param announcement 公告对象
     */
    @ApiOperation(value = "创建公告信息", notes = "根据 Announcement 对象创建公告信息")
    @ApiImplicitParam(name = "announcement", value = "公告实体 announcement", required = true, dataType = "Announcement")
    @RequestMapping(value = "add/anno", method = RequestMethod.POST)
    public Result<Object> addAnnouncement(Announcement announcement) {
        announcementService.addAnnouncement(announcement);
        return new ResultUtil<Object>().setData(null);
    }

    /**
     * 修改公告信息
     *
     * @param announcement 公告对象
     */
    @ApiOperation(value = "更新公告信息", notes = "根据id来指定更新公告信息")
    @ApiImplicitParam(name = "announcement", value = "公告信息实体 announcement", required = true, dataType = "Announcement")
    @RequestMapping(value = "update/anno", method = RequestMethod.POST)
    public Result<Object> updateAnnouncement(Announcement announcement) {
        announcementService.updateAnnouncement(announcement);
        return new ResultUtil<Object>().setData(null);
    }

    /**
     * 删除公告信息
     *
     * @param id 公告 ID
     */
    @ApiOperation(value = "删除公告信息", notes = "根据url的id来指定删除公告信息")
    @ApiImplicitParam(name = "id", value = "公告 ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "delete/anno/{id}", method = RequestMethod.POST)
    public Result<Object> deleteAnnouncementById(@PathVariable(value = "id") Integer id) {
        announcementService.deleteAnnouncementById(id);
        return new ResultUtil<Object>().setData(null);
    }
}