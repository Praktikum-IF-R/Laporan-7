/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7;

/**
 *
 * @author imgeek
 */
public class Gold extends Produk {
    public void getHarga(double harga){
    System.out.println("Keanggotaan : Gold");
    System.out.println("Tagihan     : Rp." + harga);
    System.out.println("Bonus 20%   : Rp." + (harga*0.15));
    System.out.println("Total harga : Rp." + (harga-(harga*0.15)));
}
}
