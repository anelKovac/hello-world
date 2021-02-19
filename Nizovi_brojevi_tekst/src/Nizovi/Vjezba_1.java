package Nizovi;

/**
 * napisati program koji ce utvrdivati da li definisana vrijednost postoji u nekom nizu.
 * Program je potrebno napisati bey upotrebe metode binarySearch.
 */
public class Vjezba_1 {
    public static void main(String[] args) {
        int[] array = {1, 5, 33, 563, 0, 2, 23, 9, 9, 11, 987, 23, 934, 999, 43};

        System.out.println(pretraziNiz(array, 934));
        System.out.println(pretraziNiz(array, -4));
    }

    public static boolean pretraziNiz(int[] niz, int trazeni_elemnt) {
        for(int vrijednost : niz){
            if(vrijednost == trazeni_elemnt)
                return true;
        }
        return false;
    }
}
