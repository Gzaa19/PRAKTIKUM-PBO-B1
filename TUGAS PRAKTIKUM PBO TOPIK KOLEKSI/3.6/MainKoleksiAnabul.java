import java.util.Random;

public class MainKoleksiAnabul {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>();
        Random rand = new Random();
        String[] nama = {"Milo", "Coco", "Oscar", "Luna", "Max", "Lily", "Simba", "Rocky", "Daisy", "Mimi"};

        for (int i = 0; i < 10; i++) {
            int pilih = rand.nextInt(3);
            if (pilih == 0)
                koleksiAnabul.add(new Kucing(nama[i]));
            else if (pilih == 1)
                koleksiAnabul.add(new Anjing(nama[i]));
            else
                koleksiAnabul.add(new Burung(nama[i]));
        }

        // tampilkan
        for (int i = 0; i < koleksiAnabul.getSize(); i++) {
            Anabul a = koleksiAnabul.getIsi(i);
            System.out.println("Nama: " + a.getNama());
            a.bersuara();
            a.bergerak();
            System.out.println();
        }
    }
}
    

