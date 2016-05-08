
package salon;

import java.util.*;
public class MainSalon {
    public static void main(String[] args) {
        double hargajasa = 0, hargaproduk = 0;
        int pilih,pilih1;
        String pil1,lagi;
        Scanner in = new Scanner (System.in);
        System.out.println("============= MUSLIMAH SALON ==============");
        System.out.print("Masukkan nama: ");
        String nama= in.next();
        System.out.print("Apakah anda ingin mencoba layanan jasa kami? (y/n):  ");
        String pil= in.next();
        if (pil.equalsIgnoreCase("y")){
            System.out.println("    DAFTAR LAYANAN PRODUK   ");
            System.out.println("1. Potong               Rp 35.000");
            System.out.println("2. Creambath            Rp 70.000");
            System.out.println("3. Potong + Creambath   Rp 150.000");
            System.out.println("4. Colouring            Rp 80.000");
            System.out.println("5. Smoothing            Rp 120.000");
            do{
                System.out.print("Masukkan pilihan jasa perawatan anda: ");
                pilih= in.nextInt();
                switch (pilih){
                    case 1: hargajasa+=35000;break;
                    case 2: hargajasa+=70000;break;
                    case 3: hargajasa+=150000;break;
                    case 4: hargajasa+=80000;break;
                    case 5: hargajasa+=120000;break;
                    default: System.out.println("Pilihan tidak ada! ");
                }
                System.out.print("Anda ingin mencoba kembali jasa kami? (y/n) ");
                pil1= in.next();
            } while (pil1.equalsIgnoreCase("y"));
            System.out.println();
            System.out.print("Apakah anda ingin membeli produk kami? (y/n):  ");
            String pil2= in.next();
                if (pil2.equalsIgnoreCase("y")){
                    System.out.println("    DAFTAR PRODUK SALON     ");
                    System.out.println("1. Shampoo      Rp 80000 ");
                    System.out.println("2. Conditioner  Rp 85000 ");
                    System.out.println("3. Hair Tonic   Rp 90000 ");
                    System.out.println("4. Hair Vitamin Rp 100000");
                        do{
                            System.out.print("Masukkan pilihan produk kami : ");
                            pilih1= in.nextInt();
                            switch (pilih1){
                                case 1: hargaproduk+=80000;break;
                                case 2: hargaproduk+=85000;break;
                                case 3: hargaproduk+=90000;break;
                                case 4: hargaproduk+=100000;break;
                                default : System.out.println("Pilihan tidak ada, coba memilih layanan jasa yang tersedia ! ");
                            }
                            System.out.print("Anda ingin memilih produk kami lagi ? (y/n) : ");
                            lagi= in.next();
                        } while (lagi.equalsIgnoreCase("y"));
                }
                else {
                    System.out.println("Anda tidak membeli produk jasa dari salon kecantikan kami ");
                }
        }
        else {
            System.out.println("Anda tidak membeli produk jasa dari salon kecantikan kami sehingga anda tidak dapat membeli produk kami");
            System.exit(0);
        }
        System.out.println("        TIPE MEMBER         ");
        System.out.println("1. Non Member");
        System.out.println("2. Silver   ");
        System.out.println("3. Gold     ");
        System.out.println("4. Premium  ");
        System.out.print("Masukkan tipe member anda : ");
        String type = in.next();
        double disc;
        switch (type){
            case "4" : System.out.println("ANDA MEMILIKI MEMBER PREMIUM");
                     Premium p= new Premium(nama,type,hargaproduk,hargajasa);
                     p.getHargaJasa();
                     p.getHargaBarang();
                     System.out.print("Diskon: ");
                     disc= in.nextDouble();
                     p.setDiskon(disc);
                     p.Diskon();
                     p.DisMember();
                     p.Total();
                     p.execute();break;
            case "3" : System.out.println("ANDA MEMILIKI MEMBER GOLD ");
                        Gold g = new Gold (nama,type,hargaproduk,hargajasa);
                        g.getHargaJasa();
                        g.getHargaBarang();
                        System.out.print("Diskon: ");
                        disc= in.nextDouble();
                        g.setDiskon(disc);
                        g.Diskon();
                        g.DisMember();
                        g.Total();
                        g.execute();break;
            case "2" : System.out.println("ANDA MEMILIKI SILVER ");
                        Silver s = new Silver(nama,type,hargaproduk,hargajasa);
                        s.getHargaJasa();
                        s.getHargaBarang();
                        System.out.print("Diskon: ");
                        disc= in.nextDouble();
                        s.setDiskon(disc);
                        s.Diskon();
                        s.DisMember();
                        s.Total();
                        s.execute(); break;
            case "1" : System.out.println("ANDA TIDAK MEMILIKI MEMBER ");
                        NonMember n= new NonMember(nama,type,hargaproduk,hargajasa);
                        n.getHargaJasa();
                        n.getHargaBarang();
                        System.out.print("Diskon: ");
                        disc= in.nextDouble();
                        n.setDiskon(disc);
                        n.Diskon();
                        n.DisMember();
                        n.Total();
                        n.execute(); break;
            default : System.out.println("Pilihan tidak ada, coba memilih produk yang lain ! ");
        }
    }
    
}
