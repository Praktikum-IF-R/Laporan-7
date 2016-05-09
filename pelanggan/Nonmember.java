package pelanggan;
public class Nonmember extends Pelanggan {

    public Nonmember(String nm) {
        super(nm);
    }

    public double getDiskon() {
        return 0.1;
    }
}
