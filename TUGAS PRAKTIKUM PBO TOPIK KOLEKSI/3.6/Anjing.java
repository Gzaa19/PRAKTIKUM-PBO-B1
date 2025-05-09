/* Nama File : Anjing.java
 * Deskripsi : Berisi atribut dan method dalam Subclass Anjing
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 6 Mei 2025
 */

public class Anjing extends Anabul{

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Guk-guk!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara melata.");
    }
}
