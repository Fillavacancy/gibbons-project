/**
 * FileName: MsgsServiceImpl
 * Author:   xiangjunzhong
 * Date:     2018/2/25 15:17
 * Description: ServiceImpl
 */
package com.gibbons.informationserver.service.impl;

import com.gibbons.commonserver.entity.GibbonsPage;
import com.gibbons.commonserver.util.PageUtil;
import com.gibbons.informationserver.dao.MsgsDao;
import com.gibbons.informationserver.entity.Announcement;
import com.gibbons.informationserver.entity.Msgs;
import com.gibbons.informationserver.service.MsgsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈ServiceImpl〉
 *
 * @author xiangjunzhong
 * @create 2018/2/25 15:17
 * @since 1.0.0
 */
@Service
@Transactional(readOnly = true)
public class MsgsServiceImpl implements MsgsService {

    @Autowired
    private MsgsDao msgsDao;

    /**
     * 查询留言信息
     * 根据type查询 管理员查询所有
     *
     * @param userId 用户 ID
     * @param type   查询类型 1 会员 2 管理员
     * @param page   分页参数
     * @return
     */
    public Page<Msgs> getMsgsByUserIdAndType(Integer userId, Integer type, GibbonsPage page) {
        Page<Msgs> msgsPage = null;
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        String sortDirection = PageUtil.buildPageHelper(page.getSortRow(), page.getSortDirection());
        if (sortDirection != null && sortDirection.length() > 0) {
            PageHelper.orderBy(sortDirection);
        }
        try {
            msgsPage = msgsDao.getMsgsByUserIdAndType(userId, type);
        } finally {
            PageHelper.clearPage();
        }
        return msgsPage;
    }

    /**
     * 添加留言信息
     *
     * @param msgs 留言对象
     */
    @Transactional
    public void addMsgs(Msgs msgs) {
        msgsDao.insertSelective(msgs);
    }

    /**
     * 删除留言信息
     *
     * @param id 留言 ID
     */
    @Transactional
    public void deleteMsgsById(Integer id) {
        msgsDao.deleteByPrimaryKey(id);
    }

    /**
     * 回复留言
     *
     * @param msgs 留言对象
     */
    @Transactional
    public void replyMsgs(Msgs msgs) {
        msgsDao.insertSelective(msgs);
    }
}