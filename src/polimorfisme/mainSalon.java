package polimorfisme;
import java.util.Scanner;
public class mainSalon {
    private static int pilihan;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String member, Produk, Layanan, pesan;
        int a = 0, b;
        int Jumlah;
        do {
        System.out.println("===========================================");
        System.out.println("             Salon IF - R          ");
        System.out.println("===========================================");
        System.out.println("1. Produk Dan Layanan Salon");
        System.out.println("2. Promo Hari ini ");
        System.out.println("3. Keluar");
        System.out.print("Masukkan Pilihan \t\t: ");
               pilihan = in.nextInt ();
        switch (pilihan){
            case 1 :
              while (a == 0) {
            System.out.println("============Daftar Produk Salon============");
            System.out.println("1. Maskara \t\t\t Rp. 50000 ");
            System.out.println("2. Lotion \t\t\t Rp. 25000");
            System.out.println("3. HairStyle \t\t\t Rp. 30000");
            System.out.println("4. Parfum \t\t\t Rp. 105000");
            System.out.println(" ");
            System.out.println("============Daftar Layanan Salon============");
            System.out.println("1. Potong \t\t\t Rp. 12000");
            System.out.println("2. Creambath \t\t\t Rp. 15000");
            System.out.println("3. Lulur \t\t\t Rp. 35000");
            System.out.println("4. Pijat++ \t\t\t Rp. 110000");
            System.out.println(" ");
            System.out.println("============Jenis Member============"
                    + "\n*Premium \t\t\t: Prem\n"
                    + "*Gold \t\t\t\t: Go\n"
                    + "*Silver \t\t\t: Sil\n"
                    + "*NonMember \t\t\t: No");
            System.out.println("====================================");
            System.out.print("Masukkan Jenis Member \t\t: ");
            member = in.next();
            System.out.print("Masukan Nama Produk  \t\t: ");
            Produk = in.next();
            System.out.print("Masukkan Jumlah Produk yang dibeli: ");
            Jumlah = in.nextInt();
            System.out.print("Masukan Layanan \t\t: ");
            Layanan = in.next();
            System.out.println("====================================");
            if (member.equalsIgnoreCase("Prem")) {
                Premium P = new Premium(Produk, Layanan, Jumlah);
                System.out.print("Masukkan diskon produk dalam (%): ");
                b=in.nextInt();
                P.setDiskon(b);
                System.out.println("Total Tagihan \t\t\t: Rp." + (int) P.Total());
            } else if (member.equalsIgnoreCase("Go")) {
                Gold G = new Gold(Produk, Layanan, Jumlah);
                System.out.print("Masukkan diskon produk dalam (%): ");
                b=in.nextInt();
                G.setDiskon(b);
                System.out.println("Total Tagihan \t\t\t: Rp." + (int) G.Total());
            } else if (member.equalsIgnoreCase("Sil")) {
                Silver S = new Silver(Produk, Layanan, Jumlah);
                System.out.print("Masukkan diskon produk dalam (%): ");
                b=in.nextInt();
                S.setDiskon(b);
                System.out.println("Total Tagihan \t\t\t: Rp." + (int) S.Total());
            } else {
                nonMember N = new nonMember(Produk, Layanan, Jumlah);
                System.out.println("Total Tagihan \t\t\t: Rp." + (int) N.Total());
            }
            System.out.print("Pesan lagi? (Y/N) \t\t: ");
            pesan = in.next();
            if (pesan.equalsIgnoreCase("Y")) {
                a = 0;
            } else if (pesan.equalsIgnoreCase("N")) {
                System.out.println("Terimakasih Atas Kunjungannya, semoga puas");
                System.exit(0);
            }
        }
              break;
            case 2 :
                System.out.println("Member : \n "
                        + "Premium      : 20% \n "
                        + "Gold         : 15% \n "
                        + "Silver       : 10% \n "
                        + "NonMember    : 0%");
                break;
            case 3: 
                System.out.println(" Terima Kasih Atas Kunjungannya ");
                break;
            default:
                System.out.println("Menu tidak tersedia!");
        } 
        }while (pilihan != 3);
    }   
}