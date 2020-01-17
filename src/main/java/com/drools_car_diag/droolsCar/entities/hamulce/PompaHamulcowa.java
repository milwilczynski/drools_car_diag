package com.drools_car_diag.droolsCar.entities.hamulce;

public class PompaHamulcowa {
    //0 - nie ustawione
    //1 - zepsute
    //2 - sprawne

    private byte czyJestPlynHamulcowy = 0;
    private byte iloscWodyWplynieHamulcowym = 0;
    private byte czyJestOdpowiednieCisnienie = 0;
    private String wiadomosc = "";

    public byte getCzyJestPlynHamulcowy() {
        return czyJestPlynHamulcowy;
    }

    public void setCzyJestPlynHamulcowy(byte czyJestPlynHamulcowy) {
        this.czyJestPlynHamulcowy = czyJestPlynHamulcowy;
    }

    public byte getIloscWodyWplynieHamulcowym() {
        return iloscWodyWplynieHamulcowym;
    }

    public void setIloscWodyWplynieHamulcowym(byte iloscWodyWplynieHamulcowym) {
        this.iloscWodyWplynieHamulcowym = iloscWodyWplynieHamulcowym;
    }

    public byte getCzyJestOdpowiednieCisnienie() {
        return czyJestOdpowiednieCisnienie;
    }

    public void setCzyJestOdpowiednieCisnienie(byte czyJestOdpowiednieCisnienie) {
        this.czyJestOdpowiednieCisnienie = czyJestOdpowiednieCisnienie;
    }

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }
}
