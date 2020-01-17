package com.drools_car_diag.droolsCar.entities.swiatla.cofania;
import com.drools_car_diag.droolsCar.entities.rozne.Bezpiecznik;
import com.drools_car_diag.droolsCar.entities.rozne.Przewody;
import com.drools_car_diag.droolsCar.entities.rozne.Zarowki;
import com.drools_car_diag.droolsCar.entities.swiatla.cofania.Cofania;

public class CofaniaSprawdz {

    Cofania cofania;
    Bezpiecznik bezpiecznik;
    Zarowki zarowki;
    Przewody przewody;

    public Cofania getCofania() {
        return cofania;
    }

    public void setCofania(Cofania cofania) {
        this.cofania = cofania;
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
