/* Nama File : Anabul.java
 * Deskripsi : Berisi atribut dan method dalam class Super Anabul
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 22 April 2025
 */
public class Anabul{
    // Atribut
    protected String nama;

    // Konstruktor
    public Anabul(String nama){
        this.nama = nama;
    }

    // Method Inclusion Polymorphism
    public void bersuara() {
        System.out.println(nama + " bersuara.");
    }

    public void bergerak() {
        System.out.println(nama + " bergerak.");
    }

    // Overloading Polymorphism
    public void beriMakan() {
        System.out.println(nama + " diberi makan.");
    }

    public void beriMakan(String makanan) {
        System.out.println(nama + " makan " + makanan + ".");
    }

    public void beriMakan(String makanan ,int jumlah) {
        System.out.println(nama + " makan " + makanan + "," + " diberi makan sebanyak " + jumlah + " porsi.");
    }

    // Coercion Polymorphism
    public void beriMinum(double volume) {
        System.out.println(nama + " minum " + volume + " ml air.");
    }
}