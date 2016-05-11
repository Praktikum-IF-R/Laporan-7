package salonku;
public class Umum extends Anggota {
    public Umum(String id, String nama) {
        super(id, nama);
    }
    @Override
    public double getDiskon() {
        return 0;
    }
    public double Total1() {
        return Total;
    }
}
