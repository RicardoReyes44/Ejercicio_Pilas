import java.util.Stack;

public class ImplementacionPilaDinamica implements RentaPeliculas{
	
	Stack<Pelicula> pila;
	
	public ImplementacionPilaDinamica() {pila = new Stack<Pelicula>();}
	
	@Override
	public Pelicula eliminar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pelicula obtenerUltimo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregar() {
		// TODO Auto-generated method stub
		return false;
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
		// TODO Auto-generated method stub
		return false;
	}
}
