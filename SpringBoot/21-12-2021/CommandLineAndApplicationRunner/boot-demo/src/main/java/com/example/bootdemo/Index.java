package com.example.bootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Index {

  @RequestMapping("/")
    public String Index(){
      System.out.println("Home page");
     return "Home page";
  }
  @RequestMapping("/about")
  public  String About(){
      System.out.println("About page");
      return "About page";
  }
}
