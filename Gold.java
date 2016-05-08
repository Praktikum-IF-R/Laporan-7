package mainsalon;
public class Gold extends Salon{
    public Gold(String j, String p, double hj, double hp, double d) {
        super(j, p, hj, hp, d);
    }
    public double getDiskonMember(){
        return 0.15*super.getTotalHarga();
    }
    public double getTotalPembayaran(){
        return super.getTotalHarga()-getDiskonMember();
    }
}