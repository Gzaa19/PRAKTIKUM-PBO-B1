public class Lingakaran extends BangunDatar{
    private double jejari;

    public Lingakaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
