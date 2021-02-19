public class Wine extends Product  {
    private double volume;
    private static final double WINE_TAX = 1.1;

    public Wine(String name, String bar_code, double core_price, double volume){
        super(name, bar_code, core_price);
        this.volume = volume;
    }

    @Override
    public double total_price(){
        return super.total_price() * 1.1;
    }

    @Override
    public String Info(){
        return super.Info() +
                "Zapremina boce: " + volume + " l" +
                "\nCijena + pdv " + this.total_price() + " KM"  + "\n";
    }

}
