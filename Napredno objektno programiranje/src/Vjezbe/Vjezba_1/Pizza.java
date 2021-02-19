package Vjezbe.Vjezba_1;

public class Pizza extends Product{

    public Pizza(String name, double price) {
        super(name, price);
        super.type = "pizza";
    }

    @Override
    public double countPrice() {
        return this.cijena + this.cijena * 0.1;
    }
}
