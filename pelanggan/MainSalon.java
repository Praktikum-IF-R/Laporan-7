package pelanggan;
import java.util.Scanner;
public class MainSalon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inint = new Scanner(System.in);
        int member, id, pil;
        String nama, a, b;
        Produk p = new Produk();
        Pelanggan o[] = new Pelanggan[4];
        System.out.println("-----------------------------------");
        System.out.println("-------WELCOME TO YUK NYALON-------");
        System.out.println("-----------------------------------");
        System.out.print("Masukkan nama anda : ");
        nama = in.nextLine();
        System.out.print("Punya Kartu Member (y/n) ? ");
        a = in.nextLine();
        if (a.equalsIgnoreCase("y")) {
            System.out.println("Jenis Member?\n1. Premium\n2. Gold\n3. Silver");
            System.out.print("Masukkan pilihan : ");
            member = inint.nextInt();
            System.out.print("Masukkan ID : ");
            id = inint.nextInt();
            switch (member) {
                case 1:
                    o[0] = new Premium(nama, id);
                    break;
                case 2:
                    o[1] = new Gold(nama, id);
                    break;
                case 3:
                    o[2] = new Silver(nama, id);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    System.exit(0);
            }
        } else {
            o[3] = new Nonmember(nama);
        }
        while (true) {
            System.out.println("\nLAYANAN : ");
            System.out.println("1. Smoothing");
            System.out.println("2. Rebonding");
            System.out.println("3. Bleaching");
            System.out.println("4. Coloring");
            System.out.println("\nPRODUK :");
            System.out.println("5. Lotion");
            System.out.println("6. Cream");
            System.out.println("7. Lipstick");
            System.out.println("8. Make-Up");
            System.out.println("9. Mencetak Struk anda");
            System.out.println("0. Keluar");
            System.out.print("\nMasukkan pilihan Pilihan anda : ");
            pil = inint.nextInt();
            if (pil == 9) {
                break;
            }
            if (pil == 0) {
                System.exit(0);
            }
            System.out.print("Yakin dengan pilihan anda (y/n)? ");
            b = in.nextLine();
            if (b.equalsIgnoreCase("y")) {
                p.setHargaLabel(pil - 1);
            }
        }
        System.out.println("--------------------------------");
        System.out.println("------Struk Pembayaran Anda-----");
        System.out.println("--------------------------------");
        for (Pelanggan i : o) {
            if (i != null) {
                System.out.println(i.toString());
            }
        }
        System.out.println("--------------------------------");
        int[] c = p.getHarga();
        String[] d = p.getNama();
        for (int i = 0; i < p.getHarga().length; i++) {
            if (c[i] != 0 && d[i] != null) {
                System.out.println(d[i] + " \t: Rp. " + c[i]);
            }
        }
        for (Pelanggan i : o) {
            if (i != null) {
                double diskon = p.getTotal() * i.getDiskon();
                double total = p.getTotal() - diskon;
                System.out.printf("Diskon \t\t: Rp. %.2f\n", diskon);
                System.out.printf("TOTAL TAGIHAN\t: Rp. %.2f\n", total);
                System.out.println("--------------------------------");
                break;
            }
        }
    }
}
