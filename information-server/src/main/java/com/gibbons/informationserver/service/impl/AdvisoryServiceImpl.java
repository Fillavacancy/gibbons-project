/**
 * FileName: AdvisoryServiceImpl
 * Author:   xiangjunzhong
 * Date:     2018/2/25 15:14
 * Description: 资讯ServiceImpl
 */
package com.gibbons.informationserver.service.impl;

import com.gibbons.commonserver.entity.GibbonsPage;
import com.gibbons.commonserver.util.PageUtil;
import com.gibbons.informationserver.dao.AdvisoryDao;
import com.gibbons.informationserver.entity.Advisory;
import com.gibbons.informationserver.service.AdvisoryService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br>
 * 〈资讯ServiceImpl〉
 *
 * @author xiangjunzhong
 * @create 2018/2/25 15:14
 * @since 1.0.0
 */
@Service
@Transactional(readOnly = true)
public class AdvisoryServiceImpl implements AdvisoryService {

    @Autowired
    private AdvisoryDao advisoryDao;

    /**
     * 查询资讯信息
     * 根据type查询 管理员查询所有
     *
     * @param userId 用户 ID
     * @param type   查询类型 1 会员 2 管理员
     * @param page   分页参数
     * @return
     */
    public Page<Advisory> getAdvisoryByUserIdAndType(Integer userId, Integer type, GibbonsPage page) {
        Page<Advisory> advisories = null;
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        String sortDirection = PageUtil.buildPageHelper(page.getSortRow(), page.getSortDirection());
        if (sortDirection != null && sortDirection.length() > 0) {
            PageHelper.orderBy(sortDirection);
        }
        try {
            advisories = advisoryDao.getAdvisoryByUserIdAndType(userId, type);
        } finally {
            PageHelper.clearPage();
        }
        return advisories;
    }

    /**
     * 添加资讯信息
     *
     * @param advisory 资讯对象
     */
    @Transactional
    public void addAdvisory(Advisory advisory) {
        advisoryDao.insertSelective(advisory);
    }

    /**
     * 修改资讯信息
     *
     * @param advisory 资讯对象
     */
    @Transactional
    public void updateAdvisory(Advisory advisory) {
        advisoryDao.updateByPrimaryKeySelective(advisory);
    }

    /**
     * 删除资讯信息
     *
     * @param id 资讯 ID
     */
    @Transactional
    public void deleteAdvisoryById(Integer id) {
        advisoryDao.deleteByPrimaryKey(id);
    }
}