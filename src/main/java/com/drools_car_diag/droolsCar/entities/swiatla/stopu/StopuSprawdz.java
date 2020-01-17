package com.drools_car_diag.droolsCar.entities.swiatla.stopu;

import com.drools_car_diag.droolsCar.entities.rozne.Bezpiecznik;
import com.drools_car_diag.droolsCar.entities.rozne.Przewody;
import com.drools_car_diag.droolsCar.entities.rozne.Zarowki;

public class StopuSprawdz {
    Stopu stopu;
    Bezpiecznik bezpiecznik;
    Zarowki zarowki;
    Przewody przewody;


    public Stopu getStopu() {
        return stopu;
    }

    public Bezpiecznik getBezpiecznik() {
        return bezpiecznik;
    }

    public Zarowki getZarowki() {
        return zarowki;
    }

    public Przewody getPrzewody() {
        return przewody;
    }

    // Setter Methods

    public void setStopu(Stopu StopuObject) {
        this.stopu = StopuObject;
    }

    public void setBezpiecznik(Bezpiecznik BezpiecznikObject) {
        this.bezpiecznik = BezpiecznikObject;
    }

    public void setZarowki(Zarowki ZarowkiObject) {
        this.zarowki = ZarowkiObject;
    }

    public void setPrzewody(Przewody PrzewodyObject) {
        this.przewody = PrzewodyObject;
    }
}
