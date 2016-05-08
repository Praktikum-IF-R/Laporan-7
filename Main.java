/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7;

/**
 *
 * @author imgeek
 */
import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        double harga=0; int pilih=0;
        Scanner in= new Scanner(System.in);
        System.out.println("==================SALON PAS=================");
        System.out.print("Input Nama : ");
        String nama= in.next();
        System.out.println();
        System.out.println("Layanan : ");
        System.out.println("1. Potong Rambut : Rp.90000");
        System.out.println("2. Lulur         : Rp. 110000");
        System.out.println("3. Keramas       : Rp. 40000");
        System.out.println("4. Menu Selanjutnya");
        do{
            System.out.print("Input layanan : ");
            pilih= in.nextInt();
            switch(pilih){
                case 1:
                    harga+=90000;
                    break;
                case 2: harga+=110000;
                    break;
                case 3: harga+=40000;
                break;
                default:
            }
        
        }while(pilih!=4);
        System.out.println("------------------------------------------------");
        System.out.println("Produk : ");
        System.out.println("1. Shampo : Rp.20000");
        System.out.println("2. Masker : Rp.40000");
        System.out.println("3. Selesai");
        do{
            System.out.print("Produk yang ingin anda beli : ");
            pilih=in.nextInt();
            switch(pilih){
                case 1: harga+=20000;
                    break;
                case 2: harga+=40000;
                    break;
                default :
            }
        
        }while(pilih!=3);
        System.out.println("------------------------------------------------");
        System.out.println("KEANGGOTAAN : ");
        System.out.println("1. Premium");
        System.out.println("2. Gold");
        System.out.println("3. Silver");
        System.out.println("4. Bukan anggota");
        System.out.print("Input Keanggotaan anda : ");
        int anggota= in.nextInt();
        switch(anggota){
            case 1: Produk pre= new Premium();
                System.out.println("nama : " +nama);
                pre.getHarga(harga); break;
            case 2 : Produk gold= new Gold();
                System.out.println("nama : " + nama);
                gold.getHarga(harga);break;
            case 3: Produk silver= new Silver();
                System.out.println("nama : " +nama);
                silver.getHarga(harga); break;
            case 4: Produk bukan = new Non();
                System.out.println("nama : " + nama);
                bukan.getHarga(harga); break;
        }
        System.out.println("===================================================");
    }
}
