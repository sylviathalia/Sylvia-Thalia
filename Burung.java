/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
 *
 * @author Sylvia Thalia Salsabilla
 */
public class Burung implements Sayap {
    private String nama;
    
    public Burung(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void terbang() {
        System.out.println(nama + " bisa terbang menggunakan sayap");
    }
}
