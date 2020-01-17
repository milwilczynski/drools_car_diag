package com.drools_car_diag.droolsCar.entities.wydech;

public class Wydech {
    private String wiadomosc = "";
    private byte czyDuzoBialegoDymu = 0;
    private byte czyKolorDymuNiebieski = 0;
    private byte czyKolorDymuCzarny = 0;

    public byte getCzyKolorDymuCzarny() {
        return czyKolorDymuCzarny;
    }

    public void setCzyKolorDymuCzarny(byte czyKolorDymuCzarny) {
        this.czyKolorDymuCzarny = czyKolorDymuCzarny;
    }

    public byte getCzyKolorDymuNiebieski() {
        return czyKolorDymuNiebieski;
    }

    public void setCzyKolorDymuNiebieski(byte czyKolorDymuNiebieski) {
        this.czyKolorDymuNiebieski = czyKolorDymuNiebieski;
    }

    public byte getCzyDuzoBialegoDymu() {
        return czyDuzoBialegoDymu;
    }

    public void setCzyDuzoBialegoDymu(byte czyDuzoBialegoDymu) {
        this.czyDuzoBialegoDymu = czyDuzoBialegoDymu;
    }

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }
}
