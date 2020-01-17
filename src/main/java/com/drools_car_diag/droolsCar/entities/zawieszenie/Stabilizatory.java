package com.drools_car_diag.droolsCar.entities.zawieszenie;

public class Stabilizatory {

    private byte czyStukanieZawieszeniaPodczasJazdyPoNierownosciach = 0;
    private byte czyGumaStabilizatoraZuzyta = 0;

    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte getCzyStukanieZawieszeniaPodczasJazdyPoNierownosciach() {return czyStukanieZawieszeniaPodczasJazdyPoNierownosciach; }

    public void setCzyStukanieZawieszeniaPodczasJazdyPoNierownosciach(byte czyStukanieZawieszeniaPodczasJazdyPoNierownosciach)
    {this.czyStukanieZawieszeniaPodczasJazdyPoNierownosciach = czyStukanieZawieszeniaPodczasJazdyPoNierownosciach; }

    public byte getCzyGumaStabilizatoraZuzyta() {return czyGumaStabilizatoraZuzyta; }

    public void setCzyGumaStabilizatoraZuzyta(byte czyGumaStabilizatoraZuzyta)
    {this.czyGumaStabilizatoraZuzyta = czyGumaStabilizatoraZuzyta; }
}
