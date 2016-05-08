package laporan7;
public class NonMember extends Salon {
    private double pay, pay2;
    public NonMember(String nama){
        super(nama);
    }
    public double paymentJasa(){
        return pay = bayarjasa;
    }
    public double paymentProduk(){
        return pay2 = bayarproduk;
    }
}