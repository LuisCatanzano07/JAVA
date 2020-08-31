package principal;

public class Examen_1 {

	public static boolean validarMultiplo(int numero, int multiplo) {
		return numero % multiplo == 0;
	}

	public static void main(String[] args) {
	    for(int i=1;i<=100;i++){
	        if(validarMultiplo(i,35)){
	            System.out.println("ROBERTOFORD");
	            }else if(validarMultiplo(i,7)){
	                System.out.println("FORD");
	            }else if(validarMultiplo(i,5)){
	                System.out.println("ROBERTO");
	            }else{ System.out.println(i);}
	        }
	    }
	}