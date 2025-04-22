/* Nama File : Fakultas.java
 * Deskripsi : Berisi atribut dan method dalam class fakultas
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 25 Maret 2025
 */

public class Fakultas {
    //Atribut
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    //Selektor memakai parameter
    public Fakultas(String nama, double tarifUKT, double gajiPokok){
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    //Getter dan Setter
    public String getNama(){
        return nama;
    }

    public double getTarifUKT(){
        return tarifUKT;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTarifUKT(double tarifUKT){
        this.tarifUKT = tarifUKT;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
}
