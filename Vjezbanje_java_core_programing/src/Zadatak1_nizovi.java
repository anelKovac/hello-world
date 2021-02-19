import java.util.Arrays;

/**
 * Kreirati niz koji posjeduje 50 clanova. Elementi niza su brojevi 1, 2, 3, ..., 50.
 * Zatim, kreirati jos jedan niz koji takodje posjeduje 50 elemenata(51, 52, 53, ..., 100).
 * Nakon toga, kreirati niz koji posjeduje 50 elemenata u kom eje vrijednost svakog elementa respektivni zbir
 * elemenata prethodna dva niza. Dakle, 1. element 3. niza bi bio rezultat sabiranja 1. elementa 1. niza
 * sa 1. elementom 2. niza itd.
 * Prikazati na izlazu rezultirajuci niz.
 *
 * Napredni zahtjev:
 * Uraditi primjer po logici koja je ranije navedena, ali sa tom razlikom da elementi 2. niza treba da budu
 * parni brojevi pocevsi od broja 50 (50, 52, 54, ...) i u novokreiranom nizu rezultata treba da se nadju samo
 * rezultati sabiranja koji su djeljivi sa 4. Prikazati na izlazu niz rezultata.
 */
public class Zadatak1_nizovi {
    public static void main(String[] args) {
        int[] niz1 = new int[50];
        int[] niz2 = new int[50];

        int j = 0;
        int k = 0;
        for (int i = 0; i < 50; i++) {
            niz1[i] = i + 1;
            niz2[i] = 50 + j;
            j = j + 2;
            if ((niz1[i] + niz2[i]) % 4 == 0) {
                k++;
            }
        }
        int[] niz3 = new int[k];
        int l = 0;
        for(int i = 0; i < 50; i++){
            if((niz1[i] + niz2[i]) % 4 == 0){
                niz3[l] = niz1[i] + niz2[i];
                l++;
            }
        }

        System.out.println(Arrays.toString(niz1));
        System.out.println(Arrays.toString(niz2));
        System.out.println(Arrays.toString(niz3));
    }

}
/** drugo rijesenje
 *         int[] niz1 = new int[50];
 *         int[] niz2 = new int[50];
 *         int[] niz3 = new int[50];
 *
 *         int j = 0;
 *         int k = 0;
 *         for (int i = 0; i < 50; i++) {
 *             niz1[i] = i + 1;
 *             niz2[i] = 50 + j;
 *             j = j + 2;
 *             if ((niz1[i] + niz2[i]) % 4 == 0) {
 *                 niz3[k] = niz1[i] + niz2[i];
 *                 k++;
 *             }
 *         }
 *         int[] niz4 = new int[k];
 *         for(int i = 0; i < k; i ++){
 *             niz4[i] = niz3[i];
 *         }
 */
