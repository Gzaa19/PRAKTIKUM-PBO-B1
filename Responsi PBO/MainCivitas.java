/* Nama File : MainCivitas.java
 * Deskripsi : Berisi main dalam Main Civitas
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 25 Maret 2025
 */

public class MainCivitas{
    public static void main(String[] args) {
        Fakultas fakultasTI = new Fakultas("Informatika", 5000000, 8000000);
        Mahasiswa mhs1 = new Mahasiswa("Andi", "andi@gmail.com", "123456", 3, fakultasTI);
        Mahasiswa mhs2 = new Mahasiswa("Gaza", "gaza@gmail.com", "654321", 4, fakultasTI);
        Dosen dosen1 = new Dosen("Beta", "budi@gmail.com", "987654", 10, fakultasTI);
        Dosen dosen2 = new Dosen("Dr.Aris", "aris@gmail.com", "998877", 15, fakultasTI);
        Tendik tendik1 = new Tendik("Jamilah", "siti@gmail.com", "567890", 5);
        
        System.out.println("======================= Biodata Informasi =======================");
        mhs1.tampilkanInfo();
        System.out.println();
        mhs2.tampilkanInfo();
        System.out.println();
        dosen1.tampilkanInfo();
        System.out.println();
        dosen2.tampilkanInfo();
        System.out.println();
        tendik1.tampilkanInfo();
        System.out.println();

        System.out.println("======================= Jumlah Manusia =======================");
        System.out.println("Total Mahasiswa: " + Mahasiswa.getMahasiswaCounter());
        System.out.println("Total Dosen: " + Dosen.getDosenCounter());
        System.out.println("Total Tendik: " + Tendik.getTendikCounter());
        System.out.println("Total Karyawan: " + Karyawan.getKaryawanCounter());
        System.out.println("Total Civitas Akademika: " + CivitasAkademika.getTotalCounter());
    }
}