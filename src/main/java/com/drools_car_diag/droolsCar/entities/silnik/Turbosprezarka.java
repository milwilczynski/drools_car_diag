package com.drools_car_diag.droolsCar.entities.silnik;

public class Turbosprezarka {
    private byte czySpadkiMocySilnika = 0;
    private byte czyZwiekszoneZadymienie = 0;
    private byte czyWydajeGlosneOdglosy = 0;

    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte getCzySpadkiMocySilnika() {
        return czySpadkiMocySilnika;
    }

    public void setCzySpadkiMocySilnika(byte czySpadkiMocySilnika) {
        this.czySpadkiMocySilnika = czySpadkiMocySilnika;
    }

    public byte getCzyZwiekszoneZadymienie() {
        return czyZwiekszoneZadymienie;
    }

    public void setCzyZwiekszoneZadymienie(byte czyZwiekszoneZadymienie) {
        this.czyZwiekszoneZadymienie = czyZwiekszoneZadymienie;
    }

    public byte getCzyWydajeGlosneOdglosy() {
        return czyWydajeGlosneOdglosy;
    }

    public void setCzyWydajeGlosneOdglosy(byte czyWydajeGlosneOdglosy) {
        this.czyWydajeGlosneOdglosy = czyWydajeGlosneOdglosy;
    }
}
