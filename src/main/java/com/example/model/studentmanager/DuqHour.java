package com.example.model.studentmanager;

public class DuqHour {
    private Double duq;

    private String hour;

    public Double getDuq() {
        return duq;
    }

    public void setDuq(Double duq) {
        this.duq = duq;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }
}