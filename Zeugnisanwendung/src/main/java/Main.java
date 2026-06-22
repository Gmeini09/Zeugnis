import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zeugnisanwendung");
        System.out.println("----------------");

        System.out.print("Vorname: ");
        String vorname = readRequiredText(scanner);

        System.out.print("Nachname: ");
        String nachname = readRequiredText(scanner);

        LocalDate geburtsdatum = readDate(scanner, "Geburtsdatum (dd.MM.yyyy): ");
        LocalDate zeugnisdatum = readDate(scanner, "Zeugnisdatum (dd.MM.yyyy): ");

        Zeugnis zeugnis = new Zeugnis(vorname, nachname, geburtsdatum, zeugnisdatum);

        System.out.println();
        System.out.println("Gegenstände und Noten eingeben.");
        System.out.println("Leere Bezeichnung beendet die Eingabe. Maximal 10 Gegenstände sind erlaubt.");

        while (zeugnis.getAnzahlGegenstaende() < 10) {
            System.out.println();
            System.out.print("Bezeichnung: ");
            String bezeichnung = scanner.nextLine().trim();

            if (bezeichnung.isEmpty()) {
                break;
            }

            System.out.print("Kurzbezeichnung: ");
            String kurzbezeichnung = scanner.nextLine().trim();

            int note = readGrade(scanner, "Note (1-5): ");

            Gegenstand gegenstand = new Gegenstand(bezeichnung, kurzbezeichnung, note);
            zeugnis.addSubject(gegenstand);
        }

        zeugnis.sortSubjects();
        zeugnis.printCertificate();

        scanner.close();
    }

    private static String readRequiredText(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.print("Eingabe darf nicht leer sein. Bitte erneut eingeben: ");
        }
    }

    private static LocalDate readDate(Scanner scanner, String text) {
        while (true) {
            System.out.print(text);
            String input = scanner.nextLine().trim();

            try {
                return LocalDate.parse(input, FORMATTER);
            } catch (DateTimeParseException e) {
                System.out.println("Ungültiges Datum. Bitte im Format dd.MM.yyyy eingeben, z. B. 15.03.2008.");
            }
        }
    }

    private static int readGrade(Scanner scanner, String text) {
        while (true) {
            System.out.print(text);
            String input = scanner.nextLine().trim();

            try {
                int note = Integer.parseInt(input);

                if (note >= 1 && note <= 5) {
                    return note;
                }

                System.out.println("Die Note muss zwischen 1 und 5 liegen.");
            } catch (NumberFormatException e) {
                System.out.println("Bitte eine gültige Zahl eingeben.");
            }
        }
    }
}
