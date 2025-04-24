/* Nama File : Anjing.java
 * Deskripsi : Berisi atribut dan method dalam Subclass Anjing
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 22 April 2025
 */

public class Anjing extends Anabul{
    private String ras;

    public Anjing(String nama, String ras) {
        super(nama);
        this.ras = ras;
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Guk-guk! (Ras: " + ras + ")");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara melata.");
    }
}
