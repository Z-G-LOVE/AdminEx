package com.one.Controller;

import com.one.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @作者: one者天下
 * @时间: 2021/5/14 16:26
 * @描述: 实现登录功能
 */
@Controller
public class LoginController {

    @GetMapping(value = {"/","/login"})
    public String login(){
        return "login";
    }

    /**
     * 验证并实现登录功能
     * @param user 根据表单提交封装成的用户对象
     * @param session 保存登录对象的对话对象
     * @param model 用于存储错误信息以回馈给处理界面
     * @return 返回登录页面或网站的主页
     */
    @PostMapping("/w")
    public String welcome(User user, HttpSession session , Model model){
        if ("one".equals(user.getUsername()) && "123".equals(user.getPassword())) {
            session.setAttribute("loginUser", user);
            return "redirect:/index_alt.html";
        }else {
            model.addAttribute("msg","账户或密码错误");
            return "login";
        }
    }

    /**
     * 解决页面重新提交表单的问题
     * @return 返回网站的主页面
     */
    @GetMapping("/index_alt.html")
    public String toMain(HttpSession session,Model model){
//        Object loginUser = session.getAttribute("loginUser");
//        if (loginUser != null)
//            return "index_alt";
//        else {
//            model.addAttribute("msg","请先登录");
//            return "redirect:/";
//        }
        return "index_alt";
    }

}
