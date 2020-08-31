//pasar un número hexadecimal a binario
package principal;

import java.util.Scanner;

public class Hex_A_binario_ejercicio_29 {
	static Scanner in = new Scanner(System.in);

	public static String ingresarValor() {
		String auxEntrada = "";
		while (auxEntrada.equals("")) {
			System.out.println("Por favor ingrese un numero hexadecimal");
			auxEntrada = in.nextLine();
		}
		auxEntrada = auxEntrada.toUpperCase();
		return auxEntrada;
	}

	private static boolean validarCaracteres(String parametroIngreso) {

		char[] cadenaDeIngreso = parametroIngreso.toCharArray();
		char[] caracteresPermitidos = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E',
				'F' };
		boolean tieneCaracteresInvalidos = false;

		for (int i = 0; i < cadenaDeIngreso.length; i++) {
			char carActual = cadenaDeIngreso[i];
			tieneCaracteresInvalidos = true;
			for (int j = 0; j < 16; j++) {
				if (carActual == caracteresPermitidos[j]) {
					tieneCaracteresInvalidos = false;
					break;
				}
			}
			if (tieneCaracteresInvalidos == true) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ingreso = "";

		boolean tieneCaracteresInvalidos = false;

		while (ingreso.equals("") || tieneCaracteresInvalidos == true) {
			ingreso = ingresarValor();
			tieneCaracteresInvalidos = validarCaracteres(ingreso);
			if (tieneCaracteresInvalidos) {
				System.out.println("El número ingresado tiene caracteres inválidos");
			}
		}

		String[] equivalencia = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001",
				"1010", "1011", "1100", "1101", "1110", "1111" };

		char[] posicionDeCaracteres = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E',
				'F' };

		char[] arrayIngreso = ingreso.toCharArray();
		String acuSalida = "";
		for (int i = 0; i < arrayIngreso.length; i++) {
			// busco el índice en el array de caracteres permitidos
			for(int j= 0; j < 16; j++){
				if(arrayIngreso[i] == posicionDeCaracteres[j]){
					// obtengo el valor en string del array de equivalencia con el
					// índice previamente encontrado
					acuSalida += equivalencia[j];
					break;
				}
			}
		}
		System.out.println(acuSalida);
		

	}

}
