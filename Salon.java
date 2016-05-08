package Bab7LP2;

public abstract class Salon {
    private int sabun, shampoo, conditioner, lotion;
    
    public Salon(int sb, int sh, int ct, int lt){
        this.sabun = sb;
        this.shampoo = sh;
        this.conditioner = ct;
        this.lotion = lt;
    }
    public int getJumlahSabun(){
        return sabun;
    }
    public int getJumlahShampoo(){
        return shampoo;
    }
    public int getJumlahConditioner(){
        return conditioner;
    }
    public int getJumlahLotion(){
        return lotion;
    }
   
}
