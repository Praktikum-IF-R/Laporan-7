package salonku;
public class Salon {
    private String[] produk = {"", "Hair cut", "Hair mask", "Creambath", "Smoothing", "Hair tonic", "Hair Serum", "Conditioner"};
    private double[] harga = {0, 15000, 100000, 400000, 1500000, 50000, 75000, 50000};
    public String getProduk(int index) {
        return produk[index];
    }
    public  double getHarga(int index) {
        return harga[index];
    }
}
