public class Customer implements Storable{

    private String name;
    private String address;
    private String gender;

    public Customer(){

    }
    public Customer(String name, String address, String gender){
        this.name=name;
        this.address=address;
        this.gender=gender;
    }

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
