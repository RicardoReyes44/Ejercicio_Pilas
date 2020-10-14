
public class ImplementacionPilaEstatica implements RentaPeliculas{

	Pelicula p[];
	int flecha = -1;
	
	public ImplementacionPilaEstatica(int tamaño) {p = new Pelicula[tamaño];}
	
	@Override
	public Pelicula eliminar() {
		if(verificarPilaVacia()) {
			flecha--;
			return p[flecha+1];
		}else {
			return null;
		}
	}

	@Override
	public Pelicula obtenerUltimo() {
		return p[0];
	}

	@Override
	public boolean agregar(Pelicula elemento) {
		if(!verificarPilaLlena()) {
			flecha++;
			p[flecha] = elemento;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int obtenerTamaño() {
		return flecha+1;
	}
	
	@Override
	public boolean verificarPilaLlena() {
		return p.length-1==flecha;
	}

	@Override
	public boolean verificarPilaVacia() {
		return -1==flecha;
	}
}
