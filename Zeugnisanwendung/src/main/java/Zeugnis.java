import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class Zeugnis {
    private String vorname;
    private String nachname;
    private LocalDate geburtsdatum;
    private LocalDate zeugnisdatum;
    private ArrayList<Gegenstand> gegenstaende;

    private static final int MAX_GEGENSTAENDE = 10;

    public Zeugnis(String vorname, String nachname, LocalDate geburtsdatum, LocalDate zeugnisdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.zeugnisdatum = zeugnisdatum;
        this.gegenstaende = new ArrayList<>();
    }

    public boolean addSubject(Gegenstand gegenstand) {
        if (gegenstaende.size() >= MAX_GEGENSTAENDE) {
            System.out.println("Es können maximal " + MAX_GEGENSTAENDE + " Gegenstände hinzugefügt werden.");
            return false;
        }

        gegenstaende.add(gegenstand);
        return true;
    }

    public int getAnzahlGegenstaende() {
        return gegenstaende.size();
    }

    public void sortSubjects() {
        // Bubble Sort nach Bezeichnung der Gegenstände
        // Vorgabe: Sortieren mit Collections.swap()
        for (int i = 0; i < gegenstaende.size() - 1; i++) {
            for (int j = 0; j < gegenstaende.size() - i - 1; j++) {
                String name1 = gegenstaende.get(j).getBezeichnung();
                String name2 = gegenstaende.get(j + 1).getBezeichnung();

                if (name1.compareToIgnoreCase(name2) > 0) {
                    Collections.swap(gegenstaende, j, j + 1);
                }
            }
        }
    }

    public void printCertificate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println();
        System.out.println("========================================");
        System.out.println("                 ZEUGNIS");
        System.out.println("========================================");
        System.out.println("Name: " + vorname + " " + nachname);
        System.out.println("Geburtsdatum: " + geburtsdatum.format(formatter));
        System.out.println("Zeugnisdatum: " + zeugnisdatum.format(formatter));
        System.out.println("Anzahl Gegenstände: " + getAnzahlGegenstaende());
        System.out.println("----------------------------------------");

        for (Gegenstand gegenstand : gegenstaende) {
            System.out.println(gegenstand);
        }

        System.out.println("========================================");
    }
}
