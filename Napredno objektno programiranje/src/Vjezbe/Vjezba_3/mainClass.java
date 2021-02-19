package Vjezbe.Vjezba_3;

public class mainClass {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.setOperands(5, 8);
        System.out.println(cal.add());
        System.out.println(cal.sub());
    }
}
