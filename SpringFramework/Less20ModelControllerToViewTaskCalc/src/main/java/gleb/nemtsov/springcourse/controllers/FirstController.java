package gleb.nemtsov.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

    //    System.out.println("Hello, " + name + " " + surname);
        model.addAttribute("message", "Hello, " + name + " " + surname);

        return  "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculate(@RequestParam("num1") int number1,
                            @RequestParam("num2") int number2,
                            @RequestParam("action") String action,
                            Model model) {

        double result;

        switch(action) {
            case "multiplication":
                result = number1 * number2;
                break;
            case "division":
                result = number1 / (double) number2;
                break;
            case "addition":
                result = number1 + number2;
                break;
            case "subtraction":
                result = number1 - number2;
                break;
            default:
                result = 0;
                break;
        }

        model.addAttribute("result", result);

        return "first/calculator";
    }
}
