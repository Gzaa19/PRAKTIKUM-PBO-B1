/* Nama File : Main.java
 * Deskripsi : Berisi Main dalam class Main Pegawai
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 12 Maret 2025
 */

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        System.out.println("\n========================= Daftar Pegawai Universitas =========================\n");
        DosenTetap dosenTetap = new DosenTetap("954547548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika", "78647324");
        DosenTamu dosenTamu = new DosenTamu("123456789", "Budi", LocalDate.of(1985, 3, 10), LocalDate.of(2020, 6, 15), 4000000, "Fakultas Teknik", "789654", LocalDate.of(2025, 12, 31));
        Tendik tendik = new Tendik("987654321", "Siti", LocalDate.of(1980, 8, 25), LocalDate.of(2010, 4, 20), 3500000, "Administrasi");
        System.out.println("Informasi Dosen Tetap:");
        dosenTetap.printInfo();
        System.out.println("\nInformasi Dosen Tamu:");
        dosenTamu.printInfo();
        System.out.println("\nInformasi Tendik:");
        tendik.printInfo();
    }
}
