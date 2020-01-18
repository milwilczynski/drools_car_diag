package com.drools_car_diag.droolsCar.entities.skrzyniaBiegow;

public class Manualna {
    private byte czyLuznyDrazek = 0;
    private byte czyWyjePodczasJazdy = 0;
    private byte czyZgrzytaPodczasWchodzeniaBiegu = 0;

    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }


    public byte getCzyLuznyDrazek() {
        return czyLuznyDrazek;
    }

    public void setCzyLuznyDrazek(byte czyLuznyDrazek) {
        this.czyLuznyDrazek = czyLuznyDrazek;
    }

    public byte getCzyWyjePodczasJazdy() {
        return czyWyjePodczasJazdy;
    }

    public void setCzyWyjePodczasJazdy(byte czyWyjePodczasJazdy) {
        this.czyWyjePodczasJazdy = czyWyjePodczasJazdy;
    }

    public byte getCzyZgrzytaPodczasWchodzeniaBiegu() {
        return czyZgrzytaPodczasWchodzeniaBiegu;
    }

    public void setCzyZgrzytaPodczasWchodzeniaBiegu(byte czyZgrzytaPodczasWchodzeniaBiegu) {
        this.czyZgrzytaPodczasWchodzeniaBiegu = czyZgrzytaPodczasWchodzeniaBiegu;
    }
}
