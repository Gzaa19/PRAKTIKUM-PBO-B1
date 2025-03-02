/* Nama File : Main.java
 * Deskripsi : Berisi Main dalam class Main Mahasiswa
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 25 Februari 2025
 */
public class Main {
    public static void main(String[] args) {
        // Mahasiswa 1
        System.out.println("===== Mahasiswa 1 =====");
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "Motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        // Mahasiswa 2
        System.out.println("===== Mahasiswa 2 =====");
        MataKuliah Awan = new MataKuliah("Awan", "Komputasi Awan", 3);
        MataKuliah MBD2 = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M2 = new Mahasiswa("101", "Jihan", "Informatika");
        Dosen D2 = new Dosen("520", "Beta", "Informatika");
        Kendaraan K2 = new Kendaraan("K6453BDE", "Motor");
        M2.setDosenWali(D2);
        M2.setKendaraan(K2);
        M2.addMatkul(Awan);
        M2.addMatkul(MBD2);
        M2.addMatkul(PBO);
        M2.printDetailMhs();
    }
}