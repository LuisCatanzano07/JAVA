package principal;
import java.util.Scanner; //la clase Scanner nos permite interactuar con la consola
public class Ejercicio_5 {

	public static void main(String[] args) {
		/*
		 * : Utilizando la clase Java.Utils.Scanner, 
		 * ingresar un nombre por consola y mostrar el mensaje: “Hola “ + Nombre 
		 * */
		String nombreIngresado;
		System.out.println("Ingrese su nombre");
		 
		Scanner in = new Scanner(System.in);
		nombreIngresado = in.nextLine();
		System.out.println("Hola " + nombreIngresado);
		in.close();
	}

}
