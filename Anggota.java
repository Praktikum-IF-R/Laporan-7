package salonku;
public abstract class Anggota {
    protected String nama, id;
    protected String daftar = "";
    protected double Total = 0;
    protected static double diskonAnggota = 10;
    public Anggota(String id, String nama) {
        this.nama = nama;
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public String getId() {
        return id;
    }
    public static void setDiskon1(double d) {
        diskonAnggota = d;
    }
    public static double getDiskon1() {
        return diskonAnggota / 100;
    }
    public double getDiskonAnggota() {
        return getDiskon1() * Total;
    }
    abstract double getDiskon();
    public void setDaftar(String produk) {
        daftar = produk;
    }
    public String getDaftar() {
        return daftar;
    }
    public void setTotal(double totalProduk) {
      Total = totalProduk;
    }
    public double getTotal() {
        return Total = Total - this.getDiskonAnggota();
    }
    public double Total() {
        return Total = Total - this.getDiskon()-this.getDiskonAnggota();
    }
}
