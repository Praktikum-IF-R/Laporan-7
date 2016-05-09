package pelanggan;
public class Member extends Pelanggan {

    private int id;

    public Member(String nm, int ids) {
        super(nm);
        id = ids;
    }

    public double getDiskon() {
        return 0.1;
    }

    public String toString() {
        return String.format("%s\n%-6s : %d",super.toString(), "Id", id);
    }
}
