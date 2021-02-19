import java.util.Scanner;

/**
 * U decembru su aktuelni akcijski popusti za novogodisnje ukrase prema pravilniku:
 *
 * - Za manje od 10 kupljenih proizvoda nema popusta
 * - Za 10 - 49 kupljenih ukrasa - popust od 5 %
 * - Za 50 - 99 kupljenih ukrasa - popust od 10 %
 * - Za kupljenih 100 ili vise ukrasa - popust od 15 %
 *
 * Potrebno je napisati program koji ce izracunavati i ispisati konacnu cijenu,
 * uzimajuci u obzir popuste prilikom kupovine
 *
 * Promjenjive sa brojem i cijenom ukrasa mogu biti hardokodirane, kod ce se
 * koristenje standardnog ulaza smatrati naprednijim rjesenjem.
 */
public class Zadatak4_NovoodisnjiUkrasi {
    public static void main(String[] args) {
        int brojUkrasa;
        double ukupnaCijenaUkrasa;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj kupljenih ukrasa: ");
        do {
            brojUkrasa = scanner.nextInt();
            if(brojUkrasa <= 0)
                System.out.println("Unesite broj kupljenih ukrasa: ");
        }while(brojUkrasa <= 0);
        System.out.println("Unesite ukupnu cijenu svih ukrasa: ");
        do {
            ukupnaCijenaUkrasa = scanner.nextDouble();
            if(ukupnaCijenaUkrasa <= 0)
                System.out.println("Unesite ukupnu cijenu svih ukrasa: ");
        }while(ukupnaCijenaUkrasa <= 0);

        racunajCijenu(brojUkrasa, ukupnaCijenaUkrasa);
    }
    static void racunajCijenu(int brojArtikala, double ukupnaCijenaArtikala){
        if(brojArtikala < 10)
            System.out.println("Nazalost nemate nemate popusta, vasa cijena iznosi: " + ukupnaCijenaArtikala);
        else if(brojArtikala >= 10 && brojArtikala < 50 )
            System.out.println("Vas popust iznosi 5% i vasa cijena je: " + (ukupnaCijenaArtikala - (0.05 * ukupnaCijenaArtikala)) );
        else if (brojArtikala >= 50 && brojArtikala < 100)
            System.out.println("Vas popust iznosi 10% i vasa cije je: " + Double.toString(ukupnaCijenaArtikala - (0.1 * ukupnaCijenaArtikala)));
        else if(brojArtikala >= 100)
            System.out.println("Vas popust iznosi 15% i vasa cijena je: " + Double.toString(ukupnaCijenaArtikala - (0.15 * ukupnaCijenaArtikala)));
    }

}
