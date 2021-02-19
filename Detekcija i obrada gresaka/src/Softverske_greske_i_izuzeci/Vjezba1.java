package Softverske_greske_i_izuzeci;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Program koji dijeli dva broja je potrebno modifikovati tako da se unutar koda
 * obrade eventualne greske do kjih moze doci (dijeljenje nulom)
 */
public class Vjezba1 {
    public static void main(String[] args) {
        int numberA;
        int numberB;
        double numberC = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter numberA: ");
        numberA = scanner.nextInt();

        System.out.println("Please, enter numberB: ");
        numberB = scanner.nextInt();

        try{
            numberC = numberA / numberB;
        } catch(Exception exc){
            System.out.println(exc.getMessage());
        }
        System.out.println("Result: " + numberC);

    }

}
