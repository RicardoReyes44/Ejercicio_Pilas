import java.util.Stack;

public class ImplementacionPilaDinamica implements RentaPeliculas{
	
	Stack<Pelicula> pila;
	int punto = -1;
	
	public ImplementacionPilaDinamica() {pila = new Stack<Pelicula>();}
	
	@Override
	public Pelicula eliminar() {
		if(!verificarPilaVacia()) {
			punto--;
			return pila.pop();
		}else {
			return null;
		}
	}

	@Override
	public Pelicula obtenerUltimo() {
		return pila.get(0);
	}

	@Override
	public boolean agregar(Pelicula elemento) {
		pila.add(elemento);
		punto++;
		return true;
	}

	@Override
	public int obtenerTamaño() {
		return punto+1;
	}

	@Override
	public boolean verificarPilaLlena() {
		return 4==punto;
	}

	@Override
	public boolean verificarPilaVacia() {
		return pila.size()==0;
	}

	/*
	@Override
	public String toString() {
		return "ImplementacionPilaDinamica [pila=" + pila + ", punto=" + punto + "]";
	}*/
	
}
