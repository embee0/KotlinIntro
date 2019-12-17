import java.io.File
import java.time.LocalDate
import java.time.format.DateTimeFormatter

data class Person(val kundenNr: Int, val vorname: String, val nachname: String, val geburtsdatum: LocalDate, val geschlecht: Char)

fun readPersonFile(csv: File): List<Person> {
    val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
    val lines = csv.readLines().map { it.split(";") }
    return lines.drop(1).map {
        val (nr, vn, nn, geb, mw) = it
        Person(nr.toInt(), vn, nn, LocalDate.parse(geb, formatter), mw[0])
    }
}

val persons: List<Person> = readPersonFile(File("personen.csv"))


fun main() {
    aufgabe0()
}

fun aufgabe0() {
    println("Gib alle Personen in der Datenbank aus:")
    for (person in persons) {
        println(person)
    }

    // Stelle nunden Cursor oben auf das Wort "for" und drücke Alt-Enter.
    // Welche Optionen den Code zu verändern schlägt dir IntelliJ vor?
    // Versuche die folgenden Varianten zu erzeugen:

    persons.forEach { println(it) }

    persons.forEach(::println)

    // Welche Lösung findest du selbst am besten?
}





