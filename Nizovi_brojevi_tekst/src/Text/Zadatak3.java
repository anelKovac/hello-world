package Text;

/**
 * U aplikaciju ulaze podaci kroz slijedeci String:
 * String users = "Name: John|Surname: Lord|Name: Ben|Surname: Torrance|Name: Tom|Surname: Ford";
 * Potrebno je formatirati podatke tako da izlaz aplikacije bude:
 * First name is: John, last name is: Lord
 * First name is: Ben, last name is: Torrance
 * First name is: Tom, last name is: Ford
 */
public class Zadatak3 {
    public static void main(String[] args) {
        String users = "Name: John|Surname: Lord|Name: Ben|Surname: Torrance|Name: Tom|Surname: Ford";

        String[] nizStringova = users.split("\\|");

        for (int i = 0; i < nizStringova.length; i += 2){
            String ime = nizStringova[i].split(" ")[1];
            String prezime = nizStringova[i+1].split(" ")[1];
            System.out.println("First name is: " + ime + ", last name is: " + prezime);
        }
    }


}
