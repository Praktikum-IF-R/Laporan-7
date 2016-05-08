/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon;

import java.util.Scanner;

/**
 *
 * @author LENY
 */
public class mainsalon {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int pil, jumlah;
        System.out.println("==== Welcome to Lenny Salon =====");
        System.out.println("");
        System.out.println("1. HairSpa              : 50000");
        System.out.println("2. Potong Rambut        : 25000");
        System.out.println("3. Creambath            : 35000");
        System.out.println("");
        System.out.println("diskon salon hari ini   : 10%");
        System.out.println("================================");
        System.out.println("Kartu Member Yang Anda punya (premium/gold/silver/Non Member): ");
        String kartu = a.nextLine();
        System.out.print("Masukkan pilihan    : ");
        pil = a.nextInt();

        switch (pil) {
            case 1:
                if (kartu.equalsIgnoreCase("Premium")) {
                    System.out.print("Untuk berapa orang      : ");
                    jumlah = a.nextInt();
                    premium b = new premium(jumlah);
                    b.setHarga(50000);
                    b.tampil2();
                } else if (kartu.equalsIgnoreCase("Gold")) {
                    System.out.print("Untuk berapa orang      : ");
                    jumlah = a.nextInt();
                    gold c = new gold(jumlah);
                    c.setHarga(50000);
                    c.tampil3();
                } else if (kartu.equalsIgnoreCase("Silver")) {
                    System.out.print("Untuk berapa orang      : ");
                    jumlah = a.nextInt();
                    silver d = new silver(jumlah);
                    d.setHarga(50000);
                    d.tampil4();
                } else if (kartu.equalsIgnoreCase("Non Member")) {
                    System.out.print("Untuk berapa orang      : ");
                    jumlah = a.nextInt();
                    nonmember e = new nonmember(jumlah);
                    e.setHarga(50000);
                    e.tampil5();
                }
                break;
            case 2:
                if (kartu.equalsIgnoreCase("Premium")) {
                    System.out.print("Untuk berapa orang      : ");
                    jumlah = a.nextInt();
                    premium b = new premium(jumlah);
                    b.setHarga(25000);
                    b.tampil2();
                } else if (kartu.equalsIgnoreCase("Gold")) {
                    System.out.print("Untuk berapa orang      : ");
                    jumlah = a.nextInt();
                    gold c = new gold(jumlah);
                    c.setHarga(25000);
                    c.tampil3();
                } else if (kartu.equalsIgnoreCase("Silver")) {
                    System.out.print("Untuk berapa orang      : ");
                    jumlah = a.nextInt();
                    silver d = new silver(jumlah);
                    d.setHarga(25000);
                    d.tampil4();
                } else if (kartu.equalsIgnoreCase("Non Member")) {
                    System.out.print("Untuk berapa orang      : ");
                    jumlah = a.nextInt();
                    nonmember e = new nonmember(jumlah);
                    e.setHarga(25000);
                    e.tampil5();
                }
                break;
            case 3:
                if (kartu.equalsIgnoreCase("Premium")) {
                    System.out.print("Untuk berapa orang      : ");
                    jumlah = a.nextInt();
                    premium b = new premium(jumlah);
                    b.setHarga(35000);
                    b.tampil2();
                } else if (kartu.equalsIgnoreCase("Gold")) {
                    System.out.print("Untuk berapa orang      : ");
                    jumlah = a.nextInt();
                    gold c = new gold(jumlah);
                    c.setHarga(35000);
                    c.tampil3();
                } else if (kartu.equalsIgnoreCase("Silver")) {
                    System.out.print("Untuk berapa orang      : ");
                    jumlah = a.nextInt();
                    silver d = new silver(jumlah);
                    d.setHarga(35000);
                    d.tampil4();
                } else if (kartu.equalsIgnoreCase("Non Member")) {
                    System.out.print("Untuk berapa orang      : ");
                    jumlah = a.nextInt();
                    nonmember e = new nonmember(jumlah);
                    e.setHarga(35000);
                    e.tampil5();
                }
                break;
            default:
                System.out.println("wish u luck today!");
        }
        System.out.println("==== Thank You For Comin' ====");
    }
    
}
