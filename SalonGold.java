package Polimorfisme;
public class SalonGold extends Salon {
    public double TotalB;
    public double Diskon;
    
    @Override
    public double getDiskonAnggota(){
        Diskon = (super.getTotal())*(0.15);
        return Diskon;
    }
    @Override
    public double getTotalBayar(){
        TotalB = (super.getTotal())- Diskon;
        return TotalB;
    }
}
