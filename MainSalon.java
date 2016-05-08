package laporan7;
import java.util.Scanner;
public class MainSalon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("~~~~~~~~~~~~~~Get it Beauty Salon~~~~~~~~~~~~~~");
        System.out.println(" 1. Potong Rambut\t\tRp  30.000");
        System.out.println(" 2. Creambath\t\t\tRp  50.000");
        System.out.println(" 3. Smoothing\t\t\tRp 150.000");
        System.out.println(" 4. Coloring\t\t\tRp 200.000");
        System.out.println(" 5. Bleaching\t\t\tRp 300.000");
        System.out.println("-----------------------------------------------");
        System.out.println("Tersedia juga produk andalan kami:  ");
        System.out.println(" 1. Masker\t\t\tRp  85.000");
        System.out.println(" 2. Conditioner\t\t\tRp  90.000");
        System.out.println(" 3. Shampoo\t\t\tRp 100.000");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Nama anda:\t\t");
        String nama = in.next();
        System.out.println("--------------------------------------------");
        System.out.println("Apakah anda member? (Y/N)");
        System.out.print("-> ");
        String m = in.next();
        System.out.println("--------------------------------------------");
        if (m.equalsIgnoreCase("y")) {
            System.out.print("Premium/Gold/Silver:\t");
            String member = in.next();
            if (member.equalsIgnoreCase("gold")) {
                Gold gold = new Gold(nama);
                System.out.println("Isi pilihan order anda (TEKAN 0 UNTUK BERHENTI)");
                do {
                    System.out.print("Pilihan jasa: ");
                    x = in.nextInt();
                    gold.HargaJasa(x);
                } while (x != 0);
                System.out.println("-------------------------------------------------------");
                System.out.println("Apakah anda ingin membeli produk andalan kami?(Y/N)");
                System.out.print("-> ");
                String p = in.next();
                System.out.println("-------------------------------------------------------");
                if (p.equalsIgnoreCase("y")) {
                    System.out.println("Isi pilihan order anda (TEKAN 0 UNTUK BERHENTI)");
                    do {
                        System.out.print("Pilihan produk: ");
                        x = in.nextInt();
                        gold.HargaProduk(x);
                    } while (x != 0);
                    System.out.println();
                    System.out.print("Tentukan diskon all member(dalam pecahan): ");
                    gold.setDiskonMember(in.nextDouble());
                    System.out.println("___________________________________________________________________");
                    System.out.println("Pembelian a/n: "+gold.getNama());
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Total pembayaran jasa (diskon 15%)\t\t\t: Rp " + gold.paymentJasa());
                    System.out.println("Total pembayaran produk (diskon 15% + all member "+gold.getDiskonMember()+"%)\t: Rp " + gold.paymentProduk());
                    System.out.println("Total pembayaran\t\t\t\t\t: Rp " + (gold.paymentJasa() + gold.paymentProduk()));
                } else if (p.equalsIgnoreCase("n")) {
                    System.out.println("___________________________________________________________________");
                    System.out.println("Pembelian a/n: "+gold.getNama());
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Total pembayaran jasa (diskon 15%)\t\t: Rp " + gold.paymentJasa());
                    System.out.println("Total pembayaran\t\t\t\t: Rp " + gold.paymentJasa());
                }
            } else if (member.equalsIgnoreCase("silver")) {
                Silver silver = new Silver(nama);
                System.out.println("Isi pilihan order anda (TEKAN 0 UNTUK BERHENTI)");
                do {
                    System.out.print("Pilihan jasa: ");
                    x = in.nextInt();
                    silver.HargaJasa(x);
                } while (x != 0);
                System.out.println("-------------------------------------------------------");
                System.out.println("Apakah anda ingin membeli produk andalan kami?(Y/N)");
                System.out.print("-> ");
                String p = in.next();
                System.out.println("-------------------------------------------------------");
                if (p.equalsIgnoreCase("y")) {
                    System.out.println("Isi pilihan order anda (TEKAN 0 UNTUK BERHENTI)");
                    do {
                        System.out.print("Pilihan produk: ");
                        x = in.nextInt();
                        silver.HargaProduk(x);
                    } while (x != 0);
                    System.out.println();
                    System.out.print("Tentukan diskon all member(dalam pecahan): ");
                    silver.setDiskonMember(in.nextDouble());
                    System.out.println("___________________________________________________________________");
                    System.out.println("Pembelian a/n: "+silver.getNama());
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Total pembayaran jasa (diskon 10%)\t\t\t: Rp " + silver.paymentJasa());
                    System.out.println("Total pembayaran produk (diskon 10% + all member "+silver.getDiskonMember()+"%)\t: Rp " + silver.paymentProduk());
                    System.out.println("Total pembayaran\t\t\t\t\t: Rp " + (silver.paymentJasa() + silver.paymentProduk()));
                } else if (p.equalsIgnoreCase("n")) {
                    System.out.println("___________________________________________________________________");
                    System.out.println("Pembelian a/n: "+silver.getNama());
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Total pembayaran jasa (diskon 15%)\t\t: Rp " + silver.paymentJasa());
                    System.out.println("Total pembayaran\t\t\t\t: Rp " + silver.paymentJasa());
                }
            } else if (member.equalsIgnoreCase("premium")) {
                Premium premium = new Premium(nama);
                System.out.println("Isi pilihan order anda (TEKAN 0 UNTUK BERHENTI)");
                do {
                    System.out.print("Pilihan jasa: ");
                    x = in.nextInt();
                    premium.HargaJasa(x);
                } while (x != 0);
                System.out.println("-------------------------------------------------------");
                System.out.println("Apakah anda ingin membeli produk andalan kami?(Y/N)");
                System.out.print("-> ");
                String p = in.next();
                System.out.println("-------------------------------------------------------");
                if (p.equalsIgnoreCase("y")) {
                    System.out.println("Isi pilihan order anda (TEKAN 0 UNTUK BERHENTI)");
                    do {
                        System.out.print("Pilihan produk: ");
                        x = in.nextInt();
                        premium.HargaProduk(x);
                    } while (x != 0);
                    System.out.println();
                    System.out.print("Tentukan diskon all member(dalam pecahan): ");
                    premium.setDiskonMember(in.nextDouble());
                    System.out.println("___________________________________________________________________");
                    System.out.println("Pembelian a/n: "+premium.getNama());
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Total pembayaran jasa (diskon 20%)\t\t\t: Rp " + premium.paymentJasa());
                    System.out.println("Total pembayaran produk (diskon 20% + all member "+premium.getDiskonMember()+"%)\t: Rp " + premium.paymentProduk());
                    System.out.println("Total pembayaran\t\t\t\t\t: Rp " + (premium.paymentJasa() + premium.paymentProduk()));
                } else if (p.equalsIgnoreCase("n")) {
                    System.out.println("___________________________________________________________________");
                    System.out.println("Pembelian a/n: "+premium.getNama());
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Total pembayaran jasa (diskon 15%)\t\t: Rp " + premium.paymentJasa());
                    System.out.println("Total pembayaran\t\t\t\t: Rp " + premium.paymentJasa());
                }
            }
        } else if (m.equalsIgnoreCase("N")) {
            NonMember non = new NonMember(nama);
            System.out.println("Isi pilihan order anda (TEKAN 0 UNTUK BERHENTI)");
            do {
                System.out.print("Pilihan jasa: ");
                x = in.nextInt();
                non.HargaJasa(x);
            } while (x != 0);
            System.out.println("-------------------------------------------------------");
            System.out.println("Apakah anda ingin membeli produk andalan kami?(Y/N)");
            System.out.print("-> ");
            String p = in.next();
            System.out.println("-------------------------------------------------------");
            if (p.equalsIgnoreCase("y")) {
                System.out.println("Isi pilihan order anda (TEKAN 0 UNTUK BERHENTI)");
                do {
                    System.out.print("Pilihan produk: ");
                    x = in.nextInt();
                    non.HargaProduk(x);
                } while (x != 0);
                System.out.println("___________________________________________________________________");
                System.out.println("Pembelian a/n: "+non.getNama());
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Total pembayaran jasa\t\t\t: Rp " + non.paymentJasa());
                System.out.println("Total pembayaran produk\t\t\t: Rp " + non.paymentProduk());
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Total pembayaran\t\t\t: Rp " + (non.paymentJasa() + non.paymentProduk()));
            } else if (p.equalsIgnoreCase("n")) {
                System.out.println("___________________________________________________________________");
                System.out.println("Pembelian a/n: "+non.getNama());
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Total pembayaran jasa\t\t\t: Rp " + non.paymentJasa());
                System.out.println("Total pembayaran\t\t\t: Rp " + non.paymentJasa());
            }
        }
    }
}