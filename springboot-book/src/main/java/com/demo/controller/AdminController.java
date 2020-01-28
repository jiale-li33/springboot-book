package com.demo.controller;

import com.demo.entity.Admin;
import com.demo.entity.Customer;
import com.demo.service.AdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @RequestMapping("/login")
    public String login() {
        return "behind/login";
    }
    @RequestMapping("/tologin")
    public String login(String name, String password, Model model, HttpServletRequest request) {
        UsernamePasswordToken token = new UsernamePasswordToken(name, password);

        Subject subject = SecurityUtils.getSubject();

        try {
            subject.login(token);
            Admin admin = adminService.login(name, password);
            request.getSession().setAttribute("admin",admin);
            return "redirect:/book/booklist";
        }catch (UnknownAccountException e) {
            model.addAttribute("msg","用户名或密码错误");
            return "behind/login";
        }
    }
}
