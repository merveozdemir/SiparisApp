package com.vaadin.domain;

public class Yemek {
    String adi;
    float fiyat;

    public Yemek(String adi, float fiyat) {
        this.adi = adi;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return adi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }
}
