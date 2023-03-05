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
public class Kambing extends Hewan {
    public Kambing(String nama, int umur) {
        super(nama,umur);
    }
    
    @Override
    public String getSuara() {
        return "embek...embek";
    }
}
