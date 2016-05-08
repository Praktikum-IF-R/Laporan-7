package salon;
public abstract class Class {
    
    protected double potonganhargamember;
    
    public abstract double diskonAnggota(double a);
    
    public double diskonmember(double a, double b){
        double c;
        c = (a*b)/100;
        this.potonganhargamember = c;
        double d;
        d = a - c;
        return d;
    }
    
    public double getpotonganhargamember(){
        return potonganhargamember;
    }
}
