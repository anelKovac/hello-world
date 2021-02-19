package kontrola_toka;

/**
 * Dati su ulazni podaci za jedno vozilo: String carMake = "Ford"; int doors = 4;
 * Napraviti uslovnu konstrukciju koja ce provjeravati da li je proizvodjac automobila ford,
 * i ukoliko jeste, u zavisnosti od brojava vrata prikazati odgovarajucu poruku.
 */
public class zadatak_3
{
    public static void main(String[] args)
    {
        String carMake = "Ford";
        int doors = 4;
        switch(carMake)
        {
            case "Ford":
                switch(doors)
                {
                    case 3 -> System.out.println("You drive a Ford with 3 doors");
                    case 4 -> System.out.println("You drive a Ford with 4 doors");
                    case 5 -> System.out.println("You drive a Ford with 5 doors");
                }
                break;
            default :
                System.out.println("We're sorry. You do not drive a Ford car");

        }
    }
}
