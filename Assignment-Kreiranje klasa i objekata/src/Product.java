public class Product {
    private String prod_name;
    private String bar_code;
    private double core_price;
    static final double TAX = 1.2;

    public Product() {

    }

    public Product(String name, String code, double price) {
        prod_name = name;
        bar_code = code;
        core_price = price;
    }

    public double total_price() {
        double total_price = core_price * TAX;
        return total_price;
    }

    public String Info() {
        return "Naziv proizvoda: " + prod_name + "\n" +
                "Bar kod: " + bar_code + "\n" +
                "Osnovna cijena: " + core_price + " KM" + "\n" ;
    }
}
