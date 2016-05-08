package Polimorfisme;
import java.util.Scanner;
public class SalonMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil,pil1, pil2,pil3,pil4; double Produk1,Produk2,Produk3,Jasa1,Jasa2,Jasa3;
        double diskon = 0;
        double HargaProduk = 0;
        double HargaJasa = 0;
        double DiskonHariIni = 0.1;
        SalonPremium SP = new SalonPremium();
        SalonGold SG = new SalonGold();
        SalonSilver SS = new SalonSilver();
        SalonNonAnggota SNA = new SalonNonAnggota();
            do{
            System.out.println("            TOP SALON           ");
            System.out.println("--------------------------------");
            System.out.println("Diskon Hari Ini Sebesar         \t: " +DiskonHariIni+ " (10%) ");
            System.out.println("1.Premium");
            System.out.println("2.Gold");
            System.out.println("3.Silver");
            System.out.println("4.NonAnggota");
            System.out.println("5.Exit");
            System.out.print("Anda Tergolong Member Jenis     \t:");
            pil = input.nextInt();
            System.out.println("");
            if(pil==1){
                do{
                System.out.println("    PREMIUM MEMBER(20%)  ");
                System.out.println("-------------------------");
                System.out.println("DAFTAR FASILITAS");
                System.out.println("1.Produk");
                System.out.println("2.Jasa");
                System.out.println("3.Total Harga");
                System.out.println("4.Exit");
                System.out.print("Masukan Pilihan             \t:");
                pil1 = input.nextInt();
                    System.out.println("");
                
                switch(pil1){
                    case 1 : System.out.println("   DAFTAR PRODUK   ");
                             System.out.println("-------------------");
                             System.out.println("1.Pewarna Rambut           \t:Rp.50.000");
                             System.out.println("2.Shampo Metal             \t:Rp.20.000");
                             System.out.println("3.Masker Kefir             \t:Rp.70.000");
                             System.out.print("Masukan Pilihan Produk       \t:");
                             pil2 = input.nextInt();
                             if(pil2 == 1){
                                 Produk1 = 50000;
                                 SP.setHargaProduk(Produk1);
                                 SP.setProduk("Pewarna Rambut");
                             }
                             else if(pil2 == 2){
                                 Produk2 = 20000;
                                 SP.setHargaProduk(Produk2);
                                 SP.setProduk("Sahmpo Metal");
                             }
                             else if(pil2 == 3){
                                 Produk3 = 70000;
                                 SP.setHargaProduk(Produk3);
                                 SP.setProduk("Masker Kefir");
                             }
                             else{
                                 System.out.println("Pilihan Tidak Ada");
                             }
                             System.out.println("");
                             break;
                    case 2 : System.out.println("   DAFTAR JASA YANG DI TAWARKAN    ");
                             System.out.println("-----------------------------------");
                             System.out.println("1.Potong Rambut            \t:Rp.20.000");
                             System.out.println("2.Hair Colour              \t:Rp.50.000");
                             System.out.println("3.Creambath                \t:Rp.30.000");
                             System.out.print("Masukan Pilihan Jasa         \t:");
                             pil3 = input.nextInt();
                             if(pil3 == 1){
                                 Jasa1 = 20000;
                                 SP.setHargaJasa(Jasa1);
                                 SP.setJasa("Potong Rambut");
                             }
                             else if(pil3 == 2){
                                 Jasa2 = 50000;
                                 SP.setHargaJasa(Jasa2);
                                 SP.setJasa("Hair Colour");
                             }
                             else if(pil3 == 3){
                                 Jasa3 = 30000;
                                 SP.setHargaJasa(Jasa3);
                                 SP.setJasa("Creambath");
                             }
                             else{
                                 System.out.println("Pilihan Tidak Ada");
                             }
                             System.out.println("");
                             break;
                    case 3 :System.out.println("    TOTAL PEMBAYARAN ANDA ADALAH    ");
                            System.out.println("------------------------------------");
                            System.out.println(SP.getProduk()+"\t\t: "+SP.getHargaProduk());
                            System.out.println(SP.getJasa()+"\t\t: "+SP.getHargaJasa());
                            System.out.println("Diskon Anggota\t\t: "+SP.getDiskonAnggota());
                            System.out.println("Total Pembayaran\t: "+SP.getTotalBayar());
                            System.out.println("");
                            break;
                }
                
                }while(pil1 != 4);
                System.out.println("TERIMA KASIH TELAH MENGUNJUNGI TOP SALON");
                System.out.println("");
            }
            
            if(pil==2){
                do{
                System.out.println("    GOLD MEMBER(15%)  ");
                System.out.println("----------------------");
                System.out.println("DAFTAR FASILITAS");
                System.out.println("1.Produk");
                System.out.println("2.Jasa");
                System.out.println("3.Total Harga");
                System.out.println("4.Exit");
                System.out.print("Masukan Pilihan             \t:");
                pil1 = input.nextInt();
                
                switch(pil1){
                    case 1 : System.out.println("   DAFTAR PRODUK   ");
                             System.out.println("-------------------");
                             System.out.println("1.Pewarna Rambut           \t:Rp.50.000");
                             System.out.println("2.Shampo Metal             \t:Rp.20.000");
                             System.out.println("3.Masker Kefir             \t:Rp.70.000");
                             System.out.print("Masukan Pilihan Produk       \t:");
                             pil2 = input.nextInt();
                             if(pil2 == 1){
                                 Produk1 = 50000;
                                 SG.setHargaProduk(Produk1);
                                 SG.setProduk("Pewarna Rambut");
                             }
                             else if(pil2 == 2){
                                 Produk2 = 20000;
                                 SG.setHargaProduk(Produk2);
                                 SG.setProduk("Sahmpo Metal");
                             }
                             else if(pil2 == 3){
                                 Produk3 = 70000;
                                 SG.setHargaProduk(Produk3);
                                 SG.setProduk("Masker Kefir");
                             }
                             else{
                                 System.out.println("Pilihan Tidak Ada");
                             }
                             System.out.println("");
                             break;
                    case 2 : System.out.println("   DAFTAR JASA YANG DI TAWARKAN    ");
                             System.out.println("-----------------------------------");
                             System.out.println("1.Potong Rambut            \t:Rp.20.000");
                             System.out.println("2.Hair Colour              \t:Rp.50.000");
                             System.out.println("3.Creambath                \t:Rp.30.000");
                             System.out.print("Masukan Pilihan Jasa         \t:");
                             pil3 = input.nextInt();
                             if(pil3 == 1){
                                 Jasa1 = 20000;
                                 SG.setHargaJasa(Jasa1);
                                 SG.setJasa("Potong Rambut");
                             }
                             else if(pil3 == 2){
                                 Jasa2 = 50000;
                                 SG.setHargaJasa(Jasa2);
                                 SG.setJasa("Hair Colour");
                             }
                             else if(pil3 == 3){
                                 Jasa3 = 30000;
                                 SG.setHargaJasa(Jasa3);
                                 SG.setJasa("Creambath");
                             }
                             else{
                                 System.out.println("Pilihan Tidak Ada");
                             }
                             System.out.println("");
                             break;
                    case 3 :System.out.println("    TOTAL PEMBAYARAN ANDA ADALAH    ");
                            System.out.println("------------------------------------");
                            System.out.println(SG.getProduk()+"\t\t: "+SG.getHargaProduk());
                            System.out.println(SG.getJasa()+"\t\t: "+SG.getHargaJasa());
                            System.out.println("Diskon Anggota\t\t: "+SG.getDiskonAnggota());
                            System.out.println("Total Pembayaran\t: "+SG.getTotalBayar());
                            System.out.println("");
                            break;
                }
                
            
                }while(pil1 !=4);
                System.out.println("TERIMA KASIH TELAH MENGUNJUNGI TOP SALON");
                System.out.println("");
            }
            
           
            if(pil==3){
                do{
                System.out.println("    SILVER MEMBER(10%)  ");
                System.out.println("--------------------"----);
                System.out.println("DAFTAR FASILITAS");
                System.out.println("1.Produk");
                System.out.println("2.Jasa");
                System.out.println("3.Total Harga");
                System.out.println("4.Exit");
                System.out.print("Masukan Pilihan             \t:");
                pil1 = input.nextInt();
                    System.out.println("");
                
                switch(pil1){
                    case 1 : System.out.println("   DAFTAR PRODUK   ");
                             System.out.println("-------------------");
                             System.out.println("1.Pewarna Rambut           \t:Rp.50.000");
                             System.out.println("2.Shampo Metal             \t:Rp.20.000");
                             System.out.println("3.Masker Kefir             \t:Rp.70.000");
                             System.out.print("Masukan Pilihan Produk       \t:");
                             pil2 = input.nextInt();
                             if(pil2 == 1){
                                 Produk1 = 50000;
                                 SS.setHargaProduk(Produk1);
                                 SS.setProduk("Pewarna Rambut");
                             }
                             else if(pil2 == 2){
                                 Produk2 = 20000;
                                 SS.setHargaProduk(Produk2);
                                 SS.setProduk("Sahmpo Metal");
                             }
                             else if(pil2 == 3){
                                 Produk3 = 70000;
                                 SS.setHargaProduk(Produk3);
                                 SS.setProduk("Masker Kefir");
                             }
                             else{
                                 System.out.println("Pilihan Tidak Ada");
                             }
                             System.out.println("");
                             break;
                    case 2 : System.out.println("   DAFTAR JASA YANG DI TAWARKAN    ");
                             System.out.println("-----------------------------------");
                             System.out.println("1.Potong Rambut            \t:Rp.20.000");
                             System.out.println("2.Hair Colour              \t:Rp.50.000");
                             System.out.println("3.Creambath                \t:Rp.30.000");
                             System.out.print("Masukan Pilihan Jasa         \t:");
                             pil3 = input.nextInt();
                             if(pil3 == 1){
                                 Jasa1 = 20000;
                                 SS.setHargaJasa(Jasa1);
                                 SS.setJasa("Potong Rambut");
                             }
                             else if(pil3 == 2){
                                 Jasa2 = 50000;
                                 SS.setHargaJasa(Jasa2);
                                 SS.setJasa("Hair Colour");
                             }
                             else if(pil3 == 3){
                                 Jasa3 = 30000;
                                 SS.setHargaJasa(Jasa3);
                                 SS.setJasa("Creambath");
                             }
                             else{
                                 System.out.println("Pilihan Tidak Ada");
                             }
                             System.out.println("");
                             break;
                    case 3 :System.out.println("    TOTAL PEMBAYARAN ANDA ADALAH    ");
                            System.out.println("------------------------------------");
                            System.out.println(SS.getProduk()+"\t\t: "+SS.getHargaProduk());
                            System.out.println(SS.getJasa()+"\t\t: "+SS.getHargaJasa());
                            System.out.println("Diskon Anggota\t\t: "+SS.getDiskonAnggota());
                            System.out.println("Total Pembayaran\t: "+SS.getTotalBayar());
                            System.out.println("");
                            break;
                }
                
            
                }while(pil1 !=4);
                System.out.println("TERIMA KASIH TELAH MENGUNJUNGI TOP SALON");
                System.out.println("");
            }
            if(pil==4){
                do{
                System.out.println("    NON MEMBER(0%)  ");
                System.out.println("--------------------");
                System.out.println("DAFTAR FASILITAS");
                System.out.println("1.Produk");
                System.out.println("2.Jasa");
                System.out.println("3.Total Harga");
                System.out.println("4.Exit");
                System.out.print("Masukan Pilihan             \t:");
                pil1 = input.nextInt();
                    System.out.println("");
                switch(pil1){
                    case 1 : System.out.println("   DAFTAR PRODUK   ");
                             System.out.println("-------------------");
                             System.out.println("1.Pewarna Rambut           \t:Rp.50.000");
                             System.out.println("2.Shampo Metal             \t:Rp.20.000");
                             System.out.println("3.Masker Kefir             \t:Rp.70.000");
                             System.out.print("Masukan Pilihan Produk       \t:");
                             pil2 = input.nextInt();
                             if(pil2 == 1){
                                 Produk1 = 50000;
                                 SNA.setHargaProduk(Produk1);
                                 SNA.setProduk("Pewarna Rambut");
                             }
                             else if(pil2 == 2){
                                 Produk2 = 20000;
                                 SNA.setHargaProduk(Produk2);
                                 SNA.setProduk("Sahmpo Metal");
                             }
                             else if(pil2 == 3){
                                 Produk3 = 70000;
                                 SNA.setHargaProduk(Produk3);
                                 SNA.setProduk("Masker Kefir");
                             }
                             else{
                                 System.out.println("Pilihan Tidak Ada");
                             }
                             System.out.println("");
                             break;
                    case 2 : System.out.println("   DAFTAR JASA YANG DI TAWARKAN    ");
                             System.out.println("-----------------------------------");
                             System.out.println("1.Potong Rambut            \t:Rp.20.000");
                             System.out.println("2.Hair Colour              \t:Rp.50.000");
                             System.out.println("3.Creambath                \t:Rp.30.000");
                             System.out.print("Masukan Pilihan Jasa         \t:");
                             pil3 = input.nextInt();
                             if(pil3 == 1){
                                 Jasa1 = 20000;
                                 SNA.setHargaJasa(Jasa1);
                                 SNA.setJasa("Potong Rambut");
                             }
                             else if(pil3 == 2){
                                 Jasa2 = 50000;
                                 SNA.setHargaJasa(Jasa2);
                                 SNA.setJasa("Hair Colour");
                             }
                             else if(pil3 == 3){
                                 Jasa3 = 30000;
                                 SNA.setHargaJasa(Jasa3);
                                 SNA.setJasa("Creambath");
                             }
                             else{
                                 System.out.println("Pilihan Tidak Ada");
                             }
                             System.out.println("");
                             break;
                    case 3 :System.out.println("    TOTAL PEMBAYARAN ANDA ADALAH    ");
                            System.out.println("------------------------------------");
                            System.out.println(SNA.getProduk()+"\t\t: "+SNA.getHargaProduk());
                            System.out.println(SNA.getJasa()+"\t\t: "+SNA.getHargaJasa());
                            System.out.println("Diskon Anggota\t\t: "+SNA.getDiskonAnggota());
                            System.out.println("Total Pembayaran\t: "+SNA.getTotalBayar());
                            System.out.println("");
                            break;
                }
                
            
                }while(pil1 !=4);
                System.out.println("TERIMA KASIH TELAH MENGUNJUNGI TOP SALON");
                System.out.println("");
            }
            
    }while(pil !=5);
            System.out.println("EXIT FROM PROGRAM");
            }
            }

