package mainsalon;
public abstract class Salon {
    private String jasa, produk;
    private double hargaJasa, hargaProduk, diskon;
    public Salon(String j, String p, double hj, double hp, double d){
        jasa = j;
        produk = p;
        hargaJasa = hj;
        hargaProduk = hp;
        diskon = d;
    }
    public String getJasa(){
        return jasa;
    }
    public String getProduk(){
        return produk;
    }
    public double getHargaJasa(){
        return hargaJasa;
    }
    public double getHargaProduk(){
        return hargaProduk;
    }
    public double getDiskonProduk(){
        return hargaProduk*(diskon/100);
    }
    public double getTotalHarga(){
        return hargaJasa+(hargaProduk-getDiskonProduk());
    }
    public abstract double getDiskonMember();
    public abstract double getTotalPembayaran();
}