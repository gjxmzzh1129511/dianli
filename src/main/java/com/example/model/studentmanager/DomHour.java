package com.example.model.studentmanager;

public class DomHour {
    private Double dom;

    private String hour;

    public Double getDom() {
        return dom;
    }

    public void setDom(Double dom) {
        this.dom = dom;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }
}