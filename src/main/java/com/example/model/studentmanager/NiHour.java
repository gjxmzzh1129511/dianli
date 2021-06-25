package com.example.model.studentmanager;

public class NiHour {
    private Double ni;

    private String hour;

    public Double getNi() {
        return ni;
    }

    public void setNi(Double ni) {
        this.ni = ni;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }
}