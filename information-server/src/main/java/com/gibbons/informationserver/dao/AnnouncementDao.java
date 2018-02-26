package com.gibbons.informationserver.dao;

import com.gibbons.informationserver.entity.Announcement;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface AnnouncementDao {

    /**
     * 删除公告信息
     *
     * @param id 公告 ID
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加公告信息
     *
     * @param announcement 公告对象
     */
    int insertSelective(Announcement announcement);

    Announcement selectByPrimaryKey(Integer id);

    /**
     * 修改公告信息
     *
     * @param announcement 公告对象
     */
    int updateByPrimaryKeySelective(Announcement announcement);

    /**
     * 查询公告信息
     * 根据type查询 管理员查询所有
     *
     * @param userId 用户 ID
     * @param type   查询类型 1 会员 2 管理员
     * @return
     */
    Page<Announcement> getAnnouncementByUserIdAndType(@Param("userId") Integer userId, @Param("type") Integer type);
}