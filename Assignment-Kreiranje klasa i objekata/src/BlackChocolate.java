public class BlackChocolate extends Chocolate{
    private double cocoa;

    public BlackChocolate(String name, String bar_code, double core_price, int weight, double postotakKakaoa){
        super(name, bar_code, core_price, weight);
        cocoa = postotakKakaoa;
    }

    @Override
    public String Info(){
        return super.Info() + "Postotak kakaoa: " + cocoa + " %\n";
    }
}
