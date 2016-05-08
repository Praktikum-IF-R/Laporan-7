package salonku;
public class Premium extends Anggota {
    public Premium(String id, String nama) {
        super(id, nama);
    }
    @Override
    public double getDiskon() {
        return 0.2 * Total;
    }
}
