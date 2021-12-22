package engineer.neenu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
            model.addAttribute("variable", a); //"a" should be same as html page
        return "dynamic";
        }
        @RequestMapping("/add")
        public String add(){
            return  "add";
        }
    @RequestMapping("/result")
    public String result(Model model, HttpServletRequest req){  //request we get from user we use httpserveltrequest
        int num1= Integer.parseInt(req.getParameter("num1"));
        int num2= Integer.parseInt(req.getParameter("num2"));
        int res = num1 + num2;
        model.addAttribute("res" , res);
        return  "result";
    }
    }

//=>static > css, js
//templates => html