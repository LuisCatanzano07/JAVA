package principal;
import java.util.Scanner;
public class Ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1;
		int n2;
		double p;
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese un número");
		n1=in.nextFloat();
		System.out.println("Ingrese otro número");
		n2=in.nextInt();
		p =n1/n2;
		
		//5 -> entero
		//5.0d -> double
		//5.0f -> float
		
		System.out.println(p);
		in.close();
	}

}
