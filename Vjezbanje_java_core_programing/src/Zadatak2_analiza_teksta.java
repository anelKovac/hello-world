import java.util.Arrays;

/**
 * Napisati slijedece metode koje vracaju dati tekst bez:
 * <p>
 * -prvog slova
 * -prva tri slova
 * -prve dvije rijeci
 * -posljednje rijeci
 * -posljednje recenice
 * <p>
 * Takodje, napisati i program koji testira sve trazene metode.
 * <p>
 * String sa tekstom moze biti hard-kodiran i proizvoljan
 */
class Zadatak2_analiza_teksta {
    private static String IzbaciPrvoSlovo(String tekst) {
        return tekst.substring(1, tekst.length());
    }

    private static String IzbaciPrva3Slova(String tekst) {
        return tekst.substring(3, tekst.length());
    }

    private static String IzbaciPrveDvijeRijeci(String tekst) {
        String[] str = tekst.split(" ", 3);
        return str[2];
    }

    private static String IzbaciZadnjeRijeci(String tekst){
        String[] str = tekst.split(" ");
        String noviString = "";
        if(str.length == 0) {
            return null;
        }else{
            for(int i = 0; i < str.length - 1; i++){
                noviString = noviString + " " + str[i];
            }
            return noviString;
        }
    }

    private static String IzbaciZadnjuRecenicu(String tekst){
        String[] str = tekst.split("\\.");
        String noviString = "";
        if(str.length == 0) {
            return null;
        }else{
                for(int i = 0; i < str.length - 1; i++){
                    noviString = noviString + str[i];
                }
                return noviString;
        }
    }

    public static void main(String[] args) {
        String mojTekst = "Za nove prodore potrebna su nova znanja i efikasnije metode." +
                " With great power comes great responsibility";

        System.out.println("Metoda koja izbacuje prvo slovo iz Stringa daje slijedeci rezulat: "
                + IzbaciPrvoSlovo(mojTekst));
        System.out.println("Metoda koja izbacuje prva tri slova iz Stringa daje slijedeci rezultat: "
                + IzbaciPrva3Slova(mojTekst));
        System.out.println("Metoda koja izbacuje prve dvije rijeci iz Stringa daje slijedeci rezultat: "
                + IzbaciPrveDvijeRijeci(mojTekst));
        System.out.println("Metoda koja izbcuje zadnju rijec iz Stringa daje slijedeci rezultat:"
                + IzbaciZadnjeRijeci(mojTekst));
        System.out.println("Metoda koja izbacuje zadnju recenicu iz Stringa daje slijedeci rezultat: "
                + IzbaciZadnjuRecenicu(mojTekst));

    }
}
