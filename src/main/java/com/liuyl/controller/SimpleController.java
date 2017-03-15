package com.liuyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * spring boot 测试
 */
@Controller
public class SimpleController {

    @RequestMapping("/test")
    public ModelAndView get(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aaa");
        return mv;
    }

    @RequestMapping("/try")
    public String toAaa(){
        return "aaa";
    }

}
