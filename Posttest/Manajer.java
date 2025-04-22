public class Manajer extends Pegawai {
    // Atribut
    private int tunjangan = 700000;

    // Method
    public Manajer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
