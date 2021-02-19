package konstruktor;

public class car
{
    String make;
    String model;

    car(String make, String model)
    {
        this.make = make; //na ovaj nacin prostupamo varijabli make unutar klase i ovo je ispravno
        model = model;   //na ovaj nacin pristupamo varijabli model unutar konstruktora i ovo nije ispravno
    }
}
