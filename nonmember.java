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
public class nonmember extends Salon{
private double diskon;

    public nonmember(double jumlah) {
        super(jumlah);
    }

   

    public double total(){
       double total= super.getHarga()*super.getjumlah();
       return total;
   }
   

    @Override
    public double diskon() {
        diskon=0;
        return 0;
    }
    
    public void tampil5(){
        System.out.println("total pembayaran      : " +total());
        System.out.println("setelah diskon salon  : " + diskonsalon());
        System.out.println("pembayaran            : "+pembayaran());
    }
    @Override
    public double pembayaran() {
        double pembayaran=total()-diskonsalon()-diskon();
        return pembayaran;
    }
}
