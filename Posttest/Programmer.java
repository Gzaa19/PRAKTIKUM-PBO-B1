public class Programmer extends Pegawai {
    // Atribut
    private int bonus = 450000;

    // Method
    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
