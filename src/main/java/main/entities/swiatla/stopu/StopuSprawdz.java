package main.entities.swiatla.stopu;

import main.entities.rozne.Bezpiecznik;
import main.entities.rozne.Przewody;
import main.entities.rozne.Zarowki;

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
