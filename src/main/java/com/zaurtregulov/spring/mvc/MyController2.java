package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/employee")
public class MyController2 {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails") //URL
    public String askEmplyeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-amp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
        empName = "Mr./Mrs. " + empName + "!";
        model.addAttribute("nameAttribute", empName); // добавляем атрибут в модель, модель - просто контейнер для данных
        model.addAttribute("description", " - Java software developer");
        return "show-emp-details-view";
    }
}
