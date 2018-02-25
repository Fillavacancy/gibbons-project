/**
 * FileName: UserService
 * Author:   xiangjunzhong
 * Date:     2018/2/9 10:28
 * Description: 用户Service
 */
package com.gibbons.sysserver.service;

import com.gibbons.sysserver.entity.User;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户Service〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 10:28
 * @since 1.0.0
 */
public interface UserService {

    /**
     * 登录
     *
     * @param userName 用户名
     * @param password 密码
     * @param veriCode 验证码
     * @return
     */
    boolean login(String userName, String password, String veriCode);

    /**
     * 添加用户
     *
     * @param user 用户实体
     * @return
     */
    boolean addUser(User user);

    /**
     * 获取所有用户
     *
     * @param page 分页参数
     * @return 用户集合
     */
    List<User> getAllUser(Page page);

    /**
     * 停用启用用户
     *
     * @param id 用户 ID
     * @return
     */
    boolean disabledAndEnabledUser(Integer id);

    /**
     * 删除用户
     *
     * @param id 用户 ID
     * @return
     */
    boolean deleteUserById(Integer id);
}