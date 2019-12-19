package com.vaadin.domain;

import javax.xml.crypto.dsig.SignatureProperties;

public class Masa {
    private int masaNo;
    private Siparis siparis;
    private boolean dolu;

    public int getMasaNo() {
        return masaNo;
    }

    public void setMasaNo(int masaNo) {
        this.masaNo = masaNo;
    }

    public Siparis getSiparis() {
        return siparis;
    }

    public void setSiparis(Siparis siparis) {
        this.siparis = siparis;
    }

    public boolean isDolu() {
        return dolu;
    }

    public void setDolu(boolean dolu) {
        this.dolu = dolu;
    }
}
