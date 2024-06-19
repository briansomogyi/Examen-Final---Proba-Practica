import java.util.LinkedList;

public class Manager extends Angajat {
    private LinkedList<Muncitor> listaMuncitori;

    public Manager(String nume, String prenume, double salariu, int anVechime) {
        super(nume, prenume, salariu, anVechime);
        listaMuncitori = new LinkedList<>();
    }

    public void adaugaMuncitor(Muncitor muncitor) {
        listaMuncitori.add(muncitor);
    }

    public LinkedList<Muncitor> getListaMuncitori() {
        return listaMuncitori;
    }

}
