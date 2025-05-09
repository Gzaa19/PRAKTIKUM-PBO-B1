/* Nama File :Burung.java
 * Deskripsi : Berisi atribut dan method dalam subclass Burung
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 6 Mei 2025
 */

public class Burung extends Anabul{

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Cuit!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara terbang.");
    }
}

