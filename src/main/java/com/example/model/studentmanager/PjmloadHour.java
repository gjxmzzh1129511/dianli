package com.example.model.studentmanager;

public class PjmloadHour {
    private Double pjmload;

    private String hour;

    public Double getPjmload() {
        return pjmload;
    }

    public void setPjmload(Double pjmload) {
        this.pjmload = pjmload;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }
}