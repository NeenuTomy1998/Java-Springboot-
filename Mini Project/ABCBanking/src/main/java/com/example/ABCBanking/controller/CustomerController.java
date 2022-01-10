package com.example.ABCBanking.controller;

import com.example.ABCBanking.entity.Account;
import com.example.ABCBanking.entity.Customer;
import com.example.ABCBanking.service.CustomerService;
import com.sun.xml.bind.v2.schemagen.xmlschema.Documentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;

@Controller
public class CustomerController {
    String email;
    String password;
    @Autowired
    private CustomerService service;

    @RequestMapping("/")
    public String indexPage() {
        return "Index";
    }

    @RequestMapping("/Login")
    public String loginForm() {
        return "Login";
    }

    @RequestMapping("/Signup")
    public String SignUpForm() {
        return "Register";
    }


    /**
     * This function returns login page after registration.
     * equals method here checks whether the requested password equal to confirm password
     * @param request - To get the value from the customer
     * @param model - To print value to the website
     *
     * @return To return login page
     */

    @PostMapping("/Login")

    public String CustomerRegistration(HttpServletRequest request, Model model) {
        if (!(request.getParameter("Password").equals(request.getParameter("Confirm_Password")))) {
            model.addAttribute("message", "Password doesn't match for the user");
            return "Register";
        } else {
            email = request.getParameter("Email");
            String name = request.getParameter("Username");
            password = request.getParameter("Password");

            Customer customer = new Customer(name, email, password);
            service.saveCustomer(customer);
            Account account = new Account(name, 0.00, customer, "ABC Bank", "ABC000510", "kochi");
            service.saveAccount(account);
            customer.setAccount(account);
            service.saveCustomer(customer);
            model.addAttribute("message"," User Registration successful!!");
            return "Login";
        }
    }
    /**
     * This function returns home page after login.
     * Objects.isNull if the user doesn't exists it return to login page itself and if user is valid returns home page
     * @param model
     * @return To return home page
     */

    @PostMapping("/Home")
    public String customerLogin(HttpServletRequest req, Model model) {
        Customer customer = service.findCustomerByEmail(req.getParameter("Email"));
        if (!(Objects.isNull(customer))) {
            if (customer.getPassword().equals(req.getParameter("Password"))) {
                email = customer.getEmail();
                if(customer.getName().equals("Neenu Tomy")){

                    return "Admin";
                }
                else{
                    model.addAttribute("message","Login Successfully");
                    return "Home";
                }

            }else {
               model.addAttribute("message", "Invalid Credentials");
                return "Login";
            }
        } else {
            model.addAttribute("message", "Invalid Credentials");
            return "Login";
        }

    }


    @GetMapping("/customers")
    @ResponseBody
    public List<Customer> listAll(){
        return service.listOfCustomers();
    }


    @GetMapping("/Admin")

    public  String admin(){
        return "Admin";
    }


    @RequestMapping("/Register")
    public String register() {
        return "Register";
    }


    @RequestMapping("/logout")
    public String logout(Model model) {
        model.addAttribute("message","Logout Successfully");
        return "redirect:/";
    }

    @RequestMapping("/Home")
    public String HomePage() {
        return "Home";
    }

    /**
     * This function returns profile page prints customer details
     * model.addAttribute Spring-MVC specific annotation used for preparing the model data
     *@return To return Profile

*/
    @RequestMapping("/profile")
    public String profileDetails(Model model) {
        Customer customer = service.findCustomerByEmail(email);
        model.addAttribute("id", customer.getId());
        model.addAttribute("name", customer.getName());
        model.addAttribute("email", customer.getEmail());
        model.addAttribute("phone", customer.getPhone());
        model.addAttribute("address", customer.getAddress());
        model.addAttribute("city", customer.getCity());
        model.addAttribute("country", customer.getCountry());
        model.addAttribute("state", customer.getState());
        return "Profile";
    }
    /**
     * This function returns addProfile and update customer values
     * model.addAttribute Spring-MVC specific annotation used for preparing the model data
     * @PathVariable annotation can be used to handle template variables in the request URI mapping
     *@return To return AddProfile

     */
    @RequestMapping("/add-profile/{id}") //url
    public String addProfile(@PathVariable Long id, Model model) {
        Customer customer = service.getCustomerById(id);
        model.addAttribute("id", customer.getId());
        model.addAttribute("name", customer.getName());
        model.addAttribute("email", customer.getEmail());
        model.addAttribute("phone", customer.getPhone());
        model.addAttribute("address", customer.getAddress());
        model.addAttribute("city", customer.getCity());
        model.addAttribute("country", customer.getCountry());
        model.addAttribute("state", customer.getState());
        return "AddProfile";
    }

