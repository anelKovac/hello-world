package Softverske_greske_i_izuzeci;

/**
 * Kod prikazan u nastavku je potrebno obezbijediti tako da ne prijavljuje gresku
 * static int calculate(int a, int b, String op){
 *         if(op.equals("+"))
 *             return a + b;
 *         if(op.equals("-"))
 *             return a - b;
 *         if(op.equals("/"))
 *             return a / b;
 *         if(op.equals("*"))
 *             return a * b;
 *         return 0;
 *     }
 *
 *     public static void main(String[] args) {
 *         int x = calculate(5, 0, "/");
 *         System.out.println(x);
 *     }
 */
public class Vjezba2 {
    static int calculate(int a, int b, String op){
        if(op.equals("+"))
            return a + b;
        if(op.equals("-"))
            return a - b;
        if(op.equals("/"))
            return a / b;
        if(op.equals("*"))
            return a * b;
        return 0;
    }

    public static void main(String[] args) {
        int x = 0;
        try{
            x = calculate(5, 0, "/");
            System.out.println(x);
        }catch(ArithmeticException ex){
            System.out.println("There is an error.");
        }
    }
}
