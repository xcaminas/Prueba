fun main(args: Array<String>) {
    literales()
    plantillas()
}

private fun plantillas() {
    val numero = 18
    val nombre = "pruebaKotlin $numero"
    println(nombre)

    println("$nombre.length = ${nombre.length}")

    val precio = "${'€'}10.99 = 100.99 euros"
    println(precio)
}

private fun literales() {
    val holamundo = "Hola, mundo!"
    println(holamundo)
    val frase = "Hola, mundo!\n..."   // w/backslash
    println(frase)
