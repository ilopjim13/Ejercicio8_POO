class Libro(val titulo: String, val autor: String, val numPaginas: Int, val calificacion: Int) {
    init {
        require(this.calificacion in 0..10) {"La calificación debe ser entre 0 y 10."}
    }

    override fun toString(): String {
        return "${this.titulo} de ${this.autor} con un total de ${this.numPaginas} páginas y una calificación de ${this.calificacion}/10."
    }
}