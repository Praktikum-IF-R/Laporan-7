package Laporan7;

/**
 *
 * @author wahyuridiansyah
 */
public class Gold extends Member {

    int harga, prodis;

    Gold(int harga, int prodis) {
        this.harga = harga;
        this.prodis = prodis;
    }

    @Override
    public int layanan() {
        return (harga - (harga * 15 / 100));
    }

    @Override
    public int product() {
        return (harga - ((harga * 15 / 100) + (harga * prodis / 100)));
    }
}
