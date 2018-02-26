/**
 * FileName: MsgsService
 * Author:   xiangjunzhong
 * Date:     2018/2/25 14:52
 * Description: 留言Service
 */
package com.gibbons.informationserver.service;

import com.gibbons.commonserver.entity.GibbonsPage;
import com.gibbons.informationserver.entity.Msgs;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈留言Service〉
 *
 * @author xiangjunzhong
 * @create 2018/2/25 14:52
 * @since 1.0.0
 */
public interface MsgsService {

    /**
     * 查询留言信息
     * 根据type查询 管理员查询所有
     *
     * @param userId 用户 ID
     * @param type   查询类型 1 会员 2 管理员
     * @param page   分页参数
     * @return
     */
    Page<Msgs> getMsgsByUserIdAndType(Integer userId, Integer type, GibbonsPage page);

    /**
     * 添加留言信息
     *
     * @param msgs 留言对象
     */
    void addMsgs(Msgs msgs);

    /**
     * 删除留言信息
     *
     * @param id 留言 ID
     */
    void deleteMsgsById(Integer id);

    /**
     * 回复留言
     *
     * @param msgs 留言对象
     */
    void replyMsgs(Msgs msgs);
}