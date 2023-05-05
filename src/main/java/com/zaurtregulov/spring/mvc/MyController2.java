package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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

//        Employee employee = new Employee();
//        employee.setName("Oleg");
//        employee.setSurname("Chumin");
//        employee.setSalary(3500);

        model.addAttribute("employee", new Employee());
        return "ask-amp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee emp) {
        String name = emp.getName();
        emp.setName("Mr./Mrs. " + name);

        String surname = emp.getSurname();
        emp.setSurname(surname + "!");

        int salary = emp.getSalary();
        emp.setSalary(salary * 3);

        return "show-emp-details-view";
    }
}
