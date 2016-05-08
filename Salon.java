package laporan7;
public abstract class Salon {
    protected double bayarjasa = 0;
    protected double bayarproduk = 0;
    protected double diskonallmember;
    protected int potong = 30000;
    protected int creambath = 50000;
    protected int smoothing = 150000;
    protected int coloring = 200000;
    protected int bleaching = 300000;
    protected int masker = 85000;
    protected int conditioner = 90000;
    protected int shampoo = 100000;
    protected String nama;
    public Salon(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setDiskonMember(double diskonallmember){
        this.diskonallmember=diskonallmember;
    }
    public double getDiskonMember(){
        return (diskonallmember*100);
    }
    public double HargaJasa(int ordernya) {
            if (ordernya == 1) {
                bayarjasa += potong;
            } else if (ordernya == 2) {
                bayarjasa += creambath;
            } else if (ordernya == 3) {
                bayarjasa += smoothing;
            } else if (ordernya == 4) {
                bayarjasa += coloring;
            } else if (ordernya == 5) {
                bayarjasa += bleaching;
            }
                    return bayarjasa;
        }
    public double HargaProduk(int orderbarang) {
            if (orderbarang == 1) {
                bayarproduk += masker;
            } else if (orderbarang == 2) {
                bayarproduk += conditioner;
            } else if (orderbarang == 3) {
                bayarproduk += shampoo;
            }
                    return bayarproduk;
        }
    public abstract double paymentJasa();
    public abstract double paymentProduk();
}