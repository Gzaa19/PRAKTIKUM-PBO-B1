/* Nama File :Burung.java
 * Deskripsi : Berisi atribut dan method dalam subclass Burung
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 22 April 2025
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

