package gleb.nemtsov.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("calculate")
    public String calculate(@RequestParam("number1") int number1,
                            @RequestParam("number2") int number2,
                            @RequestParam("action") String action,
                            Model model) {

        switch(action) {
            case "multiplication":
                model.addAttribute("result", "Answer: " + (number1 * number2));
                break;
            case "division":
                model.addAttribute("result", "Answer: " + (number1 / number2));
                break;
            case "addition":
                model.addAttribute("result", "Answer: " + (number1 + number2));
                break;
            case "subtraction":
                model.addAttribute("result", "Answer: " + (number1 - number2));
                break;
        }

        return "calculator/calculate";
    }

}
