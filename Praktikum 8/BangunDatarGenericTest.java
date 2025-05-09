public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingakaran l = new Lingakaran(2);
        BangunDatarGeneric<Lingakaran> bdg =
                new BangunDatarGeneric<Lingakaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("tipe generic: " + bdg.get().getClass().getName());
    }
}
