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
public abstract class Salon {
    private int hargaCreambath, hargaLulur, hargaVitamin, hargaShampoo, totalBayar;
    
    public Salon(int c, int l, int v, int s){
        hargaCreambath = c;
        hargaLulur = l;
        hargaVitamin = v;
        hargaShampoo = s;
    }
    
    public void setHargaCreambath(int c){
        hargaCreambath = c;
    }
    
    public void setHargaLulur(int l){
        hargaLulur = l;
    }
    
    public void setHargaVitamin(int v){
        hargaVitamin = v;
    }
    
    public void setHargaShampoo(int s){
        hargaShampoo = s;
    }
    
     public int getHargaCreambath(){
        return hargaCreambath;
    }
    
    public int getHargaLulur(){
        return hargaLulur;
    }
    
    public int getHargaVitamin(){
        return hargaVitamin;
    }
    
    public int getHargaShampoo(){
        return hargaShampoo;
    }
    
    public abstract int diskonJasa(int h);
    
    public abstract int diskonProduk();
    
    
}
