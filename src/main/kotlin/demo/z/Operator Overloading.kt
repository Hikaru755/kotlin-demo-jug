package demo.z

class RandomClass {

    operator fun plus(s: String): RandomClass = TODO()

    operator fun compareTo(other: RandomClass): Int = TODO()

    operator fun get(i: Int): Any = TODO()

    operator fun set(i: Int, value: Any) {}

    operator fun contains(i: Any): Boolean = TODO()

    operator fun invoke(p: Int) {}

}

fun main(args: Array<String>) {
    val r1 = RandomClass()
    val r2 = RandomClass()

    val r3 = r1 + "Test"

    if (r1 == r2) {}

    if (r1 > r2) {}

    val a = r1[2]

    r1[42] = "Test"

    if ("Test" in r1) {}

    r1(100)
}