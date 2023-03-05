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
public class Panggil {
    public static void main(String[] args){
        Hewan[] macamhewan = new Hewan[2];
        macamhewan[0] = new Kucing("Molly",1);
        macamhewan[1] = new Kambing("Dolly",2);
        
        for (Hewan hewan : macamhewan) {
            System.out.println(hewan.getNama() + " bersuara " + hewan.getSuara());
        }
        
        Sayap[] terbang = new Sayap[1];
        terbang[0] = new Burung("Merpati");
        
        for (Sayap sayap : terbang) {
            sayap.terbang();
        }
        
        try {
            Kambing kambing = new Kambing(null, 6);
        }catch (Error e) {
            System.out.println(e.getMessage());
        }
    }
}
