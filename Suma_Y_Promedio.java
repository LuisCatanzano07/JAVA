package principal;

public class Suma_Y_Promedio {
	public static void main(String[] args) {
	
	double promedio;
	/*int limiteInferior=1; 
	int limiteSuperior=100;
	int sum=0;
	for(int numero=limiteInferior; numero<=limiteSuperior; numero ++){
	sum=sum+numero;
	}*/
	///////////////////////////////////////////////////////////
	
    /* int limiteInferior=1; //A
	int limiteSuperior=100;
	int numero= limiteInferior;
      int sum=0
	while (numero <=limiteSuperior){
		sum+=numero;
		numero ++;
	}*/
   ////////////////////////////////////////////////////////
	
	/*int limiteInferior=1; //B
	int limiteSuperior=100;
	int numero=limiteInferior;
	int sum=0;
	do{
		sum+=numero;
		numero ++;
	}while(numero<=limiteSuperior);*/
	///////////////////////////////////////////////////////

	/*int count=0;  //C
	int sum=0;
	int limiteInferior=111;
	int limiteSuperior=8899;
	for(int numero=limiteInferior;numero<=limiteSuperior;numero ++){
		sum+=numero;
		count++;
	}*/
   ////////////////////////////////////////////////////////
	
	/*int limiteInferior=1;  //D
	int limiteSuperior=100;
	int sum=0;
	double count=0;
		for(int numero=limiteInferior;numero<=limiteSuperior;numero ++){
			int impar= numero/2;
			if(numero!= impar*2){
			sum+=numero;
			count++;
			}	
	}*/
	////////////////////////////////////////////////////////
	
	/*int limiteInferior=1;  //E
	int limiteSuperior=100;
	int sum=0;
	double count=0;
		for(int numero=limiteInferior;numero<=limiteSuperior;numero ++){
			int impar= numero/7;
			if(numero== impar*7){
			sum+=numero;
			count++;
			}	
	}*/
	/////////////////////////////////////////////////////
	double count=0;  //C
	int sum=0;
	int limiteInferior=1;
	int limiteSuperior=100;
	for(int numero=limiteInferior;numero<=limiteSuperior;numero ++){
		int aux=numero;
		int cuadrado=aux*aux;
		sum+=cuadrado;
		count++;
	}
	
	//promedio=sum/100d; //A;B
	promedio=sum/count; //C;D;E
	
	
	System.out.println("La suma es: "+sum+"\n"+"El promedio es: "+ promedio );
	}
	
	
}
