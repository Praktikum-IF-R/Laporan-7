package salonku;
public class Silver extends Anggota {
    public Silver(String id, String nama) {
        super(id, nama);
    }
    @Override
    public double getDiskon() {
        return 0.1 * Total;
    }
}
