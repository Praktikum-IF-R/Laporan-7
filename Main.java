/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan7;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = 0;
        Premium r = new Premium();
        Gold g = new Gold();
        Silver s = new Silver();
        System.out.println("---------------------------");
        System.out.println("\tSalon Luxury");
        System.out.println("---------------------------");
        System.out.print("Diskon untuk hari ini (%) : ");
        double d = x.nextDouble();
        System.out.println("Pelayanan dan Produk yang ditawarkan");
        System.out.println("1. Potong Rambut");
        System.out.println("2. Creambath");
        System.out.println("3. Pembelian produk");
        System.out.print("Pelayanan yang diinginkan : ");
        int p = x.nextInt();
        switch (p) {
            case 1:
                a += 35000;
                System.out.print("Apakah Anda ingin membeli produk kami (y/n): ");
                String y = x.next();
                if (y.equalsIgnoreCase("Y")) {
                    int h = 0;
                    String f;
                    do {
                        System.out.println();
                        System.out.println("Produk yang ditawarkan");
                        System.out.println("1. Alat Kosmetik");
                        System.out.println("2. Kutek");
                        System.out.println("3. Shampoo");
                        System.out.print("Produk yang Anda pilih : ");
                        int j = x.nextInt();
                        switch (j) {
                            case 1:
                                h += 100000;break;
                            case 2:
                                h += 40000;break;
                            case 3:
                                h += 35000;break;
                        }
                        System.out.print("Apakah Anda ingin membeli produk yang lain (y/n): ");
                        f = x.next();
                    } while (f.equalsIgnoreCase("Y"));
                    int total = h;
                    System.out.print("Apakah Anda member (y/n): ");
                    String m = x.next();
                    System.out.println();
                    if (m.equalsIgnoreCase("Y")) {
                        System.out.println("Pilihan member");
                        System.out.println("1. Premium");
                        System.out.println("2. Gold");
                        System.out.println("3. Silver");
                        System.out.print("Anda member ");
                        int b = x.nextInt();
                        switch (b) {
                            case 1:
                                r.setPelayanan(a);
                                r.setBarang(total);
                                r.setDiskonBarang(d);
                                r.DiskonBarang();
                                r.TotalSementara();
                                r.Diskon();
                                System.out.println("Total pembayaran Anda : Rp " + r.Total());break;
                            case 2:
                                g.setPelayanan(a);
                                g.setBarang(total);
                                g.setDiskonBarang(d);
                                g.DiskonBarang();
                                g.TotalSementara();
                                g.Diskon();
                                System.out.println("Total pembayaran Anda : Rp " + g.Total());break;
                            case 3:
                                s.setPelayanan(a);
                                s.setBarang(total);
                                s.setDiskonBarang(d);
                                s.DiskonBarang();
                                s.TotalSementara();
                                s.Diskon();
                                System.out.println("Total pembayaran Anda : Rp "+s.Total());break;
                        }
                    }else if(m.equalsIgnoreCase("N")){
                        double total1 = total + a;
                        double total2 = total1 - (total1 * d);
                        System.out.println("Total pembayaran Anda : Rp "+total2);
                    }
                }else if(y.equalsIgnoreCase("N")){
                    break;
                }break;
            case 2:
                a += 55000;
                System.out.print("Apakah Anda ingin membeli produk kami (y/n): ");
                String y1 = x.next();
                if (y1.equalsIgnoreCase("Y")) {
                    int h = 0;
                    String f1;
                    do {
                        System.out.println();
                        System.out.println("Produk yang ditawarkan");
                        System.out.println("1. Alat Kosmetik");
                        System.out.println("2. Kutek");
                        System.out.println("3. Shampoo");
                        System.out.print("Produk yang Anda pilih : ");
                        int j = x.nextInt();
                        switch (j) {
                            case 1:
                                h += 100000;break;
                            case 2:
                                h += 40000;break;
                            case 3:
                                h += 35000;break;
                        }
                        System.out.print("Apakah Anda ingin membeli produk yang lain (y/n): ");
                        f1 = x.next();
                    } while (f1.equalsIgnoreCase("Y"));
                    int total = h;
                    System.out.print("Apakah Anda member (y/n): ");
                    String m = x.next();
                    System.out.println();
                    if (m.equalsIgnoreCase("Y")) {
                        System.out.println("Pilihan member");
                        System.out.println("1. Premium");
                        System.out.println("2. Gold");
                        System.out.println("3. Silver");
                        System.out.print("Anda member ");
                        int b = x.nextInt();
                        switch (b) {
                            case 1:
                                r.setPelayanan(a);
                                r.setBarang(total);
                                r.setDiskonBarang(d);
                                r.DiskonBarang();
                                r.TotalSementara();
                                r.Diskon();
                                System.out.println("Total pembayaran Anda : Rp " + r.Total());break;
                            case 2:
                                g.setPelayanan(a);
                                g.setBarang(total);
                                g.setDiskonBarang(d);
                                g.DiskonBarang();
                                g.TotalSementara();
                                g.Diskon();
                                System.out.println("Total pembayaran Anda : Rp " + g.Total());break;
                            case 3:
                                s.setPelayanan(a);
                                s.setBarang(total);
                                s.setDiskonBarang(d);
                                s.DiskonBarang();
                                s.TotalSementara();
                                s.Diskon();
                                System.out.println("Total pembayaran Anda : Rp "+s.Total());break;
                        }
                    }else if(m.equalsIgnoreCase("N")){
                        double total1 = total + a;
                        double total2 = total1 - (total1 * d);
                        System.out.println("Total pembayaran Anda : Rp "+total2);
                    }
                }else if(y1.equalsIgnoreCase("N")){
                    break;
                }break;
            case 3:
                int h = 0;
                    do {
                        System.out.println();
                        System.out.println("Produk yang ditawarkan");
                        System.out.println("1. Alat Kosmetik");
                        System.out.println("2. Kutek");
                        System.out.println("3. Shampoo");
                        System.out.print("Produk yang Anda pilih : ");
                        int j = x.nextInt();
                        switch (j) {
                            case 1:
                                h += 100000;break;
                            case 2:
                                h += 40000;break;
                            case 3:
                                h += 35000;break;
                        }
                        System.out.print("Apakah Anda ingin membeli produk yang lain (y/n): ");
                        y = x.next();
                    } while (y.equalsIgnoreCase("Y"));
                    int total = h;
                    System.out.print("Apakah Anda member (y/n): ");
                    String m = x.next();
                    System.out.println();
                    if (m.equalsIgnoreCase("Y")) {
                        System.out.println("Pilihan member");
                        System.out.println("1. Premium");
                        System.out.println("2. Gold");
                        System.out.println("3. Silver");
                        System.out.print("Anda member ");
                        int b = x.nextInt();
                        switch (b) {
                            case 1:
                                r.setBarang(total);
                                r.setDiskonBarang(d);
                                r.DiskonBarang();
                                r.TotalSementara1();
                                r.Diskon1();
                                System.out.println("Total pembayaran Anda : Rp " + r.Total1());break;
                            case 2:
                                g.setBarang(total);
                                g.setDiskonBarang(d);
                                g.DiskonBarang();
                                g.TotalSementara1();
                                g.Diskon1();
                                System.out.println("Total pembayaran Anda : Rp " + g.Total1());break;
                            case 3:
                                s.setBarang(total);
                                s.setDiskonBarang(d);
                                s.DiskonBarang();
                                s.TotalSementara1();
                                s.Diskon1();
                                System.out.println("Total pembayaran Anda : Rp "+s.Total1());break;
                        }
                    }else if(m.equalsIgnoreCase("N")){
                        double total1 = total + a;
                        double total2 = total1 - (total1 * d);
                        System.out.println("Total pembayaran Anda : Rp "+total2);
                    }break;
        }
    }
}
