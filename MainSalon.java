package salonku;

import java.util.Scanner;

public class MainSalon {

    static Premium P[];
    static Gold G[];
    static Silver S[];
    static Umum U[];

    public static void main(String Args[]) {
        Scanner in = new Scanner(System.in);
        Salon s = new Salon();
        int masuk;
        do {
            System.out.print("\n\t====== SELAMAT DATANG ======\n\tDI SISTEM CITRA HAIR BEAUTY\n\n1.Masuk\n2.Keluar\npilihan : ");
            masuk = in.nextInt();
            if (masuk == 1) {
                System.out.println("\n===========================================");
                System.out.print("Admin\t\t\t: ");
                String admin = in.next();
                System.out.print("Diskon hari ini (%)\t: ");
                int diskon = in.nextInt();
                System.out.println("===========================================");
                System.out.print("Nama pelanggan\t: ");
                String nama = in.next();
                System.out.print("ID pelanggan\t: ");
                String id = in.next();
                System.out.println("Kartu member?\n\t1.Premium\n\t2.Gold\n\t3.Silver\n\t4.Non-Member");
                System.out.print("Pilihan : ");
                int member = in.nextInt();
                System.out.println("===========================================\n");
                System.out.println("Pilihan Jasa dan Produk\n");
                System.out.println("- Kategori Jasa -\n1.Hair cut\n2.Hair mask\n3.Creambath\n4.Smoothing");
                System.out.println("- Kategori Produk -\n5.Hair tonic\n6.Hair Serum\n7.Conditioner");
                System.out.print("Banyak jasa dan produk yang dipesan : ");
                int jumlah = in.nextInt();
                System.out.println("===========================================");
                double HargaTotal[] = new double[jumlah];
                String Daftar[] = new String[jumlah];
                int pilihan[] = new int[jumlah];
                if (member == 1) {
                    P = new Premium[jumlah];
                    System.out.print("\nANGGOTA PREMIUM\n");
                    for (int i = 0; i < jumlah; i++) {
                        System.out.printf("\n%-1s%-1s%-1s%-5s", "", "(", (i + 1), ") No : ");
                        pilihan[i] = in.nextInt();
                        P[i] = new Premium(id, nama);
                        P[i].setTotal(s.getHarga(pilihan[i]));
                        P[i].setDaftar(s.getProduk(pilihan[i]));
                        HargaTotal[i] = P[i].Total();
                        Daftar[i] = P[i].daftar;
                        System.out.printf("%10s%-22s\n%10s%-4s%-15s", " : ", Daftar[i], " : ", "Rp.", HargaTotal[i]);
                    }
                } else if (member == 2) {
                    S = new Silver[jumlah];
                    System.out.print("\nANGGOTA  SILVER\n");
                    for (int i = 0; i < jumlah; i++) {
                        System.out.printf("\n%-1s%-1s%-1s%-5s", "", "(", (i + 1), ") No : ");
                        pilihan[i] = in.nextInt();
                        S[i] = new Silver(id, nama);
                        S[i].setTotal(s.getHarga(pilihan[i]));
                        S[i].setDaftar(s.getProduk(pilihan[i]));
                        HargaTotal[i] = S[i].Total();
                        Daftar[i] = S[i].daftar;
                        System.out.printf("%10s%-22s\n%10s%-4s%-15s", " : ", Daftar[i], " : ", "Rp.", HargaTotal[i]);
                    }
                } else if (member == 3) {
                    G = new Gold[jumlah];
                    System.out.print("\nANGGOTA  GOLD\n");
                    for (int i = 0; i < jumlah; i++) {
                        System.out.printf("\n%-1s%-1s%-1s%-5s", "", "(", (i + 1), ") No : ");
                        pilihan[i] = in.nextInt();
                        G[i] = new Gold(id, nama);
                        G[i].setTotal(s.getHarga(pilihan[i]));
                        G[i].setDaftar(s.getProduk(pilihan[i]));
                        HargaTotal[i] = G[i].Total();
                        Daftar[i] = G[i].daftar;
                        System.out.printf("%10s%-22s\n%10s%-4s%-15s", " : ", Daftar[i], " : ", "Rp.", HargaTotal[i]);
                    }
                } else if (member == 4) {
                    U = new Umum[jumlah];
                    System.out.print("\nANGGOTA  UMUM\n");
                    for (int i = 0; i < jumlah; i++) {
                        System.out.printf("\n%-1s%-1s%-1s%-5s", "", "(", (i + 1), ") No : ");
                        pilihan[i] = in.nextInt();
                        U[i] = new Umum(id, nama);
                        U[i].setTotal(s.getHarga(pilihan[i]));
                        U[i].setDaftar(s.getProduk(pilihan[i]));
                        HargaTotal[i] = U[i].Total1();
                        Daftar[i] = U[i].daftar;
                        System.out.printf("%10s%-22s\n%10s%-4s%-15s", " : ", Daftar[i], " : ", "Rp.", HargaTotal[i]);
                    }
                }
                System.out.print("\n===========================================\nCetak struk pembelian(y/n) ? ");
                String struk = in.next();
                System.out.println("===========================================");
                if (struk.equalsIgnoreCase("Y")) {
                    System.out.println("\n\t    STRUK PEMBELIAN\n\t   CITRA HAIR BEAUTY\n\t    WATUGONG NO. 11\n\t\tMALANG\n\t  Telp :0821 989-087\n\n");
                    int sum = 0;
                    for (int i = 0; i < jumlah; i++) {
                        System.out.printf("%-1s%-6s%-20s%-4s%-10s\n", "", "( * )", Daftar[i], "Rp.", HargaTotal[i]);
                        sum += HargaTotal[i];
                    }
                    System.out.println("--------------------------------------( + )");
                    System.out.printf("%-1s%-6s%-20s%-4s%-10s\n", "", "( * )", "Total", "Rp.", sum);
                    System.out.print(" ( * ) Bayar\t\t   Rp. ");
                    double totalan = in.nextDouble();
                    System.out.println("--------------------------------------( - )");
                    System.out.printf("%-1s%-6s%-20s%-4s%-10s\n", "", "( * )", "Kembalian", "Rp.", (totalan - sum));
                    System.out.println("-------------------------------------------\n\t     TERIMA  KASIH\n===========================================");
                }
            }
        } while (masuk != 2);
        System.out.println("===========================================\n\t\t   EXIT\n===========================================");
    }
}
