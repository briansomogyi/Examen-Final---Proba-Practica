import java.util.LinkedList;

public class Muncitor extends Angajat {

    private LinkedList<String> listaResponsabilitati;

    public Muncitor(String nume, String prenume, double salariu, int anVechime) {
        super(nume, prenume, salariu, anVechime);
        this.listaResponsabilitati = new LinkedList<>();
    }

    public void adaugaResponsabilitate(String responsabilitate) {
        listaResponsabilitati.add(responsabilitate);
    }

    public LinkedList<String> getListaResponsabilitati() {
        return listaResponsabilitati;
    }

}
