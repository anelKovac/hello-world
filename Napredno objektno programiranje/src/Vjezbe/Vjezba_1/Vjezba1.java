package Vjezbe.Vjezba_1;

public class Vjezba1 {
    public static void main(String[] args) {
        Product margarita =  new Pizza("Margarita", 8.00);
        Product send = new Sandwich("Mijesani sendvic", 3.00);

        margarita.addSpice("kecap");
        send.addSpice("majoneza");
        System.out.println(margarita);
        System.out.println(send);

    }
}
