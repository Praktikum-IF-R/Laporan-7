package Laporan7;

public class AnggotaPremium extends Salon {

    private static int totalhargaP;
    private static int totalhargaJ;

    public AnggotaPremium(int dp) {
        super(20, dp);
    }

    public void Totalakhir() {
        System.out.println("");
        System.out.println("TOTAL JASA      : Rp." + getTotalHargaJasa());
        System.out.println("TOTAL PRODUK    : Rp." + getTotalHargaProduk());
        System.out.println("-----------------------------------------");
        System.out.println("TOTAL SEMUA     : Rp." + getTotalHarga());
    }

    public int getTotalHarga() {
        totalharga = totalhargaJ + totalhargaP;
        return totalharga;
    }

    public int getTotalHargaJasa() {
        totalhargaJ = (int) (hargajasa - (hargajasa * diskonjasa / 100));
        return totalhargaJ;
    }

    public int getTotalHargaProduk() {
        totalhargaP = (int) (hargaproduk - (hargaproduk * diskonproduk / 100));
        return totalhargaP;
    }

}
