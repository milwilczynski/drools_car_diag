package com.drools_car_diag.droolsCar.entities.wydech;

public class SondaLambda {
    private String wiadomosc = "";
    private byte czySpadekMocySilnika = 0;
    private byte czyWzrostZuzyciaPaliwa = 0;

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte getCzySpadekMocySilnika() {
        return czySpadekMocySilnika;
    }

    public void setCzySpadekMocySilnika(byte czySpadekMocySilnika) {
        this.czySpadekMocySilnika = czySpadekMocySilnika;
    }

    public byte getCzyWzrostZuzyciaPaliwa() {
        return czyWzrostZuzyciaPaliwa;
    }

    public void setCzyWzrostZuzyciaPaliwa(byte czyWzrostZuzyciaPaliwa) {
        this.czyWzrostZuzyciaPaliwa = czyWzrostZuzyciaPaliwa;
    }
}
