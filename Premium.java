package laporan7;
public class Premium extends Salon {
    private double pay, pay2;
    private double diskonPremium = 0.2;
    public Premium(String nama){
        super(nama);
    }
    public double paymentJasa(){
        double diskonjasa = bayarjasa-(bayarjasa*diskonPremium);
        return pay = diskonjasa;
    }
    public double paymentProduk(){
        double diskonproduk = bayarproduk-(bayarproduk*diskonPremium);
        double diskonproduk2 = diskonproduk-(diskonproduk*diskonallmember);
        return pay2 = diskonproduk2;
    }
}