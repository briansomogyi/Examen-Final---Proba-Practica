public class Oferta extends Act {
    private double valoareTotala;
    private Client client;

    public Oferta(String iD) {
        super(iD);
    }

    public Oferta(String iD, double valoareTotala, Client client) {
        super(iD);
        this.valoareTotala = valoareTotala;
        this.client = client;
    }

    public double getValoareTotala() {
        return valoareTotala;
    }

    public Client getClient() {
        return client;
    }

}
