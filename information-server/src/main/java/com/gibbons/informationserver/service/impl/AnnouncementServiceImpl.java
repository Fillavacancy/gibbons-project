/**
 * FileName: AnnouncementServiceImpl
 * Author:   xiangjunzhong
 * Date:     2018/2/25 15:16
 * Description: 公告ServiceImpl
 */
package com.gibbons.informationserver.service.impl;

import com.gibbons.commonserver.entity.GibbonsPage;
import com.gibbons.commonserver.util.PageUtil;
import com.gibbons.informationserver.dao.AnnouncementDao;
import com.gibbons.informationserver.entity.Announcement;
import com.gibbons.informationserver.service.AnnouncementService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br>
 * 〈公告ServiceImpl〉
 *
 * @author xiangjunzhong
 * @create 2018/2/25 15:16
 * @since 1.0.0
 */
@Service
@Transactional(readOnly = true)
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    private AnnouncementDao announcementDao;

    /**
     * 查询公告信息
     * 根据type查询 管理员查询所有
     *
     * @param userId 用户 ID
     * @param type   查询类型 1 会员 2 管理员
     * @param page   分页参数
     * @return
     */
    public Page<Announcement> getAnnouncementByUserIdAndType(Integer userId, Integer type, GibbonsPage page) {
        Page<Announcement> advisories = null;
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        String sortDirection = PageUtil.buildPageHelper(page.getSortRow(), page.getSortDirection());
        if (sortDirection != null && sortDirection.length() > 0) {
            PageHelper.orderBy(sortDirection);
        }
        try {
            advisories = announcementDao.getAnnouncementByUserIdAndType(userId, type);
        } finally {
            PageHelper.clearPage();
        }
        return advisories;
    }

    /**
     * 添加公告信息
     *
     * @param announcement 公告对象
     */
    @Transactional
    public void addAnnouncement(Announcement announcement) {
        announcementDao.insertSelective(announcement);
    }

    /**
     * 修改公告信息
     *
     * @param announcement 公告对象
     */
    @Transactional
    public void updateAnnouncement(Announcement announcement) {
        announcementDao.updateByPrimaryKeySelective(announcement);
    }

    /**
     * 删除公告信息
     *
     * @param id 公告 ID
     */
    @Transactional
    public void deleteAnnouncementById(Integer id) {
        announcementDao.deleteByPrimaryKey(id);
    }
}