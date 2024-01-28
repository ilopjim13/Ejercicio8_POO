class Libro(val titulo: String, val autor: String, val numPaginas: Int, val calificacion: Int) {
    init {
        require(this.calificacion in 1..10) {"La calificación debe ser entre 0 y 10."}
    }
}