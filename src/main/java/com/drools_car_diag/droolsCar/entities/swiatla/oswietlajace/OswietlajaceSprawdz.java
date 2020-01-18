package com.drools_car_diag.droolsCar.entities.swiatla.oswietlajace;

import com.drools_car_diag.droolsCar.entities.rozne.Bezpiecznik;
import com.drools_car_diag.droolsCar.entities.rozne.Przewody;
import com.drools_car_diag.droolsCar.entities.rozne.Zarowki;


public class OswietlajaceSprawdz {
    Oswietlajace oswietlajace;
    Bezpiecznik bezpiecznik;
    Zarowki zarowki;
    Przewody przewody;

    public Oswietlajace getOswietlajace() {
        return oswietlajace;
    }

    public void setOswietlajace(Oswietlajace oswietlajace) {
        this.oswietlajace = oswietlajace;
    }

    public Bezpiecznik getBezpiecznik() {
        return bezpiecznik;
    }

    public void setBezpiecznik(Bezpiecznik bezpiecznik) {
        this.bezpiecznik = bezpiecznik;
    }

    public Zarowki getZarowki() {
        return zarowki;
    }

    public void setZarowki(Zarowki zarowki) {
        this.zarowki = zarowki;
    }

    public Przewody getPrzewody() {
        return przewody;
    }

    public void setPrzewody(Przewody przewody) {
        this.przewody = przewody;
    }
}
