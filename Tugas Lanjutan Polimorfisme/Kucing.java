/* Nama File : Kucing.java
 * Deskripsi : Berisi atribut dan method dalam subclass Kucing
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 22 April 2025
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
