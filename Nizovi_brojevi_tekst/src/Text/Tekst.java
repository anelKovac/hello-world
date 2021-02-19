package Text;

/**
 * Ovdje su prikazane osnovne fukcionalnosti String objekata
 */
public class Tekst {

    public static void main(String[] args) {
        //Implicitno kreiranje String vrijednosti
        String message = "Hi !";

        //Eksplicitno kreiranje String vrijednost
        String message1 = new String("Hi there !");

        /**
         * Kada su stringovi kreirani eksplicitno oni se smijestaju u heap tako da se u varijablu smijesta samo
         * referenca do te vrijednosti i zbog toga provjera jednakosti dviju istih vrijednosti koristenjem znaka ==
         * ce kao rezultat dati false jer se usporedjuju dvije reference a ne dvije vrijednosti.
         * Zbog toga se za provjeru jednakosti koristi metoda equals.
         */

        /**
         * Stringove mozemo nadovezivati vec upoznatim nacinom koristenja operatora +, a pored toga imamo jos dva nacina.
         * prvi je koristenje metode concat
         * a drugi koristenje klase StringBuilder
         * U nastavku su prikazana oba nacina
         */

        String myString = "My ";
        String myString1 = "String";
        System.out.println(myString.concat(myString1));

        StringBuilder sb = new StringBuilder();
        sb.append("My ");
        sb.append("String");
        System.out.println(sb);
    }


}
