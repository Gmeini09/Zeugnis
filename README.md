# Zeugnisanwendung

Eine einfache Java-Konsolenanwendung zur Erstellung eines Zeugnisses für eine Person.

## Funktionen

- Eingabe von Personendaten
- Eingabe von Geburtsdatum und Zeugnisdatum
- Hinzufügen von maximal 10 Gegenständen
- Speichern von Bezeichnung, Kurzbezeichnung und Note
- Sortieren der Gegenstände mit Bubble Sort und `Collections.swap()`
- Ausgabe des fertigen Zeugnisses in der Konsole

## Klassen

- `Main` – startet das Programm und liest die Daten ein
- `Zeugnis` – verwaltet Personendaten und Gegenstände
- `Gegenstand` – speichert Fachbezeichnung, Kurzbezeichnung und Note

## Starten

Das Projekt in IntelliJ öffnen und die Datei `Main.java` ausführen.

Alternativ im Terminal:

```bash
javac src/main/java/*.java
java -cp src/main/java Main
