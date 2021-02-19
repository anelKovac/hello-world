public class Chocolate extends Product {
    private int weight;

    public Chocolate(String name, String bar_code, double core_price, int weight ){
        super(name, bar_code, core_price);
        this.weight = weight;
    }

    @Override
    public String Info(){
        return super.Info() + "Tezina: " + weight + " g"
                + "\nCijena + pdv: "  + super.total_price() + " KM" + "\n";
    }

}
