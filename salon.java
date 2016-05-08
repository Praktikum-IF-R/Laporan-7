/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lappolymorph;

/**
 *
 * @author ANITA
 */
public abstract class salon {
    double discproduk, discjasa, produk, total, potongan, jasa;
    
    public abstract double setdiskon();
    
    public void setpotongan(double p){
        potongan = p / 100;
    }
    public void setproduk(double p){
        produk = p;
    }
    public void setjasa(double j){
        jasa = j;
    }
    
    
    public double getpotongan(){
        return potongan;
    }
    public double getproduk(){
        return produk;
    }
    public double getjasa(){
        return jasa;
    }
    
    
}
