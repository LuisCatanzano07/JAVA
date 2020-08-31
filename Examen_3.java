package principal;

import java.util.Scanner;

public class Examen_3 {
        //Declaro la variable in a nivel clase para que
        //pueda ser utilizada por todos los métodos de la clase
        
        static Scanner in = new Scanner(System.in);
        
        /***
         * Valida y Retorna siempre un número entero
         * @return un numero entero
         */
        private static int obtenerNumeroEntero() {
                int retorno;
                System.out.println("Por favor ingrese un número entero");
                while (!in.hasNextInt()) {
                        System.out.println("El valor ingresado no es válido");
                        // libero el buffer
                        in.next();
                }
                retorno = in.nextInt();
                return retorno;
        }
        
        public static void main(String[] args) {
                int P1[] = new int[2];
                int P2[] = new int[2];
                int PM[] = new int[2];
                System.out.println("Por favor ingrese el valor de x para P1");
                P1[0] = obtenerNumeroEntero();
                System.out.println ("Por favor ingrese el valor de y para P1");
                P1[1]=obtenerNumeroEntero();
                System.out.println("Por favor ingrese el valor de x para P2");
                P2[0] = obtenerNumeroEntero();
                System.out.println ("Por favor ingrese el valor de y para P2");
                P2[1]=obtenerNumeroEntero();
                
                PM[0]=(P1[0] + P2[0])/2;
                PM[1]=(P1[1] + P2[1])/2;
                
                System.out.println ("El punto medio de x1=" + P1[0]+" y x2="+P2[0]+ " es: "+PM[0] );
                System.out.println ("El punto medio de y1=" + P1[1]+" y y2="+P2[1]+ " es: "+PM[1] );
 //Profe no puso si había que imprimir, pero yo lo agregue igual para ver los resultados 
        }
}