public class Act {
    private String ID;
    private Persoana persoana;

    public Act(String iD) {
        ID = iD;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ID == null) ? 0 : ID.hashCode());
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
        Act other = (Act) obj;
        if (ID == null) {
            if (other.ID != null)
                return false;
        } else if (!ID.equals(other.ID))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + getID() + getPersoana();
    }

    public String getID() {
        return ID;
    }

    public Persoana getPersoana() {
        return persoana;
    }

}
