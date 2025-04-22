/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam subclass dosen
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 25 Maret 2025
 */

public class Dosen extends Karyawan  implements InfoCivitas{
    //Atribut
    private Fakultas fakultas;
    private static int DosenCounter = 0;

    //Selektor memakai parameter
    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        DosenCounter++;
    }

    //Getter dan Setter
    public static int getDosenCounter() {
        return DosenCounter;
    }

    @Override
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (masaKerja * 0.01 * fakultas.getGajiPokok());
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Dosen: " + nama);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Masa kerja: " + masaKerja);
        System.out.println("Gaji: " + hitungGaji());
    }
}