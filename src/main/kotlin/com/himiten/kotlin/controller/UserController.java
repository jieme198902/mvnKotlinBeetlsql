package com.himiten.kotlin.controller;


import com.himiten.kotlin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index(){
       return "";
    }

}
