package laporan7;
public class Silver extends Salon {
    private double pay, pay2;
    private double diskonSilver = 0.1;
    public Silver(String nama){
        super(nama);
    }
    public double paymentJasa(){
        double diskonjasa = bayarjasa-(bayarjasa*diskonSilver);
        return pay = diskonjasa;
    }
    public double paymentProduk(){
        double diskonproduk = bayarproduk-(bayarproduk*diskonSilver);
        double diskonproduk2 = diskonproduk-(diskonproduk*diskonallmember);
        return pay2 = diskonproduk2;
    }
}