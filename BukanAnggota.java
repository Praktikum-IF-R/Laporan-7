/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon;

/**
 *
 * @author Acer-pc
 */
public class BukanAnggota extends Salon{
     private int jumlahVitamin, jumlahShampoo;

    public BukanAnggota(int c, int l, int v, int s) {
        super(c, l, v, s);
    }
    
    public void setJumlahVitamin(int v){
        jumlahVitamin = v;
    }
    
    public void setJumlahShampoo(int s){
        jumlahShampoo = s;
    }
    
    public int getJumlahVitamin(){
        return jumlahVitamin;
    }
    
    public int getJumlahShampoo(){
        return jumlahShampoo;
    }

    @Override
    public int diskonJasa(int h) {
        return 0;
    }

    @Override
    public int diskonProduk() {
        return 0;
    }
    
}
