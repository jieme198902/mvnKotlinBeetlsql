package com.himiten.kotlin.controller;


import com.himiten.kotlin.model.User;
import com.himiten.kotlin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/jsp",method = RequestMethod.GET)
    String jsp(Model model){
        /*List<User> list=userService.getUserListTops(5);
        model.addAttribute("list",list);*/
        model.addAttribute("hello","jsp");
        return "index";
    }
    @RequestMapping(value = "/beetl",method = RequestMethod.GET)
    ModelAndView beetl(Model model){
        /*List<User> list=userService.getUserListTops(5);
        model.addAttribute("list",list);*/
        ModelAndView mv=new ModelAndView("tpl/index");
        mv.addObject("hello","beetl");
        return mv;
    }

}
