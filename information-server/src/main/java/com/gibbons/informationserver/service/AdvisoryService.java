/**
 * FileName: AdvisoryService
 * Author:   xiangjunzhong
 * Date:     2018/2/25 14:51
 * Description: 资讯Service
 */
package com.gibbons.informationserver.service;

import com.gibbons.commonserver.entity.GibbonsPage;
import com.gibbons.informationserver.entity.Advisory;
import com.github.pagehelper.Page;

/**
 * 〈一句话功能简述〉<br>
 * 〈资讯Service〉
 *
 * @author xiangjunzhong
 * @create 2018/2/25 14:51
 * @since 1.0.0
 */
public interface AdvisoryService {

    /**
     * 查询资讯信息
     * 根据type查询 管理员查询所有
     *
     * @param userId 用户 ID
     * @param type   查询类型 1 会员 2 管理员
     * @param page   分页参数
     * @return
     */
    Page<Advisory> getAdvisoryByUserIdAndType(Integer userId, Integer type, GibbonsPage page);

    /**
     * 添加资讯信息
     *
     * @param advisory 资讯对象
     */
    void addAdvisory(Advisory advisory);

    /**
     * 修改资讯信息
     *
     * @param advisory 资讯对象
     */
    void updateAdvisory(Advisory advisory);

    /**
     * 删除资讯信息
     *
     * @param id 资讯 ID
     */
    void deleteAdvisoryById(Integer id);
}