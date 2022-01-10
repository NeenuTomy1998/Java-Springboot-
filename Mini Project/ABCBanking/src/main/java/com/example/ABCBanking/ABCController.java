//package com.example.ABCBanking;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//public class ABCController {
//    private String name;
//    private String email;
//    private String password;
//    private String confirmPassword;
//    private String phone;
//    private String address;
//    private String state;
//    private String city;
//    private String country;
//
//    @RequestMapping("/")
//    public String index() {
//        return "Login";
//    }
//
//    //register
//    @RequestMapping("/Login")
//    public String registerCustomer(Model model, HttpServletRequest req) {
//        name = req.getParameter("Username");
//        email = req.getParameter("Email");
//        password = req.getParameter("Password");
//        confirmPassword = req.getParameter("Confirm_Password");
//        return "Login";
//    }
//
//    //login
//    @RequestMapping("/Home")
//    public String loginCustomer(Model model, HttpServletRequest req) {
//        if (req.getParameter("Email").equals(email) && req.getParameter("Password").equals(password)) {
//            System.out.println("Login Successfully");
//            return "Home";
//        } else {
//            System.out.println("Wrong Credientials");
//            model.addAttribute("message", "Invalid Credientilas");
//            return "Login";
//        }
//    }
//
//    @RequestMapping("/Register")
//    public String register() {
//        return "Register";
//    }
//
//    @RequestMapping("/add-profile")
//    public String addProfile(Model model, HttpServletRequest req) {
//     fetchDetails(model);
//     return "AddProfile";
//    }
//
//    @RequestMapping("/view-profile")
//    public String viewProfile(Model model, HttpServletRequest req) {
//
//        name = req.getParameter("userName");
//        email = req.getParameter("email");
//        phone = req.getParameter("phone");
//        address = req.getParameter("address");
//        state = req.getParameter("state");
//        country = req.getParameter("country");
//        city = req.getParameter("city");
//        fetchDetails(model);
//        return "Profile";
//    }
//
//    @RequestMapping("/profile")
//    public String ProfilePage(Model model) {
//        fetchDetails(model);
//        return "Profile";
//    }
//
//
//    @RequestMapping("/HomePage")
//    public String home() {
//        return "Home";
//    }
//
//    @RequestMapping("/account")
//    public String account(Model model) {
//        model.addAttribute("name", name);
//        model.addAttribute("bankname", "ABC Bank");
//        model.addAttribute("accnumber", "466464654862");
//        model.addAttribute("ifsc", "ABC0895");
//        model.addAttribute("branchname", "kochi");
//        model.addAttribute("balance", "3000");
//        return "Account";
//    }
//
//    @RequestMapping("/logout")
//    public String logout() {
//        return "Login";
//    }
//    public  void  fetchDetails(Model model){
//        model.addAttribute("name", name);
//        model.addAttribute("email", email);
//        model.addAttribute("phone", phone);
//        model.addAttribute("address", address);
//        model.addAttribute("city", city);
//        model.addAttribute("state", state);
//        model.addAttribute("country", country);
//    }
//
//
//}
///* @RequestMapping("/result")
//    public String result(Model model, HttpServletRequest req){  //request we get from user we use httpserveltrequest
//        int num1= Integer.parseInt(req.getParameter("num1"));
//        int num2= Integer.parseInt(req.getParameter("num1"));
//        int res = num1 + num2;
//        model.addAttribute("res" , res);
//
//        return  "result";
//    }*/
//
//
//
//
