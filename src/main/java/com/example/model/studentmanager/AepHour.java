package com.example.model.studentmanager;

public class AepHour {
    private Double aep;

    private String hour;

    public Double getAep() {
        return aep;
    }

    public void setAep(Double aep) {
        this.aep = aep;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }
}