package Vjezbe.Vjezba_1;

public class Sandwich extends Product{
    public Sandwich(String name, double cijena) {
        super(name, cijena);
    }

    @Override
    public double countPrice() {
        return this.cijena + this.cijena * 0.15;
    }
}
