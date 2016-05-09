package Laporan7;

public abstract class Salon {

    public double diskonproduk;
    public double diskonjasa;
    public static int totalharga;
    public static int hargaproduk;
    public static int hargajasa;

    public Salon(int dj, int dp) {
        diskonjasa = dj;
        diskonproduk = dp;
    }

    public void setHargaJasa(int pilihan) {
        switch (pilihan) {
            case 1:
                hargajasa += 40000;
                break;
            case 2:
                hargajasa += 45000;
                break;
            case 3:
                hargajasa += 50000;
                break;
            case 4:
                hargajasa += 55000;
                break;
            default:
                System.out.println("PILIHAN TIDAK ADA!");
        }
}

    public void setHargaProduk(int pilihan, int banyak) {

        switch (pilihan) {
            case 1:
                hargaproduk += 20000 * banyak;
                break;
            case 2:
                hargaproduk += 25000 * banyak;
                break;
            case 3:
                hargaproduk += 30000 * banyak;
                break;
            case 4:
                hargaproduk += 50000 * banyak;
                break;
            default:
                System.out.println("PILIHAN TIDAK ADA!");
        }
   }

    public abstract void Totalakhir();

    public abstract int getTotalHargaJasa();

    public abstract int getTotalHargaProduk();

    public abstract int getTotalHarga();

}
