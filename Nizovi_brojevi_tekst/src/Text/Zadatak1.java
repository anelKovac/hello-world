package Text;

/**
 * U aplikaciju ulazi niz String podataka. Dozvoljena velicina takvih podataka na izlazu je 25 karaktera,
 * ali su neki na ulazu veci od toga.
 * Potrebno je napraviti program koji ce, gdje god String predje velicinu od 25 karaktera, prekinuti String i umjesto poslijednja tri karaktera ubaciti tri tacke.
 * Ovako obradjene String-ove treba emitovati na izlazu.
 */
public class Zadatak1 {
    public static void main(String[] args) {
        String[] texts =

                { "Optimum pH of your water is between 6.0 and 7.0.  However Oscars are okay in a pH up to 8.0.",

                        "The Oscar fish is not a difficult fish to look after if you give it a suitable environment to live in. You may start having problems such as health issues if you keep your Oscar in an unsuitably small tank or feed it on a poor diet",

                        "The Oscar has the potential to reach 18 inches. However in captivity Oscars normally grow to between 8 and 12 inches" };

        for(String s : texts){
            if(s.length() <= 25)
            {
                System.out.println(s);
            }else{
                String str = s.substring(0, 22);
                str = str.concat("...");
                System.out.println(str);
            }
        }

    }
}
