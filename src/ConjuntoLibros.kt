class ConjuntoLibros {
    var libros = MutableList(3) {Libro("", "", 0, 0)}

    fun agregarLibros(titulo:String, autor:String, pag:Int, cal:Int) {
        if (this.libros[0].titulo == ""  && this.libros[1].titulo == "" && this.libros[2].titulo == "") this.libros[0] = Libro(titulo, autor, pag, cal)
        else if (this.libros[0].titulo != ""  && this.libros[1].titulo == "" && this.libros[2].titulo == "") this.libros[1] = Libro(titulo, autor, pag, cal)
        else if (this.libros[0].titulo != ""  && this.libros[1].titulo != "" && this.libros[2].titulo == "") this.libros[2] = Libro(titulo, autor, pag, cal)
        else if (this.libros[0].titulo != ""  && this.libros[1].titulo != "" && this.libros[2].titulo != "")  println("Limite de libros alcanzado.")
    }

    fun eliminarLibros(elimina:String) {
        for (libro in libros) {
            if (libro.titulo == elimina && libro.autor == elimina) {
                libros.remove(libro)
            }
        }
    }

    fun mostrarCalificacion() {
        println("El libro con mayor calificación es ${libros.maxBy { it.calificacion }}")
        println("El libro con menor calificación es ${libros.minBy { it.calificacion }}")
    }

    fun mostrarContenido() {
        for(libro in libros) {
            println(libro)
        }
    }
}