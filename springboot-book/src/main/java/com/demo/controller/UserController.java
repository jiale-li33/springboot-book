package com.demo.controller;

import com.demo.entity.Class;
import com.demo.entity.Customer;
import com.demo.service.CustomerService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/login")
    public String tologin() {
        return "before/login";
    }
    @RequestMapping("/tologin")
    public String login(String name, String psw, Model model, HttpServletRequest request) {
        UsernamePasswordToken token = new UsernamePasswordToken(name, psw);

        Subject subject = SecurityUtils.getSubject();

        try {
            subject.login(token);
            Customer user = customerService.login(name, psw);
            request.getSession().setAttribute("user",user);
            return "redirect:/book/list";
        }catch (UnknownAccountException e) {
            model.addAttribute("msg","用户名或密码错误");
            return "before/login";
        }
    }
    @RequestMapping("/register")
    public String register() {
        return "before/register";
    }

    @RequestMapping("/toregister")
    public String toregister(Customer customer, Model model) {
        Integer flag = customerService.register(customer);

        return "redirect:login";
    }
    @RequestMapping("/userlist")
    public String classlist(Model model) {
        //调用方法
        List<Customer> users = customerService.queryAll();
        //返回PageInfo对象
        model.addAttribute("userList",users);
        return "behind/userList";
    }
    @RequestMapping("/del")
    public String del(Integer id,Model model) {
        Integer flag = customerService.del(id);
        return "redirect:userlist";
    }
}
