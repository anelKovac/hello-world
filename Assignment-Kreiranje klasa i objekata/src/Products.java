
public class Products {
    public static void main(String[] args) {

        Product prod = new Product("Sir Gauda", "43489762340", 4.9);
        System.out.println(prod.Info() + "Cijena + pdv: " + prod.total_price() + " KM" + "\n");

        Chocolate cok = new Chocolate("Cokolada Kandi", "123456789", 1.6, 100);
        System.out.println(cok.Info());

        Wine wine = new Wine("Vino Banylus", "9876543321", 70, 1.5);
        System.out.println(wine.Info());

    }
}
