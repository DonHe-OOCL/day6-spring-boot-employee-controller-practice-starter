package com.oocl.springbootemployee.vo;

import com.oocl.springbootemployee.entity.Employee;

import java.util.List;

public class EmployeePage {
    private Integer page;

    private Integer size;

    private List<Employee> employees;

    public EmployeePage(Integer page, Integer size, List<Employee> employees) {
        this.page = page;
        this.size = size;
        this.employees = employees;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getSize() {
        return size;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
