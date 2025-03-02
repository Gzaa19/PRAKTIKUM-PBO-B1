/* Nama File : Mahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 25 Februari 2025
 */

import java.util.ArrayList;
public class Mahasiswa {
    //Atribut
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan Kendaraan;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        listMatkul = new ArrayList<>();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    // Getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return Kendaraan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan Kendaraan) {
        this.Kendaraan = Kendaraan;
    }

    // Menambahkan Mata Kuliah ke dalam ArrayList
    public void addMatkul(MataKuliah matkul) {
        listMatkul.add(matkul);
    }


    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatkul() {
        return listMatkul.size();
    }

  
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Jumlah Mata Kuliah: " + getJumlahMatkul());
        System.out.println("Total SKS: " + getJumlahSKS());

        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        }

        if (Kendaraan != null) {
            System.out.println("Kendaraan: " + Kendaraan.getNoPlat() + " - " + Kendaraan.getJenis());
        }

        System.out.println("Mata Kuliah yang diambil:");
        for (MataKuliah matkul : listMatkul) {
            System.out.println("- " + matkul.getNama());
        }
    }
}
