package laporan7;
public class Gold extends Salon {
    private double pay, pay2;
    private double diskonGold = 0.15;
    public Gold(String nama){
        super(nama);
    }
    public double paymentJasa(){
        double diskonjasa = bayarjasa-(bayarjasa*diskonGold);
        return pay = diskonjasa;
    }
    public double paymentProduk(){
        double diskonproduk = bayarproduk-(bayarproduk*diskonGold);
        double diskonproduk2 = diskonproduk-(diskonproduk*diskonallmember);
        return pay2 = diskonproduk2;
    }
}