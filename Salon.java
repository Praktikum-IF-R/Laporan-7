/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan7;

/**
 *
 * @author Lenovo
 */
public abstract class Salon {

    private int barang,pelayanan;
    private double diskonbarang, totalsementara;
    public void setBarang(int a){
        barang = a;
    }
    public int getBarang(){
        return barang;
    }
    public void setDiskonBarang(double a){
        diskonbarang = a;
    }
    public double getDiskonBarang(){
        return diskonbarang;
    }
    public double DiskonBarang(){
        return getDiskonBarang()*getBarang();
    }
    public void setPelayanan(int a){
        pelayanan = a;
    }
    public int getPelayanan(){
        return pelayanan;
    }
    public double TotalSementara(){
        return (getBarang() - DiskonBarang()) + getPelayanan();
    }
    public double TotalSementara1(){
        return getBarang() - DiskonBarang();
    }
    public abstract double Diskon();
    public abstract double Total();
    public abstract double Diskon1();
    public abstract double Total1();
    //public abstract void Keanggotaan();
    
}
