import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ImplementacionPilaDinamica ipd = null;
		ImplementacionPilaEstatica ipe = null;
		Pelicula rentadas[] = new Pelicula[5];
		boolean candado = true;
		byte opcionPila = 0;
		byte cantidadRentada = -1;
		boolean cargado = false;

		while(candado) {
			System.out.println("1.- Pila estatica");
			System.out.println("2.- Pila dinamica");
			System.out.print("Introduce opcion: ");

			try {
			opcionPila = entrada.nextByte();

			switch(opcionPila) {
			case 1:

				ipe = new ImplementacionPilaEstatica(5);
				candado = false;
				break;

			case 2:
				ipd = new ImplementacionPilaDinamica();
				candado = false;
				break;

			default:
				System.out.println("Opcion invalida");
				break;
			}
		    }catch(InputMismatchException error){
				System.out.println("\nError en la entrada de datos <" + error + ">, por favor vuelve a intentarlo");
				entrada.nextLine();
			}
		}


		candado = true;
		while(candado) {

			System.out.println("\n-------------------------------------\nMENU\n-------------------------------------\n1.- Cargar BD de peliculas\n"
					+ "2.- Rentar pelicula\n" 
					+ "3.- Devolver pelicula\n"  
					+ "4.- Mostrar cantidad de peliculas disponibles para rentar\n"
					+ "5.- Salir");
			System.out.print("Introduce opcion: ");

			try{
			byte opcion = entrada.nextByte();

			switch(opcion) {
			case 1:
				Pelicula p[] = {new Pelicula("Fnaf", "Terror"), new Pelicula("Rocky VII", "Deporte"), new Pelicula("Sonic The Hedgehog", "Aventura"), new Pelicula("Venom", "Aventura"), new Pelicula("Iron man", "Accion")};

				if(opcionPila==1) {
					ipe.agregar(p[0]);
					ipe.agregar(p[1]);
					ipe.agregar(p[2]);
					ipe.agregar(p[3]);
					ipe.agregar(p[4]);
				}else {
					ipd.agregar(p[0]);
					ipd.agregar(p[1]);
					ipd.agregar(p[2]);
					ipd.agregar(p[3]);
					ipd.agregar(p[4]);
				}
				cargado = true;
				break;


			case 2:
				if(!cargado) {
					System.out.println("\nError, no se ha cargado la base de datos");
				}else if(cantidadRentada==4) {
					System.out.println("\nError, no puedes tener mas peliculas de las que puedes rentar");
				}else {
					cantidadRentada++;
					if(opcionPila==1) {
					    rentadas[cantidadRentada]= ipe.eliminar();
					    System.out.println(rentadas[cantidadRentada]);
				    }else {
					    rentadas[cantidadRentada]= ipd.eliminar();
					    System.out.println(rentadas[cantidadRentada]);
				    }
				}
				break;


            case 3:
            	if(!cargado) {
					System.out.println("\nError, no se ha cargado la base de datos");
				}else if(cantidadRentada==-1) {
            		System.out.println("\nError, no puedes dar mas peliculas de las que puedes tienen");
            	}else{
            		if(opcionPila==1) {
            		    System.out.println(ipe.agregar(rentadas[cantidadRentada]));
				    }else {
					    System.out.println(ipd.agregar(rentadas[cantidadRentada]));
				    }
            		rentadas[cantidadRentada] = null;
            		cantidadRentada--;
            	}
				break;


			case 4:
				if(!cargado) {
					System.out.println("\nError, no se ha cargado la base de datos");
				}else if(opcionPila==1) {
					System.out.println("Peliculas disponibles: " + ipe.obtenerTamaño());
				}else {
					System.out.println("Peliculas disponibles: " + ipd.obtenerTamaño());
				}
				break;


            case 5:
				candado = false;
				break;


			default:
				System.out.println("Opcion invalida");
				break;
			}
		    }catch(InputMismatchException error) {
		    	System.out.println("Error en la entrada de datos <" + error + ">\n\n");
		    }
			
			/*
			 * Quitar para ver pruebas
			 * 
			System.out.println(ipd);
			System.out.println(ipe);
			System.out.println(Arrays.toString(rentadas));
			*/
			
		}
		
		System.out.println("\nPrograma terminado");

	}

}
