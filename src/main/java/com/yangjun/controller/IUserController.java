package com.yangjun.controller;

import com.yangjun.entity.User;
import com.yangjun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/user")
public class IUserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/select")
    public ModelAndView selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
        User user = userService.findUserById(1);
        mv.addObject("user", user);
        mv.setViewName("user");
        return mv;
    }
}
