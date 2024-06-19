public class FluturasSalariu extends Act {

    private double valoareSalariu;
    private Angajat angajat;

    public FluturasSalariu(String iD) {
        super(iD);
    }

    public FluturasSalariu(String iD, double valoareSalariu, Angajat angajat) {
        super(iD);
        this.valoareSalariu = valoareSalariu;
        this.angajat = angajat;
    }

    public double getValoareSalariu() {
        return valoareSalariu;
    }

    public Angajat getAngajat() {
        return angajat;
    }

}
