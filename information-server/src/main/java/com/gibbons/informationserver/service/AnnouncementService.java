/**
 * FileName: AnnouncementService
 * Author:   xiangjunzhong
 * Date:     2018/2/25 14:51
 * Description: 公告Service
 */
package com.gibbons.informationserver.service;

import com.gibbons.commonserver.entity.GibbonsPage;
import com.gibbons.informationserver.entity.Announcement;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈公告Service〉
 *
 * @author xiangjunzhong
 * @create 2018/2/25 14:51
 * @since 1.0.0
 */
public interface AnnouncementService {

    /**
     * 查询公告信息
     * 根据type查询 管理员查询所有
     *
     * @param userId 用户 ID
     * @param type   查询类型 1 会员 2 管理员
     * @param page   分页参数
     * @return
     */
    Page<Announcement> getAnnouncementByUserIdAndType(Integer userId, Integer type, GibbonsPage page);

    /**
     * 添加公告信息
     *
     * @param announcement 公告对象
     */
    void addAnnouncement(Announcement announcement);

    /**
     * 修改公告信息
     *
     * @param announcement 公告对象
     */
    void updateAnnouncement(Announcement announcement);

    /**
     * 删除公告信息
     *
     * @param id 公告 ID
     */
    void deleteAnnouncementById(Integer id);
}