package engineer.neenu.demo;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class MVCController {

    @RequestMapping("/")
        public String Index() {
            return "home";
        }
        @RequestMapping("/dynamic")
    public String dynamic(Model model){
        int a =10; // here we need to connect a to html using model
            model.addAttribute("a", a); //"a" should be same as html page
        return "dynamic";
        }
        @RequestMapping("/add")
        public String add(){
            return  "add";
        }
    @RequestMapping("/result")
    public String result(Model model, HttpServletRequest req){  //request we get from user we use httpserveltrequest
        int num1= Integer.parseInt(req.getParameter("num1"));
        int num2= Integer.parseInt(req.getParameter("num1"));
        int res = num1 + num2;
        model.addAttribute("res" , res);

        return  "result";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/details") // In @postMapping password cannot be seen
    public String signup(HttpServletRequest request , Model model){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        model.addAttribute("username", username);
//        model.addAttribute("password", password); //password can be seen in browser
        model.addAttribute("email", email);
        model.addAttribute("address", address);
        return "details";

    }
    }

/*Restful API
//sending data in url , less data
--->GET - READ
//http header- data will be encrypted, more data can be send
---->POST - CREATE
---->PUT/PATCH -UPDATE
---->DELETE -DELETE


 */