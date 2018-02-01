package demo.z

class Statics {

    companion object {

        val STATIC_FIELD = 1

        fun staticFunction(): Statics = Statics()

    }

}

fun main(args: Array<String>) {

    Statics.STATIC_FIELD

    Statics.staticFunction()

}