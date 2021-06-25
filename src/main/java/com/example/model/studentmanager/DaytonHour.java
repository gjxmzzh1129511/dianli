package com.example.model.studentmanager;

public class DaytonHour {
    private Double dayton;

    private String hour;

    public Double getDayton() {
        return dayton;
    }

    public void setDayton(Double dayton) {
        this.dayton = dayton;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }
}