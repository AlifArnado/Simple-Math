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
import java.util.Scanner;
public class balok {
    
    int panjang , lebar , tinggi, hasil;
    Scanner masuk = new Scanner(System.in);
    public void setLuasBalok(int panjang , int lebar , int tinggi) {
          this.panjang = panjang;
          this.lebar = lebar;
          this.tinggi = tinggi;
    }
    
    public void setVolumeBalok(int panjang , int lebar , int tinggi) {
          this.panjang = panjang;
          this.lebar = lebar;
          this.tinggi = tinggi;
    }
    
    public void diagonalBalok(int panjang , int lebar , int tinggi) {
          this.panjang = panjang;
          this.lebar = lebar;
          this.tinggi = tinggi;
    }
    
    public void setkelilingBalok(int panjang , int lebar , int tinggi) {
          this.panjang = panjang;
          this.lebar = lebar;
          this.tinggi = tinggi;
    }
    
    public int getLuasBalok() {
        hasil = (2 * panjang) + (2 * lebar) + (2 * tinggi);
        return hasil;
    }
    
    public int getVolumeBalok() {
        hasil = panjang * lebar * tinggi;
        return hasil;
    }
    
    public int getKelilingBalok() {
        hasil = 4 * (panjang + lebar + tinggi);
        return hasil;
    }
    
    public int getDiagonal() {
        hasil = (int) Math.sqrt(Math.pow(panjang, 2)+Math.pow(lebar, 2)+Math.pow(tinggi, 2));
        return hasil;
    }
    
}
