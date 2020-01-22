package com.drools_car_diag.droolsCar.entities.silnik.czujniki;

public class CzujnikMasyPowietrza {
    private byte czyBrakMocyPodczasPrzyspieszania = 0;
    private byte czyNierownaPracaSilnikaNaJalowymBiegu = 0;

    private String wiadomosc = "";

    public String getWiadomosc() {
        return wiadomosc;
    }

    public void setWiadomosc(String wiadomosc) {
        this.wiadomosc = wiadomosc;
    }


    public byte getCzyBrakMocyPodczasPrzyspieszania(){
        return czyBrakMocyPodczasPrzyspieszania;
    }

    public void setCzyBrakMocyPodczasPrzyspieszania(byte czyBrakMocyPodczasPrzyspieszania){
        this.czyBrakMocyPodczasPrzyspieszania = czyBrakMocyPodczasPrzyspieszania;
    }

    public byte getCzyNierownaPracaSilnikaNaJalowymBiegu() {
        return czyNierownaPracaSilnikaNaJalowymBiegu;
    }

    public void setCzyNierownaPracaSilnikaNaJalowymBiegu(byte czyNierownaPracaSilnikaNaJalowymBiegu){
        this.czyNierownaPracaSilnikaNaJalowymBiegu = czyNierownaPracaSilnikaNaJalowymBiegu;
    }
}
