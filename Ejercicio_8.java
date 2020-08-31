package principal;
public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1, var2;
		int aux;
		var1 = 1;
		var2 = 3;
		System.out.println("el primer numero es " + var1);
		System.out.println("el segundo numero es " + var2);
		//System.out.println("el valor del auxiliar es " + aux);
		 
		aux = var1;
		var1 = var2;
		var2 = aux;
		System.out.println("el primer numero intercambiado es " + var1);
		System.out.println("el segundo numero intercambiado es " + var2);
		System.out.print("el valor del auxiliar es " + aux);
	}

}
