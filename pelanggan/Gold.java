package pelanggan;
public class Gold extends Member {

    public Gold(String nm, int ids) {
        super(nm, ids);
    }

    public double getDiskon() {
        return super.getDiskon() + 0.15;
    }

    public String toString() {
        return String.format("%s\n%-6s : %s",super.toString(), "Member", "Gold");
    }
}
