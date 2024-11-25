package com.oocl.springbootemployee.page;

import com.oocl.springbootemployee.entity.Company;

import java.util.List;

public class CompanyPage extends BasePage {
    private List<Company> companies;

    public CompanyPage(Integer page, Integer size, List<Company> companies) {
        super(page, size);
        this.companies = companies;
    }

    public List<Company> getCompanies() {
        return companies;
    }
}
