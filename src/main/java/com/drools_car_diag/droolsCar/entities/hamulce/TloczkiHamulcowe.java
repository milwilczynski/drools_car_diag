package com.drools_car_diag.droolsCar.entities.hamulce;

public class TloczkiHamulcowe {

    private byte czyZabrudzone = 0;
    private byte czySkorodowane = 0;
    private byte czyKolaSieBlokuja = 0;
    private String wiadomosc = "";

    public byte getCzyZabrudzone() {
        return czyZabrudzone;
    }

    public void setCzyZabrudzone(byte czyZabrudzone) {
        this.czyZabrudzone = czyZabrudzone;
    }

    public byte getCzySkorodowane() {
        return czySkorodowane;
    }

    public void setCzySkorodowane(byte czySkorodowane) {
        this.czySkorodowane = czySkorodowane;
    }

    public byte getCzyKolaSieBlokuja() {
        return czyKolaSieBlokuja;
    }

    public void setCzyKolaSieBlokuja(byte czyKolaSieBlokuja) {
        this.czyKolaSieBlokuja = czyKolaSieBlokuja;
    }

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }
}
