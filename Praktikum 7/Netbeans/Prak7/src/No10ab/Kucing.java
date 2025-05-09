/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No10ab;

/**
 *
 * @author hp
 */
public class Kucing extends Anabul{
    private String jenis;

    public Kucing(String nama, String jenis) {
        super(nama);
        this.jenis = jenis;
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Meong! (Jenis: " + jenis + ")");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara melata.");
    }
}

