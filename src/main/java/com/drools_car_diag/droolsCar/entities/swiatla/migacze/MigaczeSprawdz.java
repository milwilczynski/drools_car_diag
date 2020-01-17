package com.drools_car_diag.droolsCar.entities.swiatla.migacze;

import com.drools_car_diag.droolsCar.entities.rozne.Przewody;
import  com.drools_car_diag.droolsCar.entities.rozne.Zarowki;
import com.drools_car_diag.droolsCar.entities.rozne.Bezpiecznik;
public class MigaczeSprawdz {
    Migacze migacze;
    Bezpiecznik bezpiecznik;
    Zarowki zarowki;
    Przewody przewody;


    public Migacze getMigacze() {
        return migacze;
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

    public void setMigacze(Migacze MigaczeObject) {
        this.migacze = MigaczeObject;
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
