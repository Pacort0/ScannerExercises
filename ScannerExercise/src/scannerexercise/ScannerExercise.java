package scannerexercise;
import java.util.*;
public class ScannerExercise {
		public static void main (String args []) {
			
			//Iniciamos nuestra variable Scanner, que nos va a permitir leer el teclado a través de la consola.
			Scanner fiuu = new Scanner(System.in);
			
			//Imprimo el mensaje inicial por pantalla.
			System.out.print("Introduzca un número al azar, literalmente da igual cuál: ");
			
			//Creo la variable en la que se va a guardar el número que se introduzca por teclado y la uno al Scanner.
			float numero_random = fiuu.nextFloat();
			
			//Imprimo el resultado por consola.
			System.out.println("\nEl número es " + numero_random);
			fiuu.close();
		}

}
