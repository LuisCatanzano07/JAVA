package principal;

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {

		int X;
		int A;
	     X=0;
		 A=0;   
		
   Scanner in=new Scanner (System.in);
   System.out.println("Ingrese un n�mero :");
   X=in.nextInt();
		   if (X==10){
			   A=X+2;
			   System.out.println ("El n�mero X es: "+ X+" el n�mero A es " + A);

		   }
		   else
		   { System.out.println ("El n�mero no es correcto");
		   }
		   in.close();
	}

}