package principal;

import java.util.Scanner;

public class Ejercicio_19 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int []arreglo= new int [5];
		int numero;
		for(int i=0;i<arreglo.length;i++){
			System.out.println("Ingrese un numero\n");
			numero=in.nextInt();
			arreglo[i]=numero;
			
				
			
		}
		for(int i=0;i<arreglo.length;i++){
			System.out.println("Los numeros son\n"+ arreglo[i]);
			in.close();
		}
	}
	}

