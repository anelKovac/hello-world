package Text;

public class MetodKlaseString {
    public static void main(String[] args) {
        //Pretvaranje String vrijednosti u niz karaktera
        String word = "hello";

        char[] charArray = word.toCharArray();
        for(char c : charArray){
            System.out.println(c);
        }

        //Dobijanje informacije o duzini promjenjive tipa String.
        int len = word.length();
        System.out.println("String length is " + len);

        //Konvertovanje svih karaktera jedne vrijednosti Stringa u velika slova.
        String str = "welcome to ITA!";
        System.out.println("Return value: ");
        System.out.println(str.toUpperCase());

        //Konvertovanje svih karaktera u mala slova
        System.out.println("Return value: ");
        System.out.println(str.toLowerCase());

        //Odsjecanje praznih karaktera sa pocetka i sa kraja jednog Stringa
        String str1 = "    Welcome to ITAcademy    ";
        System.out.println("Return value: ");
        System.out.println(str1.trim());

        //Utvrdjivanje postojanja karaktera ili grupe karaktera unutar jednog String-a.
        String str2 = "Welcome to ITAcademy";
        String subStr11 = "ITAcademy";
        String subStr22 = "ITAcademy.com";

        //Kada je ulazni parametar jedan znak metoda vraca index njegove prve pojave.
        System.out.print("Found index: ");
        System.out.println(str.indexOf('o')); //vraca 4, znaci da se znak nalzi na 5.mjestu

        System.out.print("Found Index: ");
        System.out.println(str.indexOf('o', 5)); //trazi ondex karaktera 'o' ali od 5. indexa pa dalje

        //Slijedeca metoda pretrazuje podstring i kao rezultat vraca indekst prvog karaktera trazenog stringa
        //ili -1 ako String nije pronadjen
        System.out.print("Found Index: ");
        System.out.println(str2.indexOf(subStr11));

        System.out.print("Found Index: ");
        System.out.println(str2.indexOf(subStr11, 15)); //Pretraga se vrsi od indexa 15 dalje

        System.out.print("Found Index: ");
        System.out.println(str2.indexOf(subStr22));

        // Metoda koja vraca karakter proslijedjenog indexa
        String s = "This is string.";
        char result = s.charAt(8);
        System.out.println(result);

        //Kreiranj substringa na osnovu parametara koji su proslijedjeni metodi substring
        //public String substring(int beginIndex);
        //public String substring(int beginIndex, int endIndex);
        System.out.print("Return Value: ");
        System.out.println(str2.substring(11));

        System.out.print("Return Value: ");
        System.out.println(str2.substring(11, 14));

        //Metoda za poredjenje vrijednosti
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

        //metoda za utvrdjivanje da li string pocinje nekim prefiksom
        System.out.print("Return Value: ");
        System.out.println(str2.startsWith("Welcome"));

        System.out.print("Return Value: ");
        System.out.println(str2.startsWith("ITAcademy"));

        System.out.print("Return Value: ");
        System.out.println(str2.startsWith("ITAcademy", 11)); //pretraga od 11. indexa

        //Metoda koja provjerava da li se String zavrsava definisanim sufiksom.

        String str3 = "This is string!";

        boolean retVal;

        retVal = str3.endsWith("string!");
        System.out.println("Return Value: " + retVal);

        retVal = str3.endsWith("This");
        System.out.println("Return Value: " + retVal);

        //Zamjena  odredjenih karaktera sa drugim karakterima
        String word1 = "--Hello--";
        System.out.println(word1.replace("-", "*"));

        //split metoda omogucava podjelu jednog STringa na niz String vrijednost
        String str4 = "Welcome-to-ITAcademy";
        String[] wordArray1 = str4.split("-");

        System.out.println("Return Value: ");
        for (String f : wordArray1) {
            System.out.println(f);
        }

        String[] wordArray2 = str4.split("-", 2);

        System.out.println("Return Value: ");
        for (String f : wordArray2) {
            System.out.println(f);
        }

        String str5 = "This is a sentence.  This is a question, right?  Yes!  It is.";

        String[] wordArray = str5.split("[ .,?!]+"); // na ovaj nacin smo definisali veci broj karaktera podjele.

        System.out.println("Return Value: ");
        for (String a : wordArray) {
            System.out.println(a);
        }

    }

}
