public class Main {
    public static void hitungSewa(Vehicle v) {
        v.calRent(50, 1000);
    }

    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);

        // hitungSewa(kendaraan);
        // hitungSewa(mobil);
        // hitungSewa(bis);
    }
}
