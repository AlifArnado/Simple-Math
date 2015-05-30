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
public class segitiga {
    int alas ;
    int tinggi;
    double hasil;
    
    public void setLuasSegitiga(int alas , int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public int getLuasSegitiga() {
        hasil = 0.5 * alas * tinggi;
        return (int) hasil;
    }
}
