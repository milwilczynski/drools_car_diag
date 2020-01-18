package com.drools_car_diag.droolsCar.entities.silnik.czujniki;

public class CzujnikPolozeniaWaluKorbowego {
    private byte czyNierownaPracaSilnika = 0;

    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }


    public byte getCzyNierownaPracaSilnika() {
        return czyNierownaPracaSilnika;
    }

    public void setCzyNierownaPracaSilnika(byte czyNierownaPracaSilnika) {
        this.czyNierownaPracaSilnika = czyNierownaPracaSilnika;
    }
}
