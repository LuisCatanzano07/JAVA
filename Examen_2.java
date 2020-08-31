package principal;

import java.util.Scanner;

public class Examen_2 {
	// Declaro la variable in a nivel clase para que
	// pueda ser utilizada por todos los métodos de la clase

	static Scanner in = new Scanner(System.in);

	/***
	 * ingresa por teclado un valor y valida que éste sea distinto de vacío
	 * 
	 * @return la cadena de carecteres
	 */
	public static String ingresarValor() {
		String auxEntrada = "";
		while (auxEntrada.equals("")) {
			System.out.println("Por favor ingrese un numero hexadecimal");
			auxEntrada = in.nextLine();
		}
		auxEntrada = auxEntrada.toUpperCase();
		return auxEntrada;
	}
     private static boolean tieneCaracteresNoValidos( String parametroIngreso){
         char[] cadenaIngreso=parametroIngreso.toCharArray();
         char[] caracteresPermitidos = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E','F' };
         
         boolean caracteresInvalidos=false;
         
         for(int i=0; i<cadenaIngreso.length;i++){
             char carAct=cadenaIngreso[i];
             caracteresInvalidos=true;
             for(int j=0;j<16;j++){
                 if( carAct==caracteresPermitidos[j]){
                     caracteresInvalidos=false;
                     break;
                 }
             }
             if(caracteresInvalidos==true){
             return true;
             
         }
     }
                 return false;
 }
         
     



	public static void main(String[] args) {
	    
	    String valorIngresado = ingresarValor();
	    String Acum="";
	    char[] ArrayvalorIngresado=valorIngresado.toCharArray();
	    String[] equivalencia = { "0000 ", "0001 ", "0010 ", "0011 ", "0100 ", "0101 ", "0110 ", "0111 ", "1000 ", "1001 ",
				"1010 ", "1011 ", "1100 ", "1101 ", "1110 ", "1111 " };
		char[] posicion = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E','F' };
		boolean caracteresInvalidos=false;
	    caracteresInvalidos=tieneCaracteresNoValidos(valorIngresado);
	     if(caracteresInvalidos==true || valorIngresado == ""){
	        System.out.println("EL INGRESO TIENE CARACTERES INVALIDOS");
	    }else{
	        
	        for(int i=0;i<ArrayvalorIngresado.length;i++){
	        
	        for(int j=0;j<16;j++){
	            if( ArrayvalorIngresado[i]==posicion[j]){
	                Acum+=equivalencia[j];
	                break;
	            }
	        }
	        
	        }   
	        System.out.println (Acum);
	    }
       
	}

}