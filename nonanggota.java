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
public class nonanggota extends salon{

    public nonanggota(int bm, int bc, int bk, int bs, double js, int dskn) {
        super(bm, bc, bk, bs, js, dskn);
    }
    public double gettotalsemua() {
        return super.gettotal();
    }
    public void display() {
        System.out.println("total yang dibayarkan sebesar           : "+gettotalsemua());
        System.out.println("---------------------------------------------------------");
        System.out.println("terimakasih telah datang ke salon kami");
        System.out.println("---------------------------------------------------------");
    }
    
}
