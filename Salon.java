package polymorphysm;
public abstract class Salon {
    private String jasa, produk;
    private double biayajasa, biayaproduk, diskon;
    public abstract double getDiskonMem();
    public abstract void boom();
    public Salon(String js, String pr, double bjs, double bpr, double disc){
        jasa = js;
        produk = pr;
        biayajasa = bjs;
        biayaproduk = bpr;
        diskon = disc;
    }
    public String getJasa(){
        return jasa;
    }
    public String getProduk(){
        return produk;
    }
    public double getJasaBayar(){
        return biayajasa;
    }
    public double getProdukBayar(){
        return biayaproduk;
    }
    public double getDiskon(){
        return biayaproduk*(diskon/100);
    }
    public double getBayar(){
        return (getJasaBayar() - getDiskonMem()) + (getProdukBayar() - getDiskon());
    }
}
