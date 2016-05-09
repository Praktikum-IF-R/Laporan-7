package Polimorfisme;
public class Silver extends Anggota {
    public Silver(){
        super();
    }
    @Override
    public double Lorea(){
        double l = super.Lorea() - lore*0.1;
        return l;
    }
    @Override
    public double Ponds(){
        double p = super.Ponds() - pond*0.1;
        return p;    
    }
    public double Facial(){
        face -= face * 0.1;
        return face;
    }
    public double Creambath(){
        cream -= cream *0.1;
        return cream;
    } 
}
