public class Gegenstand {
    private String bezeichnung;
    private String kurzbezeichnung;
    private int note;

    public Gegenstand(String bezeichnung, String kurzbezeichnung, int note) {
        this.bezeichnung = bezeichnung;
        this.kurzbezeichnung = kurzbezeichnung;
        this.note = note;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getKurzbezeichnung() {
        return kurzbezeichnung;
    }

    public int getNote() {
        return note;
    }

    @Override
    public String toString() {
        if (kurzbezeichnung == null || kurzbezeichnung.isEmpty()) {
            return bezeichnung + ": " + note;
        }

        return bezeichnung + " (" + kurzbezeichnung + "): " + note;
    }
}
