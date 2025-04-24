/* Nama File : Kandang.java
 * Deskripsi : Berisi atribut dan method dalam subclass Kandang
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 22 April 2025
 */

public class Kandang<T extends Anabul> { // Tambahan class: kandang.java untuk method Parametric Polymorphism
    private T penghuni;

    public void setPenghuni(T penghuni) {
        this.penghuni = penghuni;
    }

    public void infoPenghuni() {
        penghuni.bersuara();
        penghuni.bergerak();
    }
}
