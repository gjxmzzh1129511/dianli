package com.example.model.studentmanager;

public class EkpcHour {
    private Double ekpc;

    private String hour;

    public Double getEkpc() {
        return ekpc;
    }

    public void setEkpc(Double ekpc) {
        this.ekpc = ekpc;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }
}