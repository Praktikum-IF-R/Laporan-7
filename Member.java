package salon;
public abstract class Member extends Pelanggan {

    private String keanggotaan;
    private double total;
    
    public Member (String nama, String keanggotaan, double tariflayanan, double tarifproduk){
        super(nama,keanggotaan,tariflayanan,tarifproduk);
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeanggotaan() {
        return keanggotaan;
    }

    public void setKeanggotaan(String keanggotaan) {
        this.keanggotaan = keanggotaan;
    }

    public double getTariflayanan() {
        return tariflayanan;
    }

    public void setTariflayanan(double tariflayanan) {
        this.tariflayanan = tariflayanan;
    }

    public double getTarifproduk() {
        return tarifproduk;
    }

    public void setTarifproduk(double tarifproduk) {
        this.tarifproduk = tarifproduk;
    }
    public void tarifLayanan(){
        double diskon = tariflayanan*0.2;
        tariflayanan=tariflayanan-diskon;
    }
    public void tarifProduk(){
        double diskon = tarifproduk*0.1;
        tarifproduk=tarifproduk-diskon;
    }
    public abstract double TotalBiaya ();
    public void displayMessage (){
        System.out.println("Nama pelanggan      : "+nama);
        System.out.println("Keanggotaan         : "+keanggotaan);
        System.out.println("Anda mendapatkan diskon 20% dari pelayanan kami");
        System.out.println("Biaya Layanan : Rp "+tariflayanan);
        System.out.println("Anda mendapatkan diskon 10% dari pembelian produk kami");
        System.out.println("Biaya Produk  : Rp "+tarifproduk);
        System.out.println("=======================================");
        System.out.println("Total Biaya Anda adalah Rp "+TotalBiaya());
        System.out.println("Terima Kasih");
    }
}

