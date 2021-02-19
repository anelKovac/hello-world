public class Person {
    private String ime;
    private String prezime;
    private String grad;

    public Person(String name, String surname, String town){
        ime = name;
        prezime = surname;
        grad = town;
    }

    public void ispisiPodatke(){
        System.out.println(ime + " " + prezime + " " + grad);
    }
}
