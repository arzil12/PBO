public class Bayar extends Pelanggan {
    int bulan;
    int bayar;

    @Override
    public  int Uang(int bulan, int bayar) {

        return bulan*bayar;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getBayar() {
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }
}
