package salon;
public class NonMember extends Salon {
    private double hargabarang, hargajasa;   
    public NonMember(String nama, String member, double hb, double hj){
       super(nama, member);
        hargabarang=hb;
        hargajasa=hj;
    }
    public double getHargaBarang(){
        return hargabarang;
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
        return 0;
    }
    @Override
    public double Diskon() {
    return (int) (hargabarang+hargajasa)*dis;
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


