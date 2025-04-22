/* Nama File : Mahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam subclass Mahasiswa
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 25 Maret 2025
 */

public class Mahasiswa extends CivitasAkademika implements InfoCivitas {
    //Atribut
    private static int mahasiswaCounter = 0;
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    
    //Selektor memakai parameter
    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        mahasiswaCounter++;
    }

    //Getter dan Setter
    public String getNIM() {
        return NIM;
    }
    
    public int getSemester() {
        return semester;
    }
    
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    
    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    public static int getMahasiswaCounter() {
        return mahasiswaCounter;
    }
    
    public double hitungUKT() {
        return fakultas.getTarifUKT() * Math.pow(0.95, semester - 1);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mahasiswa: " + nama);
        System.out.println("NIM: " + NIM );
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("UKT: " + hitungUKT());
    }
}