package Polimorfisme;
public class Premium extends Anggota {
    public Premium(){
        super();
    }
    @Override
    public double Lorea(){
        double l = super.Lorea() - lore * 0.2;
        return l;
    }
    @Override
    public double Ponds(){
        double p = super.Ponds() - pond * 0.2;
        return p;    
    }
    public double Facial(){
        face -= face * 0.2;
        return face;
    }
    public double Creambath(){
        cream -= cream *0.2;
        return cream;
    } 
}
