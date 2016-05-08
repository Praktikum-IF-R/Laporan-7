package Laporan7;

/**
 *
 * @author wahyuridiansyah
 */
public class NonMember extends Member {

    int harga;

    NonMember(int harga) {
        this.harga = harga;
    }

    @Override
    public int layanan() {
        return harga;
    }

    @Override
    public int product() {
        return harga;
    }
}
