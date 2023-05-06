package com.zaurtregulov.spring.mvc;

import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 256, message = "name must be 2..256 symbols!") // минимальная и максимальная длина имени в символах
    private String name;
    private String surname;
    private int salary;
    private String department;

    private Map<String, String> departmentsList;

    private String carBrand;

    private Map<String, String> carBrandsList;

    private String languages;

    private Map<String, String> languagesList;

    public Employee() {
        departmentsList = new LinkedHashMap<>();
        departmentsList.put("IT", "Information Technology");
        departmentsList.put("HR", "Human resources");
        departmentsList.put("SALES", "Sales department");

        carBrandsList = new LinkedHashMap<>();
        carBrandsList.put("Tesla","Tesla>");
        carBrandsList.put("BMW","BMW>");
        carBrandsList.put("Audi","Audi>");
        carBrandsList.put("Mercedes-Benz","Mercedes>");
        carBrandsList.put("Toyota","Toyota>");

        languagesList = new LinkedHashMap<>();
        languagesList.put("English", "EN>");
        languagesList.put("Deutsch", "DE>");
        languagesList.put("Russian", "RU>");
        languagesList.put("French", "FR>");
        languagesList.put("Spanish", "ES>");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartmentsList() {
        return departmentsList;
    }

    public void setDepartmentsList(Map<String, String> departmentsList) {
        this.departmentsList = departmentsList;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrandsList() {
        return carBrandsList;
    }

    public void setCarBrandsList(Map<String, String> carBrandsList) {
        this.carBrandsList = carBrandsList;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
