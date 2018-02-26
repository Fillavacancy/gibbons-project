package com.gibbons.informationserver.dao;

import com.gibbons.informationserver.entity.Advisory;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdvisoryDao {

    /**
     * 查询资讯信息
     * 根据type查询 管理员查询所有
     *
     * @param userId 用户 ID
     * @param type   查询类型 1 会员 2 管理员
     * @return
     */
    Page<Advisory> getAdvisoryByUserIdAndType(@Param("userId") Integer userId, @Param("type") Integer type);

    /**
     * 删除资讯信息
     *
     * @param id 资讯 ID
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加资讯信息
     *
     * @param advisory 资讯对象
     */
    int insertSelective(Advisory advisory);

    Advisory selectByPrimaryKey(Integer id);

    /**
     * 修改资讯信息
     *
     * @param advisory 资讯对象
     */
    int updateByPrimaryKeySelective(Advisory advisory);

    /**
     * 查询资讯信息
     *
     * @param userId 用户 ID
     * @return
     */
    Page<Advisory> getAdvisoryByUserId(Integer userId);
}