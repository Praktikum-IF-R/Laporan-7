package salonku;
public class Gold extends Anggota {
    public Gold(String id, String nama) {
        super(id, nama);
    }
    @Override
    public double getDiskon() {
        return 0.15 * Total;
    }
}
