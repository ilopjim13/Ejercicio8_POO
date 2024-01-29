fun main() {
    val listaLibros = ConjuntoLibros()

    listaLibros.agregarLibros("Pepito", "Jose", 289, 7)
    listaLibros.agregarLibros("Noce", "Manolito", 190, 3)
    listaLibros.agregarLibros("xd", "xd", 190, 2)

    listaLibros.eliminarLibros("xd", "xd")

    listaLibros.mostrarCalificacion()

    listaLibros.mostrarContenido()
}