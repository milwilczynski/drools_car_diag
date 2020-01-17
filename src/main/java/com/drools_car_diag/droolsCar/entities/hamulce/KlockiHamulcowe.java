package com.drools_car_diag.droolsCar.entities.hamulce;

public class KlockiHamulcowe {
    //0 - nie ustawione
    //1 - zepsute
    //2 - sprawne
    private byte czyZuzyte = 0;
    private byte czySiePrzegrzewaja = 0;

    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte getCzyZuzyte() {return czyZuzyte; }

    public void setCzyZuzyte(byte czyZuzyte) {this.czyZuzyte = czyZuzyte; }

    public byte getCzySiePrzegrzewaja() {return czySiePrzegrzewaja; }

    public void setCzySiePrzegrzewaja(byte czySiePrzegrzewaja) {this.czySiePrzegrzewaja = czySiePrzegrzewaja; }
}
