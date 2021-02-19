package Text;

/**
 * U aplikaciju ulaze podaci kroz slijedeca dva Stringa:
 * String[] forbidenChars = { "<",">","'" };
 * String input = "<div>my 'div' tag</div>";
 *
 * Potrebno je procistiti String, tako da na izlazu ne bude karaktera koji su naznaceni u listi
 * nedozvoljenih karaktera:  divmy div tag/div
 */
public class Zadatak4 {
    public static void main(String[] args) {
        String[] forbidenChars = { "<",">","'" };
        String input = "<div>my 'div' tag</div>";

        for (int i = 0; i < forbidenChars.length; i++){
            input = input.replace(forbidenChars[i], "");
        }
        System.out.println(input);
    }
}
