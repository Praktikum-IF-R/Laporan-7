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
public class silver extends salon {
    private double diskonanggota,total;
    public silver(int bm, int bc, int bk, int bs, double js, int dskn) {
        super(bm, bc, bk, bs, js, dskn);
    }
    public double getdiskonanggota() {
        diskonanggota=(super.gettotal()-super.getdiskonbarang())*20/100;
        return diskonanggota;
    }
    public double gettotalsemua() {
        total=super.gettotal()-super.getdiskonbarang()-getdiskonanggota();
        return total;
    }
    public void display() {
        System.out.println("diskon promo anggota hari ini sebesar   : "+super.getdiskonbarang());
        System.out.println("diskon anggota silver sebesar           : "+diskonanggota);
        System.out.println("total yang dibayarkan sebesar           : "+gettotalsemua());
        System.out.println("---------------------------------------------------------");
        System.out.println("terimakasih telah datang ke salon kami");
        System.out.println("---------------------------------------------------------");
    }
}
