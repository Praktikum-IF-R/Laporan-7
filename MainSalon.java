/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7_1;

/**
 *
 * @author Deltaviyahya
 */
public class MainSalon {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("   Data Keanggotaan Salon   ");
        System.out.println("----------------------------");
        Silver s = new Silver("Dini", "Silver");
        s.setPerawatan(100000);
        s.setProduk(100000);
        s.disc_perawatan();
        s.info_pelanggan();
        s.info_bayar();
        Gold g = new Gold("Dini", "Gold");
        g.setPerawatan(100000);
        g.setProduk(100000);
        g.disc_perawatan();
        g.info_pelanggan();
        g.info_bayar();
        Premium p = new Premium("Dini", "Premium");
        p.setPerawatan(100000);
        p.setProduk(100000);
        p.disc_perawatan();
        p.info_pelanggan();
        p.info_bayar();
        non_anggota n = new non_anggota("Dini", "Non-Anggota");
        n.setPerawatan(100000);
        n.setProduk(100000);
        n.disc_perawatan();
        n.info_pelanggan();
        n.info_bayar();
    }
}
