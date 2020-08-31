//System.out.print("# ");   // imprime # y un espacio, sin salto de línea
//System.out.println();     // imprime una nueva línea
package principal;
public class Tabla_Cuadrada_ejercicio_10 { // guardar como "TablaCuadrada.java"
	public static void main(String[] args) {
		
		for(int i =0; i< 5; i++){
			System.out.println();
			
			
			for(int j = 0; j < 5; j++){
				int resto=j % 2;
				if(resto==0){
				System.out.print("# "); }
				else { System.out.print("# ");
			}	
		}
		/*
		 * 
		 * int dimension = 5; // tamaño de la tabla for (int fila = 1; ......;
		 * ......) { for (int columna = 1; ......; ......) { ...... } ...... }
		 */
	}
}
}	