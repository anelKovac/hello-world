package Text;

/**
 * U aplikaciju ulazi lista fajlova u obliku niza.
 * Potrebno je (pomocu ekstenzije) prepoznati samo fajlove koji su tipa jpg, png ili gif
 * i emitovati poruku o njihovom tipu na izlaz
 */
public class Zadatak2 {
    public static void main(String[] args) {
        String[] files = {
                        "picture1.jpg",
                        "text1.txt",
                        "picture2.png",
                        "text2.doc",
                        "picture3.gif"
                };
        for (String s : files){
            if(s.endsWith("jpg")){
                System.out.println("Datoteka " + s + " je tipa .jpg");
            }else if(s.endsWith("png")){
                System.out.println("Datoteka " + s + " je tipa .png");
            }else if(s.endsWith("gif")){
                System.out.println("Datoteka " + s + " je tipa .gif");
            }
        }
    }
}
