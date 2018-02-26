/**
 * FileName: UserController
 * Author:   xiangjunzhong
 * Date:     2018/2/9 10:06
 * Description: 用户Controller
 */
package com.gibbons.sysserver.controller;

import com.gibbons.sysserver.entity.User;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户Controller〉
 *
 * @author xiangjunzhong
 * @create 2018/2/9 10:06
 * @since 1.0.0
 */
@Controller("/sys/user")
@Api(description = "用户管理")
public class UserController {

    /**
     * 登录
     *
     * @param request  请求对象
     * @param userName 用户名
     * @param password 密码
     * @param veriCode 验证码
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, String userName, String password, String veriCode) {
        return null;
    }

    /**
     * 添加用户
     *
     * @param request 请求对象
     * @param user    用户实体
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add/user", method = RequestMethod.POST)
    public String addUser(HttpServletRequest request, User user) {
        return null;
    }

    /**
     * 获取所有用户
     *
     * @param page 分页对象
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/get/all/user", method = RequestMethod.GET)
    public String getAllUser(Page page) {
        return null;
    }

    /**
     * 停用启用用户
     *
     * @param id 用户 ID
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/disabled/and/enabled/user", method = RequestMethod.POST)
    public String disabledAndEnabledUser(Integer id) {
        return null;
    }

    /**
     * 删除用户
     *
     * @param id 用户 ID
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delete/user/by/id", method = RequestMethod.POST)
    public String deleteUserById(Integer id) {
        return null;
    }
}