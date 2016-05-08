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
public class silver extends Salon {


    public silver(double jumlah) {
        super(jumlah);
    }

  
  public double total(){
       double total= super.getHarga()*super.getjumlah();
       return total;
   }
 
    @Override
    public double diskon() {
        
        double diskonsil = 0.1* total();
        return diskonsil;
    }

    public void tampil4() {
        System.out.println("total pembayaran      : " +total());
        System.out.println("setelah diskon salon  : " + diskonsalon());
        System.out.println("setelah diskon silver : " + diskon());
        System.out.println("pembayaran            : "+pembayaran());
    }
@Override
    public double pembayaran() {
        double pembayaran=total()-diskonsalon()-diskon();
        return pembayaran;
    }
}
