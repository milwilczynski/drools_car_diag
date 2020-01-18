package com.drools_car_diag.droolsCar.entities.rozne;

public class Zarowki {
    // 0 - nie ustawiony
    // 1 - spalony
    // 2  - dziala
    private  byte czySpalone = 0;
    private byte napiecie = 0;

    public byte isNapiecie() {
        return napiecie;
    }

    public void setNapiecie(byte napiecie) {
        this.napiecie = napiecie;
    }

    public byte isCzySpalone() {
        return czySpalone;
    }

    public void setCzySpalone(byte czySpalone) {
        this.czySpalone = czySpalone;
    }
}
