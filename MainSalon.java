package mainsalon;
import java.util.Scanner;
public class MainSalon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan1, pilihan2;
        String jasa, jasa1 = "", jasa2 = "", jasa3 = "";
        String produk, produk1 = "", produk2 = "", produk3 = "";
        double diskon = 0, hj = 0, hp = 0;
        do {
            System.out.println("-------------------------------------");
            System.out.println("       Maiden's Beauty Salon");
            System.out.println("-------------------------------------");
            System.out.println("1. Jasa");
            System.out.println("2. Beli Produk");
            System.out.println("3. Selesai");
            System.out.print("Pilihan : ");
            pilihan1 = input.nextInt();
            System.out.println("-------------------------------------");
            switch (pilihan1) {
                case 1:
                    do {
                        System.out.println("1. Hair Cut (Rp 50.000)");
                        System.out.println("2. Creambath (Rp 25.000)");
                        System.out.println("3. Facial (Rp 100.000)");
                        System.out.print("Pilihan : ");
                        pilihan2 = input.nextInt();
                        System.out.println("-------------------------------------");
                        switch (pilihan2) {
                            case 1:
                                jasa1 = "-Hair Cut \n";
                                hj += 50000;
                                break;
                            case 2:
                                jasa2 = "-Creambath \n";
                                hj += 25000;
                                break;
                            case 3:
                                jasa3 = "-Facial \n";
                                hj += 100000;
                        }
                        System.out.println("Tambah jasa?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.print("Pilihan : ");
                        pilihan2 = input.nextInt();
                        System.out.println("-------------------------------------");
                    } while (pilihan2 == 1);
                    break;
                case 2:
                    do {
                        System.out.println("1. Masker (Rp 20.000)");
                        System.out.println("2. Cat Rambut (Rp 30.000)");
                        System.out.println("3. Kutek (Rp 15.000)");
                        System.out.print("Pilihan : ");
                        pilihan2 = input.nextInt();
                        switch (pilihan2) {
                            case 1:
                                produk1 = "-Masker \n";
                                hp += 20000;
                                break;
                            case 2:
                                produk2 = "-Cat Rambut \n";
                                hp += 30000;
                                break;
                            case 3:
                                produk3 = "-Kutek \n";
                                hp += 15000;
                        }
                        System.out.println("Tambah Pembelian Produk?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.print("Pilihan : ");
                        pilihan2 = input.nextInt();
                        System.out.println("-------------------------------------");
                        if (pilihan2 == 2) {
                            System.out.print("Diskon promo (%): ");
                            diskon = input.nextDouble();
                        }
                    } while (pilihan2 == 1);
                    break;
                case 3:
                    System.out.println("Apakah Anda Member?");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak");
                    System.out.print("Pilihan : ");
                    pilihan2 = input.nextInt();
                    System.out.println("-------------------------------------");
                    if (pilihan2 == 1) {
                        System.out.println("Pilih Member : ");
                        System.out.println("1. Premium");
                        System.out.println("2. Gold");
                        System.out.println("3. Silver");
                        System.out.print("Pilihan : ");
                        pilihan2 = input.nextInt();
                        System.out.println("");
                        switch (pilihan2) {
                            case 1:
                                jasa = jasa1 + jasa2 + jasa3;
                                produk = produk1 + produk2 + produk3;
                                Premium member1 = new Premium(jasa, produk, hj, hp, diskon);
                                if (jasa.equalsIgnoreCase("")) {
                                    System.out.println("Tidak Ada Penggunaan Jasa");
                                } else {
                                    System.out.println("Anda Menggunakan Jasa :\n" + member1.getJasa());
                                }
                                if (produk.equalsIgnoreCase("")) {
                                    System.out.println("Tidak Ada Pembelian Produk");
                                } else {
                                    System.out.println("Anda Membeli Produk : \n" + member1.getProduk());
                                }
                                System.out.println("Total Pembayaran : Rp " + member1.getTotalPembayaran());
                                System.out.println("-------------------------------------");
                                break;
                            case 2:
                                jasa = jasa1 + jasa2 + jasa3;
                                produk = produk1 + produk2 + produk3;
                                Gold member2 = new Gold(jasa, produk, hj, hp, diskon);
                                if (jasa.equalsIgnoreCase("")) {
                                    System.out.println("Tidak Ada Penggunaan Jasa");
                                } else {
                                    System.out.println("Anda Menggunakan Jasa :\n" + member2.getJasa());
                                }
                                if (produk.equalsIgnoreCase("")) {
                                    System.out.println("Tidak Ada Pembelian Produk");
                                } else {
                                    System.out.println("Anda Membeli Produk : \n" + member2.getProduk());
                                }
                                System.out.println("Total Pembayaran : Rp " + member2.getTotalPembayaran());
                                System.out.println("-------------------------------------");
                                break;
                            case 3:
                                jasa = jasa1 + jasa2 + jasa3;
                                produk = produk1 + produk2 + produk3;
                                Silver member3 = new Silver(jasa, produk, hj, hp, diskon);
                                if (jasa.equalsIgnoreCase("")) {
                                    System.out.println("Tidak Ada Penggunaan Jasa");
                                } else {
                                    System.out.println("Anda Menggunakan Jasa :\n" + member3.getJasa());
                                }
                                if (produk.equalsIgnoreCase("")) {
                                    System.out.println("Tidak Ada Pembelian Produk");
                                } else {
                                    System.out.println("Anda Membeli Produk : \n" + member3.getProduk());
                                }
                                System.out.println("Total Pembayaran : Rp " + member3.getTotalPembayaran());
                                System.out.println("-------------------------------------");
                                break;
                        }
                    } else {
                        double total = hj + hp;
                        jasa = jasa1 + jasa2 + jasa3;
                        produk = produk1 + produk2 + produk3;
                        if (jasa.equalsIgnoreCase("")) {
                            System.out.println("Tidak Ada Penggunaan Jasa");
                        } 
                        else {
                            System.out.println("Anda Menggunakan Jasa :\n" + jasa);
                        }
                        if (produk.equalsIgnoreCase("")) {
                            System.out.println("Tidak Ada Pembelian Produk");
                        } 
                        else {
                            System.out.println("Anda Membeli Produk : \n" + jasa);
                        }
                        System.out.println("Total Pembayaran : Rp "+total);
                        System.out.println("-------------------------------------");
                    }
            }
        } while (pilihan1 < 3);
    }
}