package principal;
import java.util.Scanner;

public class Ejercicio_Algoritmo_De_Busqueda {
	static Scanner in; // variable de instancia

	public static void main(String[] args) {
		in = new Scanner(System.in);// genero la instancia de Scanner (variable
									// de instancia)

		int opcionDeMenu = 1;// inicializo para que la opci�n de men� sea desde
								// el principio
		int array[] = new int[5];// inicializa el array

		do {

			if (opcionDeMenu == 1) { // Si cargan todos los n�meros
				for (int i = 0; i < array.length; i++) {
					array[i] = getNumber("Ingrese un n�mero entero", "S�lo se admiten n�meros enteros");
				}
			}
			if (opcionDeMenu <= 2) { // para buscar determinado n�mero en el
										// array anterior
				int numeroDeBusqueda;
				numeroDeBusqueda = getNumber("Ingrese el n�mero a buscar (tiene que ser entero)", "S�lo se admiten n�meros enteros");
				// Utilizo el operador condicional ternario "? :" (Apunte
				// te�rico pag. 25) para saber qu� mensaje mostrar
				
				String mensaje = findNumber(array, numeroDeBusqueda)
						? "Se ha encontrado el n�mero ingresado para buscar :)"
						: "NO se ha encontrado el n�mero ingresado para buscar :(";
				
				 
				System.out.println(mensaje);

				opcionDeMenu = getNumber(
						"Seleccione la opci�n deseada del menu\n1 para empezar de nuevo\n2 para buscar otro n�mero\n3 para Salir",
						"S�lo se admiten n�meros enteros del 1 al 3", 1, 3);
			}
		} while (opcionDeMenu != 3);
		System.out.println("Sale del programa");
		in.close();// cierro el scanner
	}

	/**
	 * Lee y valida un n�mero entero por consola
	 * 
	 * @param mensajeDeingreso
	 *            Mensaje que se le muestra al usuario para que ingrese el
	 *            numero
	 * @param mensajeDeError
	 *            Mensaje que se muestra en caso de error
	 * @return el numero entero le�do
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
	 * Lee y valida un n�mero entero por consola validado que est� entre los
	 * limites superior e inferior indicado en los parametros
	 * 
	 * @param mensajeDeingreso
	 *            Mensaje que se le muestra al usuario para que ingrese el
	 *            numero
	 * @param mensajeDeError
	 *            Mensaje que se muestra en caso de error
	 * @param limiteInferior
	 *            es el l�mite inferior (no inclusivo) que puede tener
	 * @param limiteSuperior
	 *            es el l�mite superior (no inclusivo) que puede tener el n�mero
	 * @return el numero entero le�do
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
	 * Busa el n�mero indicado dentro del array
	 * 
	 * @param array
	 *            vector de enteros en d�nde se buscar� la coincidencia
	 * @param numeroDeBusqueda
	 *            n�mero a buscar
	 * @return true si el numeroDebusueda est� inclu�do en el array
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