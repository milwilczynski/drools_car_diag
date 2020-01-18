package com.drools_car_diag.droolsCar.entities.wydech;

public class Kolektor {
    private String wiadomosc = "";
    private byte czyHalasPodczasPracy = 0;

    public byte getCzyHalasPodczasPracy() {
        return czyHalasPodczasPracy;
    }

    public void setCzyHalasPodczasPracy(byte czyHalasPodczasPracy) {
        this.czyHalasPodczasPracy = czyHalasPodczasPracy;
    }

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }
}
