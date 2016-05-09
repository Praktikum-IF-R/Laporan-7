package Laporan7;

public class TidakAnggota extends Salon {

    private static int totalhargaP;
    private static int totalhargaJ;

    public TidakAnggota() {
        super(0, 0);
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
        totalhargaJ = hargajasa;
        return totalhargaJ;
    }

    public int getTotalHargaProduk() {
        totalhargaP = hargaproduk;
        return totalhargaP;
    }
}
