package salon;
public class Pembeli extends Salon  {
    
    private String member;
    private double totalPrice, productSale, serviceSale;

    public Pembeli(String name, String service, String product, String member) {
        super(name, service, product);
        this.member = member;
    }

    public double getTotalPrice() {
        serviceSale = getServicePrice() * 0;
        productSale = getProductPrice() * 0;
        totalPrice = getServicePrice() + getProductPrice() - serviceSale - productSale;
        return totalPrice;
    }

    public String getDescription() {
        return super.getDescription()
                + "Membership : " + member + "\n"
                + "Purchase   :  Service = " + getService() + " " + getServicePrice() + "\t--NO Sale\n"
                + "              Product = " + getProduct() + " " + getProductPrice() + "\t--NO Sale ";
    }
}
