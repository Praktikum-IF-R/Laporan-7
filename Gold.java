package Polimorfisme;
public class Gold extends Anggota {
    public Gold(){
        super();
    }
    @Override
    public double Lorea(){
        double l = super.Lorea() - lore * 0.15;
        return l;
    }
    @Override
    public double Ponds(){
        double p = super.Ponds() - pond * 0.15;
        return p;    
    }
    public double Facial(){
        face -= face * 0.15;
        return face;
    }
    public double Creambath(){
        cream -= cream *0.15;
        return cream;
    } 
}
