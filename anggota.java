package BAB7.definisi;
import java.util.Scanner;
public class anggota extends pelanggan {
    String nama;
    int kategori;
    Scanner in = new Scanner(System.in);
    anggota(double a, double b, double c, double d, double e) {
        super((a -= a * 0.1), (b -= b * 0.1), (c -= c * 0.1), (d -= d * 0.1), (e -= e * 0.1));
    }
    public void namaPelanggan() {
        nama = in.nextLine();
    }
    public void kategori() {
        kategori = in.nextInt();
    }
    public void pilihan(int a) {
        pengaturanHarga(a);
    }
}
