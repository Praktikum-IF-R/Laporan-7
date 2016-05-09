package laporan7;

public class nonMember extends salon {
   public nonMember(String a, int b){
      super(a, b);
    }
    @Override
    public double totalJ(){
        return super.jasa();
    }
    @Override
    public double totalP(){
        return super.produk();
    }
    @Override
    public double total(){
        return total2 = totalJ()+totalP();
    }
}
