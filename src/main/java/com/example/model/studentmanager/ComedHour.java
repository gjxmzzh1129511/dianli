package com.example.model.studentmanager;

public class ComedHour {
    private Double comed;

    private String hour;

    public Double getComed() {
        return comed;
    }

    public void setComed(Double comed) {
        this.comed = comed;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }
}