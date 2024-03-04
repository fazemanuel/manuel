import java.util.Scanner;

public class caminoCorto{
	
	public static void main(){
	//inicializo el objeto lector
	
	Scanner sc = new Scanner (System.in);
	
	//definir las variables para las entradas  
	double xMartin, yMartin, xRicardo, yRicardo;
	
	//definir las variables para la salida
	double xMedio, Ymedio, pendiente, intercepto;
	
	//leyendo las coordenas de martin
	
	System.out.println("digite la posicion en x para martin");
	xMartin = sc.nextInt();
	
	System.out.println("digite la posicion y para martin");
	yMartin = sc.nextInt();
	
    //leyendo las coordenas de ricardo

    System.out.println("digite la coordenada x de ricardo");
    xRicardo = sc.nextInt();
	
	System.out.println("digite la coordenada y de ricardo");
    yRicardo = sc.nextInt();

    //calculando el punto de encuentro
	
	xMedio = (xMartin+xRicardo)/2;
	yMedio = (yMartin+yRicardo)/2;
	
	System.out.println("El punto de encuentro de martin y ricardo es:(" +xMedio+","+yMedio+")");
	
	
	
	
	}
} ..