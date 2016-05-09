package laporan7;

public class Premium extends Salon{
    
    private double biaya;
    private double diskon = 0.15;
    public Premium(String a){
        super(a);
    }
    public double Biaya(){
        double hargadiskon = (harga*diskon);
        return biaya = harga - hargadiskon - (hargadiskon * diskonMember);
    }
}
