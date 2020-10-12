
public interface RentaPeliculas {
	
	public Pelicula eliminar();
	public Pelicula obtenerUltimo();
	public boolean agregar();
	public int obtenerTamaño();
	public boolean verificarPilaLlena();
	public boolean verificarPilaVacia();
	
}
