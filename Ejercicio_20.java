package principal;

import java.util.Scanner;

public class Ejercicio_20 {

	public static void main(String[] args) {
int A=0, VA=0;
Scanner in= new Scanner(System.in);

System.out.println("Ingrese un número");

A=in.nextInt();
if(A>0){
	System.out.println("El valor absoluto es:"+ A);
	
}else{
	VA= A*(-1);
	System.out.println("El valor absoluto es:" + VA);

}

in.close();


	}

}
