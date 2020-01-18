package com.drools_car_diag.droolsCar.entities.zawieszenie;

public class GeometriaZawieszenia {

    private byte samoistneSkrecaniePojazdu = 0;
    private byte odpowiedniaZbieznoscKol = 0;
    private byte katPochyleniaKol = 0;
    private byte czyPiskOponPodczasSkrecania = 0;
    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte getSamoistneSkrecaniePojazdu() {return samoistneSkrecaniePojazdu; }

    public void setSamoistneSkrecaniePojazdu(byte samoistneSkrecaniePojazdu) {this.samoistneSkrecaniePojazdu = samoistneSkrecaniePojazdu; }

    public byte getOdpowiedniaZbieznoscKol() {return odpowiedniaZbieznoscKol; }

    public void setOdpowiedniaZbieznoscKol(byte odpowiedniaZbieznoscKol) {this.odpowiedniaZbieznoscKol = odpowiedniaZbieznoscKol; }

    public byte getKatPochyleniaKol() {return katPochyleniaKol; }

    public void setKatPochyleniaKol(byte katPochyleniaKol) {this.katPochyleniaKol = katPochyleniaKol; }

    public byte getCzyPiskOponPodczasSkrecania() {return czyPiskOponPodczasSkrecania; }

    public void setCzyPiskOponPodczasSkrecania(byte czyPiskOponPodczasSkrecania) {this.czyPiskOponPodczasSkrecania = czyPiskOponPodczasSkrecania; }
}
