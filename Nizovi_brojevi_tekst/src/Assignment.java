/**
 * Parsiranje teksta
 */

public class Assignment {
    public static void main(String[] args) {
        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";
                String[] osobe = text.split(" ");
                Person[] per = new Person[osobe.length];

                for (int i = 0; i < text.length(); i++){

                    String ime = osobe[i].split("\\.")[0];
                    String prezime = osobe[i].split("[\\./]")[1];
                    String grad = osobe[i].split("[\\./]")[2];

                    per[i] = new Person(ime, prezime, grad);
                    per[i].ispisiPodatke();
                }
    }

}
