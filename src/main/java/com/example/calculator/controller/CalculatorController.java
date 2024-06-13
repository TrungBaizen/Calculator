package com.example.calculator.controller;

import com.example.calculator.model.CalculatorModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/home")
    private ModelAndView home(Model model) {
        CalculatorModel calculatorModel = new CalculatorModel();
        model.addAttribute("calculatorModel", calculatorModel);
        return new ModelAndView("index");
    }

    @PostMapping("/home")
    public ModelAndView showCondiment(@ModelAttribute("calculatorModel") CalculatorModel calculatorModel) {
        int result = 0;
        if (calculatorModel.getAdd() != null) {
            result = calculatorModel.getNumberOne() + calculatorModel.getNumberTwo();
        } else if (calculatorModel.getSub() != null) {
            result = calculatorModel.getNumberOne() - calculatorModel.getNumberTwo();
        }else if (calculatorModel.getDiv() != null) {
            result = calculatorModel.getNumberOne() / calculatorModel.getNumberTwo();
        }else if (calculatorModel.getMul() != null) {
            result = calculatorModel.getNumberOne() * calculatorModel.getNumberTwo();
        }
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
