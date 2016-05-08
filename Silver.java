package Laporan7;

/**
 *
 * @author wahyuridiansyah
 */
public class Silver extends Member {

    int harga,prodis;

    Silver(int harga, int prodis) {
        this.harga = harga;
        this.prodis = prodis;
    }

    @Override
    public int layanan() {
        return (harga - (harga * 10 / 100));
    }

    @Override
    public int product() {
        return (harga - ((harga * 10 / 100) + (harga * prodis / 100)));
    }
}
