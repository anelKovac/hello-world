package kontrola_toka;

/**
 * Potrebno je izvršiti proveru ostatka deljenja x i y.
 * Ukoliko ne postoji ostatak, prikazati poruku da ostatak ne postoji; u suprotnom,
 * proveriti da li je ostatak veći ili manji od hiljadu i dati odgovarajuću poruku.
 */
public class zadatak_2
{
    public static void main(String[] args)
    {
        int x = 523134, y = 325423;

        int ostatak = x % y;
        switch(ostatak)
        {
            case 0 -> System.out.println("Ne postoji ostatak.");
            default -> {
                if (ostatak > 1000)
                {
                    System.out.println("ostatak je veci od 1000 i iznosi " + ostatak);
                } else if (ostatak < 1000)
                {
                    System.out.println("Ostatak je manji od 1000 i iznosi " + ostatak);
                } else System.out.println("Ostatak je jedan 1000");
            }
        }

    }
}
