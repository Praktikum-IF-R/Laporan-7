package Bab7LP2;

public class Silver extends Salon {
    private long hargatotal;
    
    public Silver(int sb, int sh, int ct, int lt){
        super(sb,sh,ct,lt);
    }
    public long HargaTotal(){
        hargatotal = (getJumlahSabun()*25000)+(getJumlahShampoo()*50000)+(getJumlahConditioner()*35000)+(getJumlahLotion()*60000);
        return (hargatotal-(hargatotal*10/100));
    }
}
