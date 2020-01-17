package com.drools_car_diag.droolsCar.entities.zawieszenie;

public class Amortyzatory {

    private byte wydluzonaDrogaHamowania = 0;
    private byte wyciekOlejuZAmortyzatora = 0;
    private byte odrywajaceSieKolaOdNawierzchni = 0;
    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte getWydluzonaDrogaHamowania() {return wydluzonaDrogaHamowania; }

    public void setWydluzonaDrogaHamowania(byte wydluzonaDrogaHamowania) {this.wydluzonaDrogaHamowania = wydluzonaDrogaHamowania; }

    public byte getWyciekOlejuZAmortyzatora() {return wyciekOlejuZAmortyzatora; }

    public void setWyciekOlejuZAmortyzatora(byte wyciekOlejuZAmortyzatora) {this.wyciekOlejuZAmortyzatora = wyciekOlejuZAmortyzatora; }

    public byte getOdrywajaceSieKolaOdNawierzchni() {return odrywajaceSieKolaOdNawierzchni; }

    public void setOdrywajaceSieKolaOdNawierzchni(byte odrywajaceSieKolaOdNawierzchni) {this.odrywajaceSieKolaOdNawierzchni = odrywajaceSieKolaOdNawierzchni; }
}
