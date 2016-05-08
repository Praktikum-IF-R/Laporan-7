package salon;
public abstract class Pelanggan {
    protected String nama, keanggotaan;
    protected double tariflayanan,tarifproduk;

    public Pelanggan(String nama, String keanggotaan, double tariflayanan, double tarifproduk) {
        this.nama = nama;
        this.keanggotaan = keanggotaan;
        this.tariflayanan = tariflayanan;
        this.tarifproduk = tarifproduk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKeanggotaan(String keanggotaan) {
        this.keanggotaan = keanggotaan;
    }
    
    public String getKeanggotaan() {
        return keanggotaan;
    }

    public void setTariflayanan(double tariflayanan) {
        this.tariflayanan = tariflayanan;
    }

    public double getTariflayanan() {
        return tariflayanan;
    }

    public void setTarifproduk(double tarifproduk) {
        this.tarifproduk = tarifproduk;
    }

    public double getTarifproduk() {
        return tarifproduk;
    }

    public abstract void tarifLayanan();
    public abstract void tarifProduk();
}
