public class Segitiga extends BangunDatar {
    private double alas, tinggi;
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    public double hitungKeliling() {
        double miring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + miring;
    }
}
