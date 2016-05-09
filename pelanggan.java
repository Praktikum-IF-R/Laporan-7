package BAB7.definisi;
public abstract class pelanggan {
    private double harga;
    double a, b, c, d, e;
    pelanggan(double a, double b, double c, double d, double e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    public abstract void namaPelanggan();
    double pengaturanHarga(int c) {
        switch (c) {
            case 1:
                harga = a;
                break;
            case 2:
                harga = b;
                break;
            case 3:
                harga = this.c;
                break;
            case 4:
                harga = d;
                break;
            case 5:
                harga = e;
                break;
            default:
                break;
        }
        return harga;
    }
}
