package principal;

public class Verificar_Par_Impar {

	public static void main(String[] args) {
		int numero=279;
				System.out.println("EL valor del número es: " + numero);
		int resto= numero/2;
		if(resto*2 !=numero){
			System.out.println("Número impar");
			
		}else{
			System.out.println("Número Par");
		}

	}

}
