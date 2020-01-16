package main.entities.swiatla.cofania;

public class Cofania {
    private byte czySwieca = 0;
    private byte czyCzujnikBieguDziala = 0;
    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte getCzySwieca() {
        return czySwieca;
    }

    public void setCzySwieca(byte czySwieca) {
        this.czySwieca = czySwieca;
    }

    public byte getCzyCzujnikBieguDziala() {
        return czyCzujnikBieguDziala;
    }

    public void setCzyCzujnikBieguDziala(byte czyCzujnikBieguDziala) {
        this.czyCzujnikBieguDziala = czyCzujnikBieguDziala;
    }
}
