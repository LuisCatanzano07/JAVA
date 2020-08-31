package principal;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int producto =0;
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese  el primer numero: ");
		num1 = in.nextInt();
		System.out.print("Ingrese  el segundo numero: ");
		num2= in.nextInt();
		producto=num1*num2;
in.close();
		
		System.out.print("El producto del primer numero por el segundo es" + producto);
		
	}

}
