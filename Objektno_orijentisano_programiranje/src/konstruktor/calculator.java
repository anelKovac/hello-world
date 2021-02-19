package konstruktor;

public class calculator
{
    double broj1;
    double broj2;

    calculator(double broj1, double broj2 )
    {
        this.broj1 = broj1;
        this.broj2 = broj2;
    }
    double saberi()
    {
        return broj1 + broj2;
    }
    double oduzmi()
    {
        return broj1 - broj2;
    }
    double pomnozi()
    {
        return broj1 * broj2;
    }
    double podijeli()
    {
        return broj1 / broj2;
    }
}
class test
{
    public static void main(String[] args)
    {
        calculator calc = new calculator(10, 5);
        double rez = calc.saberi();
        System.out.println(rez);
    }
}