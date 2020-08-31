package principal;

import java.util.Scanner;

public class Happy_Path_2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num[] = new int[5];
		int x;
		int opcion;

		do {
			do {
				boolean elNumeroEsta = false;
				int ban = 0;
				do {

					for (x = 0; x < num.length;) {
						try {
							ban = 0;
							System.out.print("*Ingrese un número: ");
							num[x] = teclado.nextInt();
							x++;
						} catch (Exception e) {
							System.out.println("*El valor indicado no es válido, por favor ingrese un numero entero");
							ban = 1;
							teclado.nextLine();
						}

					}
				}

				while (ban != 0);
				System.out.println("----------------------------------------------------------\n");
				do {
					do {
						ban = 0;
						try {
							int ban1 = 0;
							int numero;
							System.out.print("*Ingrese el número a buscar:  ");

							numero = teclado.nextInt();
							for (x = 0; x < num.length; x++) {
								if (numero == num[x]) {
									elNumeroEsta = true;
									ban1=1;
									;

								}

								else {
									elNumeroEsta = false;
								}
							}

							if (ban1 == 1) {
								System.out.println("Se ha encontrado el número ingresado para buscar");
							}
							if (ban1 == 0) {
								System.out.println("Número no encontrado");
							}
						} catch (Exception e) {
							System.out.println("El valor indicado no es válido, por favor ingrese un numero entero");
							ban = 1;
							teclado.nextLine();
						}

					} while (ban != 0);
					System.out.println("----------------------------------------------------------\n");
					System.out.println("*******  MENÚ DE OPCIONES ******** ");
					System.out.println("1---->Empezar de nuevo");
					System.out.println("2---->Buscar otro número");
					System.out.println("3---->Salir");
					System.out.println("*Ingrese una opción: ");
					do {
						do {
							opcion = teclado.nextInt();
							System.out.println("----------------------------------------------------------\n");

							switch (opcion) {
							case 1:
								System.out.println("*Usted a elegido volver a empezar: ");

								break;
							case 2:
								System.out.println("*Usted a elegido volver a buscar un número: ");

								break;
							case 3:
								System.out.println("*Usted a elegido finalizar la ejecucion. Adios!!!");
								opcion = teclado.nextInt();
								break;
							default:

								System.out.println("*Ingrese una opción correcta");

								break;
							}
						} while (opcion < 1);
					} while (opcion > 3);
				} while (opcion == 2);
			} while (opcion == 1);
		} while (opcion != 3);

		teclado.close();
	}

}