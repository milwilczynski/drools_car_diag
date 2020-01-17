package com.drools_car_diag.droolsCar.entities.rozne;

public class Bezpiecznik {
    // 0 - nie ustawiony
    // 1 - spalony
    // 2  - dziala
    private byte czySpalony = 0;

    public byte isCzySpalony() {
        return czySpalony;
    }

    public void setCzySpalony(byte czySpalony) {
        this.czySpalony = czySpalony;
    }
}
