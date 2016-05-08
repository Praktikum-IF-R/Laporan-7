/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lappolymorph;
import java.util.Scanner;
/**
 *
 * @author ANITA
 */
public class LapPolymorph {
    public static void main(String[] args) {
        double d;
        int pil, produk, jasa, disc;
        
        Scanner in = new Scanner(System.in);
        premium p = new premium();
        gold g = new gold();
        silver s = new silver();
        
        System.out.println("-----------------------------------");
        System.out.println("        SALON KECANTIKAN");
        System.out.println("-----------------------------------");
        System.out.println("        JENIS KEANGGOTAAN");
        System.out.println("1. Premium");
        System.out.println("2. Gold");
        System.out.println("3. Silver");
        System.out.println("4. Umum (Bukan Anggota)");
        System.out.print("Pilihan     : ");
        pil=in.nextInt();
        System.out.println("-----------------------------------");
        if (pil == 1){
            System.out.println("   JENIS KEANGGOTAAN : PREMIUM");
            System.out.println(" ANDA MENDAPAT POTONGAN SEBESAR 20%");
            System.out.println("");
            System.out.print("Pelayanan         = Rp ");
            jasa = in.nextInt();
            p.setjasa(jasa);
            System.out.print("Pembelian produk  = Rp ");
            produk = in.nextInt();
            p.setproduk(produk);
            System.out.print("Tambahan discount = ");
            disc = in.nextInt();
            p.setpotongan(disc);
            System.out.println("");
            System.out.print("TOTAL PEMBAYARAN  : Rp ");
            System.out.println(p.total());
            System.out.println("-----------------------------------");
        } else if (pil == 2){
            System.out.println("     JENIS KEANGGOTAAN : GOLD");
            System.out.println(" ANDA MENDAPAT POTONGAN SEBESAR 15%");
            System.out.println("");
            System.out.print("Pelayanan         = Rp ");
            jasa = in.nextInt();
            g.setjasa(jasa);
            System.out.print("Pembelian produk  = Rp ");
            produk = in.nextInt();
            g.setproduk(produk);
            System.out.print("Tambahan discount = ");
            disc = in.nextInt();
            g.setpotongan(disc);
            System.out.println("");
            System.out.print("TOTAL PEMBAYARAN  : Rp ");
            System.out.println(g.total());
            System.out.println("-----------------------------------");
        } else if (pil == 3){
            System.out.println("    JENIS KEANGGOTAAN : SILVER");
            System.out.println(" ANDA MENDAPAT POTONGAN SEBESAR 10%");
            System.out.println("");
            System.out.print("Pelayanan         = Rp ");
            jasa = in.nextInt();
            s.setjasa(jasa);
            System.out.print("Pembelian produk  = Rp ");
            produk = in.nextInt();
            s.setproduk(produk);;
            System.out.print("Tambahan discount = ");
            disc = in.nextInt();
            s.setpotongan(disc);
            System.out.println("");
            System.out.print("TOTAL PEMBAYARAN  : Rp ");
            System.out.println(s.total());
            System.out.println("-----------------------------------");
        } else if (pil == 4){
            System.out.println("JENIS KEANGGOTAAN : UMUM (BUKAN ANGGOTA)");
            System.out.println(" ANDA TIDAK MENDAPAT POTONGAN HARGA");
            System.out.println("");
            System.out.print("Pelayanan         = Rp ");
            jasa = in.nextInt();
            System.out.print("Pembelian produk  = Rp ");
            produk = in.nextInt();
            System.out.print("Tambahan discount = ");
            disc = in.nextInt();
            System.out.println("");
                double potongan = produk - (produk * (disc/100));
                double total = jasa + potongan;
            System.out.print("TOTAL PEMBAYARAN  : Rp ");
            System.out.println(total);
            System.out.println("-----------------------------------");
        } else {
            System.out.println("       *** TERIMA KASIH ***");
            System.exit(0);
        }
            
    }
    
}
