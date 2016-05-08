package mainsalon;
public class Premium extends Salon{
    public Premium(String j, String p, double hj, double hp, double d) {
        super(j, p, hj, hp, d);
    }
    public double getDiskonMember(){
        return 0.2*super.getTotalHarga();
    }
    public double getTotalPembayaran(){
        return super.getTotalHarga()-getDiskonMember();
    }
}