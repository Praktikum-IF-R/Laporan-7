package polimorfisme;
public class Premium extends Salon {
    private String Produk, Layanan;
    private int Dis, Harga, Jumlah, HargaP, HargaL;
    public Premium(String p, String l, int J) {
        this.Produk = p;
        if (Produk.equalsIgnoreCase("Maskara")) {
            HargaP = 50000;
        } else if (Produk.equalsIgnoreCase("Lotion")) {
            HargaP = 25000;
        } else if (Produk.equalsIgnoreCase("HairStyle")) {
            HargaP = 30000;
        } else if (Produk.equalsIgnoreCase("Parfum")) {
            HargaP = 105000;
        } else {
            HargaP = 0;
        }
        this.Layanan = l;
        if (Layanan.equalsIgnoreCase("Potong")) {
            HargaL = 12000;
        } else if (Layanan.equalsIgnoreCase("Creambath")) {
            HargaL = 15000;
        } else if (Layanan.equalsIgnoreCase("Lulur")) {
            HargaL = 35000;
        } else if (Layanan.equalsIgnoreCase("Pijat++")) {
            HargaL = 110000;
        } else {
            HargaL = 0;
        }
    }
    public void setDiskon(int d) {
        Dis = d;
    }
    public int getDiskon() {
        return Dis;
    }
    public int DisProduk() {
        int p = (HargaP*Dis/100)*20/ 100;
        return p;
    }
    public int DisLayanan() {
        int l = HargaL*20/ 100;
        return l;
    }
    public int Total() {
        Harga = (DisProduk() + DisLayanan());
        return Harga;
    }
}

