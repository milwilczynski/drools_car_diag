package com.drools_car_diag.droolsCar.entities.opony;

public class Opony {

    private byte czyBieznikZuzyty = 0;
    private byte czyCisnieniePrawidlowe = 0;
    private byte czyPrzebite = 0;
    private byte czySamochodTraciSterownosc = 0;
    private byte czyDrganiaPodczasJazdy = 0;

    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }

    public byte getCzyBieznikZuzyty() {return  czyBieznikZuzyty; }

    public void setCzyBieznikZuzyty(byte czyBieznikZuzyty) {this.czyBieznikZuzyty = czyBieznikZuzyty; }

    public byte getCzyCisnieniePrawidlowe() {return czyCisnieniePrawidlowe; }

    public void setCzyCisnieniePrawidlowe(byte czyCisnieniePrawidlowe) {this.czyCisnieniePrawidlowe = czyCisnieniePrawidlowe; }

    public byte getCzyPrzebite() {return czyPrzebite; }

    public void setCzyPrzebite(byte czyPrzebite) {this.czyPrzebite = czyPrzebite; }

    public byte getCzySamochodTraciSterownosc() {return czySamochodTraciSterownosc; }

    public void setCzySamochodTraciSterownosc(byte czySamochodTraciSterownosc) {this.czySamochodTraciSterownosc = czySamochodTraciSterownosc; }

    public byte getCzyDrganiaPodczasJazdy() {return czyDrganiaPodczasJazdy; }

    public void setCzyDrganiaPodczasJazdy(byte czyDrganiaPodczasJazdy) {this.czyDrganiaPodczasJazdy = czyDrganiaPodczasJazdy; }
}
