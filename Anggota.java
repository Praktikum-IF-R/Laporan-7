package Polimorfisme;
public class Anggota extends Kosmetik {
    public Anggota (){
        super();
    }
    public double Lorea(){
        lore -= lore*0.1;
        return lore;
    }
    public double Ponds(){
        pond -= pond*0.1;
        return pond;
    }
}
