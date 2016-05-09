package pelanggan;
public abstract class Pelanggan {

    private String nama;

    public Pelanggan(String nm) {
        nama = nm;
    }

    public String getNama() {
        return nama;
    }

    public abstract double getDiskon();

    public String toString() {
        return String.format("%-6s : %s", "Nama", nama);
    }
}
