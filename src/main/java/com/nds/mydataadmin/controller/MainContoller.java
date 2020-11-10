package com.nds.mydataadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class MainContoller {
    @GetMapping(value = "/")
    public ModelAndView Main(){
      ModelAndView mav = new ModelAndView("index");
      mav.addObject("name", "goddaehee");
      List<String> testList = new ArrayList<String>();
      testList.add("a");
      testList.add("b");
      testList.add("c");
      mav.addObject("list", testList);
      return mav;
    }

  @GetMapping(value = "/time")
  public String Time(){

    return "thymeleaf/index";
  }
}
