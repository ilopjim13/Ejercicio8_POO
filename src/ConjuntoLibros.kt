class ConjuntoLibros {
    var libros = Array(3) {Libro("", "", 0, 0)}

    fun agregarLibros(titulo:String, autor:String, pag:Int, cal:Int) {
        if (this.libros[0].titulo == ""  && this.libros[1].titulo == "" && this.libros[2].titulo == "") this.libros[0] = Libro(titulo, autor, pag, cal)
        else if (this.libros[0].titulo != ""  && this.libros[1].titulo == "" && this.libros[2].titulo == "") this.libros[1] = Libro(titulo, autor, pag, cal)
        else if (this.libros[0].titulo != ""  && this.libros[1].titulo != "" && this.libros[2].titulo == "") this.libros[2] = Libro(titulo, autor, pag, cal)
        else if (this.libros[0].titulo != ""  && this.libros[1].titulo != "" && this.libros[2].titulo != "")  println("Limite de cuentas alcanzado.")
    }

    fun eliminarLibros(elimina:String) {
        for (libro in libros) {
            if (libro.titulo == elimina && libro.autor == elimina) {
                libros
            }
        }
    }

    fun mostrarCalificacion() {

    }

    fun mostrarContenido() {

    }
}