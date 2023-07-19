package ru.alishev.springcourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CalculatorController {
    @GetMapping("/calculator")
        public String calculator(@RequestParam("a") int a, @RequestParam("action") String action,
                                 @RequestParam("b") int b, Model model) {

            double result;
            switch (action) {
                case "multiplication":
                    result = a * b;
                    break;
                case "division":
                    result = (double) a / b;
                    break;
                case "plus":
                    result = a + b;
                case "minus":
                    result = a - b;
                default:
                    result = 0;
                    break;
            }
            model.addAttribute("result", result);

            return "first/calculator";
        }
    }

