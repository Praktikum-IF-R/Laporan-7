package laporan7;

import java.util.Scanner;

public class MainSalon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("====FILKOM SPA AND BEAUTY SALON====");
        System.out.println("Melayani \t : ");
        System.out.println("- Jasa  : ");
        System.out.println("1. Creambath \t Rp. 20000");
        System.out.println("2. HairCut \t Rp. 30000");
        System.out.println("3. Facial \t Rp. 20000");
        System.out.println("- Produk  : ");
        System.out.println("1. Masker \t Rp. 30000");
        System.out.println("2. Lulur \t Rp. 40000");
        System.out.println("3. MilkBath \t Rp. 25000");
        System.out.println("*member tertentu mendapatkan diskon \n tersendiri untuk setiap pelayanan");
        System.out.print("Diskon Produk Hari Ini: ");
        int dis = in.nextInt();
        System.out.println("");
        System.out.print("Masukkan Nama \t \t : ");
        String nama = in.next();
        System.out.print("Jenis Anggota Member \t : ");
        String member = in.next();
        if (member.equalsIgnoreCase("gold")){   
                gold gold = new gold(nama, dis);
                System.out.print("Masukkan jasa \t \t : ");
                gold.setJasa(s.nextLine());
                System.out.println("Harga (disk 15%) \t : Rp. " + gold.totalJ());
                System.out.print("Masukkan produk \t : ");
                gold.setProduk(s.nextLine());
                System.out.println("Harga (disk "+dis+"%) \t : Rp. " + gold.totalP());
                System.out.println("====FILKOM SPA AND BEAUTY SALON====");
                System.out.println("Nama          : "+gold.getNama());
                System.out.println("Member        : Gold");
                System.out.println("Total Harga   : Rp. "+gold.total());
                System.out.println("===================================");
                
        }else if (member.equalsIgnoreCase("premium")){   
                premium prem = new premium(nama, dis);
                System.out.print("Masukkan jasa \t \t : ");
                prem.setJasa(s.nextLine());
                System.out.println("Harga (disk 20%) \t : Rp. " + prem.totalJ());
                System.out.print("Masukkan produk \t : ");
                prem.setProduk(s.nextLine());
                System.out.println("Harga (disk "+dis+"%) \t : Rp. " + prem.totalP());
                System.out.println("====FILKOM SPA AND BEAUTY SALON====");
                System.out.println("Nama          : "+prem.getNama());
                System.out.println("Member        : Premium");
                System.out.println("Total Harga   : Rp. "+prem.total());
                System.out.println("===================================");
        
        }else if (member.equalsIgnoreCase("silver")){   
                silver silver = new silver(nama, dis);
                System.out.print("Masukkan jasa \t \t : ");
                silver.setJasa(s.nextLine());
                System.out.println("Harga (disk 10%) \t : Rp. " + silver.totalJ());
                System.out.print("Masukkan produk \t : ");
                silver.setProduk(s.nextLine());
                System.out.println("Harga (disk "+dis+"%) \t : Rp. " + silver.totalP());
                System.out.println("====FILKOM SPA AND BEAUTY SALON====");
                System.out.println("Nama          : "+silver.getNama());
                System.out.println("Member        : Silver");
                System.out.println("Total Harga   : Rp. "+silver.total());
                System.out.println("===================================");
        }else if (member.equalsIgnoreCase("NonMember")){   
                nonMember non = new nonMember(nama, dis);
                System.out.print("Masukkan jasa \t \t : ");
                non.setJasa(s.nextLine());
                System.out.println("Harga (no disk) \t : Rp. " + non.totalJ());
                System.out.print("Masukkan produk \t : ");
                non.setProduk(s.nextLine());
                System.out.println("Harga (no disk) \t : Rp. " + non.totalP());
                System.out.println("====FILKOM SPA AND BEAUTY SALON====");
                System.out.println("Nama          : "+non.getNama());
                System.out.println("Member        : Non Member");
                System.out.println("Total Harga   : Rp. "+non.total());
                System.out.println("===================================");
        }
    }
}
