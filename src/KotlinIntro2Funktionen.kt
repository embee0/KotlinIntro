// Jede Zeile in diesem Programm hat (wahrscheinlich) im Vergleich zu anderen Programmiersprachen etwas Ungewohntes.
// Was fällt dir in den einzelnen Zeilen auf?

fun main() {
    // Funktionen
    greet("Meyer", "Herr")
    greet("Müller")

    var zahl = verdopple(6)
    zahl = quadriere(zahl)

}

fun greet(name: String, anrede: String = "Frau") {
    println("Guten Tag, $anrede $name!")
}

fun verdopple(z: Int): Int {
    return z * 2
}

fun quadriere(zahl: Int) = zahl * zahl

