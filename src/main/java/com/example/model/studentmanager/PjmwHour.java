package com.example.model.studentmanager;

public class PjmwHour {
    private Double pjmw;

    private String hour;

    public Double getPjmw() {
        return pjmw;
    }

    public void setPjmw(Double pjmw) {
        this.pjmw = pjmw;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }
}