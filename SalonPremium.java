package Polimorfisme;
public class SalonPremium extends Salon {
    public double Diskon;
    public double TotalB;
    @Override
    public double getDiskonAnggota(){
        Diskon = (super.getTotal())*(0.2);
        return Diskon;
    }
    @Override
    public double getTotalBayar(){
        TotalB = (super.getTotal())- Diskon;
        return TotalB;
    }
    
}
