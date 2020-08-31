package principal;

public class Piedra_Papel_Tijera_ejercicio_8 {
	/*
	 * Piedra Papel y Tijera (bucle & condiciones) Escribir un programa, llamado
	 * PiedraPapelTijera que imprima los n�meros del 1 al 110, mostrando 11
	 * n�meros por l�nea.
	 * 
	 * 
	 * El programa deber� imprimir: �Piedra� en lugar de los n�meros que son
	 * m�ltiplos de 3 �Papel� en lugar de los n�meros que son m�ltiplos de 5 y
	 * �Tijera� para aquellos n�meros m�ltiplos de 7, adem�s,
	 * 
	 * 
	 * imprimir �PiedraPapel� para aquellos n�meros que sean a su vez divisibles
	 * por 3 y 5 simult�neamente, �PapelTijera� para los divisibles entre 5 y 7,
	 * �PiedraTijera� para los que son divisibles entre 3 y 7.
	 */
	public static void main(String[] args) {

		int contadorLineas = 0;

		for (int i = 1; i <= 110; i++) {

			contadorLineas = contadorLineas + 1;
			
			if(contadorLineas > 11)
			{
				//reseteo
				contadorLineas = 0;
				System.out.println("");
			}
			
			if (i % 15 == 0) {// es m�ltiplo de 3 * 5
				System.out.print(" PiedraPapel");
			} else if (i % 21 == 0) {
				System.out.print(" PiedraTijera");
			} else if (i % 35 == 0) {
				System.out.print(" PapelTijera");
			} else {

				int resto;
				resto = i % 3;
				if (resto == 0) { // es m�ltiplo de 3
					System.out.print(" Piedra");
				} else {
					resto = i % 5;
					if (resto == 0) {// es m�ltiplo de 5
						System.out.print(" Papel");
					} else {
						resto = i % 7;
						if (resto == 0) {// es m�ltimplo de 7
							System.out.print(" Tijera");
						} else {
							System.out.print("  " + i + " ");
						}
					}
				}
			}

		}

		/*
		 * System.out.print(" Imprimo algo y le mete enter al final");
		 * System.out.print("Esto imprime en la linea anterior");
		 * System.out.print(" Ves que este mesnaje esta consecuente?");
		 */
	}
}