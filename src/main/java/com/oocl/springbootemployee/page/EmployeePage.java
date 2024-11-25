package com.oocl.springbootemployee.page;

import com.oocl.springbootemployee.entity.Employee;

import java.util.List;

public class EmployeePage extends BasePage {

    private List<Employee> employees;

    public EmployeePage(Integer page, Integer size, List<Employee> employees) {
        super(page, size);
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
