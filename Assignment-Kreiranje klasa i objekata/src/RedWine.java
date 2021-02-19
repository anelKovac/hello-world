public class RedWine extends Wine{
    private String type;

    public RedWine(String name, String bar_code, double core_price, double volume, String type){
        super(name, bar_code, core_price, volume);
            this.type = type;
    }
    @Override
    public String Info(){
        return super.Info() + "Tip vina: " + type + "\n";
    }
}
