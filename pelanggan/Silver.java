package pelanggan;
public class Silver extends Member {

    public Silver(String nm, int ids) {
        super(nm, ids);
    }

    public double getDiskon() {
        return super.getDiskon() + 0.1;
    }

    public String toString() {
        return String.format("%s\n%-6s : %s",super.toString(), "Member", "Silver");
    }
}
