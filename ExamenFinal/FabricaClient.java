public class FabricaClient {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        Angajat manager = new Manager("Somogyi", "Brian", 10, 0);
        Angajat muncitor = new Muncitor("Damse", "Denis", 10, 0);
        Client client = new Client("Tundrea");
        fabrica.adaugareAngajat(manager);
        fabrica.adaugareAngajat(muncitor);
        fabrica.afisareAngajati();
        fabrica.concediereAngajat(muncitor);
        fabrica.afisareAngajati();
        fabrica.adaugaClient(client);
        fabrica.afisareClienti();
        try {
            fabrica.eliberareFluturas(null, 0, muncitor);
        } catch (AngajatulAFostConcediat e) {
            System.out.println("Angajatul " + muncitor + " a fost concediat.");
        }
    }
}
