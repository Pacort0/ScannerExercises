package scannerexercise;
import java.util.*;

public class ScannerExcercise6 {
	public static void main (String args[]) {
		
		//Iniciamos nuestra variable Scanner, que nos va a permitir leer el teclado a través de la consola.
		Scanner entrada = new Scanner(System.in);
		
		//Creo todas las variables en las que se van a guardar todas las cuentas una vez resueltas.
		double multiplicacion;
		double suma;
		double resta;
		double division;
		
		//Creo el mensaje que se va a mostrar por pantalla una vez se inicie el programa.
		System.out.print("Por favor, introduzca dos números separados por un espacio: ");
		
		//Inicio ambas variables en las que se van a guardar los numeros que se introduzcan por teclado y las uno al Scanner. 
	    double numero1 = entrada.nextDouble();
	    double numero2 = entrada.nextDouble();
	    
	    //Realizo todas las operaciones pertinentes en sus respectivas variables.
	    suma = numero1 + numero2;
	    resta = numero1 - numero2;
	    multiplicacion = numero1*numero2;
	    division = numero1/numero2;
	    
	    //Imprimo los mensajes finales de cada solución.
	    System.out.println("\nLa suma de ambos es: " + suma);
	    System.out.println("La resta de ambos es: " + resta);
	    System.out.println("La multiplicación de ambos es: " + multiplicacion);
	    System.out.println("La división de ambos es: " + division);
	    
	    entrada.close();
	}
}
