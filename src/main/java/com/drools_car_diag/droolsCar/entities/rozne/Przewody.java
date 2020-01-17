package com.drools_car_diag.droolsCar.entities.rozne;
;

public class Przewody {
    // 0 - nie ustawiony
    // 1 - uszkodzony
    // 2  - dziala
    private byte czyUszkodzone = 0;

    public byte isCzyUszkodzone() {
        return czyUszkodzone;
    }

    public void setCzyUszkodzone(byte czyUszkodzone) {
        this.czyUszkodzone = czyUszkodzone;
    }
}
