package Debug;
import java.util.Scanner;
/**
 * U ovom primjeru ce biti razmotren pojam logickih gresaka
 */
public class PrimjerLogickihGresaka {
    public static void main(String[] args) {
        int numberA;
        int numberB;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter number A: ");
        numberA = scanner.nextInt();

        System.out.println("Please, enter number B: ");
        numberB = scanner.nextInt();

        if(numberA > numberB){
            System.out.println("Number " + numberA + " is greater then " + numberB);
        }else{
            System.out.println("Number " + numberB + " is greater then " + numberA);
        }
    }
}
/**
 * Logicka greska se ogleda u tome da ako unesemo dva ista broja program nece
 * prepoznati da se radi o istim brojevim ate ce ispisati da je jedan broj veci od samog sebe
 */
