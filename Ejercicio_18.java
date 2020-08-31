package principal;

import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A=0, B=0;
double R =0;
Scanner in= new Scanner(System.in);
System.out.println("Ingrese dos números:");
A= in.nextInt();
B=in.nextInt();
if(A>B){
	R=A/B;
	System.out.println("El resultado es:" + R);
	
}else{
	R=B/A;
	System.out.println("El resultado es:"+ R);
}
in.close();
	}

}
