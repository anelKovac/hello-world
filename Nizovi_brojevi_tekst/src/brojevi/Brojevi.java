package brojevi;

public class Brojevi {

    public static void main(String[] args) {
        //Numericke vrijednosti mozemo definisati u nekoliko razlicitih oblika npr.
        int decVal = 26;  // dekadni prikaz
        int octVal = 032; // oktalni prikaz
        int hexVal = 0x1a; // hexadekadni prikaz
        int binVal = 0b11010; // binarni prikaz

    /*  Za razdvajanje grupa cifara moze se koristiti karakter donja crta _ , Ona nece biti tretirana od strane
        kompajlera te ce broj imati istu vrijednost koju je imao bez donjih crta.
        Donja crta se ne moze postaviti:
        - na pocetak ili kraj broja
        - pored decimalne tacke
        - prije F ili L sufiksa
        */
        long creditCardNumber = 1234_4344_4325_3234L;
        float pi = 3.14_15F;

        //Boxing
        //Slijedece dvije naredbe su identicne
        Integer myNumber = 16;
        Integer myNumber1 = new Integer(16);
        //Boxing je fukcionalnost koja omogucava da se omotacima dodijeljuju vrijednosti kao da se radi o primitivnim tipovima
        //Suprotno od toga je UNBOXING, a to je konvertovanje slozenog tipa omotaca nazad u primitivni tip
        Integer a = 16;
        int primitivnibroj = a;

        //Neke od metoda numerickih omotaca
        Integer b = 17;

        System.out.println(b.compareTo(a));// if b < a out -1; if b > a out 1; if b==a out 0;
        int mojBroj2 = b.intValue(); //obom metodom smo izvukli primitivu vrijednost iz omotaca

        //Omotaci imaju i neke staticke metode kao npr.
        System.out.println(Integer.compare(16, 17)); // if prva vrijednost > druga out 1, u suprotnom -1 , if == 0
        System.out.println(Integer.sum(16, 17)); //duma dva broja
        System.out.println(Integer.min(16, 17)); // koja vrijednost je manja
        System.out.println(Integer.max(16, 17)); // koja vrijednost je veca

        //klasa Math i njene metode

        System.out.println(Math.abs(-17));
        System.out.println(Math.min(17, 23));
        System.out.println(Math.max(17, 23));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(4, 2));
        System.out.println(Math.signum(-17));
        System.out.println(Math.random());




    }



}
