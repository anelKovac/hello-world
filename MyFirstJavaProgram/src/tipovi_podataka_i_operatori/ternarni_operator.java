package tipovi_podataka_i_operatori;

/**
 * Ternarni operator se koristi za dodijelu vrijeednosti, ali na osnovu predefinisanog uslova
 * U slijedecemo programu mozemo vridjeti primjer upotrebe ovog operatora
 */
public class ternarni_operator
{
    public static void main(String[] args)
    {
            int age = 15;
            String message = (age<18) ? "You can't enter" : "Welcome";
            System.out.println(message);
    }
}
