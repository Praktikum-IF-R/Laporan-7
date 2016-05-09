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
public class Gold extends Salon{
    
    private int jumlahVitamin, jumlahShampoo;
    private int diskonProduk, totalDiskonJasa, totalDiskonProduk;

    public Gold(int c, int l, int v, int s) {
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
    
    public void setDiskonProduk(int d){
        diskonProduk = d;
    }

    @Override
    public int diskonJasa(int h) {
        return (15*h)/100;
    }

    @Override
    public int diskonProduk() {
        return (diskonProduk*((getHargaVitamin()*jumlahVitamin)+(getHargaShampoo()*jumlahShampoo)))/100;
    }
  
}
