package BAB7.definisi;
import java.util.*;
public class mainClass {
    static double jasa = 250000;
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("apakah anda member : (Y/n)");
        String pil = in.next();
        pelanggan jenis[] = new pelanggan[4];
        jenis[0] = new anggota(200000, 240000, 260000, 210000, 204000);
        if (pil.equalsIgnoreCase("y")) {
            System.out.print("masukan nama : ");
            jenis[0].namaPelanggan();
            System.out.println("kategori anda :\n1. premium\n2. gold\n3. silver");
            int i = in.nextInt();
            switch (i) {
                case 1:
                    premium prem = new premium(jenis[0].a, jenis[0].b, jenis[0].c, jenis[0].d, jenis[0].e);
                    beli(prem.pengaturanHarga(pil()));
                    jasa *= 0.8;
                    break;
                case 2:
                    gold gol = new gold(jenis[0].a, jenis[0].b, jenis[0].c, jenis[0].d, jenis[0].e);
                    beli(gol.pengaturanHarga(pil()));
                    jasa *= 0.85;
                    break;
                case 3:
                    silver sil = new silver(jenis[0].a, jenis[0].b, jenis[0].c, jenis[0].d, jenis[0].e);
                    beli(sil.pengaturanHarga(pil()));
                    jasa *= 0.9;
                    break;
            }
        } else {
            jenis[1] = new bukanAnggota(200000, 240000, 260000, 210000, 204000);
            System.out.print("masukan nama : ");
            jenis[1].namaPelanggan();
            beli(jenis[1].pengaturanHarga(pil()));
        }
    }
    static int pil() {
        Scanner in = new Scanner(System.in);
        System.out.println("masukan pilihan : ");
        System.out.println("\n1. oriflame\t200000\n2. oval\t\t240000\n3. garnier\t260000\n4. dove\t\t210000\n5. vaseline\t204000");
        int a = in.nextInt();
        return a;
    }
    static void beli(double harga) {
        Scanner in = new Scanner(System.in);
        System.out.println("mau beli berapa : ");
        int a = in.nextInt();
        System.out.println("total harga  : " + (harga * a) + jasa);
    }
}
