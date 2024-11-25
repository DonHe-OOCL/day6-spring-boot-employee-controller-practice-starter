package com.oocl.springbootemployee.page;

public class BasePage {
    private Integer page;

    private Integer size;

    public BasePage() {
    }

    public BasePage(Integer page, Integer size) {
        this.page = page;
        this.size = size;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getSize() {
        return size;
    }
}
