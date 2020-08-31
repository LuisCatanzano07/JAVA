package principal;
import java.util.*;

public class Teclado_Telefonico_ejercicio_16 {

	public static void main(String[] args) {
		String ingreso = "";
		String control = "abcdefghijklmnopqrstuvwxyz";
		int numeroSalida=0;

		Scanner in = new Scanner(System.in);
		while (ingreso.length() == 0  ) {
			System.out.println("ingrese los caracteres");
			ingreso = in.nextLine();
		}
		in.close();
		// variable auxiliar para evitar el problema del case sensitive
		String auxIngreso = ingreso.toLowerCase();

		// valido si los caracteres están incluídos dentro de los caracteres de
		// control:
		boolean esCaracterValido = false;
		for (int i = 0; i < auxIngreso.length(); i++) {
			char caracterActual = auxIngreso.charAt(i);
			esCaracterValido = false;
			for (int j = 0; j < control.length(); j++) {
				char caracterDeControl = control.charAt(j);
				if(caracterActual==caracterDeControl)
				{
					esCaracterValido = true;
					break;
				}				
			}
			
			if(esCaracterValido == false)
			{
				System.out.println("la palabra: " + auxIngreso + " NO Es válida");
				break; //i
			} 
			
		}
		
		if(esCaracterValido == true)
		{
			for (int i = 0; i < auxIngreso.length(); i++) {
				char caracterActual = auxIngreso.charAt(i);
				String ingresado= ""+caracterActual+"";
				switch (ingresado) {
				case "a":
				case "b":
				case "c":
					numeroSalida = 2;
					System.out.print(numeroSalida);
               break;
				case "d":
				case "e":
				case "f":
					numeroSalida = 3;
					System.out.print(numeroSalida);
					break;
				case "g":
				case "h":
				case "i":
					numeroSalida = 4;
					System.out.print(numeroSalida);
					break;
				case "j":
				case "k":
				case "l":
					numeroSalida = 5;
					System.out.print(numeroSalida);
					break;
				case "m":
				case "n":
				case "o":
					numeroSalida = 6;
					System.out.print(numeroSalida);
					break;
				case "p":
				case "q":
				case "r":
				case "s":
					numeroSalida = 7;
					System.out.print(numeroSalida);
					break;
				case "t":
				case "u":
				case "v":
					numeroSalida = 8;
					System.out.print(numeroSalida);
					break;
				case "w":
				case "x":
				case "y":
				case "z":
					numeroSalida = 9;
					System.out.print(numeroSalida);
					break;

				}
				
				
			}
		} 


	}
}