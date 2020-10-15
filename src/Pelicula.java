
class Pelicula {

	String titulo;
	String genero;

	public Pelicula(String titulo, String genero) {
		this.titulo = titulo;
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + "]";
	}

}
