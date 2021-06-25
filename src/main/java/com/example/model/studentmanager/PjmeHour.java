package com.example.model.studentmanager;

public class PjmeHour {
    private Double pjme;

    private String hour;

    public Double getPjme() {
        return pjme;
    }

    public void setPjme(Double pjme) {
        this.pjme = pjme;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }
}