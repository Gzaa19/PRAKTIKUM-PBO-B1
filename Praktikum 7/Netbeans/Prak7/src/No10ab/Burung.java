/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No10ab;

/**
 *
 * @author hp
 */
public class Burung extends Anabul{
        private String spesies;
    
        public Burung(String nama, String spesies) {
            super(nama);
            this.spesies = spesies;
        }
    
        @Override
        public void bersuara() {
            System.out.println(nama + " berbunyi: Cuit! (Spesies: " + spesies + ")");
        }
    
        @Override
        public void bergerak() {
            System.out.println(nama + " bergerak dengan cara terbang.");
        }
}
