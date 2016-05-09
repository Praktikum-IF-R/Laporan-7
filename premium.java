package laporan7;

public class premium extends salon {
    double diskJ, diskP;
  
    public premium(String a, int b){
      super(a, b);
   }
    public double diskJasa(){
       return diskJ = super.jasa()*0.2;
    }
    public double diskProduk(){
        return diskP = super.produk()*super.dis/100;
    }
    @Override
    public double totalJ(){
        return super.jasa()- diskJasa();
    }
    @Override
    public double totalP(){
        return super.produk() - diskProduk();
    }
    @Override
    public double total(){
        return total2 = totalJ()+totalP();
    }
    
}
