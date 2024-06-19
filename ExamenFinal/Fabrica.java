import java.util.Iterator;
import java.util.LinkedList;

public class Fabrica {
    private LinkedList<Angajat> listaAngajati;
    private LinkedList<Client> listaClienti;
    private LinkedList<Act> listaActe;

    public Fabrica() {
        listaAngajati = new LinkedList<>();
        listaClienti = new LinkedList<>();
        listaActe = new LinkedList<>();
    }

    public void adaugareAngajat(Angajat angajat) {
        this.adaugaAngajat(angajat);
    }

    public void concediereAngajat(Angajat angajat) {
        listaAngajati.remove(angajat);
    }

    public void afisareAngajati() {
        Iterator<Angajat> iterator = listaAngajati.iterator();
        while (iterator.hasNext()) {
            Angajat angajat = iterator.next();
            System.out.print(angajat + " ");
        }
        System.out.println();
    }

    public void adaugareClient(Client client) {
        this.adaugaClient(client);
    }

    public void afisareClienti() {
        Iterator<Client> iterator = listaClienti.iterator();
        while (iterator.hasNext()) {
            Client client = iterator.next();
            System.out.print(client + " ");
        }
        System.out.println();
    }

    public void generareContract(String iD, double valoareTotala, Client client) {
        Oferta oferta = new Oferta(iD, valoareTotala, client);
        this.adaugaAct(oferta);
    }

    public void eliberareFluturas(String iD, double valoareSalariu, Angajat angajat) throws AngajatulAFostConcediat {
        Iterator<Angajat> iterator = listaAngajati.iterator();
        while (iterator.hasNext()) {
            Angajat angajat2 = iterator.next();
            if (angajat.equals(angajat2)) {
                FluturasSalariu fluturasSalariu = new FluturasSalariu(iD, valoareSalariu, angajat);
                this.adaugaAct(fluturasSalariu);
                return;
            }
        }
        throw new AngajatulAFostConcediat(angajat, FluturasSalariu.class.getName());
    }

    public void afisareActe() {
        System.out.println(this);
    }

    public void adaugaAngajat(Angajat angajat) {
        listaAngajati.add(angajat);
    }

    public void adaugaClient(Client client) {
        listaClienti.add(client);
    }

    public void adaugaAct(Act act) {
        listaActe.add(act);
    }

    public LinkedList<Angajat> getListaAngajati() {
        return listaAngajati;
    }

    public LinkedList<Client> getListaClienti() {
        return listaClienti;
    }

    public LinkedList<Act> getListaActe() {
        return listaActe;
    }

    @Override
    public String toString() {
        String string = "";
        Iterator<Act> iterator = listaActe.iterator();
        while (iterator.hasNext()) {
            Act act = iterator.next();
            string += act + " ";
        }
        return string;
    }

}
