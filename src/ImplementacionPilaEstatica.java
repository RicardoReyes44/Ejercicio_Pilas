import java.util.Arrays;

public class ImplementacionPilaEstatica implements RentaPeliculas{

	Pelicula p[];
	int flecha = -1;
	
	public ImplementacionPilaEstatica(int tamaño) {p = new Pelicula[tamaño];}
	
	@Override
	public Pelicula eliminar() {
		if(!verificarPilaVacia()) {
			Pelicula e = p[flecha];
			p[flecha--] = null;
			return e;
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
		if(flecha!=-1) {
			return flecha+1;
		}else {
			return 0;
		}
	}
	
	@Override
	public boolean verificarPilaLlena() {
		return 4==flecha;
	}

	@Override
	public boolean verificarPilaVacia() {
		return flecha==-1;
	}

	@Override
	public String toString() {
		return "ImplementacionPilaEstatica [p=" + Arrays.toString(p) + ", flecha=" + flecha + "]";
	}
	
	
	
}
