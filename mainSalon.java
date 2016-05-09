/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon;

import java.util.Scanner;

/**
 *
 * @author Acer-pc
 */
public class mainSalon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Scanner inn = new Scanner(System.in);
        
        int diskon,hargaJasa = 0,hargaProduk = 0,jumlahProduk = 0,pilih;
        String jasa = null, pilih2,pilih3,member;
        
        System.out.print("Masukan Diskon Produk Hari Ini :");
        diskon = in.nextInt();
        
        System.out.println("\n=======================");
        System.out.println("   Selamat Datang DI   ");
        System.out.println("Salon Kecantikan Mastin");
        System.out.println("=======================");
        System.out.println("1. Jasa Kecantikan");
        System.out.println("   a. Creambath     25K");
        System.out.println("   b. Lulur         50K");
        System.out.println("2. Produk Kecantikan");
        System.out.println("   a. Vitamin       15K");
        System.out.println("   b. Shampoo       10K");
        System.out.println("=======================");
        System.out.print("Masukan Pilihan Anda :");
        pilih = in.nextInt();
        
        switch(pilih){
            case 1:
                System.out.println("\nAnda Memimilih : \n\"Jasa Kecantikan\"");
                System.out.println("   a. Creambath");
                System.out.println("   b. Lulur");
                System.out.print("Pilih Jasa :");
                jasa = inn.nextLine();
                
                if(jasa.equalsIgnoreCase("Creambath")||jasa.equalsIgnoreCase("a"))
                    hargaJasa = 25000;
                else if(jasa.equalsIgnoreCase("Lulur")||jasa.equalsIgnoreCase("b"))
                    hargaJasa = 50000;
                else
                    System.out.println("Menu Tidak Tersedia");
                
                System.out.print("\nMembeli Produk ?(y/n)");
                pilih3 = inn.nextLine();
                
                if(pilih3.equalsIgnoreCase("y")){
                    System.out.println("\n\"Produk Kecantikan\"");
                    System.out.println("   a. Vitamin       15K");
                    System.out.println("   b. Shampoo       10K");
                    System.out.print("Pilih Jasa :");
                    jasa = inn.nextLine();
                
                    if(jasa.equalsIgnoreCase("Vitamin")||jasa.equalsIgnoreCase("a"))
                        hargaProduk = 15000;
                    else if(jasa.equalsIgnoreCase("Shampoo")||jasa.equalsIgnoreCase("b"))
                        hargaProduk = 10000;
                    else
                        System.out.println("Menu Tidak Tersedia");
                
                    System.out.print("Masukan Banyak Barang :");
                    jumlahProduk = in.nextInt();
                }
                
                break;
            case 2:
                System.out.println("\nAnda Memimilih : \n\"Produk Kecantikan\"");
                System.out.println("   a. Vitamin       15K");
                System.out.println("   b. Shampoo       10K");
                System.out.print("Pilih Jasa :");
                jasa = inn.nextLine();
                
                if(jasa.equalsIgnoreCase("Vitamin")||jasa.equalsIgnoreCase("a"))
                    hargaProduk = 15000;
                else if(jasa.equalsIgnoreCase("Shampoo")||jasa.equalsIgnoreCase("b"))
                    hargaProduk = 10000;
                else
                    System.out.println("Menu Tidak Tersedia");
                
                System.out.print("Masukan Banyak Barang :");
                jumlahProduk = in.nextInt();
                
                break;
            default :
                System.out.println("Menu Tidak Tersedia");
                break;
                   
        }
        
        System.out.print("\nApakah Anda Angota ?(y/n):");
        pilih2 = inn.nextLine();
        
        if(pilih2.equalsIgnoreCase("y")){
            System.out.println("Daftar Jenis Keanggotaan:");
            System.out.println("1.Premium");
            System.out.println("2.Gold");
            System.out.println("3.Silver");
            System.out.print("Masukan Jenis Keanggotan Anda:");
            member = inn.nextLine();
            
            Premium premium = new Premium(25000,50000,15000,10000);
            Gold gold = new Gold(25000,50000,15000,10000);
            Silver silver = new Silver(25000,50000,15000,10000);
            
            if(member.equalsIgnoreCase("premium")||member.equalsIgnoreCase("1")){
                 premium.diskonJasa(hargaJasa);
                premium.setDiskonProduk(diskon);
                
                if(jasa.equalsIgnoreCase("Vitamin")||jasa.equalsIgnoreCase("a")){
                    premium.setJumlahVitamin(jumlahProduk);
                    premium.setJumlahShampoo(0);
                }
                    
                else if(jasa.equalsIgnoreCase("Shampoo")||jasa.equalsIgnoreCase("b")){
                    premium.setJumlahVitamin(0);
                    premium.setJumlahShampoo(jumlahProduk);
                }
                
                
                System.out.println("\nSALON KECANTIKAN MASTIN");
                System.out.println("Harga Bayar  :");
                System.out.println("Harga Jasa   :"+hargaJasa);
                System.out.println("Harga Produk :"+hargaProduk);
                System.out.println("Diskon       :");
                System.out.println("Diskon Jasa  :"+premium.diskonJasa(hargaJasa));
                System.out.println("Diskon Produk:"+premium.diskonProduk());
                System.out.println("Total Bayar  :"+((hargaJasa+hargaProduk)-(premium.diskonProduk()+premium.diskonJasa(hargaJasa))));
                
            }
            
            else if(member.equalsIgnoreCase("gold")||member.equalsIgnoreCase("2")){
               
                gold.setDiskonProduk(diskon);
                
                if(jasa.equalsIgnoreCase("Vitamin")||jasa.equalsIgnoreCase("a")){
                    gold.setJumlahVitamin(jumlahProduk);
                    gold.setJumlahShampoo(0);
                }
                    
                else if(jasa.equalsIgnoreCase("Shampoo")||jasa.equalsIgnoreCase("b")){
                    gold.setJumlahVitamin(0);
                    gold.setJumlahShampoo(jumlahProduk);
                }
                
                System.out.println("\nSALON KECANTIKAN MASTIN");
                System.out.println("Harga Bayar  :");
                System.out.println("Harga Jasa   :"+hargaJasa);
                System.out.println("Harga Produk :"+hargaProduk);
                System.out.println("Diskon       :");
                System.out.println("Diskon Produk:"+gold.diskonProduk());
                System.out.println("Diskon Jasa  :"+gold.diskonJasa(hargaJasa));
                System.out.println("Total Bayar  :"+((hargaJasa+hargaProduk)-(gold.diskonProduk()+gold.diskonJasa(hargaJasa))));
            }
            
            else if(member.equalsIgnoreCase("silver")||member.equalsIgnoreCase("3")){
               
                silver.setDiskonProduk(diskon);
                
                if(jasa.equalsIgnoreCase("Vitamin")||jasa.equalsIgnoreCase("a")){
                    silver.setJumlahVitamin(jumlahProduk);
                    silver.setJumlahShampoo(0);
                }
                    
                else if(jasa.equalsIgnoreCase("Shampoo")||jasa.equalsIgnoreCase("b")){
                    silver.setJumlahVitamin(0);
                    silver.setJumlahShampoo(jumlahProduk);
                }
                
                System.out.println("\nSALON KECANTIKAN MASTIN");
                System.out.println("Harga Bayar  :");
                System.out.println("Harga Jasa   :"+hargaJasa);
                System.out.println("Harga Produk :"+hargaProduk);
                System.out.println("Diskon       :");
                System.out.println("Diskon Produk:"+silver.diskonProduk());
                System.out.println("Diskon Jasa  :"+silver.diskonJasa(hargaJasa));
                System.out.println("Total Bayar  :"+((hargaJasa+hargaProduk)-(silver.diskonProduk()+silver.diskonJasa(hargaJasa))));
               
            }
            
        }
        
        else{
            BukanAnggota BA = new BukanAnggota(25000,50000,15000,10000);
            
            if(jasa.equalsIgnoreCase("Vitamin")||jasa.equalsIgnoreCase("a")){
                    BA.setJumlahVitamin(jumlahProduk);
                    BA.setJumlahShampoo(0);
            }
                    
            else if(jasa.equalsIgnoreCase("Shampoo")||jasa.equalsIgnoreCase("b")){
                    BA.setJumlahVitamin(0);
                    BA.setJumlahShampoo(jumlahProduk);
            }
            System.out.println("\nSALON KECANTIKAN MASTIN");
            System.out.println("Harga Bayar  :");
            System.out.println("Harga Jasa   :"+hargaJasa);
            System.out.println("Harga Produk :"+hargaProduk);
            System.out.println("Diskon       :");
            System.out.println("Diskon Produk:"+BA.diskonProduk());
            System.out.println("Diskon Jasa  :"+BA.diskonJasa(hargaJasa));
            System.out.println("Total Bayar  :"+(hargaJasa+hargaProduk));
        }
            
           
               
                
                
               
                
                
        
        
        
 
    }
    
}
