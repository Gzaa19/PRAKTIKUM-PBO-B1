public class BangunDatarGenerik<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T bangunDatar) {
        this.bangunDatar = bangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double luas() {
        return bangunDatar.hitungLuas();
    }

    public double keliling() {
        return bangunDatar.hitungKeliling();
    }
}
