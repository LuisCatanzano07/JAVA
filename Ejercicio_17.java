package principal;

import java.util.Scanner;

public class Ejercicio_17 {
	public static void main(String[] args) {
	int A,B,D;
	A=0;
	B=0;
	D=0;
	Scanner in= new Scanner(System.in);
	System.out.println("Ingrese primer número: ");
	A=in.nextInt();
	System.out.println("Ingrese primer número: ");
	B=in.nextInt();	
	if (A==3 && B==4){
		D=A+B;
	}else{
		D=A*B;
	}		
	
	System.out.println("El resultado es: "+ D);
	in.close();
 }
}
