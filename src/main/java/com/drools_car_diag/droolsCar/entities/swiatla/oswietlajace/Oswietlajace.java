package com.drools_car_diag.droolsCar.entities.swiatla.oswietlajace;

public class Oswietlajace {
    private byte czySwieca = 0;
    private byte czyDajaSlabeSwiatlo = 0;
    private String wiadomosc = "";

    public byte getCzySwieca() {
        return czySwieca;
    }

    public void setCzySwieca(byte czySwieca) {
        this.czySwieca = czySwieca;
    }

    public byte getCzyDajaSlabeSwiatlo() {
        return czyDajaSlabeSwiatlo;
    }

    public void setCzyDajaSlabeSwiatlo(byte czyDajaSlabeSwiatlo) {
        this.czyDajaSlabeSwiatlo = czyDajaSlabeSwiatlo;
    }

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }
}
