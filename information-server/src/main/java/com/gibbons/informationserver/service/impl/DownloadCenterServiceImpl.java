/**
 * FileName: DownloadCenterServiceImpl
 * Author:   xiangjunzhong
 * Date:     2018/2/26 9:56
 * Description: 下载中心ServiceImpl
 */
package com.gibbons.informationserver.service.impl;

import com.gibbons.commonserver.entity.GibbonsPage;
import com.gibbons.commonserver.util.PageUtil;
import com.gibbons.informationserver.dao.AdvisoryDao;
import com.gibbons.informationserver.entity.Advisory;
import com.gibbons.informationserver.service.DownloadCenterService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br>
 * 〈下载中心ServiceImpl〉
 *
 * @author xiangjunzhong
 * @create 2018/2/26 9:56
 * @since 1.0.0
 */
@Service
@Transactional(readOnly = true)
public class DownloadCenterServiceImpl implements DownloadCenterService {

    @Autowired
    private AdvisoryDao advisoryDao;

    /**
     * 查询资讯信息
     *
     * @param userId 用户 ID
     * @param page   分页参数
     * @return
     */
    public Page<Advisory> getAdvisoryByUserId(Integer userId, GibbonsPage page) {
        Page<Advisory> advisories = null;
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        String sortDirection = PageUtil.buildPageHelper(page.getSortRow(), page.getSortDirection());
        if (sortDirection != null && sortDirection.length() > 0) {
            PageHelper.orderBy(sortDirection);
        }
        try {
            advisories = advisoryDao.getAdvisoryByUserId(userId);
        } finally {
            PageHelper.clearPage();
        }
        return advisories;
    }

    /**
     * 下载咨询
     *
     * @param id 咨询 ID
     */
    public void downloadAdvice(Integer id) {

    }
}