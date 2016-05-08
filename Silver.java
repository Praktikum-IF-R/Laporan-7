package mainsalon;
public class Silver extends Salon{
    public Silver(String j, String p, double hj, double hp, double d) {
        super(j, p, hj, hp, d);
    }
    public double getDiskonMember(){
        return 0.1*super.getTotalHarga();
    }
    public double getTotalPembayaran(){
        return super.getTotalHarga()-getDiskonMember();
    }
}