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
public abstract class Salon {

    private double diskonsalon;
    private String kartu;
    private double totalharga;
    private double jumlah;
    private int harga;
    

    public Salon( double jumlah) {
        
        this.jumlah = jumlah;
    }
    public double getjumlah(){
        return jumlah;
    }
 public int getHarga() {
        return harga;
    }
 
    public void setHarga(int harga) {
        this.harga = harga;
    }

     

    

    public double diskonsalon() {
        diskonsalon = 0.1;
        double diskon = diskonsalon * harga*jumlah;
        return diskon;
    }

    public abstract double diskon();

    public abstract double pembayaran();

}
