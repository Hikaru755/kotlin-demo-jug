package demo.z

fun traverseHierarchyClassical(deeply: Deeply?) {

    if(deeply != null && deeply.nested != null && deeply.nested.hierarchy != null) {
        println(deeply.nested.hierarchy.name)
    } else {
        println("Something was null")
    }

}

fun traverseHierarchyIdiomatic(deeply: Deeply?) {

    println(deeply?.nested?.hierarchy?.name ?: "Something was null")

}




class Hierarchy(val name: String)
class Nested(val hierarchy: Hierarchy?)
class Deeply(val nested: Nested?)