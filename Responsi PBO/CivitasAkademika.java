/* Nama File : CivitasAkademika.java
 * Deskripsi : Berisi atribut dan method dalam abstract class Super Civitas
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 25 Maret 2025
 */

public abstract class CivitasAkademika {
    //Atribut
    protected String nama;
    protected String email;
    protected static int totalCounter;

    //Selektor memakai parameter
    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
        totalCounter++;
    }

    //Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getTotalCounter() {
        return totalCounter;
    }
}