package BAB7.definisi;
import java.util.*;
public class bukanAnggota extends pelanggan {
    String nama;
    Scanner in = new Scanner(System.in);
    bukanAnggota(double a, double b, double c, double d, double e) {
        super(a, b, c, d, e);
    }
    public void namaPelanggan() {
        nama = in.nextLine();
    }
    public void pilihan(int a){
        pengaturanHarga(a);
    }
}
