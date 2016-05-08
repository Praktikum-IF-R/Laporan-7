package salon;
public class Gold extends Member {

    private String keanggotaan;
    private double total;
    public Gold (String nama, String keanggotaan, double tariflayanan, double tarifproduk){
        super(nama,keanggotaan,tariflayanan,tarifproduk);
    }
    public String getNama() {
        return nama;
    }

    public String getKeanggotaan() {
        return keanggotaan;
    }

    public double getTariflayanan() {
        return tariflayanan;
    }

    public double getTarifproduk() {
        return tarifproduk;
    }

    public void tarifLayanan(){
        double diskon = tariflayanan*0.15;
        tariflayanan=tariflayanan-diskon;
    }
    public void tarifProduk(){
        double diskon = tarifproduk*0.1;
        tarifproduk=tarifproduk-diskon;
    }
    public double TotalBiaya (){
        return total = tariflayanan+tarifproduk;
    }
    public void displayMessage (){
        System.out.println("Nama pelanggan      : "+nama);
        System.out.println("Keanggotaan         : Gold");
        System.out.println("Anda mendapatkan diskon 15% dari pelayanan kami");
        System.out.println("Biaya Layanan : Rp "+tariflayanan);
        System.out.println("Anda mendapatkan diskon 10% dari pembelian produk kami");
        System.out.println("Biaya Produk  : Rp "+tarifproduk);
        System.out.println("=======================================");
        System.out.println("Total Biaya Anda adalah Rp "+TotalBiaya());
        System.out.println("Terima Kasih");
    }
}
