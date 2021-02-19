package Nizovi;

import java.util.Arrays;

public class OperacijeNadNizovima {

    public static void main(String[] args) {
       //Utvrdjivanje duzine niza
        int[] niz = {3, 5, 2, 6, 1, 6};
        int[] niz2 = {12, 13, 14};
        System.out.println(niz.length);

        //prolazak kroz niz
        for(int i = 0; i < niz.length; i++){
            System.out.println(niz[i]);
        }

        /*  prolazak kroz niz koristenjem unaprijedjene verzije for petlje tzv. FOR EACH
            Kod ove petlje imamo jednu promjenjivu koja ce u svakoj iteraciji dobijati vrijednost
            narednog elementa niza, pored promjenjive imamo i refenrecu na niz.
        */
        for(int vrijednost : niz){
            System.out.println(niz[vrijednost]);
        }

        //Kopiranje niza
        //deklaracija niza u koji cemo kopirati druga dva niza
        int[] odredisniNiz = new int[niz.length + niz2.length];

        //Kopiranje prvog niza u odredisni niz
        System.arraycopy(niz, 0, odredisniNiz, 0, niz.length);
        //Kopiranje drugog niza u odredisni niz
        System.arraycopy(niz2, 0, odredisniNiz, niz.length, niz2.length);
        //Ispis odredisnog niza
        //Za ispis koristimo klasu Arrays i njenu metodu toString koje mozemo naci u paketu java.util
        System.out.println(Arrays.toString(odredisniNiz));

        //Sortiranje niza
        Arrays.sort(niz);
        System.out.println(Arrays.toString(niz));

        //Pretraga niza
        //Koristena metoda za pretragu zahtjeva da niz prethodno bude sortiran
        //Ako trazeni element bude pronadjen metoda kao rezultat vraca poziciju tog elementa tj. njegov indeks
        //Ako trazeni element ne postoji u nizu kao rezultat dobijamo negativnu vrijednost koja je
        //Zapravo duzina niza uvecana za jedan.
        int a = Arrays.binarySearch(niz, 2);
        System.out.println(a);   //ispisuje 2 jer je element na 3 mjestu tj. ima indeks 2
        System.out.println(Arrays.binarySearch(niz, 34)); //vraca -7

        //Visedimenzionalni nizovi
        int[][] matrica = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},              //Deklaracija + inicijalizacija
                {9, 10, 11, 12}
        };
        int[][] matrica1 = new int[3][4]; //samo deklaracaija




    }
}
