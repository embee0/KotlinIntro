// Jede Zeile in diesem Programm hat (wahrscheinlich) im Vergleich zu anderen Programmiersprachen etwas Ungewohntes.
// Was fällt dir in den einzelnen Zeilen auf?

fun main() {

    println("Willkommen bei Kotlin!")

    // Variablen
    val vorname: String = "Michael"
    val alter: Int = 44
    val nachname = "Brenner"
    println("Mein Name ist $vorname $nachname und ich bin $alter Jahre alt.")

    var alter2 = 44
    //alter += 1
    alter2 += 1

    // Schleifen
    val n = 10
    print(1)
    for (i in 2..n) {
        print(" + $i")
    }
    val summe = (1..n).sum()
    println(" = $summe")

    val sprachen = listOf("Java", "Python", "C#", "JavaScript", "Haskell", "Clojure", "Prolog", "Smalltalk")
    println()
    for (s in sprachen) {
        println("$s ist eine bekannte Programmiersprache.")
    }

    println()
    for ((i, s) in sprachen.withIndex()) {
        println("$s ist die ${i + 1}. Programmiersprache in unserer Liste.")
    }

    // Primitive Datentypen sind Klassen
    val binAlter = alter.toString(2)
    println("\nIm Binärsystem bin ich nicht $alter, sondern $binAlter Jahre alt.")

    val pi: Double = 3.1415926
    pi.toString()   // besseres Bsp???

}
