package principal;
import java.util.Scanner;

public class Ejercicio_Algoritmo_De_Busqueda {
	static Scanner in; // variable de instancia

	public static void main(String[] args) {
		in = new Scanner(System.in);// genero la instancia de Scanner (variable
									// de instancia)

		int opcionDeMenu = 1;// inicializo para que la opción de menú sea desde
								// el principio
		int array[] = new int[5];// inicializa el array

		do {

			if (opcionDeMenu == 1) { // Si cargan todos los números
				for (int i = 0; i < array.length; i++) {
					array[i] = getNumber("Ingrese un número entero", "Sólo se admiten números enteros");
				}
			}
			if (opcionDeMenu <= 2) { // para buscar determinado número en el
										// array anterior
				int numeroDeBusqueda;
				numeroDeBusqueda = getNumber("Ingrese el número a buscar (tiene que ser entero)", "Sólo se admiten números enteros");
				// Utilizo el operador condicional ternario "? :" (Apunte
				// teórico pag. 25) para saber qué mensaje mostrar
				
				String mensaje = findNumber(array, numeroDeBusqueda)
						? "Se ha encontrado el número ingresado para buscar :)"
						: "NO se ha encontrado el número ingresado para buscar :(";
				
				 
				System.out.println(mensaje);

				opcionDeMenu = getNumber(
						"Seleccione la opción deseada del menu\n1 para empezar de nuevo\n2 para buscar otro número\n3 para Salir",
						"Sólo se admiten números enteros del 1 al 3", 1, 3);
			}
		} while (opcionDeMenu != 3);
		System.out.println("Sale del programa");
		in.close();// cierro el scanner
	}

	/**
	 * Lee y valida un número entero por consola
	 * 
	 * @param mensajeDeingreso
	 *            Mensaje que se le muestra al usuario para que ingrese el
	 *            numero
	 * @param mensajeDeError
	 *            Mensaje que se muestra en caso de error
	 * @return el numero entero leído
	 */
	private static int getNumber(String mensajeDeingreso, String mensajeDeError) {
		int returnNumber = 0;
		System.out.println(mensajeDeingreso);

		while (!in.hasNextInt()) { // while (in.hasNextInt() == false)
			System.out.println(mensajeDeError);
			in.next(); // libera el buffer
		}
		returnNumber = in.nextInt();

		return returnNumber;
	}

	/**
	 * Lee y valida un número entero por consola validado que esté entre los
	 * limites superior e inferior indicado en los parametros
	 * 
	 * @param mensajeDeingreso
	 *            Mensaje que se le muestra al usuario para que ingrese el
	 *            numero
	 * @param mensajeDeError
	 *            Mensaje que se muestra en caso de error
	 * @param limiteInferior
	 *            es el límite inferior (no inclusivo) que puede tener
	 * @param limiteSuperior
	 *            es el límite superior (no inclusivo) que puede tener el número
	 * @return el numero entero leído
	 */
	private static int getNumber(
			String mensajeDeingreso, 
			String mensajeDeError, 
			int limiteInferior,
			int limiteSuperior) {
		int numeroIngresado;
		
		boolean continuarWhile;
		do {
			numeroIngresado = getNumber(mensajeDeingreso, mensajeDeError + "\n" + mensajeDeingreso);
			continuarWhile = numeroIngresado < limiteInferior || numeroIngresado > limiteSuperior;
			if (continuarWhile) {
				System.out.println(mensajeDeError);
			}

		} while (continuarWhile);

		return numeroIngresado;
	}

	/**
	 * Busa el número indicado dentro del array
	 * 
	 * @param array
	 *            vector de enteros en dónde se buscará la coincidencia
	 * @param numeroDeBusqueda
	 *            número a buscar
	 * @return true si el numeroDebusueda está incluído en el array
	 */
	private static boolean findNumber(int[] array, int numeroDeBusqueda) {
		if (array == null) {
			return false;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numeroDeBusqueda) {
				return true;
			}
		}

		return false;
	}

}