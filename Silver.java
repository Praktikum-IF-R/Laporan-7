package salon;
import java.util.Scanner;
public class Silver extends Salon {

  private double hargabrng, hargajasa,disc;
    public Silver(String nama, String member, double hargabrng, double hargajasa) {
        super(nama, member);
        this.hargabrng=hargabrng;
        this.hargajasa=hargajasa;
    }
    public double getHargaBarang(){
        return hargabrng;
    }
    public double getHargaJasa(){
        return hargajasa;
    }

    public void setDiskon(double dis){
        this.dis=dis;
    }
    @Override
    public double Total() {
    return (int) (getHargaBarang()+getHargaJasa()-getTotalDiskon());
    }
    @Override
    public double DisMember(){
        return (int) hargajasa*0.1;
    }
    @Override
    public double Diskon() {
    return (int) (hargabrng+hargajasa)*dis;
    }
    public double getTotalDiskon(){
        return DisMember()+Diskon();
    }
    @Override
    public void execute() {
    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    System.out.println("Nama                    : "+nama);
    System.out.println("Tipe Member             : "+member);
    System.out.println("-------------------------------------------------------");
    System.out.println("Total Harga Perawatan   : Rp"+getHargaJasa());
    System.out.println("Total Harga Produk      : Rp"+getHargaBarang());
    System.out.println("Diskon                  :-Rp"+Diskon());
    System.out.println("Diskon Member           :-Rp"+DisMember());
    System.out.println("                        : ----------------------------+");
    System.out.println("Total Harga             : Rp"+Total());
    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    }
    
    
}

