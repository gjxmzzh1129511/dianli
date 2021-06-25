package com.example.model.studentmanager;

public class DeokHour {
    private Double deok;

    private String hour;

    public Double getDeok() {
        return deok;
    }

    public void setDeok(Double deok) {
        this.deok = deok;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }
}