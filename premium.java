/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon;

/**
 *
 * @author LENY
 */
public class premium extends Salon {

    

    public premium(double jumlah) {
        super(jumlah);
    }

    
 public double total(){
       double total= super.getHarga()*super.getjumlah();
       return total;
   }
    @Override
    public double diskon() {
        double diskonpre = 0.2 * total();
        return diskonpre;
    }
    

    public void tampil2() {
        System.out.println("total pembayaran      : " +total());
        System.out.println("diskon salon          : " + diskonsalon());
        System.out.println("diskon premium        : " + diskon());
        System.out.println("pembayaran            : "+pembayaran());
    }

    @Override
    public double pembayaran() {
        double pembayaran=total()-diskonsalon()-diskon();
        return pembayaran;
    }

}
