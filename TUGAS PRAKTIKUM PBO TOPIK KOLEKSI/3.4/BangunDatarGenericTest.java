public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // Persegi
        Persegi persegi = new Persegi(5);
        BangunDatarGenerik<Persegi> bdg1 = new BangunDatarGenerik<>();
        bdg1.set(persegi);
        System.out.println("Luas persegi: " + bdg1.luas());
        System.out.println("Keliling persegi: " + bdg1.keliling());
        System.out.println("Tipe generic: " + bdg1.get().getClass().getName());
        System.out.println();

        // Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(4, 6);
        BangunDatarGenerik<PersegiPanjang> bdg2 = new BangunDatarGenerik<>();
        bdg2.set(pp);
        System.out.println("Luas persegi panjang: " + bdg2.luas());
        System.out.println("Keliling persegi panjang: " + bdg2.keliling());
        System.out.println("Tipe generic: " + bdg2.get().getClass().getName());
        System.out.println();

        // Segitiga
        Segitiga segitiga = new Segitiga(3, 4);
        BangunDatarGenerik<Segitiga> bdg3 = new BangunDatarGenerik<>();
        bdg3.set(segitiga);
        System.out.println("Luas segitiga: " + bdg3.luas());
        System.out.println("Keliling segitiga: " + bdg3.keliling());
        System.out.println("Tipe generic: " + bdg3.get().getClass().getName());
    }
}

