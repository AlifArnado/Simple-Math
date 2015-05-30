/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.math;

/**
 *
 * @author alif
 */
public class kubus {
    int rusuk , hasil ;
    
    public void setKubus(int rusuk) {
        this.rusuk = rusuk;
    }
    
    public int getVolumeKubus() {
        hasil = rusuk * rusuk * rusuk;
        return hasil;
    }
    
    public int getkelilingKubus() {
        hasil = 12 * rusuk;
        return hasil;
    }
    
    public int getLuasPermukaan() {
        hasil = 6 * rusuk * rusuk;
        return hasil;
    }
    
    public int getLuasSisi() {
        hasil = rusuk * rusuk;
        return hasil;
    }
}
