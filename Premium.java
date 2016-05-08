package Laporan7;

/**
 *
 * @author wahyuridiansyah
 */
public class Premium extends Member {

    int harga, prodis;

    Premium(int harga, int prodis) {
        this.harga = harga;
        this.prodis = prodis;
    }

    @Override
    public int layanan() {
        return (harga - (harga * 20 / 100));
    }

    @Override
    public int product() {
        return (harga - ((harga * 20 / 100) + (harga * prodis / 100)));
    }
}
