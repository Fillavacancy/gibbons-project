/**
 * FileName: DownloadCenterService
 * Author:   xiangjunzhong
 * Date:     2018/2/26 9:54
 * Description: 下载中心Service
 */
package com.gibbons.informationserver.service;

import com.gibbons.commonserver.entity.GibbonsPage;
import com.gibbons.informationserver.entity.Advisory;
import com.github.pagehelper.Page;

/**
 * 〈一句话功能简述〉<br>
 * 〈下载中心Service〉
 *
 * @author xiangjunzhong
 * @create 2018/2/26 9:54
 * @since 1.0.0
 */
public interface DownloadCenterService {

    /**
     * 查询资讯信息
     *
     * @param userId 用户 ID
     * @param page   分页参数
     * @return
     */
    Page<Advisory> getAdvisoryByUserId(Integer userId, GibbonsPage page);

    /**
     * 下载咨询
     *
     * @param id 咨询 ID
     */
    void downloadAdvice(Integer id);
}