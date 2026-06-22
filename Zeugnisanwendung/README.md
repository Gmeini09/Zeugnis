# Zeugnisanwendung

Dieses IntelliJ-Projekt erfüllt die geforderten Kriterien:

- Klasse `Zeugnis`
- Personendaten
- Geburtsdatum und Zeugnisdatum im Format `dd.MM.yyyy`
- Gegenstände als `ArrayList`
- maximal 10 Gegenstände
- Funktionen `sortSubjects`, `printCertificate`, `addSubject`
- Klasse `Gegenstand` mit Bezeichnung, Kurzbezeichnung und Note
- Klasse `Main`
- Basisdaten werden eingelesen
- Gegenstände und Noten werden eingelesen und zum Zeugnis-Objekt hinzugefügt
- Sortierung mit Bubble Sort und `Collections.swap()`
- Ausgabe des Zeugnisses

## In IntelliJ starten

1. ZIP-Datei entpacken.
2. IntelliJ IDEA öffnen.
3. `File` → `Open...` auswählen.
4. Den Ordner `Zeugnisanwendung_richtig` öffnen.
5. Datei `src/main/java/Main.java` öffnen.
6. Neben `public static void main` auf den grünen Play-Button klicken.

## Über Terminal kompilieren

```bash
javac src/main/java/*.java
java -cp src/main/java Main
```
