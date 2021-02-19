public class Dog extends Animal {
    private String name, breed; //breed = vrsta
    public Dog (String name){
        super("Dog");
        this.name = name;
        this.breed = "dachshund";
    }

    public Dog(String name, String breed){
        super("Dog");
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString(){
        return super.toString() + " " + name + ", " + breed + ".";
    }
}
