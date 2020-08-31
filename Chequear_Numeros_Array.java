package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Chequear_Numeros_Array{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] array = new int[5];
		int numero;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Ingrese un numero\n");
			numero = in.nextInt();
			array[i] = numero;

		}
		System.out.println("Ingrese el numero a buscar");
		int num = in.nextInt();
		if (num == array[0]) {
			System.out.println("Se ha encontrado el número ingresado para buscar" );
		} else if (num == array[1]) {
			System.out.println("Se ha encontrado el número ingresado para buscar" );
		} else if (num == array[2]) {
			System.out.println("Se ha encontrado el número ingresado para buscar" );
		} else if (num == array[3]) {
			System.out.println("Se ha encontrado el número ingresado para buscar" );
		} else if (num == array[4]) {
			System.out.println("Se ha encontrado el número ingresado para buscar" );

		} else 
			System.out.println("El valor indicado no es válido, por favor ingrese un numero entero"); 
	
			int opcion;
			do{
			opcion=Integer.parseInt(JOptionPane.showInputDialog("Menu\n1.	Empezar de nuevo\n2.	Buscar otro número\n3.	Salir del programa "));
switch (opcion){
case 1:
	JOptionPane.showInputDialog(null,"Empezar de nuevo");
	break;
case 2:
	JOptionPane.showInputDialog(null,"Buscar otro número");
	break;
case 3:
	JOptionPane.showInputDialog(null,"Salir del programa");
	break;
	
}}while(opcion!=3);
			in.close();
	}}
			