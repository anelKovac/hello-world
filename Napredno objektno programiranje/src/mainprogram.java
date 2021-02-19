import java.awt.image.ImageProducer;

public class mainprogram {
    public static void main(String[] args) {
        Storable product1 = new Gamepad("Logitech", "f718", 129.99, true);
        Printer product2 = new Printer("hp", "envy photo 7155", 179.99, true);
        Monitor product3 = new Monitor("dell", "u2419h", 219.99, 24);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        }
    }

