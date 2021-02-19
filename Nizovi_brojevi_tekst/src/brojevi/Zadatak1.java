package brojevi;
import java.util.Scanner;

/**
 * Program kji od korisnika prihvata parametar koji se odnosi na poluprecnik kruga.
 * Nakon unosa vrijednosti, program treba da izracuna obim i povrsinu kruga  i rezultate prikaze na izlazu.
 */

public class Zadatak1 {
    public static void main(String[] args) {

        System.out.println("Unesite duzinu poluprecnika kruga");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double circumferece = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;

        System.out.println("Obim kruga je: " + circumferece);
        System.out.println("Provrsina kruga je:" + area);
    }
}
