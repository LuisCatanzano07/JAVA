package principal;

public class CalculoDePi_ejercicio7 {

	public static void main(String[] args) {
		double sum = 0;
		int maxDenom = 10000000;

		for (int denom = 1; denom < maxDenom; denom = denom + 2) {

			if (denom % 4 == 1) {
				sum += 1d / denom;
			} else if (denom % 4 == 3) {
				sum -= 1d / denom;
			} else {
				System.out.println("Esto se volvió loco!!");
			}
		}
		
		double valorAproximadoDePi = 4d * sum;

		System.out.println("Valor aproximado: " + valorAproximadoDePi);
		System.out.println("Valor De Math.Pi: " + Math.PI);
		double diferencia = Math.abs( valorAproximadoDePi - Math.PI); //la funcion abs retorna el valor absoluto de un número.
		
				
		System.out.println("La diferencia entre Math.Pi y el valor caluclado es: " 
		+ diferencia);
	}

}