package principal;
public class Serie_Armonica_ejercicio_6 {

	public static void main(String[] args) {
		int maxDenominador = 50000 ;
		double sumMenorAmayor = 0.0 ; // sum de menor a mayor
		double sumMayorAmenor = 0.0 ; // sum de mayor a menor
		// forloop
		//para la suma de menor a mayor
		
		for ( int denominador = 1 ; denominador <= maxDenominador ; denominador ++ ) {
		 
			sumMenorAmayor = sumMenorAmayor + (1.0/denominador);
		}
		
		for ( int denominador = maxDenominador ; denominador >= 1 ; denominador -- ) {
			 
			sumMayorAmenor = sumMayorAmenor + (1.0/denominador);
		}
		
		 
		boolean sonIguales = sumMenorAmayor == sumMayorAmenor; 
		
		
		System.out.println("Los numeros son iguales? " + sonIguales);
		System.out.println("diferencia: " + (sumMenorAmayor - sumMayorAmenor));
		
		//mostrar los resultados

	}

}