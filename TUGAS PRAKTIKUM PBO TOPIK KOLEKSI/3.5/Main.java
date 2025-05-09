public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();
        System.out.println("Menambahkan 10 karakter:");
        for (char c = 'A'; c < 'A' + 10; c++) {
            koleksiKarakter.add(c);
        }
        koleksiKarakter.showAll();
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
        System.out.println();

        System.out.println("Ambil elemen di indeks ke-3:");
        System.out.println("Isi: " + koleksiKarakter.getIsi(3));
        System.out.println();

        System.out.println("Ubah elemen di indeks ke-3 menjadi 'Z':");
        koleksiKarakter.setIsi(3, 'Z');
        koleksiKarakter.showAll();
        System.out.println();

        System.out.println("Hapus elemen di indeks ke-5:");
        koleksiKarakter.delete(5);
        koleksiKarakter.showAll();
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
        System.out.println();

        System.out.println("Set size menjadi 12:");
        koleksiKarakter.setSize(12);
        koleksiKarakter.showAll();
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
        System.out.println();

        System.out.println("Set size menjadi 5:");
        koleksiKarakter.setSize(5);
        koleksiKarakter.showAll();
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
    }
}
