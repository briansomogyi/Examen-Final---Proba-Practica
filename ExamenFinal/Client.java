public class Client extends Persoana {

    public Client(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return getNume();
    }

}
