public class AngajatulAFostConcediat extends Exception {
    public AngajatulAFostConcediat(Angajat angajat, String className) {
        super("Angajatului " + angajat + " nu i se mai poate emite " + className + ".");
    }
}
