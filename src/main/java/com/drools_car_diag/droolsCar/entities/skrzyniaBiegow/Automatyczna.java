package com.drools_car_diag.droolsCar.entities.skrzyniaBiegow;

public class Automatyczna {
    private String wiadomosc = "";
    private byte czyRozlaczanieNapedu = 0;
    private byte czyBrakBieguWstecznego = 0;
    private byte czyBrakWysokichBiegow = 0;

    public byte getCzyBrakWysokichBiegow() {
        return czyBrakWysokichBiegow;
    }

    public void setCzyBrakWysokichBiegow(byte czyBrakWysokichBiegow) {
        this.czyBrakWysokichBiegow = czyBrakWysokichBiegow;
    }

    public byte getCzyBrakBieguWstecznego() {
        return czyBrakBieguWstecznego;
    }

    public void setCzyBrakBieguWstecznego(byte czyBrakBieguWstecznego) {
        this.czyBrakBieguWstecznego = czyBrakBieguWstecznego;
    }

    public byte getCzyRozlaczanieNapedu() {
        return czyRozlaczanieNapedu;
    }

    public void setCzyRozlaczanieNapedu(byte czyRozlaczanieNapedu) {
        this.czyRozlaczanieNapedu = czyRozlaczanieNapedu;
    }

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }
}
