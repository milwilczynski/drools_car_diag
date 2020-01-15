package main.entities.swiatla;

public class Migacze {
    // 0 - nie ustawiony
    // 1 - spalony
    // 2  - dziala
    private byte czySwieca  = 0;
    private byte czyZaSzybkoMigaja  = 0;
    private byte czyDzialaLewaStrona  = 0;
    private byte czyDzialaPrawaStrona  = 0;
    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte isCzySwieca() {
        return czySwieca;
    }

    public void setCzySwieca(byte czySwieca) {
        this.czySwieca = czySwieca;
    }

    public byte isCzyZaSzybkoMigaja() {
        return czyZaSzybkoMigaja;
    }

    public void setCzyZaSzybkoMigaja(byte czyZaSzybkoMigaja) {
        this.czyZaSzybkoMigaja = czyZaSzybkoMigaja;
    }

    public byte isCzyDzialaLewaStrona() {
        return czyDzialaLewaStrona;
    }

    public void setCzyDzialaLewaStrona(byte czyDzialaLewaStrona) {
        this.czyDzialaLewaStrona = czyDzialaLewaStrona;
    }

    public byte isCzyDzialaPrawaStrona() {
        return czyDzialaPrawaStrona;
    }

    public void setCzyDzialaPrawaStrona(byte czyDzialaPrawaStrona) {
        this.czyDzialaPrawaStrona = czyDzialaPrawaStrona;
    }
}

