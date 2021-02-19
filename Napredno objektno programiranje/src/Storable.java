public interface Storable {
    //interfejsi mogu imati sadrzavati konstante i na taj nacin sve klase koje implementiraju interfejs
    //dobijaju tu konstantu npr.
    public static final int SOME_CONSTANT = 13;

    //primarni elementi koji se ovjde nalaze su javne abstraktne metode i to je podrazumjevano tako da
    //se metode mogu pisati i bez kljucnih rijeci public i abstract
    public abstract void read();
    public abstract void write();
    public abstract void update();
    public abstract void delete();
    //podrazumjevane metode ne moraju biti implementirane od strane klasa koje implementiraju interfejs
    default boolean exists() {
        method1();
        method2();
        return true;
    }
    //privatne metode se mogu koristiti samo unutar interfejsa
    private void method1(){
        System.out.println("Hello from private method1");
    }
    private void method2(){
        System.out.println("Hello from private method2");
    }
}
