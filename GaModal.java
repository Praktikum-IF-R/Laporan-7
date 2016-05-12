package polymorphysm;
public class GaModal extends Salon {
    public GaModal(String js, String pr, double bjs, double bpr, double disc){
        super(js,pr,bjs,bpr,disc);
    }
    public double getDiskonMem(){
        return 0*super.getJasaBayar();
    }
    public void boom(){
        System.out.println(super.getJasa()+"\t\t: Rp"+super.getJasaBayar());
        System.out.println(super.getProduk()+"\t\t: Rp"+super.getProdukBayar());
        System.out.println("________________________________________+");
        System.out.println("SUB TOTAL\t\t: Rp"+super.getBayar());
    }
}
