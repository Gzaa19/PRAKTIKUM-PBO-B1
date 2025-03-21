/* Nama File : Main.java
 * Deskripsi : Berisi Main dalam class Main Manusia
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 18 Maret 2025
 */

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo", "01-04-2006", "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", "01-01-2000", "Jl. Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", "09-01-1977", "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
        PNS p2 = new PNS("Panji", "01-04-2010", "Jl. Mulawarman",10000000, "198004212010041002");
        
        p2.setAlamat("Jl. Panorama 111 Tembalang");
        
        System.out.println("======================= Statistik =======================");
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        System.out.println("Pajak PNS p2 = " + p2.hitungPajak());
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
        System.out.println("Masa Kerja p2 = " + p2.hitungMasaKerja());
        System.out.println();

        System.out.println("======================= Biodata =======================");
        p1.cetakInfo();
        System.out.println();
        pe1.cetakInfo();
        System.out.println();
        pt1.cetakInfo();
        System.out.println();
        p2.cetakInfo();
    }
}