import java.io.File
import java.time.LocalDate
import java.time.format.DateTimeFormatter

data class Person(val kundenNr: Int, val vorname: String, val nachname: String, val geburtsdatum: LocalDate, val geschlecht: Char)

val persons: List<Person> = readPersonFile(File("personen.csv"))

fun main() {


    for (person in persons) {
        println(person)
    }

}


fun readPersonFile(csv: File): List<Person> {
    val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
    val lines = csv.readLines().map { it.split(";") }
    return lines.drop(1).map {
        val (nr, vn, nn, geb, mw) = it
        Person(nr.toInt(), vn, nn, LocalDate.parse(geb, formatter), mw[0])
    }
}


