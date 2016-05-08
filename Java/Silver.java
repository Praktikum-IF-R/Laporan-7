package salon;
public class Silver extends Class {
    protected double potonganharga;
    public double diskonAnggota(double a){
        double c;
        c = (a*10)/100;
        this.potonganharga = c;
        double d;
        d = a - c;
        return d;
    }
    
    public double getpotonganharga(){
        return potonganharga;
    }
}
