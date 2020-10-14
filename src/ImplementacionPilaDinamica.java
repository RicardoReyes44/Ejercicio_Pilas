import java.util.Stack;

public class ImplementacionPilaDinamica implements RentaPeliculas{
	
	Stack<Pelicula> pila;
	
	public ImplementacionPilaDinamica() {pila = new Stack<Pelicula>();}
	
	@Override
	public Pelicula eliminar() {
		return pila.pop();
	}

	@Override
	public Pelicula obtenerUltimo() {
		return pila.get(0);
	}

	@Override
	public boolean agregar(Pelicula elemento) {
		if(verificarPilaVacia()) {
			pila.add(elemento);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int obtenerTamaño() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean verificarPilaLlena() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verificarPilaVacia() {
		return pila.size()==0;
	}
}
