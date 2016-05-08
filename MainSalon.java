package salon;
import java.util.Scanner;
public class MainSalon {
    
    private static String nama, keanggotaan;
    private static double tariflayanan,tarifproduk;
    
    public static void main(String[] args) {
        int pilihan;
        Scanner input = new Scanner (System.in);
        do {
        System.out.println("Welcome to Nanny's Pav Salon");
	System.out.println("-----------------------------");
        System.out.println("Choose your Member Card ");
        System.out.println("1. Premium Member");
        System.out.println("2. Gold Member");
        System.out.println("3. Silver Member");
        System.out.println("4. Non-Member");
        System.out.println("5. Exit");
        System.out.println("Enter your input : ");
        pilihan = input.nextInt();
        switch (pilihan) {
        case 1 : Premium ();
            break;
        case 2 : Gold ();
            break;
        case 3 : Silver ();
            break;
        case 4 : NonMember ();
            break;
        case 5 : Keluar ();
            break;
        default : System.out.println("Your input doesn't exist");
            System.out.println("");
        }
        } while (pilihan != 5);
    }
        private static void Premium () {
        Scanner input = new Scanner (System.in);
        Premium p1 = new Premium(nama, keanggotaan, tariflayanan, tarifproduk);
        System.out.println("Nama : ");
        nama = input.next();
        System.out.println("Masukkan tarif layanan : ");
        tariflayanan = input.nextDouble();
        System.out.println("Masukkan tarif produk : ");
        tarifproduk = input.nextDouble();
        p1.setNama(nama);
        p1.setTariflayanan(tariflayanan);
        p1.setTarifproduk(tarifproduk);
        p1.tarifLayanan();
        p1.tarifProduk();
        p1.displayMessage();
        System.out.println("");
        }
        
        private static void Gold () {
        Scanner input = new Scanner (System.in);
        Gold g1 = new Gold (nama, keanggotaan, tariflayanan,tarifproduk);
        System.out.println("Nama :");
        nama=input.nextLine();
        System.out.println("Masukkan tarif layanan:");
        tariflayanan = input.nextDouble();
        System.out.println("Masukkan tarif produk : ");
        tarifproduk = input.nextDouble();
        g1.setNama(nama);
        g1.setTariflayanan(tariflayanan);
        g1.setTarifproduk(tarifproduk);
        g1.tarifLayanan();
        g1.tarifProduk();
        g1.displayMessage();
        System.out.println("");
        }
        
        private static void Silver () {
        Scanner input = new Scanner (System.in);
        Silver s1 = new Silver (nama, keanggotaan, tariflayanan,tarifproduk);
        System.out.println("Nama :");
        nama=input.nextLine();
        System.out.println("Masukkan tarif layanan:");
        tariflayanan = input.nextDouble();
        System.out.println("Masukkan tarif produk : ");
        tarifproduk = input.nextDouble();
        s1.setNama(nama);
        s1.setTariflayanan(tariflayanan);
        s1.setTarifproduk(tarifproduk);
        s1.tarifLayanan();
        s1.tarifProduk();
        s1.displayMessage();
        System.out.println("");
        }
        
        private static void NonMember () {
        Scanner input = new Scanner (System.in);
        NonMember n1=new NonMember (nama, keanggotaan, tariflayanan,tarifproduk);
        System.out.println("Nama :");
        nama=input.nextLine();
        System.out.println("Masukkan tarif layanan:");
        tariflayanan = input.nextDouble();
        System.out.println("Masukkan tarif produk : ");
        tarifproduk = input.nextDouble();
        n1.setNama(nama);
        n1.setTariflayanan(tariflayanan);
        n1.setTarifproduk(tarifproduk);
        n1.tarifLayanan();
        n1.tarifProduk();
        n1.displayMessage();
        System.out.println("");
    }
        
        private static void Keluar () {
        System.out.println("Terimakasih");
        System.exit(0);
    }
}
