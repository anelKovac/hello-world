package Softverske_greske_i_izuzeci;

public class Izuzeci {
    public static void main(String[] args) {
        int[] nums = new int[4];
/**
 * U try blok se smijesta kod koji potencijalno moze proizvesti izuzetak(Exception)
 * Ako dodje do izuzetka onda se aktivira catch blok
 */
        try{
            nums[7] = 10;
        }
        catch(Exception exc){
            System.out.println("There is an error");
            System.out.println(exc.getClass()); //vraca ime klase izuzetka
            System.out.println(exc.getMessage());  // vraca poruku izuzetka
        }
    }
}
