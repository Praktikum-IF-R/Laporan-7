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
public class gold extends salon{
    private double discount = 0.15;
    
    public gold(){
        
    }

    @Override
    public double setdiskon() {
        return discount;
    }
    
    public double total(){
        discjasa = getjasa() - (getjasa() * setdiskon());
        discproduk = getproduk() - (getproduk() * getpotongan());
        total = discjasa + discproduk;
        return total;
    }
    
}
