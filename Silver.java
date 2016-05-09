package laporan7;

public class Silver extends Salon{
    
    private double biaya;
    private double diskon = 0.1;
    public Silver(String a){
        super(a);
    }
    public double Biaya(){
        double hargadiskon = (harga*diskon);
        return biaya = harga - hargadiskon - (hargadiskon * diskonMember);
    }
}
