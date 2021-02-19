package Vjezbe.Vjezba_2;

public class mainClass {
    public static void main(String[] args) {
        Square a = new Square();
        a.setValues(100, 100, 5);

        System.out.println(a.racunajObim());
        System.out.println(a.racunajPovrsinu());
    }
}
