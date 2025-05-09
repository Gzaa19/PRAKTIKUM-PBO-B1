/* Nama File : Kucing.java
 * Deskripsi : Berisi atribut dan method dalam subclass Kucing
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 6 Mei 2025
 */

public class Kucing extends Anabul{

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Meong!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara melata.");
    }
}
