package com.example.MovieBookingApp.Controller;

import com.example.MovieBookingApp.Entity.Customer;
import com.example.MovieBookingApp.Entity.Movie;
import com.example.MovieBookingApp.Service.CustomerService;
import com.example.MovieBookingApp.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class HomeController {
    static int customerid;
    String email;
    String password;
    String gender;
    String phone;
    @Autowired
    private CustomerService service;

    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public String homepage(Model model) {
        return "Index";
    }

    @RequestMapping("/Register")
    public String SignUpForm() {
        return "Register";
    }

    public Customer getCustomer;


    @PostMapping("/Login")

    public String CustomerRegistration(HttpServletRequest request, Model model) {
        if (!(request.getParameter("password").equals(request.getParameter("Confirm_Password")))) {
            model.addAttribute("message", "Password doesn't match for the user");
            return "Register";
        } else {
            email = request.getParameter("email");
            String name = request.getParameter("name");
            password = request.getParameter("password");
            phone = request.getParameter("phone");
            gender = request.getParameter("gender");
            Customer customer = new Customer(name, password, email, gender, phone);
            service.saveCustomer(customer);

            model.addAttribute("message", " User Registration successful!!");
            return "Login";
        }
    }
    @PostMapping("/Home")
    public String customerLogin(HttpServletRequest req, Model model) {
        Customer customer = service.findCustomerByEmail(req.getParameter("Email"));
       getCustomer = customer;
        if (!(Objects.isNull(customer))) {
            if (customer.getPassword().equals(req.getParameter("Password"))) {
                email = customer.getEmail();
                customerid= customer.getId();
                for (Movie movie : movieService.listAll())
                {
                    System.out.println(movie.getMname());
                }
                model.addAttribute("movie",movieService.listAll());
                model.addAttribute("message","login Sucessfully !!");
                return "Home";

            }else {
                model.addAttribute("message", "Invalid Credentials");
                return "Login";
            }
        } else {
            model.addAttribute("message", "Invalid Credentials");
            return "Login";
        }

    }


}