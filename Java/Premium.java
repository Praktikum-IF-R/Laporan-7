package salon;
public class Premium extends Class {
    protected double potonganharga;
    public double diskonAnggota(double a){
        double c;
        c = (a*20)/100;
        this.potonganharga = c;
        double d;
        d = a - c;
        return d;
    }
    
    public double getpotonganharga(){
        return potonganharga;
    }
}
