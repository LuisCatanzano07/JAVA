package principal;
public class Fibonacci_ejercicio_9 {

	public static void main(String[] args) {
		int n = 3; // el índice n para F(n), comenzando con n=3
		int fn; // F(n) que se calculará
		int fnMenos1 = 1; // F(n-1), inicialización para F(2) = 1 (por
							// definición)
		int fnMenos2 = 1; // F(n-2), inicialización para F(1) = 1 (Por
							// definición)
		int nMax = 20; // valor máximo de n, inclusive
		int sum = fnMenos1 + fnMenos2; // ACUMULA TODOS LOS F(n)
		double promedio;

		System.out.println("Los primeros " + nMax
				+ " números de Fibonacci son:");

		System.out.print("1 ");
		System.out.print("1 ");

		while (n <= nMax) {
			// calcular F(n), imprimirlo y agregar a ""sum""
			fn = fnMenos1 + fnMenos2;
			System.out.print(fn + " ");

			sum = sum + fn;

			// ajustar el índice n e intercambiar los números
			n = n + 1;
			// f(n) => fn
			// f(n-1) => fnMenos1
			// f(n-2) => fnMenos2
			// DESPLAZO LOS VALORES UN LUGAR
			// fMenos1 => fn
			// fMenos2 => fMenos1

			// lo que tengo en f-1 ahora lo voy a tener en f-2
			fnMenos2 = fnMenos1;

			// lo que tengo en f ahora lo voy a tener en f-1
			fnMenos1 = fn;

		}
		// calcular y mostrar el promedio (=sum/nMax)

	}

}