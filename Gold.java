package laporan7;

public class Gold extends Salon{
    
    private double biaya;
    private double diskon = 0.2;
    public Gold(String a){
        super(a);
    }
    public double Biaya(){
        double hargadiskon = (harga*diskon);
        return biaya = harga - hargadiskon - (hargadiskon * diskonMember);
    }
}

