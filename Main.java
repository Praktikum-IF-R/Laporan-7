package Laporan7;

/**
 *
 * @author wahyuridiansyah
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int harga1;
        Scanner in = new Scanner(System.in);
        System.out.print("Berapa Persen Diskon Hari ini: ");
        int diskonmember = in.nextInt();
        System.out.println("------------------------------------");
        System.out.println("            WR Beauty");
        System.out.println("------------------------------------");
        System.out.println("[Code: 001] Hair Styling    Rp. 125.000");
        System.out.println("[Code: 002] Facials         Rp. 65.000");
        System.out.println("------------------------------------");
        System.out.println("[Code: 003] Bedak           Rp. 130.000");
        System.out.println("[Code: 004] Foundation      Rp. 90.000");
        System.out.println("------------------------------------");
        System.out.print("Input Code: ");
        int code = in.nextInt();
        System.out.println("------------------------------------");
        if (code == 001) {
            harga1 = 125000;
            System.out.println("Jenis Keanggotaan: ");
            System.out.println("    [Code: 01] Non Member");
            System.out.println("    [Code: 02] Premium");
            System.out.println("    [Code: 03] Gold");
            System.out.println("    [Code: 04] Silver");
            System.out.println("------------------------------------");
            System.out.print("Input Code: ");
            int code1 = in.nextInt();
            if (code1 == 01) {
                NonMember a1 = new NonMember(harga1);
                a1.nonmember1();
                a1.tampilHarga(a1.layanan());
            } else if (code1 == 02) {
                Premium a2 = new Premium(harga1,diskonmember);
                a2.premium1();
                a2.tampilHarga(a2.layanan());
            } else if (code1 == 03) {
                Gold a3 = new Gold(harga1,diskonmember);
                a3.gold1();
                a3.tampilHarga(a3.layanan());
            } else if (code1 == 04) {
                Silver a4 = new Silver(harga1,diskonmember);
                a4.silver1();
                a4.tampilHarga(a4.layanan());
            } else {
                System.out.println("Maaf code yang anda inputkan salah");
                System.out.println("------------------------------------");
            }
        } 
        else if (code == 002) {
            harga1 = 65000;
            System.out.println("Jenis Keanggotaan: ");
            System.out.println("    [Code: 01] Non Member");
            System.out.println("    [Code: 02] Premium");
            System.out.println("    [Code: 03] Gold");
            System.out.println("    [Code: 04] Silver");
            System.out.print("Input Code: ");
            int code1 = in.nextInt();
            if (code1 == 01) {
                NonMember a1 = new NonMember(harga1);
                a1.nonmember2();
                a1.tampilHarga(a1.layanan());
            } else if (code1 == 02) {
                Premium a2 = new Premium(harga1,diskonmember);
                a2.premium2();
                a2.tampilHarga(a2.layanan());
            } else if (code1 == 03) {
                Gold a3 = new Gold(harga1,diskonmember);
                a3.gold2();
                a3.tampilHarga(a3.layanan());
            } else if (code1 == 04) {
                Silver a4 = new Silver(harga1,diskonmember);
                a4.silver2();
                a4.tampilHarga(a4.layanan());
            } else {
                System.out.println("Maaf code yang anda inputkan salah");
                System.out.println("------------------------------------");
            }
        } else if (code == 003) {
            harga1 = 130000;
            System.out.println("Jenis Keanggotaan: ");
            System.out.println("    [Code: 01] Non Member");
            System.out.println("    [Code: 02] Premium");
            System.out.println("    [Code: 03] Gold");
            System.out.println("    [Code: 04] Silver");
            System.out.print("Input Code: ");
            int code1 = in.nextInt();
            if (code1 == 01) {
                NonMember a1 = new NonMember(harga1);
                System.out.println("------------------------------------");
                System.out.println("Bedak      : Rp. 130.000");
                System.out.println("Non Member : Tidak Dapat Diskon");
                System.out.println("------------------------------------");
                a1.tampilHarga(a1.product());
            } else if (code1 == 02) {
                Premium a2 = new Premium(harga1,diskonmember);
                System.out.println("------------------------------------");
                System.out.println("Bedak          : Rp. 130.000");
                System.out.println("Member Premium : Diskon 20%");
                System.out.println("Diskon Product : Diskon "+diskonmember+"%");
                System.out.println("------------------------------------");
                a2.tampilHarga(a2.product());
            } else if (code1 == 03) {
                Gold a3 = new Gold(harga1,diskonmember);
                System.out.println("------------------------------------");
                System.out.println("Bedak          : Rp. 130.000");
                System.out.println("Member Gold    : Diskon 15%");
                System.out.println("Diskon Product : Diskon "+diskonmember+"%");
                System.out.println("------------------------------------");
                a3.tampilHarga(a3.product());
            } else if (code1 == 04) {
                Silver a4 = new Silver(harga1,diskonmember);
                System.out.println("------------------------------------");
                System.out.println("Bedak          : Rp. 130.000");
                System.out.println("Member Silver  : Diskon 10%");
                System.out.println("Diskon Product : Diskon "+diskonmember+"%");
                System.out.println("------------------------------------");
                a4.tampilHarga(a4.product());
            } else {
                System.out.println("Maaf code yang anda inputkan salah");
                System.out.println("------------------------------------");
            }
        } 
        else if (code == 004) {
            harga1 = 90000;
            System.out.println("Jenis Keanggotaan: ");
            System.out.println("    [Code: 01] Non Member");
            System.out.println("    [Code: 02] Premium");
            System.out.println("    [Code: 03] Gold");
            System.out.println("    [Code: 04] Silver");
            System.out.print("Input Code: ");
            int code1 = in.nextInt();
            if (code1 == 01) {
                NonMember a1 = new NonMember(harga1);
                System.out.println("------------------------------------");
                System.out.println("Foundation : Rp. 90.000");
                System.out.println("Non Member : Tidak Dapat Diskon");
                System.out.println("------------------------------------");
                a1.tampilHarga(a1.product());
            } else if (code1 == 02) {
                Premium a2 = new Premium(harga1,diskonmember);
                System.out.println("------------------------------------");
                System.out.println("Foundation     : Rp. 90.000");
                System.out.println("Member Premium : Diskon 20%");
                System.out.println("Diskon Product : Diskon "+diskonmember+"%");
                System.out.println("------------------------------------");
                a2.tampilHarga(a2.product());
            } else if (code1 == 03) {
                Gold a3 = new Gold(harga1,diskonmember);
                System.out.println("------------------------------------");
                System.out.println("Foundation     : Rp. 90.000");
                System.out.println("Member Gold    : Diskon 15%");
                System.out.println("Diskon Product : Diskon "+diskonmember+"%");
                System.out.println("------------------------------------");
                a3.tampilHarga(a3.product());
            } else if (code1 == 04) {
                Silver a4 = new Silver(harga1,diskonmember);
                System.out.println("------------------------------------");
                System.out.println("Foundation     : Rp. 90.000");
                System.out.println("Member Silver  : Diskon 10%");
                System.out.println("Diskon Product : Diskon "+diskonmember+"%");
                System.out.println("------------------------------------");
                a4.tampilHarga(a4.product());
            } else {
                System.out.println("Maaf code yang anda inputkan salah");
                System.out.println("------------------------------------");
            }
        } else {
            System.out.println("Code yang anda masukan salah");
            System.out.println("------------------------------------");
        }
    }
}