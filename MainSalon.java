/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon;

import java.util.Scanner;

/**
 *
 * @author yudi hermawan
 */
public class MainSalon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu;
        String member;
        String nama;
        String id;
        String hari;
        System.out.println("Program Penghitungan Salon");
        System.out.println("Nama Pelanggan :");
        nama = input.next();
        input.nextLine();
        System.out.println("Id Pelanggan :");
        id = input.next();
        System.out.println("Diskon 10% tiap hari Senin-Jumat");
        System.out.println("Hari Ini adalah hari");
        System.out.println("Masukkan hari :");
        hari = input.next();
        input.nextLine();
        System.out.println("1. Premium");
        System.out.println("2. Gold");
        System.out.println("3. Silver");
        System.out.println("4. Tidak");
        System.out.println("Apakah Punya Kartu Member :");
        member = input.next();
        input.nextLine();
        if (member.equalsIgnoreCase("Premium")) {
            Premium p = new Premium(nama, id);
            System.out.println("Daftar Perawatan Salon");
            System.out.println("1. Creambath            Rp.200.000,-");
            System.out.println("2. Rebonding            Rp.300.000,-");
            System.out.println("3. Massage              Rp.150.000,-");
            System.out.println("4. Pedicure             Rp.50.000,-");
            System.out.println("5. Manicure             Rp.50.000,-");
            System.out.println("6. Sulam Alis           Rp.500.000,-");
            System.out.println("Untuk Perawatan di Rumah   ");
            System.out.println("7. Ponds Age Miracle    Rp.150.000");
            System.out.println("8. Loreal               Rp.100.000");
            System.out.println("9. Nurish Skin          Rp.100.000");
            System.out.println("10. Tresseme            Rp.150.000");
            System.out.println("Ketik (Stop) untuk berhenti");
            do {
                System.out.println("Masukkan Perawatannya :");
                menu = input.nextLine();
                p.pesanProduk(menu);
            } while (!(menu.equalsIgnoreCase("Stop")));
            p.diskonhari(hari);
            p.diskonmember();
            p.DisplayMessage();
        } else if (member.equalsIgnoreCase("Gold")) {
            Gold g = new Gold(nama, id);
            System.out.println("Daftar Perawatan Salon");
            System.out.println("1. Creambath            Rp.200.000,-");
            System.out.println("2. Rebonding            Rp.300.000,-");
            System.out.println("3. Massage              Rp.150.000,-");
            System.out.println("4. Pedicure             Rp.50.000,-");
            System.out.println("5. Manicure             Rp.50.000,-");
            System.out.println("6. Sulam Alis           Rp.500.000,-");
            System.out.println("Untuk Perawatan di Rumah   ");
            System.out.println("7. Ponds Age Miracle    Rp.150.000");
            System.out.println("8. Loreal               Rp.100.000");
            System.out.println("9. Nurish Skin          Rp.100.000");
            System.out.println("10. Tresseme            Rp.150.000");
            System.out.println("Ketik (Stop) untuk berhenti");
            do {
                System.out.println("Masukkan Perawatannya :");
                menu = input.nextLine();
                g.pesanProduk(menu);
            } while (!(menu.equalsIgnoreCase("Stop")));
            g.diskonhari(hari);
            g.diskonmember();
            g.DisplayMessage();
        } else if (member.equalsIgnoreCase("Silver")) {
            Silver s = new Silver(nama, id);
            System.out.println("Daftar Perawatan Salon");
            System.out.println("1. Creambath            Rp.200.000,-");
            System.out.println("2. Rebonding            Rp.300.000,-");
            System.out.println("3. Massage              Rp.150.000,-");
            System.out.println("4. Pedicure             Rp.50.000,-");
            System.out.println("5. Manicure             Rp.50.000,-");
            System.out.println("6. Sulam Alis           Rp.500.000,-");
            System.out.println("Untuk Perawatan di Rumah   ");
            System.out.println("7. Ponds Age Miracle    Rp.150.000");
            System.out.println("8. Loreal               Rp.100.000");
            System.out.println("9. Nurish Skin          Rp.100.000");
            System.out.println("10. Tresseme            Rp.150.000");
            System.out.println("Ketik (Stop) untuk berhenti");
            do {
                System.out.println("Masukkan Perawatannya :");
                menu = input.nextLine();
                s.pesanProduk(menu);
            } while (!(menu.equalsIgnoreCase("Stop")));
            s.diskonhari(hari);
            s.diskonmember();
            s.DisplayMessage();
        } else if (member.equalsIgnoreCase("Tidak")) {
            TakMember t = new TakMember(nama, id);
            System.out.println("Daftar Perawatan Salon");
            System.out.println("1. Creambath            Rp.200.000,-");
            System.out.println("2. Rebonding            Rp.300.000,-");
            System.out.println("3. Massage              Rp.150.000,-");
            System.out.println("4. Pedicure             Rp.50.000,-");
            System.out.println("5. Manicure             Rp.50.000,-");
            System.out.println("6. Sulam Alis           Rp.500.000,-");
            System.out.println("Untuk Perawatan di Rumah   ");
            System.out.println("7. Ponds Age Miracle    Rp.150.000");
            System.out.println("8. Loreal               Rp.100.000");
            System.out.println("9. Nurish Skin          Rp.100.000");
            System.out.println("10. Tresseme            Rp.150.000");
            System.out.println("Ketik (Stop) untuk berhenti");
            do {
                System.out.println("Masukkan Perawatannya :");
                menu = input.nextLine();
                t.pesanProduk(menu);
            } while (!(menu.equalsIgnoreCase("Stop")));
            t.diskonhari(hari);
            t.diskonmember();
            t.DisplayMessage();
        }
    }
}
