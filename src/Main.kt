fun main() {
    val listaLibros = ConjuntoLibros()

    listaLibros.agregarLibros("Pepito", "Jose", 289, 7)
    listaLibros.agregarLibros("Noce", "Manolito", 190, 3)
    listaLibros.agregarLibros("xd", "xd", 190, 3)

    listaLibros.eliminarLibros("xd")

    listaLibros.mostrarCalificacion()

    listaLibros.mostrarContenido()
}