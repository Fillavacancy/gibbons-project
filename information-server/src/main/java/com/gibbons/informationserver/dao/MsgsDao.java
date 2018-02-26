package com.gibbons.informationserver.dao;

import com.gibbons.informationserver.entity.Msgs;
import com.github.pagehelper.Page;

public interface MsgsDao {

    /**
     * 删除留言信息
     *
     * @param id 留言 ID
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加留言信息
     *
     * @param msgs 留言对象
     */
    int insertSelective(Msgs msgs);

    Msgs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Msgs msgs);

    /**
     * 查询留言信息
     * 根据type查询 管理员查询所有
     *
     * @param userId 用户 ID
     * @param type   查询类型 1 会员 2 管理员
     * @return
     */
    Page<Msgs> getMsgsByUserIdAndType(Integer userId, Integer type);
}