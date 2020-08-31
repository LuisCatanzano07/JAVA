package principal;
import java.util.Scanner;
public class Ejercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ingresar un número en una variable llamada A y otro en una variable
		 * X. Calcular el X% de A y guardar el resultado en una variable llamada
		 * B. Imprimir B.
		 */
		double A;
		double X;
		double B;
		Scanner in = new Scanner(System.in);
		System.out.println("ingrese A");
		A = in.nextDouble();
		// if (A != 0) {
		// if ( (A > 0) || ( A < 0 ) ) {
		//boolean expresion = (A != 0d);
		if (A != 0) {
			System.out.println("ingrese X");
			X = in.nextDouble();
			B = X * 100d / A;
			System.out.println("el resulatado es " + B);
		} else {
			System.out.println("Usted apesta, no se puede dividir por cero");
			in.close();
		}

	}

}
