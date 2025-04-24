import java.util.ArrayList;
/* Nama File : Main.java
 * Deskripsi : Berisi Main dalam class Main
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 22 April 2025
 */

public class Main {
    public static void main(String[] args) {
        Anabul anabul1 = new Kucing("Mimi", "Anggora");
        Anabul anabul2 = new Anjing("Bruno", "Bulldog");
        Anabul anabul3 = new Burung("Rio", "Parrot");
        Anabul anabul4 = new Kucing("Jiji", "Persia");
        Anabul anabul5 = new Anjing("Oscar", "Golden Retriever");

        ArrayList<Anabul> anabuls = new ArrayList<>();
        anabuls.add(anabul1);
        anabuls.add(anabul2);
        anabuls.add(anabul3);
        anabuls.add(anabul4);
        anabuls.add(anabul5);

        // Inclusion + Overloading + Coercion
        System.out.println("=== Data Anabul Peliharaan ===");
        for (Anabul a : anabuls) {
            a.bersuara();
            a.bergerak();
            System.out.println();
        }

        System.out.println("=== Overloading Polymorphism ===");
        anabul1.beriMakan();
        anabul2.beriMakan("tulang");
        anabul1.beriMakan("whiskas", 2);

        System.out.println("\n=== Coercion Polymorphism ===");
        anabul1.beriMinum(250);

        System.out.println("\n=== Parametric Polymorphism ===");
        Kandang<Kucing> kandangKucing = new Kandang<>();
        kandangKucing.setPenghuni((Kucing) anabul1);
        kandangKucing.infoPenghuni();
        Kandang<Anjing> kandangAnjing = new Kandang<>();
        kandangAnjing.setPenghuni((Anjing) anabul2);
        kandangAnjing.infoPenghuni();
    }
}