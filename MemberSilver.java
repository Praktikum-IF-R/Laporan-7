package polymorphysm;
public class MemberSilver extends Salon {
    public MemberSilver(String js, String pr, double bjs, double bpr, double disc){
        super(js,pr,bjs,bpr,disc);
    }
    public double getDiskonMem(){
        return 0.1*super.getJasaBayar();
    }
    public void boom(){
        System.out.println(super.getJasa()+"\t\t: Rp"+super.getJasaBayar());
        System.out.println(super.getProduk()+"\t\t: Rp"+super.getProdukBayar());
        System.out.println("Diskon produk hari ini\t: Rp"+super.getDiskon());
        System.out.println("Diskon khusus member\t: Rp"+getDiskonMem());
        System.out.println("________________________________________+");
        System.out.println("SUB TOTAL\t\t: Rp"+super.getBayar());
    }
}
