fun main() {

//    for (i in 0..50) {
//        println("Ich soll mich nicht immer wiederholen!")
//    }
//
//    for (i in 0..3) {
//        val zufallszahl = (1..6).random()
//        println("Ich habe eine $zufallszahl gewürfelt.")
//    }
//
//    var liste = mutableListOf<String>()
//    for (i in 0..10) {
//        liste.add("Test$i")
//    }
//
//    repeat(50) {
//        val zufallszahl = (1..6).random()
//        println("Ich habe eine $zufallszahl gewürfelt.")
//    }
//
//    wiederhole(5, {
//        val zufallszahl = (1..6).random()
//        println("Ich habe eine $zufallszahl gewürfelt.")
//    })
//
//    wiederhole(10, ::schreibeEtwas)
//
//    zaehlschleife(3, ::schreibeMitZeilenummer)
//
//    zaehlschleife(3) {
//        i -> println("Ich habe $i$ im Geldbeutel.")
//    }
//
//    val liste = listOf(1, 2, 3, 4, 5)
//    liste.forEach {
//        println(it)
//    }
//
//
//
//    for (i in liste) {
//        println(i)
//    }

    val summe = addiere(6, 7)
    val differenz = subtrahiere(6, 7)

    berechne(6, 7, ::multipliziere, "multipliziere")

    berechne(6, 7, { x, y -> x * y }, "multipliziere")

    val operatoren = listOf(::addiere, ::subtrahiere, ::multipliziere, ::dividiere)
    for (op in operatoren) {
        berechne(7, 9, op, "verrechne")
    }

    val opMap = mapOf("+" to ::addiere, "-" to ::subtrahiere)
    for (opName in opMap.keys) {
        val op = opMap[opName]!!
        berechne(3, 11, op, opName)
    }


}

fun wiederhole(anzahl: Int, code: () -> Unit) {
    for (i in 1..anzahl) {
        code()
    }
}

fun zaehlschleife(anzahl: Int, code: (Int) -> Unit) {
    for (i in 1..anzahl) {
        code(i)
    }
}

fun wertetabelle(minX: Int, maxX: Int, f: (Int) -> Double) {
    for (x in minX..maxX) {
        val y = f(x)
        println("f($x) = $y")
    }
}

fun addiere(x: Int, y: Int): Int = x + y
fun subtrahiere(x: Int, y: Int) = x - y
fun multipliziere(x: Int, y: Int) = x * y
fun dividiere(x: Int, y: Int) = x / y

fun berechne(x: Int, y: Int, op: (Int, Int) -> Int, opName: String) {
    val ergebnis = op(x, y)
    println("Ich $opName die Zahlen $x und $y... Ergebnis: $ergebnis")
}

fun schreibeEtwas() {
    println("Hallo!")
}

fun schreibeMitZeilenummer(i: Int) {
    println("$i: Hallo!")
}