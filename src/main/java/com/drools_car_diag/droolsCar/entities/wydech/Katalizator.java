package com.drools_car_diag.droolsCar.entities.wydech;

public class Katalizator {
    private String wiadomosc = "";
    private byte czyGrzechotaniePodczasPracy = 0;
    private byte czyProblemyZUruchomieniemSilnika = 0;
    private byte czyPrzyduszanieSilnika = 0;

    public byte getCzyPrzyduszanieSilnika() {
        return czyPrzyduszanieSilnika;
    }

    public void setCzyPrzyduszanieSilnika(byte czyPrzyduszanieSilnika) {
        this.czyPrzyduszanieSilnika = czyPrzyduszanieSilnika;
    }

    public byte getCzyProblemyZUruchomieniemSilnika() {
        return czyProblemyZUruchomieniemSilnika;
    }

    public void setCzyProblemyZUruchomieniemSilnika(byte czyProblemyZUruchomieniemSilnika) {
        this.czyProblemyZUruchomieniemSilnika = czyProblemyZUruchomieniemSilnika;
    }

    public byte getCzyGrzechotaniePodczasPracy() {
        return czyGrzechotaniePodczasPracy;
    }

    public void setCzyGrzechotaniePodczasPracy(byte czyGrzechotaniePodczasPracy) {
        this.czyGrzechotaniePodczasPracy = czyGrzechotaniePodczasPracy;
    }

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }
}
