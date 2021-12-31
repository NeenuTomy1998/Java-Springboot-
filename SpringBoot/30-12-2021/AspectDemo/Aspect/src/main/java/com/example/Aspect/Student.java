package com.example.Aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int age;
    private String name;


    @Autowired
    public Phone phone;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }
    //public static void log(){
     //   System.out.println("print only method");
   // }
    public void show(){
        //System.out.println("print only method");
        System.out.println("inside show");

    }
  public void shown(String name){
    System.out.println("Inside Shown parameter");
}

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}