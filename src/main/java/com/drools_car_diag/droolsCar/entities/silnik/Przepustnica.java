package com.drools_car_diag.droolsCar.entities.silnik;

public class Przepustnica {
    private byte czyNierownaPracaMotoru = 0;
    private byte czySilnikWylaczaSiePodczasHamowania = 0;

    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte getCzySilnikWylaczaSiePodczasHamowania() {
        return czySilnikWylaczaSiePodczasHamowania;
    }

    public void setCzySilnikWylaczaSiePodczasHamowania(byte czySilnikWylaczaSiePodczasHamowania) {
        this.czySilnikWylaczaSiePodczasHamowania = czySilnikWylaczaSiePodczasHamowania;
    }

    public byte getCzyNierownaPracaMotoru() {
        return czyNierownaPracaMotoru;
    }

    public void setCzyNierownaPracaMotoru(byte czyNierownaPracaMotoru) {
        this.czyNierownaPracaMotoru = czyNierownaPracaMotoru;
    }
}
