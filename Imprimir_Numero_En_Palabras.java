package principal;

import java.util.Scanner;

public class Imprimir_Numero_En_Palabras {

	public static void main(String[] args) {
		int numero;
		Scanner in = new Scanner(System.in);
		System.out.println("ingrese un número");
		numero = in.nextInt();
		//SWITCH-CASE
		String stringnom;
		switch(numero){
		case 1:
		stringnom="UNO";
		    break;
		case 2:
		stringnom="DOS";
		    break;
		case 3:
		stringnom="TRES";
		    break;
		case 4:
		stringnom="CUATRO";
		    break;
		case 5:
		stringnom="CINCO";
		    break;
		case 6:
		stringnom="SEIS";
		    break;
		case 7:
		stringnom="SIETE";
		    break;
		case 8:
		stringnom="OCHO";
		    break;
		case 9:
		stringnom="NUEVE";
		    break;
	    default:
	    stringnom="OTRO"	;
	    	break;
	    	
		}
		
		System.out.println(stringnom);		
in.close();
	}
	// IF ANIDADOS
	/*if (numero==1){
		System.out.println("UNO");
	}else if( numero==2){
		System.out.println("DOS");
    }else if( numero==3){
	System.out.println("TRES");
    }else if( numero==4){
System.out.println("CUATRO");
    }else if( numero==5){
System.out.println("CINCO");
    }else if( numero==6){
System.out.println("SEIS");
    }else if( numero==7){
System.out.println("SIETE");
    }else if( numero==8){
System.out.println("OCHO");
    }else if( numero==9){
System.out.println("NUEVE");
}else{
System.out.println("OTRO");
}*/
	
}
