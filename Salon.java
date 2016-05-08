package Polimorfisme;
public abstract class Salon {
    private String Jasa;
    private String Produk;
    private double HargaJasa;
    private double HargaProduk;
    private double diskon;
    public double Total;
    public abstract double getTotalBayar();
    public abstract double getDiskonAnggota();
    
    public void setJasa(String Jasa){
        this.Jasa = Jasa;
    }
    public String getJasa(){
        return Jasa;
    }
    public void setProduk(String Produk){
        this.Produk = Produk;
    }
    public String getProduk(){
        return Produk;
    }
    
    public void setHargaJasa(double HJ){
        HargaJasa = HJ;
    }
    public double getHargaJasa(){
        return HargaJasa;
    }
    public void setHargaProduk(double HP){
        HargaProduk = HP;
    }
    public double getHargaProduk(){
        return HargaProduk;
    }
    public void setDiskon(double diskon){
        this.diskon = diskon;
        diskon = (HargaJasa + HargaProduk)* (diskon);
    }
    public double getDiskon(){
        return diskon;
    }
    public double getTotal(){
        Total = (HargaJasa)+(HargaProduk)-(diskon);
        return Total;
    }
}
