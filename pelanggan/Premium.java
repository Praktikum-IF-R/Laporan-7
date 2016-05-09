package pelanggan;
public class Premium extends Member {

    public Premium(String nm, int ids) {
        super(nm, ids);
    }

    public double getDiskon() {
        return super.getDiskon() + 0.2;
    }

    public String toString() {
        return String.format("%s\n%-6s : %s",super.toString(), "Member", "Premium");
    }
}
