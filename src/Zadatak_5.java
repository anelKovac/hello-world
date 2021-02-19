import java.util.Scanner;

public class Zadatak_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int broj1 = in.nextInt();

        System.out.println("Unesite drugi broj: ");
        int broj2 = in.nextInt();

        System.out.println(broj1 + " x " + broj2 + " = " + broj1 * broj2);
    }
}
