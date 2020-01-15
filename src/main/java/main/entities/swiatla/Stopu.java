package main.entities.swiatla;


public class Stopu {
    // 0 - nie ustawiony
    // 1 - spalony
    // 2  - dziala
    private byte czySwiecaStop = 0;
    private byte czyDzialaCzujnikHamowania  = 0;
    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte getCzySwiecaStop() {
        return czySwiecaStop;
    }

    public void setCzySwiecaStop(byte czySwiecaStop) {
        this.czySwiecaStop = czySwiecaStop;
    }

    public byte getCzyDzialaCzujnikHamowania() {
        return czyDzialaCzujnikHamowania;
    }

    public void setCzyDzialaCzujnikHamowania(byte czyDzialaCzujnikHamowania) {
        this.czyDzialaCzujnikHamowania = czyDzialaCzujnikHamowania;
    }

}
