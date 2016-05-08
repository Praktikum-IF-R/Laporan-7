package Polimorfisme;
public class SalonSilver extends Salon {
    public double TotalB;
    public double Diskon;
    
    @Override
    public double getDiskonAnggota(){
        Diskon = (super.getTotal())*(0.10);
        return Diskon;
    }
    @Override
    public double getTotalBayar(){
        TotalB = (super.getTotal())- Diskon;
        return TotalB;
    }
}
