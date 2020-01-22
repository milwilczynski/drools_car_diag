package com.drools_car_diag.droolsCar.entities.silnik;

public class Cewka {
    private byte czyNierownaPracaSilnikaNaJalowymBiegu = 0;
    private byte czyProblemZUruchomieniem = 0;
    private byte czySpadkiMocySilnika = 0;

    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte getCzyNierownaPracaSilnikaNaJalowymBiegu() {
        return czyNierownaPracaSilnikaNaJalowymBiegu;
    }

    public void setCzyNierownaPracaSilnikaNaJalowymBiegu(byte czyNierownaPracaSilnikaNaJalowymBiegu) {
        this.czyNierownaPracaSilnikaNaJalowymBiegu = czyNierownaPracaSilnikaNaJalowymBiegu;
    }

    public byte getCzyProblemZUruchomieniem() {
        return czyProblemZUruchomieniem;
    }

    public void setCzyProblemZUruchomieniem(byte czyProblemZUruchomieniem) {
        this.czyProblemZUruchomieniem = czyProblemZUruchomieniem;
    }

    public byte getCzySpadkiMocySilnika() {
        return czySpadkiMocySilnika;
    }

    public void setCzySpadkiMocySilnika(byte czySpadkiMocySilnika) {
        this.czySpadkiMocySilnika = czySpadkiMocySilnika;
    }
}
