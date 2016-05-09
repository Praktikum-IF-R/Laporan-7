package bab7;
import java.util.*;
public class Bab7 {
    public static void main(String[] args) {
        Bab7 m = new Bab7();
        m.Pembayaran();}
    public String [] pelayanan = {"Cukur","Keramas","Smoothing"};
    public double [] HargaPelayanan = {35000,50000,75000};
    public String [] produk = {"Masker", "Pomade", "Sisir"};
    public double [] HargaProduk = {30000,190000,50000};
    public double jumlah, jumlah1;
    public String pilih;
    public int input, pilihan,MemberCard, member;
    
    public void Pelayanan (){
        Scanner in=new Scanner(System.in);
        do{
        System.out.println("Daftar Layanan Salon Brawijaya");
        System.out.println("1. Cukur            | Rp.35000,-");
        System.out.println("2. Keramas          | Rp.50000,-");
        System.out.println("3. Smoothing        | Rp.75000,-");
        System.out.print("Pilih Layanan       : ");
        pilih = in.next();
            for (int i = 0; i < 3; i++) {
                if (pilih.equalsIgnoreCase(pelayanan[i])) {
                    System.out.println("Harga Layanan Rp."+HargaPelayanan[i]+",-");}}

            for (int i = 0; i < pelayanan.length; i++) {
                if (pilih.equalsIgnoreCase(pelayanan[i])) {
                    jumlah += HargaPelayanan[i];break;}}

            System.out.println("Pilih Layanan Kembali ? (1. Ya | 2. Tidak)");
            System.out.print("Input Pilihan: ");
            input = in.nextInt();
        }while (input !=2);}
    
    public void Produk (){
        Scanner in=new Scanner(System.in);
        do{
        System.out.println("Daftar Produk Salon Brawijaya");
        System.out.println("1. Masker           | Rp. 30000,-");
        System.out.println("2. Pomade           | Rp.190000,-");
        System.out.println("3. Sisir            | Rp. 50000,-");
        System.out.print("Pilih Produk        : ");
        pilih = in.next();
            for (int i = 0; i < 3; i++) {
                if (pilih.equalsIgnoreCase(produk[i])) {
                    System.out.println("Harga Produk Salon Brawijaya Rp."+HargaProduk[i]+",-");}}
            
            for (int i = 0; i < produk.length; i++) {
                if (pilih.equalsIgnoreCase(produk[i])) {
                    jumlah1 += HargaProduk[i];break;}}

            System.out.println("Beli Produk Kembali? (1.Ya | 2. Tidak)");
            System.out.print("Input Pilihan: ");
            input = in.nextInt();
        }while (input !=2);}
    
    public void Pembayaran(){
        Scanner in=new Scanner(System.in);
        Salon P = new Premium() {};
        Salon G = new Gold() {};
        Salon S = new Silver() {};
        Salon z = new nonAnggota ();
        
        do{
            System.out.println("Salon Brawijaya");
            System.out.println("1. Layanan");
            System.out.println("2. Produk");
            System.out.print("Masukkan Inputan: ");
            pilihan = in.nextInt();
            if (pilihan == 1) {
                Pelayanan();
            }else if(pilihan == 2){
                Produk();
            }else{
                System.out.println("Inputan Salah");}
            
            System.out.println();
            System.out.println("Apakah Anda ingin memilih lagi? (1.Ya | 2.Tidak)");
            System.out.print("Masukkan Inputan: ");
            input = in.nextInt();        
        }while(input !=2);
        
        double jmlh = jumlah + jumlah1;
        double bayar, total;
        System.out.println("==================================================");
        System.out.println("Apakah Anda Memiliki Kartu Member? (1.Ya | 2.Tidak)");
        System.out.print("Masukkan Inputan: ");
        MemberCard = in.nextInt();
        if (MemberCard == 1) {
            System.out.println("Jenis Kartu Anggota");
            System.out.println("1. Premium");
            System.out.println("2. Gold");
            System.out.println("3. Silver");
            System.out.print("Masukkan Pilihan: ");
            member = in.nextInt();
            switch(member){
                case 1: total = jmlh * P.Diskon();
                        bayar = jmlh - total;
                        System.out.println("Total yang Harus dibayarkan :Rp."+bayar+",-");break;
                case 2: total = jmlh * G.Diskon();
                        bayar = jmlh - total;
                        System.out.println("Total yang Harus dibayarkan :Rp."+bayar+",-");break;
                case 3: total = jmlh * S.Diskon();
                        bayar = jmlh - total;
                        System.out.println("Total yang Harus dibayarkan :Rp."+bayar+",-");break;    
                default: System.out.println("Inputan Salah");}    
        }else{
            bayar = jmlh;
            System.out.println("Total yang Harus dibayarkan :Rp."+bayar+",-");
            System.out.println("==================================================");
        }
    }
    
}
