public abstract class Persoana {
    private String nume;

    public Persoana(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return nume;
    }

}
