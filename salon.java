package laporan7;

public abstract class salon {
    protected String nama, member, jasa, produk;
    final int creambath = 20000;
    final int haircut = 30000;
    final int facial = 20000;
    final int masker = 30000;
    final int lulur = 40000;
    final int milkbath = 25000;
    double total;
    double total2 = 0;
    int dis;

    public salon(String nama, int dis) {
        this.nama = nama;
        this.dis = dis;
    }
    public String getNama() {
        return nama;
    }
    public int getDis(){
        return dis;
    }
    public void setJasa(String jasa) {
        this.jasa = jasa;
    }
    public String getJasa() {
        return jasa;
    }
    public void setProduk(String produk) {
        this.produk = produk;
    }
    public String getProduk() {
        return produk;
    }
    public double jasa() {
        if (jasa.equalsIgnoreCase("creambath")) {
            total = creambath;
        } else if (jasa.equalsIgnoreCase("haircut")) {
            total = haircut;
        } else if (jasa.equalsIgnoreCase("facial")) {
            total = facial;
        } else {
            total = 0;
        }
        return total;
    }
    public double produk() {
        if (produk.equalsIgnoreCase("masker")) {
            total = masker;
        } else if (produk.equalsIgnoreCase("lulur")) {
            total = lulur;
        } else if (produk.equalsIgnoreCase("milkbath")) {
            total = milkbath;
        } else {
            total = 0;
        }
        return total;
    }
    public double total2() {
        return total2 = jasa() + produk();
    }
    public abstract double totalJ();
    public abstract double totalP();
    public abstract double total();
}
