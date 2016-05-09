package Laporan7;

import java.util.Scanner;

public class mainSalon1 {

    public static void main(String[] args) {
        Salon anggotasalon[] = new Salon[4];
        Scanner us = new Scanner(System.in);
        Scanner ui = new Scanner(System.in);
        String menu;
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        System.out.println("-----------------------------------------");
        System.out.println("      Masukkan Kartu Anggota Anda !      ");
        System.out.println("    1. PREMIUM                           ");
        System.out.println("    2. GOLD                              ");
        System.out.println("    3. SILVER                            ");
        System.out.println("    4. TIDAK SALAH SATU ANGGOTA          ");
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan Pilihan  :                       ");
        int anggota = ui.nextInt();
        System.out.println("");
        do {
            System.out.println("- - - - - - - - - - - - - - - - - - - - -");
            System.out.println("\t\tSALON ELISA");
            System.out.println("\t1. LAYANAN JASA");
            System.out.println("\t2. BELI PRODUK JUALAN");
            System.out.println("\t3. KELUAR");
            System.out.println("- - - - - - - - - - - - - - - - - - - - -");
            System.out.print("Masukkan Pilihan  :                            ");
            int pilihan = ui.nextInt();

            switch (pilihan) {
                case 1:
                    String pij;
                    do {
                        System.out.println("\t1. LAYANAN JASA: ");
                        System.out.println("1. Potong Rambut");
                        System.out.println("2. Toning Rambut");
                        System.out.println("3. Creambath");
                        System.out.println("4. Smooting");
                        System.out.print("Masukkan Pilihan     : ");
                        int pilihanjasa = ui.nextInt();
                        switch (anggota) {
                            case 1:
                                anggotasalon[0] = new AnggotaPremium(0);
                                anggotasalon[0].setHargaJasa(pilihanjasa);
                                break;
                            case 2:
                                anggotasalon[1] = new AnggotaGold(0);
                                anggotasalon[1].setHargaJasa(pilihanjasa);

                                break;
                            case 3:
                                anggotasalon[2] = new AnggotaSilver(0);
                                anggotasalon[2].setHargaJasa(pilihanjasa);
                                break;
                            case 4:
                                anggotasalon[3] = new TidakAnggota();
                                anggotasalon[3].setHargaJasa(pilihanjasa);
                                break;
                            default:
                                System.out.println("MASUKAN ANDA SALAH !");
                                break;
                        }
                        System.out.println("");
                        System.out.print("Inginkan Jasa Lagi? (Y/T) : ");
                        pij = us.nextLine();
                        System.out.println("");
                    } while (pij.equalsIgnoreCase("Y"));
                    System.out.println("");
                    if (pij.equalsIgnoreCase("T")) {
                        anggotasalon[anggota - 1].Totalakhir();
                    }
                    break;
                case 2:
                    String pid;
                    System.out.print("Masukkan Diskon Untuk Produk Saat ini: ");
                    int dpp = ui.nextInt();
                    do {
                        System.out.println("\t2. BELI PRODUK JUALAN: ");
                        System.out.println("1. Vitamin Rambut");
                        System.out.println("2. Cream Rambut");
                        System.out.println("3. Shampo Spesial");
                        System.out.println("4. Alat Semir Lengkap");
                        System.out.print("Masukkan Pilihan           : ");
                        int pilihanproduk = ui.nextInt();
                        System.out.print("Berapa Banyak              : ");
                        int bnyk = ui.nextInt();
                        switch (anggota) {
                            case 1:
                                anggotasalon[0] = new AnggotaPremium(dpp);
                                anggotasalon[0].setHargaProduk(pilihanproduk, bnyk);
                                break;
                            case 2:
                                anggotasalon[1] = new AnggotaGold(dpp);
                                anggotasalon[1].setHargaProduk(pilihanproduk, bnyk);
                                break;
                            case 3:
                                anggotasalon[2] = new AnggotaSilver(dpp);
                                anggotasalon[2].setHargaProduk(pilihanproduk, bnyk);
                                break;
                            case 4:
                                anggotasalon[3] = new TidakAnggota();
                                anggotasalon[3].setHargaProduk(pilihanproduk, bnyk);
                                break;
                            default:
                                System.out.println("MASUKAN ANDA SALAH !");
                                break;
                        }
                        System.out.println("");
                        System.out.print("Inginkan Jasa Lagi? (Y/T) : ");
                        pij = us.nextLine();
                        System.out.println("");
                    } while (pij.equalsIgnoreCase("Y"));
                    if (pij.equalsIgnoreCase("T")) {
                        anggotasalon[anggota - 1].Totalakhir();
                    }
                    break;
                case 3:
                    anggotasalon[anggota - 1].Totalakhir();
                    System.exit(0);
                    break;

                default:
                    System.out.println("PILIHAN TIDAK ADA!");
                    break;
            }
            System.out.println("");
            System.out.print("TAMPLIKAN MENU LAGI? (Y/T) : ");
            menu = us.nextLine();
        } while (menu.equalsIgnoreCase("Y"));
        System.out.println("");
        System.out.println("TERIMAKASIH ATAS KUNJUNGAN ANDA :) ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
    }
}
