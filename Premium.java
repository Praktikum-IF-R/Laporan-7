package salon;
public class Premium extends Salon{
    private String member;
    private double totalPrice, productSale, serviceSale;

    public Premium(String name, String service, String product, String member) {
        super(name, service, product);
        this.member = member;
    }

    @Override
    public double getTotalPrice() {
        serviceSale = getServicePrice() - (getServicePrice() * 0.2);
        productSale = getProductPrice() - (getProductPrice() * 0.1);
        totalPrice = serviceSale + productSale;
        return totalPrice;
    }

    public String getDescription() {
        return super.getDescription()
                + "Membership : " + member + "\n"
                + "Purchase   :  Service = " + getService() + " " + getServicePrice() + "\t--Sale 20%\n"
                + "              Product = " + getProduct() + " " + getProductPrice() + "\t--Sale 10%";
    }
}
