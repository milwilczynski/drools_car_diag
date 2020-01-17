package com.drools_car_diag.droolsCar.entities.hamulce;

public class TarczeHamulcowe {
    //0 - nie ustawione
    //1 - zepsute
    //2 - sprawne
    private byte CzySiePrzegrzewaja = 0;
    private byte CzySaUszkodzone = 0;
    private String wiadomosc = "";

    public byte getCzySiePrzegrzewaja() {
        return CzySiePrzegrzewaja;
    }

    public void setCzySiePrzegrzewaja(byte czySiePrzegrzewaja) {
        CzySiePrzegrzewaja = czySiePrzegrzewaja;
    }

    public byte getCzySaUszkodzone() {
        return CzySaUszkodzone;
    }

    public void setCzySaUszkodzone(byte czySaUszkodzone) {
        CzySaUszkodzone = czySaUszkodzone;
    }

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }
}
