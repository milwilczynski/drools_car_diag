package com.drools_car_diag.droolsCar.entities.ukladKierowniczy;

public class UkladKierowniczy {
    private byte czySzarpaniePodczasSkrecania = 0;
    private byte czyLuzWKolachPodczasJazdy = 0;
    private byte czyDrganieKierownicyPodczasPostoju = 0;
    private byte czyWspomaganieDziala = 0;
    private byte wspomaganieRazDzialaRazNie = 0;
    private String wiadomosc = "";
    private byte wyciePompyWTrakcieJazdy = 0;
    private byte czyUtrudnioneSkrecanie = 0;
    private byte czyGwizdyPompyWTrakcieJazdy = 0;

    public byte getCzyGwizdyPompyWTrakcieJazdy() {
        return czyGwizdyPompyWTrakcieJazdy;
    }

    public void setCzyGwizdyPompyWTrakcieJazdy(byte czyGwizdyPompyWTrakcieJazdy) {
        this.czyGwizdyPompyWTrakcieJazdy = czyGwizdyPompyWTrakcieJazdy;
    }

    public byte getCzyUtrudnioneSkrecanie() {
        return czyUtrudnioneSkrecanie;
    }

    public void setCzyUtrudnioneSkrecanie(byte czyUtrudnioneSkrecanie) {
        this.czyUtrudnioneSkrecanie = czyUtrudnioneSkrecanie;
    }

    public byte getWyciePompyWTrakcieJazdy() {
        return wyciePompyWTrakcieJazdy;
    }

    public void setWyciePompyWTrakcieJazdy(byte wyciePompyWTrakcieJazdy) {
        this.wyciePompyWTrakcieJazdy = wyciePompyWTrakcieJazdy;
    }

    public byte getWspomaganieRazDzialaRazNie() {
        return wspomaganieRazDzialaRazNie;
    }

    public void setWspomaganieRazDzialaRazNie(byte wspomaganieRazDzialaRazNie) {
        this.wspomaganieRazDzialaRazNie = wspomaganieRazDzialaRazNie;
    }

    public byte getCzyWspomaganieDziala() {
        return czyWspomaganieDziala;
    }

    public void setCzyWspomaganieDziala(byte czyWspomaganieDziala) {
        this.czyWspomaganieDziala = czyWspomaganieDziala;
    }


    public byte getCzyDrganieKierownicyPodczasPostoju() {
        return czyDrganieKierownicyPodczasPostoju;
    }

    public void setCzyDrganieKierownicyPodczasPostoju(byte czyDrganieKierownicyPodczasPostoju) {
        this.czyDrganieKierownicyPodczasPostoju = czyDrganieKierownicyPodczasPostoju;
    }

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte getCzySzarpaniePodczasSkrecania() {return czySzarpaniePodczasSkrecania; }

    public void setCzySzarpaniePodczasSkrecania(byte czySzarpaniePodczasSkrecania) {this.czySzarpaniePodczasSkrecania = czySzarpaniePodczasSkrecania; }

    public byte getCzyLuzWKolachPodczasJazdy() {return  czyLuzWKolachPodczasJazdy; }

    public void setCzyLuzWKolachPodczasJazdy(byte czyLuzWKolachPodczasJazdy) {this.czyLuzWKolachPodczasJazdy = czyLuzWKolachPodczasJazdy; }
}
