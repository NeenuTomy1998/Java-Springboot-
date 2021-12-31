package com.example.Aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Phone {
    @Autowired
    private Student student;
    private String Model;
    private String Brand;

    public void display(){
        student.show();
        System.out.println("inside display");
    }
}
