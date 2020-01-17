package com.drools_car_diag.droolsCar.entities.zawieszenie;

public class Wahacze {

    private byte czyStukaniePodczasjazdyPoNierownosciach = 0;
    private byte czySzarpaniePrzyRuszaniu = 0;
    private byte czyPukanieWKolach = 0;
    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte getCzyStukaniePodczasjazdyPoNierownosciach() {return czyStukaniePodczasjazdyPoNierownosciach; }

    public void setCzyStukaniePodczasjazdyPoNierownosciach(byte czyStukaniePodczasjazdyPoNierownosciach)
    {this.czyStukaniePodczasjazdyPoNierownosciach = czyStukaniePodczasjazdyPoNierownosciach; }

    public byte getCzySzarpaniePrzyRuszaniu() {return czySzarpaniePrzyRuszaniu; }

    public void setCzySzarpaniePrzyRuszaniu(byte czySzarpaniePrzyRuszaniu)
    {this.czySzarpaniePrzyRuszaniu = czySzarpaniePrzyRuszaniu; }

    public byte getCzyPukanieWKolach() {return czyPukanieWKolach; }

    public void setCzyPukanieWKolach(byte czyPukanieWKolach) {this.czyPukanieWKolach = czyPukanieWKolach; }
}
