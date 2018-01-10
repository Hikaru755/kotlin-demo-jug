package demo.interop

class Statics {

    companion object {

        const val STATIC_FIELD = 1

        @JvmStatic
        fun staticFunction(): Statics = Statics()

    }

}

fun main(args: Array<String>) {

    Statics.STATIC_FIELD

    Statics.staticFunction()

}