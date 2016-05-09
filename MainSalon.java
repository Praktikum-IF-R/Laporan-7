package laporan7;

import java.util.Scanner;

public class MainSalon {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("___________Brawijaya Salon___________");
        System.out.println("Perawatan Rambut:");
        System.out.println(" 1. Potong Rambut          Rp 15.000");
        System.out.println(" 2. Potong + Cuci Blow     Rp 35.000");
        System.out.println(" 3. Creambath              Rp 30.000");
        System.out.println(" 4. Smoothing              Rp 40.000");
        System.out.println(" 5. Coloring               Rp 150.000");
        System.out.println("Produk Kecantikan: ");
        System.out.println(" 6. Shampoo                Rp 20.000");
        System.out.println(" 7. Conditioner            Rp 30.000");
        System.out.println(" 8. Vitamin Rambut         Rp 10.000");
        System.out.println(" 9. Pewarna Rambut         Rp 60.000");
        System.out.println("=====================================");
        System.out.print("Nama Pelanggan                              : ");
        String nama = in.nextLine();
        System.out.print("Member(Gold/Premiun/Silver/Member/NonMember): ");
        String member = in.nextLine();
        System.out.print("Jumlah Produk yang Anda Pilih               : ");
        int a = Integer.parseInt(in.nextLine());
        int [] brawijaya = new int [a];
        if(member.equalsIgnoreCase("Gold")){
            Gold gold = new Gold(nama);
            int count = 0;
            for(int i = 0; i<a; i++){
                System.out.print("Masukkan pilihan Anda                       : ");
                brawijaya[count] = Integer.parseInt(in.nextLine());
                count++;
            }
            gold.setHarga(brawijaya);
            System.out.println("\n________Brawijaya Salon________");
            System.out.println("Nama         : "+gold.getNama());
            System.out.println("Status Member: Gold");
            System.out.println("------------------------------");
            gold.TampilBarang(brawijaya);
            System.out.println("(Diskon 20% + 10%)");
            System.out.println("Total Harga            Rp "+gold.Biaya());
        }
        else if(member.equalsIgnoreCase("Premium")){
            Premium premium = new Premium(nama);
            int count = 0;
            for(int i = 0; i<a; i++){
                System.out.print("Masukkan pilihan: ");
                brawijaya[count] = Integer.parseInt(in.nextLine());
                count++;
            }
            premium.setHarga(brawijaya);
            System.out.println("\n________Brawijaya Salon________");
            System.out.println("Nama         : "+premium.getNama());
            System.out.println("Status Member: Premium");
            System.out.println("------------------------------");
            premium.TampilBarang(brawijaya);
            System.out.println("(Diskon 15% + 10%)");
            System.out.println("Total Harga            Rp "+premium.Biaya());
        }
        else if(member.equalsIgnoreCase("Silver")){
            Silver silver = new Silver(nama);
            int count = 0;
            for(int i = 0; i<a; i++){
                System.out.print("Masukkan pilihan: ");
                brawijaya[count] = Integer.parseInt(in.nextLine());
                count++;
            }
            silver.setHarga(brawijaya);
            System.out.println("\n________Brawijaya Salon________");
            System.out.println("Nama             : "+silver.getNama());
            System.out.println("Status Member    : Silver");
            System.out.println("------------------------------");
            silver.TampilBarang(brawijaya);
            System.out.println("(Diskon 10% + 10%)");
            System.out.println("Total Harga            Rp "+silver.Biaya());
        }
        else if(member.equalsIgnoreCase("Member")){
            Member m = new Member(nama);
            int count = 0;
            for(int i = 0; i<a; i++){
                System.out.print("Masukkan pilihan: ");
                brawijaya[count] = Integer.parseInt(in.nextLine());
                count++;
            }
            m.setHarga(brawijaya);
            System.out.println("\n________Brawijaya Salon________");
            System.out.println("Nama             : "+m.getNama());
            System.out.println("Status Member    : Silver");
            System.out.println("------------------------------");
            m.TampilBarang(brawijaya);
            System.out.println("(Diskon 10%)");
            System.out.println("Total Harga            Rp "+m.Biaya());
        }
        if(member.equalsIgnoreCase("NonMember")){
            NonMember nm = new NonMember(nama);
            int count = 0;
            for(int i = 0; i<a; i++){
                System.out.print("Masukkan pilihan: ");
                brawijaya[count] = Integer.parseInt(in.nextLine());
                count++;
            }
            nm.setHarga(brawijaya);
            System.out.println("\n________Brawijaya Salon________");
            System.out.println("Nama         : "+nm.getNama());
            System.out.println("Status Member: NonMember");
            System.out.println("------------------------------");
            nm.TampilBarang(brawijaya);
            System.out.println("Total Harga         Rp "+nm.Biaya());
        }
        System.out.println("==================================");
    }
}
