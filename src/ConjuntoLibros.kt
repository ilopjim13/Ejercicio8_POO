
class ConjuntoLibros {
    private var libros = mutableListOf<Libro>()
    private var cantLibros = 1

    fun agregarLibros(titulo:String, autor:String, pag:Int, cal:Int) {
        if (this.cantLibros <= 3) {
            if (libros.find {  it == Libro(titulo, autor, pag, cal) } == null) {
                libros.add(Libro(titulo, autor, pag, cal))
                this.cantLibros++
            } else println("Este libro ya existe en el conjunto de libros.")
        } else println("Limite de libros alcanzados.")
    }

    fun eliminarLibros(titu:String, autor: String) {
        if (libros.find { it.titulo == titu && it.autor == autor} != null) {
            libros.remove(libros.find { it.titulo == titu && it.autor == autor })
            this.cantLibros -= 1
        } else println("**ERROR** no se ha podido eliminado ningún libro.")
    }

    fun mostrarCalificacion() {
        println("El libro con mayor calificación es ${libros.maxBy { it.calificacion }.titulo}")
        println("El libro con menor calificación es ${libros.minBy { it.calificacion }.titulo}")
    }

    fun mostrarContenido() {
        for(libro in libros) {
            println(libro)
        }
    }
}