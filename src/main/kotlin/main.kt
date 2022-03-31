
fun main () {

    val likes = 5

    val peoples = if ((likes) % 10 == 1)  ("$likes человеку") else ("$likes людям")

    println(peoples)
}
