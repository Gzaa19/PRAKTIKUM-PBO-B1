/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class Dosen
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 25 Februari 2025
 */

public class Dosen {
    private String NIP;
    private String Nama;
    private String Prodi;

    public Dosen(String NIP, String Nama, String Prodi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    public String getNip() {
        return NIP;
    }

    public String getNama() { // Tambahkan getter untuk Nama
        return Nama;
    }

    public String getProdi() {
        return Prodi;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }
}