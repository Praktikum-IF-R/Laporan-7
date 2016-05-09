/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum7;

/**
 *
 * @author Lenovo
 */
public abstract class salon {
    private final int masker,cat,kutek,sampo;
    private int bm,bc,bk,bs;
    private double diskon,totalbarang,jasa;
    public salon(int bm,int bc, int bk, int bs,double js,int dskn){
        masker =25000;
        cat=100000;
        kutek=15000;
        sampo=30000;
        this.bm=bm;
        this.bc=bc;
        this.bk=bk;
        this.bs=bs;
        jasa=js;
        diskon=dskn;
    }
    public double gettotalbarang(){
        totalbarang=(masker*bm)+(cat*bc)+(kutek*bk)+(sampo*bs);
        return totalbarang;
    }
    public double getdiskonbarang(){
        return gettotalbarang()*diskon/100;
    }
    public double getjasa(){
        return jasa;
    }
    public double gettotal(){
        return getjasa()+gettotalbarang();
    }
    public abstract double gettotalsemua();
    public abstract void display();
}
