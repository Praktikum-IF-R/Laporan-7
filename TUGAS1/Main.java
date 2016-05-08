/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kart[] = new String[20];
        long Total1 = 0, Total2 = 0;
        int input, last = 0, diskon;
        String inputs;
        boolean menu1 = true, menu2;
        System.out.print("Diskon Untuk Member : ");
        diskon = scan.nextInt();
        System.out.println("Pengesetan diskon selesai\n\n");
        System.out.println("                SELAMAT DATANG DI INDAH SALON");
        System.out.println("DISKON " + diskon + "% UNTUK SEMUA PRODUK KECANTIKAN BAGI PEMILIK KARTU MEMBER\n\n");
        while (menu1) {
            System.out.println("Daftar Layanan & Produk :\n1.Tata Rambut\n2.Perawatan Rambut\n3.Perawatan Wajah\n4.Produk Kecantikan\n5.Daftar Belanja\n0.Selesai");
            System.out.print("Pilihan : ");
            input = scan.nextInt();
            switch (input) {
                case 0:
                    if (Total1 + Total2 == 0) {
                        System.out.println("Tidak Ada Pembelian");
                    } else {
                        System.out.println("\nDaftar Belanja :");
                        for (int i = 1; i <= last; i++) {
                            System.out.println(kart[i]);
                        }
                        System.out.print("\nMemiliki Kartu Member(Ya/Tidak) : ");
                        inputs = scan.next();
                        if (inputs.equalsIgnoreCase("ya")) {
                            System.out.print("Jenis Kartu(Premium/Gold/Silver) : ");
                            inputs = scan.next();
                            if (inputs.equalsIgnoreCase("Premium")) {
                                Premium P = new Premium();
                                System.out.println("\n            Total Rp." + P.DiskonMember(Total1, Total2, diskon));
                                System.out.println("Premium Member Diskon 20%");
                            } else if (inputs.equalsIgnoreCase("Gold")) {
                                Gold G = new Gold();
                                System.out.println("\n            Total Rp." + G.DiskonMember(Total1, Total2, diskon));
                                System.out.println("Gold Member Diskon 15%");
                            } else if (inputs.equalsIgnoreCase("Silver")) {
                                Silver S = new Silver();
                                System.out.println("\n            Total Rp." + S.DiskonMember(Total1, Total2, diskon));
                                System.out.println("Silver Member Diskon 10%");
                            }
                            System.out.println("Diskon Produk "+diskon+"%");
                        } else {
                            System.out.println("\n            Total Rp." + (Total1 + Total2));
                        }
                    }
                    System.out.println("                Program Selesai");
                    System.out.println("        Terima Kasih Atas Kunjungan Anda");
                    menu1 = false;
                    break;
                case 1:
                    menu2 = true;
                    while (menu2) {
                        System.out.println("\nTata Rambut :");
                        System.out.println("1.Gunting           Rp.10.000");
                        System.out.println("2.Styling           Rp.50.000");
                        System.out.println("3.Rebonding         Rp.100.000");
                        System.out.println("4.Pewarnaan         Rp.120.000");
                        System.out.println("0.Kembali");
                        System.out.print("Pilihan : ");
                        input = scan.nextInt();
                        switch (input) {
                            case 0:
                                menu2 = false;
                                break;
                            case 1:
                                last += 1;
                                kart[last] = "Gunting           Rp.10.000";
                                Total1 += 10000;
                                break;
                            case 2:
                                last += 1;
                                kart[last] = "Styling           Rp.50.000";
                                Total1 += 50000;
                                break;
                            case 3:
                                last += 1;
                                kart[last] = "Rebonding         Rp.100.000";
                                Total1 += 100000;
                                break;
                            case 4:
                                last += 1;
                                kart[last] = "Pewarnaan         Rp.120.000";
                                Total1 += 120000;
                                break;
                        }
                    }
                    break;
                case 2:
                    menu2 = true;
                    while (menu2) {
                        System.out.println("\nPerawatan Rambut :");
                        System.out.println("1.Creambath         Rp.30.000");
                        System.out.println("2.Masker rambut     Rp.30.000");
                        System.out.println("3.Hair Spa          Rp.40.000");
                        System.out.println("0.Kembali");
                        System.out.print("Pilihan : ");
                        input = scan.nextInt();
                        switch (input) {
                            case 0:
                                menu2 = false;
                                break;
                            case 1:
                                last += 1;
                                kart[last] = "Creambath         Rp.30.000";
                                Total1 += 30000;
                                break;
                            case 2:
                                last += 1;
                                kart[last] = "Masker rambut     Rp.30.000";
                                Total1 += 30000;
                                break;
                            case 3:
                                last += 1;
                                kart[last] = "Hair Spa          Rp.40.000";
                                Total1 += 40000;
                                break;
                        }
                    }
                    break;
                case 3:
                    menu2 = true;
                    while (menu2) {
                        System.out.println("\nPerawatan Wajah :");
                        System.out.println("1.Facial            Rp.30.000");
                        System.out.println("0.Kembali");
                        System.out.print("Pilihan : ");
                        input = scan.nextInt();
                        switch (input) {
                            case 0:
                                menu2 = false;
                                break;
                            case 1:
                                last += 1;
                                kart[last] = "";
                                break;
                        }
                    }
                    break;
                case 4:
                    menu2 = true;
                    while (menu2) {
                        System.out.println("\nProduk Kecantikan :");
                        System.out.println("1.Cream		Rp.80.000");
                        System.out.println("2.Kutek		Rp.50.000");
                        System.out.println("3.Sabun Acnes	Rp.120.000");
                        System.out.println("0.Kembali");
                        System.out.print("Pilihan : ");
                        input = scan.nextInt();
                        switch (input) {
                            case 0:
                                menu2 = false;
                                break;
                            case 1:
                                last += 1;
                                kart[last] = "Cream		Rp.80.000";
                                Total2 += 80000;
                                break;
                            case 2:
                                last += 1;
                                kart[last] = "Kutek		Rp.50.000";
                                Total2 += 50000;
                                break;
                            case 3:
                                last += 1;
                                kart[last] = "Sabun Acnes	Rp.120.000";
                                Total2 += 120000;
                                break;
                        }
                    }
                    break;
                case 5:
                    for (int i = 1; i <= last; i++) {
                        if (kart[1] == "") {
                            System.out.println("Kosong");
                        } else {
                            System.out.println(kart[i]);
                        }
                    }
                    break;
            }
            System.out.println("--------------------------------------------------------------------------\n");
        }
    }
}
