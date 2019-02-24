package lesson1.task1



//fun main ( args : Array < String > ) {
//
//    val x: Int = 3821
//    val y: Int
//val a: Int = x % 1000
//    val b: Int = sqr (4)
//    val c: Int = 478
//    val d = c % 10 // 8    d
//    val e = c / 10 // 47
//    val f = e % 10 // 7    f
//    val g = c / 100 // 4    g
//    println ("primer $d$f$g")
//    val ho: Int = 3
//    val min: Int = 43
//    val sec: Int = 24
//val number: Int = 3801
//    val s = ho * 60 * 60 + min * 60 + sec
//    println("secund vsego $s")
fun main(args: Array<String>) {


    fun thirdDigit() : Int {
        val n3: Int = 478 % 10

        return n3
    }

    val n3 : Int = thirdDigit()
    println("aaa $n3")
}
