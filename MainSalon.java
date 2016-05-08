package Bab7LP2;

import java.util.Scanner;
public class MainSalon {
    public static void main(String[] args){
        Scanner fd = new Scanner(System.in);
        int sb=0, sh=0, ct=0, lt=0;
        int ck=0, pj=0, cr=0, ctr=0;
        int jasa, angka;
        long dscpr=0, dscgl=0, dscsl=0, dscgt=0, jasalon=0;
        
        System.out.println("===============FD BARBER SHOP===============");
        System.out.println("Jasa : ");
        System.out.println("1. Cukur Rambut\t\t Rp. 20000,-");
        System.out.println("2. Pijat\t\t Rp. 40000,-");
        System.out.println("3. Creambath\t\t Rp. 32000,-");
        System.out.println("4. Cat Rambut\t\t Rp. 125000,-\n");
        String pil1;
        do{
        System.out.print("Pilihan Jasa (Jika tidak ada masukkan selain 1-4) : ");
        int piljasa = fd.nextInt();
        switch(piljasa){
            case 1 : ck = 20000; break;
            case 2 : pj = 40000; break;
            case 3 : cr = 32000; break;
            case 4 : ctr = 125000; break;
            default : break;
            }
          System.out.print("Ada lagi? (Y/N) : ");
          pil1 = fd.next();
          jasa = ck+pj+cr+ctr;
        }while(pil1.equalsIgnoreCase("Y"));
        System.out.println("Produk : ");
        System.out.println("1. Sabun anti Kuman\t\t Rp. 25000,-");
        System.out.println("2. Shampoo anti Kutu\t\t Rp. 50000,-");
        System.out.println("3. Conditioner penghilang Kutu\t Rp. 35000,-");
        System.out.println("4. Lotion pemutih\t\t Rp. 60000,-\n");
        String pil2;
        do{
        System.out.print("Pilihan produk (Jika tidak ada masukkan selain 1-4) : ");
        int pil = fd.nextInt();
        switch(pil){
            case 1 :
                System.out.println("Anda akan membeli produk Sabun anti Kuman.");
                System.out.print("Jumlah yang dibeli : ");
                sb = fd.nextInt();
                break;
            case 2 :
                System.out.println("Anda akan membeli produk Shampoo anti Kutu.");
                System.out.print("Jumlah yang dibeli : ");
                sh = fd.nextInt();
                break;
            case 3 :
                System.out.println("Anda akan membeli produk Conditioner penghilang Kutu.");
                System.out.print("Jumlah yang dibeli : ");
                ct = fd.nextInt();
                break;
            case 4 :
                System.out.println("Anda akan membeli produk Lotion pemutih.");
                System.out.print("Jumlah yang dibeli : ");
                lt = fd.nextInt();
                break;
            default : break;
            }
            System.out.print("Ada produk lain yang ingin dibeli? (Y/N) : ");
            pil2 = fd.next();
        }while(pil2.equalsIgnoreCase("Y"));
        Premium pr = new Premium(sb, sh, ct, lt);
        Gold gl = new Gold(sb, sh, ct, lt);
        Silver sl = new Silver(sb, sh, ct, lt);
        Guest gt = new Guest(sb, sh, ct, lt);
    System.out.print("\nMasukkan angka(1-100) : ");
    angka = fd.nextInt();
    if(angka>=1 || angka<=25 || angka>=51 || angka<=75){
        jasalon = jasa-(jasa*10/100);
        dscpr = (pr.HargaTotal()-(gt.HargaTotal() * 10/100))+(jasalon-(jasalon*20/100));
        dscgl = (gl.HargaTotal()-(gt.HargaTotal() * 10/100))+(jasalon-(jasalon*15/100));
        dscsl = (sl.HargaTotal()-(gt.HargaTotal() * 10/100))+(jasalon-(jasalon*10/100));
        dscgt = (gt.HargaTotal()-(gt.HargaTotal() * 10/100))+jasalon;
        System.out.println("Selamat! Anda mendapatkan tambahan diskon 10%");
    }
    else if (angka >25 || angka <51 || angka>75 || angka<=100){
        dscpr = pr.HargaTotal()+(jasa-(jasa*20/100));
        dscgl = gl.HargaTotal()+(jasa-(jasa*15/100));
        dscsl = sl.HargaTotal()+(jasa-(jasa*10/100));
        dscgt = gt.HargaTotal()+jasa;
    }
    System.out.println("\n=======Pilihan Member=======");
    System.out.println("1. Premium (20% Disc)");
    System.out.println("2. Gold (15% Disc)");
    System.out.println("3. Silver (10% Disc)");
    System.out.println("4. Non-member\n");
    System.out.print("Jenis member : ");
    int member = fd.nextInt();
        switch(member){
            case 1 :
               System.out.println("Total yang harus dibayar : "+"Rp. "+dscpr+",-");
               break;
            case 2 :
               System.out.println("Total yang harus dibayar : "+"Rp. "+dscgl+",-");
               break; 
            case 3 :
               System.out.println("Total yang harus dibayar : "+"Rp. "+dscsl+",-");
               break; 
            case 4 :
               System.out.println("Total yang harus dibayar : "+"Rp. "+dscgt+",-");
               break; 
        }
    System.out.println("=====THANK YOU FOR COMING=====");
    }
    
}
