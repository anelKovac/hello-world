import java.util.Arrays;

/**
 * Dat je slijedeci string:
 * String text = "Dorris/Janson/25/219.74/Chicago Cornelius/Howse/40/319.88/Boston Edward/Youngn/31/119.96/Atlanta"
 *
 * Potrebno je napraviti logiku kojaj ce iz ovog String-a izvuci pojedinacne podatke:
 *
 * -ime
 * -prezime
 * -broj godina
 * -iznos plate
 * -mjesto
 *
 * Procitane i isparsirane podatke iz String-a potrebno je iskoristiti za popunjavanje polja objekata tipa Person;
 * stoga je potrebno kreirati klasu Person, kao i adekvatna polja u okviru nje. Dakle, u klasi Person bi trebalo
 * da postoji kostruktor sa tih 5 zadatih polja.
 *
 * Zatim, u glavnoj klasi, nakon kreiranja objekta tipa Person i popunjavanja njegovih polja, objekat tipa
 * Person treba sjestit u listu i izvrsiti prolazak kroz tu listu i ispis podataka o osobama.
 */
public class Zadatak3_parsiranjeStringa_i_liste {
    public static void main(String[] args) {
        String text = "Dorris/Janson/25/219.74/Chicago Cornelius/Howse/40/319.88/Boston Edward/Youngn/31/119.96/Atlanta";

        String[] stringOsobe = text.split(" ");
        Person[] osoba = new Person[stringOsobe.length];
        String[][] podaci = new String[3][5];

        for(int i = 0 ; i < stringOsobe.length ; i++){
            podaci[i] = stringOsobe[i].split("/");
            osoba[i] = new Person(podaci[i][0], podaci[i][1], podaci[i][2], podaci[i][3], podaci[i][4]);
        }

        for (Person person: osoba) {
            person.ispisiPodatke();
            System.out.println();
        }

    }

}
class Person{
    private String ime, prezime, mjesto;
    private int brojGodina;
    private double iznosPlate;

    public Person(String ime, String prezime, String brojGodina, String iznosPlate, String mjesto){
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = Integer.parseInt(brojGodina);
        this.iznosPlate = Double.parseDouble(iznosPlate);
        this.mjesto = mjesto;
    }

    public void ispisiPodatke(){
        System.out.println("Ime: " + ime +
                            "\nPrezime: " + prezime +
                            "\nGodine: " + brojGodina +
                            "\nIznos plate: " + iznosPlate +
                            "\nMjesto boravka: " + mjesto);
    }
}
