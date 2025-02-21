/* Nama File : Mtitik.java
 * Deskripsi : Berisi main dalam class Titik
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Kamis, 20 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Titik==========");
        // Membuat titik T1
        System.out.println("Titik T1: ");
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        System.out.println("Berada di kuadran: " + T1.getKuadran());
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat());


        // Membuat Titik T2
        System.out.println("\n");
        System.out.println("Titik T2: ");
        Titik T2 = new Titik();
        T2.setAbsis(-10);
        T2.setOrdinat(10);
        T2.printTitik();
        T2.geser(5, 5);
        T2.printTitik();
        System.out.println("Berada di kuadran: " + T2.getKuadran());
        System.out.println("Jarak ke pusat: " + T2.getJarakPusat());

        // Menghitung jarak antara T1 dan T2
        System.out.println("\n");
        System.out.println("==========Menghitung jarak antara T1 dan T2==========");
        double jarakT1T2 = T1.getJarak(T2);
        System.out.println("Jarak antara T1 dan T2: " + jarakT1T2);

        // Membuat Titik T3
        System.out.println("\n");
        System.out.println("Titik T3: ");
        Titik T3 = new Titik(-5, -3);
        T3.printTitik();
        T3.geser(3, -5);
        T3.printTitik();
        System.out.println("Berada di kuadran: " + T3.getKuadran());
        System.out.println("Jarak ke pusat: " + T3.getJarakPusat());

        // Membuat Titik T4
        System.out.println("\n");
        System.out.println("Titik T4: ");
        Titik T4 = new Titik(8, -1);
        T4.printTitik();
        System.out.println("Berada di kuadran: " + T4.getKuadran());
        System.out.println("Jarak ke pusat: " + T4.getJarakPusat());
        T4.geser(2, -3);
        T4.printTitik();

        // Menghitung jarak antara T3 dan T4
        System.out.println("\n");
        System.out.println("==========Menghitung jarak antara T3 dan T4==========");
        double jarakT3T4 = T3.getJarak(T4);
        System.out.println("Jarak antara T1 dan T2: " + jarakT3T4);

        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
    }
}