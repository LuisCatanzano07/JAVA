package principal;

import java.util.Scanner;

public class Imprimir_Dias_En_Palabras {
	public static void main(String[] args) {
		int numero;
		Scanner in = new Scanner(System.in);
		System.out.println("ingrese un número");
		numero = in.nextInt();
		// IF ANIDADOS
		if (numero == 0) {
			System.out.println("LUNES");
		} else if (numero == 1) {
			System.out.println("MARTES");
		} else if (numero == 2) {
			System.out.println("MIÉRCOLES");
		} else if (numero == 3) {
			System.out.println("JUEVES");
		} else if (numero == 4) {
			System.out.println("VIERNES");
		} else if (numero == 5) {
			System.out.println("SÁBADO");
		} else if (numero == 6) {
			System.out.println("DOMINGO");
		} else {
			System.out.println("NO ES UN DÍA VÁLIDO");
		}

				/*//SWITCH-CASE
				String stringnom;
				switch(numero){
				case 0:
				stringnom="LUNES";
				    break;
				case 1:
				stringnom="MARTES";
				    break;
				case 2:
				stringnom="MIÉRCOLES";
				    break;
				case 3:
				stringnom="JUEVES";
				    break;
				case 4:
				stringnom="VIERNES";
				    break;
				case 5:
				stringnom="SÁBADO";
				    break;
				case 6:
				stringnom="DOMINGO";
				    break;

			    default:
			    stringnom="NO ES UN DÍA VÁLIDO"	;
			    	break;
			    	
				}
				
				System.out.println(stringnom);		
				*/
in.close();
			}

		}



