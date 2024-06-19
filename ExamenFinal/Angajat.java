public abstract class Angajat extends Persoana {
    private String prenume;
    private double salariu;
    private int anVechime;

    public Angajat(String nume, String prenume, double salariu, int anVechime) {
        super(nume);
        this.prenume = prenume;
        this.salariu = salariu;
        this.anVechime = anVechime;
    }

    public void afisareSalariu() {
        double salariuCurent = this.getSalariu();
        double salariuActual = salariuCurent;
        for (int i = 0; i < anVechime; i++) {
            salariuActual += (0.1) * salariuCurent;
        }
        System.out.println(salariuActual);
    }

    public void afisareNumeCompletSiFunctie() {
        System.out.println(this);
    }

    public String getPrenume() {
        return prenume;
    }

    public double getSalariu() {
        return salariu;
    }

    public int getAnVechime() {
        return anVechime;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        String nume = getNume();
        result = prime * result + ((nume == null) ? 0 : nume.hashCode());
        result = prime * result + ((prenume == null) ? 0 : prenume.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Angajat other = (Angajat) obj;
        String nume = getNume();
        if (nume == null) {
            if (other.getNume() != null)
                return false;
        } else if (!nume.equals(other.getNume()))
            return false;
        if (prenume == null) {
            if (other.prenume != null)
                return false;
        } else if (!prenume.equals(other.prenume))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return getNume() + " " + getPrenume() + " (" + getClass().getName() + ")";
    }

}
