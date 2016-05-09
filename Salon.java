package salon;
public abstract class Salon {

    private String name, product, service, Product, Service;
    private double servicePrice, productPrice;

    public Salon(String name, String service , String product) {
        this.name = name;        
        this.service = service;
        this.product = product;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public String getService() {
        return service;
    }

    public double getServicePrice() { 
        if (service.equalsIgnoreCase("Hair Mask")) {
            servicePrice = 75000;
        } else if (service.equalsIgnoreCase("Hair Spa")) {
            servicePrice = 110000;
        } else if (service.equalsIgnoreCase("Creambath")) {
            servicePrice = 50000;
        } else if (service.equalsIgnoreCase("Hair Color")) {
            servicePrice = 200000;
        } else if (service.equalsIgnoreCase("Masker")) {
            servicePrice = 27000;
        } else if (service.equalsIgnoreCase("Facial")) {
            servicePrice = 95000;
        } else if (service.equalsIgnoreCase("Milk Massage")) {
            servicePrice = 198000;
        }
        return servicePrice;
    }

    public double getProductPrice() {
        if (product.equalsIgnoreCase("Soap")) {
            productPrice = 25000;
        } else if (product.equalsIgnoreCase("Conditioner")) {
            productPrice = 53000;
        } else if (product.equalsIgnoreCase("Hair Spray")) {
            productPrice = 48000;
        } else if (product.equalsIgnoreCase("Shampoo")) {
            productPrice = 50000;
        } else if (product.equalsIgnoreCase("Hair Vitamin")) {
            productPrice = 35000;
        } else if (product.equalsIgnoreCase("Body Lotion")) {
            productPrice = 53000;
        } else if (product.equalsIgnoreCase("Sun Screen")) {
            productPrice = 61000;
        } else if (product.equalsIgnoreCase("Night Serum")) {
            productPrice = 190000;
        } else if (product.equalsIgnoreCase("Night Cream")) {
            productPrice = 77000;
        } else if (product.equalsIgnoreCase("Day Cream")) {
            productPrice = 107000;
        }
        return productPrice;
    }

    public String service() {
        if (service.equalsIgnoreCase("Hair Mask")) {
            Service = "75000";
        } else if (service.equalsIgnoreCase("Hair Spa")) {
            Service = "110000";
        } else if (service.equalsIgnoreCase("Creambath")) {
            Service = "50000";
        } else if (service.equalsIgnoreCase("Hair Color")) {
            Service = "200000";
        } else if (service.equalsIgnoreCase("Masker")) {
            Service = "27000";
        } else if (service.equalsIgnoreCase("Facial")) {
            Service = "95000";
        } else if (service.equalsIgnoreCase("Milk Massage")) {
            Service = "198000";
        }
        return Service;
    }

    public String product() {
        if (product.equalsIgnoreCase("Soap")) {
            Product = "25000";
        } else if (product.equalsIgnoreCase("Conditioner")) {
            Product = "53000";
        } else if (product.equalsIgnoreCase("Hair Spray")) {
            Product = "48000";
        } else if (product.equalsIgnoreCase("Shampoo")) {
            Product = "50000";
        } else if (product.equalsIgnoreCase("Hair Vitamin")) {
            Product = "35000";
        } else if (product.equalsIgnoreCase("Body Lotion")) {
            Product = "53000";
        } else if (product.equalsIgnoreCase("Sun Screen")) {
            Product = "61000";
        } else if (product.equalsIgnoreCase("Night Serum")) {
            Product = "190000";
        } else if (product.equalsIgnoreCase("Night Cream")) {
            Product = "77000";
        } else if (product.equalsIgnoreCase("Day Cream")) {
            Product = "107000";
        }
        return Product;
    }

    public abstract double getTotalPrice();

    public String getDescription() {
        return getName() + "\n";
    }
}