    /**
     * This function returns profile page after updating details
     *@return To return Profile

     */
    @PostMapping("updateCustomer")
    public String updateCustomer(HttpServletRequest req) {
        Customer customer = service.getCustomerById(Long.parseLong(req.getParameter("userid")));
        customer.setPhone(req.getParameter("phone"));
        customer.setAddress(req.getParameter("address"));
        customer.setCity(req.getParameter("city"));
        customer.setState(req.getParameter("state"));
        customer.setCountry(req.getParameter("country"));
        service.saveCustomer(customer);
        return "redirect:/profile";
    }
    /**
     * This method returns account page
     * model.addAttribute Spring-MVC specific annotation used for preparing the model data
     * @param model contains the data of the application and which is displayed in the view
     *@return To return account page

     */
    @RequestMapping("/account")
    public String accountDetails(Model model) {

        Customer customer = service.findCustomerByEmail(email);
        Account account = service.getAccountByCustomerId(customer);
        model.addAttribute("name", customer.getName());
        model.addAttribute("bankName", account.getBankName());
        model.addAttribute("accNumber", account.getId());
        model.addAttribute("ifsc", account.getIFSCCode());
        model.addAttribute("branchName", account.getBranchName());
        model.addAttribute("balance", account.getAccountBalance());
        return "Account";
    }

    @RequestMapping("/transfer")
    public String transfer(HttpServletRequest request, Model model) {
        return "transfer";
    }

    /**
     *  This method returns transfer page of ABC BANK
     * @param model contains the data of the application and which is displayed in the view
     *@return To return Transfer page

     */
    @PostMapping("/transfer")
    public String afterTransfer(HttpServletRequest request, Model model) {

        Customer customer = service.findCustomerByEmail(email);
        Account fromAccount = service.getAccountByCustomerId(customer);

        Double transferAmount = Double.parseDouble(request.getParameter("transfer"));
        if (!(fromAccount.getAccountBalance() >= transferAmount)) {
            model.addAttribute("message", "Insufficient Balance!!!");
            return "transfer";
        } else {
            Account toAccount = service.getAccountByAccountId(Long.parseLong(request.getParameter("transferto")));
            if (!(Objects.isNull(toAccount))) {
                Double updatedAmount = (fromAccount.getAccountBalance()) - transferAmount;
                fromAccount.setAccountBalance(updatedAmount);
                service.saveAccount(fromAccount);

                Double transferMoney = (toAccount.getAccountBalance()) + transferAmount;
                toAccount.setAccountBalance(transferMoney);
                service.saveAccount(toAccount);
                model.addAttribute("message", "Transfer Successful!!");
                return "transfer";
            }
            else{
                model.addAttribute("message","Account doesn't exists");
                return "transfer";
            }
        }

    }

    @RequestMapping("/Deposit")
    public String deposit() {
        return "Deposit";
    }
    /**
     * This function returns deposit fund page of ABC BANK
     * @param model contains the data of the application and which is displayed in the view
     *@return To return deposit page

     */
    @PostMapping("/Deposit")
    public String afterDeposit(HttpServletRequest request, Model model) {
        if(!((Double.parseDouble(request.getParameter("deposit")))>0))
        {
            model.addAttribute("message", "Please enter valid amount!!!");
            return "deposit";
        }
        Customer customer = service.findCustomerByEmail(email);
        Account myAccount = service.getAccountByCustomerId(customer);
        Double newBalance = (myAccount.getAccountBalance()) + Double.parseDouble(request.getParameter("deposit"));
        myAccount.setAccountBalance(newBalance);
        service.saveAccount(myAccount);
        model.addAttribute("message","Deposit Successful!!");
        return "Deposit";
    }

}





