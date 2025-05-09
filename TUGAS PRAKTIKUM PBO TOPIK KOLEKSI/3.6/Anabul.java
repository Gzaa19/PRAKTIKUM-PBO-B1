/* Nama File : Anjing.java
 * Deskripsi : Berisi atribut dan method dalam Superclass Anabul
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 6 Mei 2025
 */
public abstract class Anabul {
    // Atribut
    protected String nama;

    // Konstruktor
    public Anabul(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void bersuara();
    public abstract void bergerak();
}